package com.nh.common.transaction;

/**
 * 서비스가 수행중인 스레드에서 스프링 트랜잭션 매니저를 가져오기 위한 클래스
 * 
 * @author  YimSinHyuk
 * @since   2021. 11. 26.
 * @version 21.0.0.0
 */
public class TransactionManagerHolder {
    private static ThreadLocal<TransactionManager> transactionManager = new ThreadLocal<>();
    
    public static void setInstance(TransactionManager transaction) {
        transactionManager.set(transaction);
    }
   
    /**
     * 스레드에서 사용중인 트랜잭션 매니저 빈을 반환한다.
     * 
     * @since 21.0.0.0
     * @return
     */
    public static TransactionManager getInstance() {
        return transactionManager.get();
    }
    
    /**
     * 컨트롤러 로직 종료후 스레드에 적용된 트랜잭션 매니저를 제거한다.
     * 
     * @since 21.0.0.0
     */
    public static void remove() {
        TransactionManager txHolder = transactionManager.get();
        if(txHolder != null) {
            txHolder.release();
        }
        
        transactionManager.remove();
    }
}
