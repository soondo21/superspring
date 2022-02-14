package com.nh.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nh.common.dto.ResponseBodyDTO;
import com.nh.common.dto.header.HDR_DIGITAL;
import com.nh.common.service.context.ServiceContext;
import com.nh.common.service.context.ServiceContextHolder;
import com.nh.common.service.interfaces.ServiceObject;
import com.nh.common.service.process.SystemProcessor;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

import com.nh.common.transaction.TransactionManagerHolder;
import com.nh.common.transaction.TransactionManager;
import com.tmax.superspring.util.StringUtil;

@RestController
@RequestMapping("/bt")
public class BtController implements ApplicationContextAware {
	private static final Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
	private static final String systemTxDef = "systemTxDef";
	private static final String serviceTxDef = "serviceTxDef";
	
	/**
     * 서비스가 스프링 빈으로 등록되었을 경우, 현재 요청에 대응하는 서비스 객체를
     * 가져오기 위해 어플리케이션 컨텍스트를 사용한다.
     */
	private ApplicationContext appContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appContext = applicationContext;
	}
	
	/**
	 * POST API를 요청받아, Http RequestBody로부터 수행해야할 서비스를 구하고
	 * 서비스 수행 결과를 응답으로 내보낸다.
	 * 전반적인 Http Request 요청에 대한 값들은 RequestEntity에 대응시켰으며,
	 * Http RequestBody의 JSON 데이터로부터 서비스 헤더와 서비스 입력값을 구했다.
	 * 
	 * @since 21.0.0.0
	 * @param httpRequest
	 * @param queryString
	 * @param pathVariables
	 * @return
	 * @throws Throwable
	 */
	@PostMapping("/post")
    public @ResponseBody ResponseEntity<String> postRequest(RequestEntity<String> httpRequest, @RequestParam LinkedMultiValueMap<String, String> queryString, @PathVariable Map<String, String> pathVariables) throws Throwable {
        ResponseEntity<String> response = null;
        
        response = handleControlProcess(httpRequest, queryString, pathVariables);
        
        return response;
    }
	
	/**
     * GET API를 요청받아, Http URL의 QueryString으로부터 수행해야할 서비스를 구하고
     * 서비스 수행 결과를 응답으로 내보낸다.
     * 전반적인 Http Request 요청에 대한 값들은 RequestEntity에 대응시켰으며,
     * Query String은 RequestParam 어노테이션을 이용한 스프링 기능으로 Map에 대응시켰다.
     * 
     * @since 21.0.0.0
     * @param httpRequest
     * @param queryString
     * @param pathVariables
     * @return
     * @throws Throwable
     */
    @GetMapping("/get/querystring")
    public @ResponseBody ResponseEntity<String> getQueryStringRequest(RequestEntity<String> httpRequest, @RequestParam LinkedMultiValueMap<String, String> queryString, @PathVariable Map<String, String> pathVariables) throws Throwable {
        ResponseEntity<String> response = null;
        
        response = handleControlProcess(httpRequest, queryString, pathVariables);
        
        return response;
    }
    
    /**
     * GET API를 요청받아, Http URL의 PathVariable로부터 수행해야할 서비스를 구하고
     * 서비스 수행 결과를 응답으로 내보낸다.
     * 전반적인 Http Request 요청에 대한 값들은 RequestEntity에 대응시켰으며,
     * PathVariable 어노테이션을 이용하여 RequestMapping 경로에 존재하는 path variable들을 Map으로 치환하였다.
     * 
     * @since 21.0.0.0
     * @param httpRequest
     * @param queryString
     * @param pathVariables
     * @return
     * @throws Throwable
     */
    @GetMapping("/get/pathvariable/{serviceId}")
    public @ResponseBody ResponseEntity<String> getPathVariableRequest(RequestEntity<String> httpRequest, @RequestParam LinkedMultiValueMap<String, String> queryString, @PathVariable Map<String, String> pathVariables) throws Throwable {
        ResponseEntity<String> response = null;
        
        response = handleControlProcess(httpRequest, queryString, pathVariables);
        
        return response;
    }
	
	
	
	private ResponseEntity<String> handleControlProcess(RequestEntity<String> request, LinkedMultiValueMap<String, String> queryString, Map<String, String> pathVariables) throws Throwable {
		SystemProcessor         systemProcessor = SystemProcessor.getInstance(appContext);
	    ResponseEntity<String>  response        = null;
	    HttpStatus              responseStatus  = HttpStatus.OK;
	    ServiceContext          context         = new ServiceContext();
	    ServiceObject           service         = null;
	    HDR_DIGITAL             header          = null;
		Object                  input           = null;
	    Object                  output          = null;
	    String                  serviceId       = null;
	    String                  serviceClzName  = null;
	    Throwable               serviceException= null;
	    String                  langCd          = null;
	    String requestBody = null;
		String responseBodyStr = null;
	    
	    //**************************************************
	    //* 
	    //*              1. Request Body Unmarshal
	    //*
	    //**************************************************
	    context.setRequestHeaders(HttpHeaders.readOnlyHttpHeaders(request.getHeaders()));
	    context.setQueryString(request.getUrl().getQuery());
	    context.setQuerStringMap(queryString);
	    context.setPathVariable(pathVariables);
	    
	    requestBody = request.getBody();
	    JsonElement headerJson  = null;
	    JsonElement inputJson  = null;
	    
	    /*
	     * POST, PUT등 Request Body가 존재하는 경우, body로부터 서비스의 헤더와 입력 객체를 생성해야한다.
	     * 서비스 식별과 서비스 입력 객체를 구하기전 서비스 헤더를 생성한다.
	     */
	    if(requestBody != null) {
	        JsonElement[]   headerNbody = unmarshalRequestBody(requestBody);
	        headerJson  = headerNbody[0];
	        inputJson   = headerNbody[1];
	        header = getHeader(headerJson, HDR_DIGITAL.class);
	        context.setDigitalHeaders(header);
	        
	        // 서비스 헤더로부터 수행해야할 서비스명을 식별한다.
	        serviceId       = header.getSys_comm().getRms_svc_c();
	        
	        // 서비스 헤더로부터 다국어 메세지 코드를 받아온다.
	        langCd          = header.getEfn_comm().getLang_ds();
	    }
	    
	    /*
	     * Request Body로부터 서비스를 식별하지 못했다면 Http Header를 이용해서 서비스 식별을 시도한다.
	     */
	    if(StringUtil.isEmpty(serviceId)) {
	        serviceId = defineServiceNameFromWebHeader(context.getRequestHeaders());
	    }
	    
	    /*
	     * Http Header로부터 서비스를 식별하지 못했다면, 쿼리 스트링으로부터 서비스 식별을 시도한다.
	     */
	    if(StringUtil.isEmpty(serviceId)) {
	        serviceId = defineServiceNameFromQueryString(context.getQuerStringMap());
	    }
	    
	    /*
	     * Request Body, Http Header, Query String 모두로부터 서비스를 식별하지 못했다면, path variable로부터 서비스 식별을 시도한다.
	     */
	    if(StringUtil.isEmpty(serviceId)) {
	        serviceId = defineServiceNameFromPathVariable(context.getPathVariable());
	    }
	    
	    /*
	     * ServiceContext에서도 serviceId를 정의하지 못했다면 IllegalArgumentException을 throw 한다.
	     */
	    if(StringUtil.isEmpty(serviceId)) {
	        throw new IllegalArgumentException("Failed to define service name");
	    }
	
	    /*
	     * 식별한 서비스명에 해당하는 서비스 객체를 생성한다.
	     */
	    try {
	    	service         = (ServiceObject) getServiceObject(serviceId);
	        serviceClzName  = service.getClass().getName();
	        
	        /*
	         * 식별한 서비스명에 해당하는 서비스 입력 객체를 생성한다.
	         * '서비스 이름' + '_in'
	         */
	        //Class<?>    serviceInputType    = getServiceInputClass(serviceClzName);
	        Class<?>    serviceInputType    = getServiceInputClass2(serviceId);
	        
	        /*
	         * POST, PUT등으로 request body에 json 전문으로 서비스 입력값이 들어왔다고 가정.
	         * 혹 GET, HEAD등으로 request body가 없는 요청일 경우, 쿼리 스트링이나 web header에서
	         * 서비스 입력 객체를 만드는 작업으로 변경해주면 된다.
	         */
	        input   = getInput(inputJson, serviceInputType); 
	    } catch(Exception e) {
	        // 서비스 객체를 생성하지못해서 발생하는 에러
	        serviceException = e;
	        responseStatus = HttpStatus.INTERNAL_SERVER_ERROR;
	        e.printStackTrace();
	    }
	    
	   
	    try {
	    	//**************************************************
            //* 
            //*              2. Initialize TransactionManager
            //*
            //**************************************************
            
            /*
             * 각종 선후처리 및 서비스 로직에서 사용할 트랜잭션 매니저 빈을 가져온다.
             * 트랜잭션 매니저는 반드시 스프링 빈으로 등록되어있어야 하며, 트랜잭션 매니저가 하나가 아니라면
             * 그에 맞게 로직을 수정해서 사용한다.
             * 아래 소스에서 transactionManager Bean은 com.nb.edop.common.DataBaseConfig에서 등록된 Bean을 사용한다.
             */
            initTransactionManager("transactionManager");
            
	        if(service != null) {
	            //**************************************************
	            //* 
	            //*               3. System Pre Process
	            //*
	            //**************************************************
	            
	            /*
	             * 시스템 선처리를 위한 트랜잭션을 시작합니다.
	             * 기본 트랜잭션 정택은 TransactionDefinition.PROPAGATION_REQUIRES_NEW입니다.
	             * 선처리를 위한 새로운 트랜잭션을 생성합니다.
	             * 현재는 시스템 선후처리에서 이미지로깅을 Async로 처리하는 로직 구현
	             */
	        	TransactionStatus       sysPreTx            = TransactionManagerHolder.getInstance().beginTransaction(systemTxDef);
	            try {
	                /*
	                 * 시스템 선처리 로직을 수행한다.
	                 */
	                //input = systemProcessor.preProcess(header, input);
	            	String reqbody = requestBody;
	            	systemProcessor.run(() -> {
	        			try {
	        				systemProcessor.preProcess(reqbody);
	        			} catch (Exception e) {
	        				e.printStackTrace();
	        			}
	        		});
	            	
	            	TransactionManagerHolder.getInstance().commit(sysPreTx);
	                
	            } catch(Throwable t) {
	            	TransactionManagerHolder.getInstance().rollback(sysPreTx);
	                t.printStackTrace();
	            }
	            
	            //**************************************************
                //* 
                //*               4-1. Service Transaction Begin
                //*
                //**************************************************
                
                /*
                 * 서비스를 위한 트랜잭션을 시작합니다.
                 * 기본 트랜잭션 정택은 TransactionDefinition.PROPAGATION_REQUIRES_NEW입니다.
                 */
                TransactionStatus       serviceTx       = TransactionManagerHolder.getInstance().beginTransaction(serviceTxDef);
	            
	            try {
	                //**************************************************
	                //* 
	                //*               4-2. Service Call
	                //*
	                //**************************************************
	                
	            	/* Service 영역에서 현재 Thread의 ServiceContext에만 접근 가능하도록 Holder Pattern 적용. */
	                ServiceContextHolder.setInstance(context);
	                
	                output = service.service(input);
	                TransactionManagerHolder.getInstance().commit(serviceTx);
	            } catch (Throwable t) {
	            	/*
	            	 * [ERROR] 해당 부분에서 ExceptionHandler 로직을 처리해야함.
	            	 */

	            	System.out.println("=======================> 4-2. Throwable Catch절 시작");
	                serviceException    = t;
	                responseStatus      = HttpStatus.INTERNAL_SERVER_ERROR;
	                TransactionManagerHolder.getInstance().rollback(serviceTx);
	                System.out.println("=======================> serviceException : " + serviceException.getMessage() + ", responseStatus : " + responseStatus);
	                output = systemProcessor.errorProcess(serviceException, langCd);
	                System.out.println("=======================> 4-2. Throwable Catch절 종료");
	            } finally {
	            	ServiceContextHolder.removeInstance();
	            }
	        }
	        
	        //**************************************************
	        //* 
	        //*               5. Response Marshal
	        //*
	        //**************************************************
	        
	        /*
	         * 정상적으로 서비스 수행이 종료되었다는 가정하에 서비스 출력결과를 Http Response Body에 담기위한
	         * JSON 문자열을 생성한다.
	         */
	        if(responseStatus != HttpStatus.INTERNAL_SERVER_ERROR) {
	        	System.out.println("=======================> 5. Response Marshal [OK]");
	            responseBodyStr = marshalResponseBody(header, output);
	        } else {
	            // 서비스 수행에 실패한경우 응답으로 전달하고 싶은 내용이 있다면 해당 내용을 생성
	        	System.out.println("=======================> 5. Response Marshal [INTERNAL_SERVER_ERROR]");
	            responseBodyStr = marshalResponseBody(header, output);
	        }
	        
	        //**************************************************
	        //* 
	        //*               6. System Post Process
	        //*
	        //**************************************************
	        
	        /*
	         * 시스템 후처리 영역
	         */
	        /*
             * 시스템 후처리를 위한 트랜잭션을 시작합니다.
             * 기본 트랜잭션 정택은 TransactionDefinition.PROPAGATION_REQUIRES_NEW입니다.
             * 후처리를 위한 새로운 트랜잭션을 생성합니다.
             */
            TransactionStatus systemPostTx = TransactionManagerHolder.getInstance().beginTransaction(systemTxDef);
            
	        try {
	        	// 정책적으로 시스템 후처리가 동작하는 조건을 정해야 함(현재는 정상응답에 대해서만 후처리 실행)
	            if(responseStatus == HttpStatus.OK) {
	            	String resbody = responseBodyStr;
	            	systemProcessor.run(() -> {
	        			try {
	        				systemProcessor.postProcess(resbody);
	        			} catch (Exception e) {
	        				e.printStackTrace();
	        			}
	        		});
	            	
	            } else {
	            	System.out.println("=======================> 6. errorProcess 호출 결과 : " + output);
	            }
	            
	            TransactionManagerHolder.getInstance().commit(systemPostTx);
	        } catch(Throwable t) {
	        	TransactionManagerHolder.getInstance().rollback(systemPostTx);
	        	t.printStackTrace();
	        }
	        
	        
	        //**************************************************
	        //* 
	        //*               7. Create Response Entity
	        //*
	        //**************************************************
	        
	        /*
	         * 서비스 응답을 생성한다.
	         * 서비스 성공유무에 따른 Http Status 지정과 Response Body에 담을 JSON 문자열을 전달한다.
	         */
	        response = getResponseEntity(responseStatus, responseBodyStr);
	    } finally {
	    	/*
             * 스레드 로컬에 저장되어있는 트랜잭션 매니저 빈 객체를 제거한다.
             */
            TransactionManagerHolder.remove();
	    }
	    
	    return response;
	}
	
	/**
     * Controller 반한값인 ResponseEntity 객체를 생성할 BodyBuilder 객체를 생성한다.
     * 응답으로 전달할 HttpStatus를 파라미터로 전달한다.
     * 
     * @since 21.0.0.0
     * @param httpStatus 응답 상태
     * @return
     */
    private BodyBuilder getResponseEntityBuilder(HttpStatus httpStatus) {
        return ResponseEntity.status(httpStatus);
    }
    
    /**
     * Http Response를 위한 ResponseEntity 객체에 필요한 응답 데이터를 설정한다.
     * Response Body에 JSON 문자열을 담기위해서는 contentType의 media type을 JSON으로 지정해줘야한다.
     * 필요한 Http Header값이 있다면 BodyBuilder의 header API를 이용하여 설정할수 있다.
     * 
     * @since 21.0.0.0
     * @param httpStatus    응답 상태
     * @param responseBody  응답 전문
     * @return
     */
    private ResponseEntity<String> getResponseEntity(HttpStatus httpStatus, String responseBody) {
        ResponseEntity<String> response = null;
        
        BodyBuilder bodyBuilder = getResponseEntityBuilder(httpStatus);
        bodyBuilder.contentType(MediaType.APPLICATION_JSON);
        response = bodyBuilder.body(responseBody);
        
        
        return response;
    }
    
    /**
     * Http Request Body로부터 서비스 수행에 필요한 헤더와 서비스 입력 전문을 구한다.
     * JSON으로 전달된 서비스 전문이라 가정하고 있으며, 전문에는 header, dto 두가지 필드가 존재한다는
     * 가정하에 파싱 로직을 작성했다.
     * 
     * @since 21.0.0.0
     * @param requestBodyStr Http RequestBody를 통해 전달받은 JSON 문자열
     * @return
     */
    private JsonElement[] unmarshalRequestBody(String requestBodyStr) {
        JsonElement[] requestBody = new JsonElement[]{null, null};
        
        JsonElement httpBodyElement = JsonParser.parseString(requestBodyStr);
        
        JsonObject  httpBodyObject  =  httpBodyElement.getAsJsonObject();
        JsonElement headerElement   = httpBodyObject.get("header");
        JsonElement bodyElement     = httpBodyObject.get("dto");
        
        requestBody[0] = headerElement;
        requestBody[1] = bodyElement;
        
        return requestBody;
    }
    
    /**
     * 서비스 출력값과 서비스 헤더를 통해 응답 전문을 작성한다.
     * 
     * @since 21.0.0.0
     * @param <HeaderType> Http Request로부터 전달받은 서비스 헤더 객체에 해당하는 클래스
     * @param <OutputType> 서비스 수행 결과 반환된 서비스 응답 객체에 해당하는 클래스
     * @param header Http Request로부터 전달받은 서비스 헤더 객체
     * @param output 서비스 수행 결과 반환된 서비스 응답 객체
     * @return
     */
    private <HeaderType, OutputType> String marshalResponseBody(HeaderType header, OutputType output) {
        String outputStr = null;
        
        ResponseBodyDTO<HeaderType, OutputType> responseDTO = new ResponseBodyDTO<>();
        responseDTO.setHeader(header);
        responseDTO.setDto(output);
        
        outputStr = gson.toJson(responseDTO);
        
        
        return outputStr;
    }
    
    /**
     * Http RequestBody의 'header' 변수에 해당하는 JSON을 입력받은 클래스의 객체로 생성한다.
     * 
     * @since 21.0.0.0
     * @param <HeaderType>      서비스 헤더 클래스
     * @param headerJson        request body에서 서비스 헤더에 해당하는 JSON 문자열
     * @param headerTypeClass   서비스 헤더 클래스
     * @return
     */
    private <HeaderType> HeaderType getHeader(JsonElement headerJson, Class<HeaderType> headerTypeClass) {
        if(headerJson == null) {
            return null;
        }
        
        HeaderType header = null;
        
        header = gson.fromJson(headerJson, headerTypeClass);
        
        return header;
    }
    
    /**
     * Http RequestBody의 'dto' 변수에 해당하는 JSON을 입력받은 클래스의 객체로 생성한다.
     * 
     * @since 21.0.0.0
     * @param <InputType>       서비스 입력 클래스
     * @param inputJson         request body에서 서비스 입력에 해당하는 JSON 문자열
     * @param inputTypeClass    서비스 입력 클래스
     * @return
     */
    private <InputType> InputType getInput(JsonElement inputJson, Class<InputType> inputTypeClass) {
        if(inputJson == null) {
            return null;
        }
        
        InputType input = null;
        
        input = gson.fromJson(inputJson, inputTypeClass);
        
        return input;
    }
    
    /**
     * Http Request의 URL과 컨트롤러 RestAPI 매핑에 지정한 path variable 값으로부터
     * 실행해야할 서비스명을 식별한다.
     * 
     * @since 21.0.0.0
     * @param pathVariables path variable이 담긴 map
     * @return
     */
    private String defineServiceNameFromPathVariable(Map<String, String> pathVariables) {
        String serviceId = pathVariables != null && !pathVariables.isEmpty() ? pathVariables.get("serviceId") : null;
        
        return serviceId;
    }

    /**
     * Http Request로부터 전달받은 쿼리 스트링으로부터 실행해야할 서비스명을 식별한다.
     * 
     * @since 21.0.0.0
     * @param queryString query string이 담긴 map으로 value는 List&lt;String&gt;에 대응한다.
     * @return
     */
    private String defineServiceNameFromQueryString(LinkedMultiValueMap<String, String> queryString) {
        List<String> value = queryString.get("serviceId");
        String serviceId = value != null && !value.isEmpty() ? value.get(0) : null;
        return serviceId;
    }
    
    /**
     * Http Header로부터 서비스명을 식별한다.
     * 
     * @since 21.0.0.0
     * @param webHeader RequestEntity로부터 얻어온 Header객체
     * @see HttpHeaders
     * @return
     */
    private String defineServiceNameFromWebHeader(HttpHeaders webHeader) {
        List<String> value = webHeader.get("serviceId".toLowerCase());
        String serviceId = value != null && !value.isEmpty() ? value.get(0) : null;
        return serviceId;
    }
    
    /**
     * 식별한 서비스명으로부터 서비스 객체를 생성한다.
     * 먼저 스프링 빈으로 등록되어있는지 확인후, 등록되었으면 빈객체를 가져오며
     * 빈으로 등록되지 않은 경우, 객체를 직접 생성한다.
     * 
     * @since 21.0.0.0
     * @param serviceId
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    private Object getServiceObject(String serviceId) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object serviceObject = null;
        
        serviceId = serviceId + "Service";
        
        // 서비스가 스프링 빈으로 등록되었는지 확인
        try {
            if(appContext.containsBean(serviceId)) {
                serviceObject = appContext.getBean(serviceId);
            }
        } catch(NoSuchBeanDefinitionException ignore) {
            // 필요한 경우 에러처리
        }
        
        // 스프링 빈으로 등록되지 않은 서비스의 경우 객체를 직접 생성해야한다.
        // 이 경우, 스프링의 IOC 및 DI 지원을 전혀 받지 못하므로 주의! 때문에 업무 서비스는 Spring Bean으로 생성하기를 권장한다.
        if (serviceObject == null) {
            Class<?> serviceClz = Class.forName(serviceId);
            serviceObject = serviceClz.newInstance();
        }

        return serviceObject;
    }
    
    /**
     * 서비스의 입력 객체를 생성하기 위해, 클래스명을 식별합니다.
     * '서비스 이름' + '_in'
     * 
     * @since 21.0.0.0
     * @param <InputType> 서비스 입력 클래스
     * @param serviceName 수행해야할 서비스 이름
     * @return
     * @throws ClassNotFoundException
     */
    @SuppressWarnings({ "unchecked" })
    private <InputType> Class<InputType> getServiceInputClass(String serviceName) throws ClassNotFoundException {
        Class<InputType> inputTypeClass = null;
        
        String inputTypeName = serviceName + "_IN";
        
        inputTypeClass = (Class<InputType>) Class.forName(inputTypeName);
        
        return inputTypeClass;
    }
    
    @SuppressWarnings({ "unchecked" })
    private <InputType> Class<InputType> getServiceInputClass2(String serviceId) throws ClassNotFoundException {
        Class<InputType> inputTypeClass = null;
        
        String pkg = "com.nh.dto.";
        String inputTypeName = pkg + serviceId + "." + serviceId + "_IN";
        
        inputTypeClass = (Class<InputType>) Class.forName(inputTypeName);
        
        return inputTypeClass;
    }
    
    /**
     * 본 예시는 CS 매니저로부터 전달받은 요청사항에 따라 사용자가 'service' method를 정의한
     * 인터페이스를 상속받아 서비스를 개발했을것이라 가정하고 작성되어있습니다.
     * 만약 서비스 실행을 위한 API가 'service'가 아니라면, 서비스 수행을 위한 API를 호출을 위해
     * 리플렉션을 사용하는 예시 코드입니다.
     * 
     * @since 21.0.0.0
     * @param serviceObject             서비스 객체
     * @param serviceInput              서비스 입력 객체
     * @return
     * @throws NoSuchMethodException
     * @throws SecurityException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    @SuppressWarnings({ "unused", "unchecked" })
    private <InputType, OutputType> OutputType executeService(Object serviceObject, InputType serviceInput) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        OutputType result = null;
        
        Method serviceMethod = serviceObject.getClass().getMethod("service", serviceInput.getClass());
        result = (OutputType) serviceMethod.invoke(serviceObject, serviceInput);
        
        return result;
    }
    
    /**
     * 서비스와 선후처리에서 사용할 스프링 트랜잭션 매니저 빈을 반환한다.
     * 가져온 트랜잭션 매니저는 서비스가 할당받은 스레드 로컬에 저장하여
     * 사용할수 있도록 한다.
     * 
     * @since 21.0.0.0
     * @param transactionManagerName
     * @return
     */
    private PlatformTransactionManager initTransactionManager(String transactionManagerName) {
        PlatformTransactionManager  platformTransactionManager          = (PlatformTransactionManager) appContext.getBean(transactionManagerName);
        TransactionManager    transactionManager    = new TransactionManager(platformTransactionManager);
        TransactionManagerHolder.setInstance(transactionManager);
        
        return platformTransactionManager; 
    }
		
}
