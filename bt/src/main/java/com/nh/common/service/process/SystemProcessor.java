package com.nh.common.service.process;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.nh.common.dto.header.HDR_DIGITAL;
import com.nh.common.service.ExceptionHandler;
import com.nh.common.service.ImageLogService;
import com.tmax.superspring.dto.DataObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SystemProcessor {
	
	Logger logger = LoggerFactory.getLogger(SystemProcessor.class);
	
	@Autowired
	ExceptionHandler exceptionHandler;
	
	@Autowired
	ImageLogService imageLogService;
	
    public static SystemProcessor getInstance(ApplicationContext context) {
        return (SystemProcessor) context.getBean("systemProcessor");
    }
    
    // 비동기 호출
 	@Async("threadPoolTaskExecutor")
 	public void run(Runnable runnable) {
// 		ImageLogService.run(runnable);
 		runnable.run();
 	}
    
//    public <HeaderType, InputType> InputType preProcess(HeaderType header, InputType input) {
 	public void preProcess(String body) {
 		logger.info("SystemProcessor ======================> [PreProcess][IMAGE LOGGGING][BODY : {}]", body);
    }
 	
 	public void preProcess(HttpServletRequest req, HDR_DIGITAL headerDto, String input) {
 		/*
 		 * preProcess 로직 추가해야 함.
 		 */
 		
 		// ImageLogService Async Call
 		imageLogService.run(() -> {
 			imageLogService.preLog(req, headerDto, input);
 		});
 	}
    
//    public <HeaderType, OutputType> void postProcess(HeaderType header, OutputType input) {
//    }
 	public void postProcess(String body) {
 		logger.info("SystemProcessor ======================> [PostProcess][IMAGE LOGGGING][BODY : {}]", body);
 	}
 	
public void postProcess(HttpServletRequest req, HDR_DIGITAL headerDto, String input) {
	/*
		 * postProcess 로직 추가해야 함.
		 */
		
		// ImageLogService Async Call
		imageLogService.run(() -> {
			imageLogService.preLog(req, headerDto, input);
		});
 	}
    
    public <HeaderType, InputType> void errorProcess(HeaderType header, InputType input, Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        String exceptionAsString = sw.toString();
    }
    
    public DataObject errorProcess(Throwable t, String langCd) {
    	return exceptionHandler.exceptionHandle(t, langCd);
    }
    
//    public <HeaderType, InputType> ErrorObject errorProcess(HeaderType header, InputType input, Throwable t) {
//        StringWriter sw = new StringWriter();
//        t.printStackTrace(new PrintWriter(sw));
//        String exceptionAsString = sw.toString();
//        
//        ErrorObject error = new ErrorObject();
//        error.setErrorMessage(exceptionAsString);
//        
//        System.out.println(error.getErrorMessage());
//        
//        return error;
//    }

}
