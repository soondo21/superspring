package com.nh.common.service.context;

public class ServiceContextHolder {
    /**
     * Controller를 통해 전달받은 HTTP Header, Query String, Path Variable등을 들고 있는 컨텍스트 객체
     * 
     */
    private static final ThreadLocal<ServiceContext> INSTANCE = new ThreadLocal<>();

    /**
     * 현재 스레드에서 생성된 서비스 컨텍스트를 반환한다.
     * 
     * @since 21.0.0.0
     * @return
     */
    public static ServiceContext getInstance() {
        return INSTANCE.get();
    }

    
    /**
     * 현재 스레드에서 수행될 서비스의 컨텍스트를 설정한다.
     * 
     * @since 21.0.0.0
     * @param serviceContext
     */
    public static void setInstance(ServiceContext serviceContext) {
        INSTANCE.set(serviceContext);
    }

    /**
     * 서비스 종료후 스레드에 설정되어있는 컨텍스트를 제거한다.
     * 
     * @since 21.0.0.0
     */
    public static void removeInstance() {
        INSTANCE.remove();
    }

}
