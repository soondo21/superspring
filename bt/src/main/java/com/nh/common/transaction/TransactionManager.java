package com.nh.common.transaction;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * 새로운 트랜잭션을 시작하고 커밋, 롤백을 수행하기 위한 클래스.</br>
 * 스프링으로부터 PlatformTransactionManager 빈 객체를 가져와서 사용한다.</br>
 * PlatformTransactionManager의 getTransaction, commit, rollback을 호출한다.</br>
 * 사용자의 편의를 위해 기본적인 TransactionDefinition을 생성하도록 했다.</br>
 * 
 * @author  YimSinHyuk
 * @since   2021. 11. 26.
 * @version 21.0.0.0
 * @see PlatformTransactionManager
 */
public class TransactionManager {
    private final Map<String, TransactionDefinition>    definitionMap       = new HashMap<>();
    private final Deque<TransactionStatus>              txStack             = new LinkedList<>();
    private final PlatformTransactionManager            transactionManager;
    
    public TransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
    
    /**
     * 스프링으로부터 가져온 트랜잭션 매니저 객체를 반환한다.
     * 
     * @since 21.0.0.0
     * @return TransactionManagerHolder 객체 생성 당시 사용자가 주입한 트랜잭션 매니저 빈 객체
     * @see PlatformTransactionManager
     */
    public PlatformTransactionManager getTransactoinManager() {
        return transactionManager;
    }
    
    /**
     * 기본 설정값으로 새로운 트랜잭션을 시작한다.
     * NAME         : defaultDefinition
     * PROPAGATION  : TransactionDefinition.PROPAGATION_REQUIRES_NEW
     * ISOLATION    : TransactionDefinition.ISOLATION_DEFAULT
     * 
     * @since 21.0.0.0
     * @return TransactionStatus 트랜잭션 매니저의 getTransaction 호출 결과 시작된 트랜잭션의 상태
     * @see TransactionDefinition
     * @see TransactionStatus
     */
    public TransactionStatus beginTransaction() {
        return beginTransaction("defaultDefinition");
    }
    
    /**
     * 사용자가 지정한 이름의 TransactionDefinition으로 트랜잭션을 시작한다.
     * 지정한 이름의 TransactionDefinition가 존재하지 않는 경우, 기본 값으로 생성하여 트랜잭션을 시작한다.
     * PROPAGATION  : TransactionDefinition.PROPAGATION_REQUIRES_NEW
     * ISOLATION    : TransactionDefinition.ISOLATION_DEFAULT
     * 
     * @since 21.0.0.0
     * @param definitionName 트랜잭션을 정의한 TransactionDefinition 객체의 이름
     * @return TransactionStatus 트랜잭션 매니저의 getTransaction 호출 결과 시작된 트랜잭션의 상태
     * @see TransactionDefinition
     * @see TransactionStatus
     */
    public TransactionStatus beginTransaction(String definitionName) {
        TransactionDefinition txDefinition = definitionMap.get(definitionName);
        if(txDefinition == null) {
            return beginTransaction(definitionName, TransactionDefinition.PROPAGATION_REQUIRES_NEW, TransactionDefinition.ISOLATION_DEFAULT);
        }
        
        return beginTransaction(txDefinition);
    }
    
    /**
     * 사용자가 지정한 전파 전력, 고립도 값으로 트랜잭션을 시작한다.
     * 
     * @since 21.0.0.0
     * @param definitionName 트랜잭션을 정의한 TransactionDefinition 객체의 이름
     * @param propagationStrategy 트랜잭션 시작을 위한 전파 전략
     * @param isolationLevel 트랜잭션이 보여질수 있는 범위
     * @return TransactionStatus 트랜잭션 매니저의 getTransaction 호출 결과 시작된 트랜잭션의 상태
     * @see TransactionDefinition
     * @see TransactionStatus
     */
    public TransactionStatus beginTransaction(String definitionName, int propagationStrategy, int isolationLevel) {
        TransactionDefinition txDefinition = getDefaultTransactionDefinition(definitionName, propagationStrategy, isolationLevel);
        return beginTransaction(txDefinition);
    }
    
    /**
     * 사용자가 설정한 TransactionDefinition으로 트랜잭션을 시작한다.
     * 
     * @since 21.0.0.0
     * @param definition 사용자가 지정한 트랜잭션 정의
     * @return TransactionStatus 트랜잭션 매니저의 getTransaction 호출 결과 시작된 트랜잭션의 상태
     * @see TransactionDefinition
     * @see TransactionStatus
     */
    public TransactionStatus beginTransaction(TransactionDefinition definition) {
        TransactionStatus txStatus = transactionManager.getTransaction(definition);
        txStack.add(txStatus);
        return txStatus;
    }
    
    /**
     * 트랜잭션 시작을 위해 트랜잭션의 속성이 정의된 TransactionDefinition 객체를 생성한다.
     * 입력받은 이름의 definition이 존재하는 경우, 이전에 생성했던 객체를 반환한다.
     * TransactionDefinition인터페이스의 구현체인 DefaultTransactionDefinition를 반환한다.
     * 
     * @since 21.0.0.0
     * @param definitionName 생성하려는 트랜잭션 정의 이름
     * @param propagationStrategy 트랜잭션 시작을 위한 전파 전략
     * @param isolationLevel 트랜잭션이 보여질수 있는 범위
     * @return TransactionDefinition 트랜잭션 시작을 위해, 시작하려는 트랜잭션의 속성을 설정한 Definition객체
     * @see TransactionDefinition
     * @see DefaultTransactionDefinition
     */
    public TransactionDefinition getDefaultTransactionDefinition(String definitionName, int propagationStrategy, int isolationLevel) {
        DefaultTransactionDefinition definition = (DefaultTransactionDefinition) definitionMap.get(definitionName);
        if(definition == null) {
            definition = new DefaultTransactionDefinition();
            definition.setName(definitionName);
            definition.setPropagationBehavior(propagationStrategy);
            if(isolationLevel == 0) {
                isolationLevel = TransactionDefinition.ISOLATION_DEFAULT;
            }
            definition.setIsolationLevel(isolationLevel);
            definition = (DefaultTransactionDefinition) definitionMap.putIfAbsent(definitionName, definition);
        }
        
        return definition;
    }
    
    /**
     * 가장 최근에 시작된 트랜잭션을 커밋한다.
     * 
     * @since 21.0.0.0
     */
    public void commit() {
        TransactionStatus currentTx = txStack.pop();
        transactionManager.commit(currentTx);
    }
    
    /**
     * 입력받은 TransactionStatus에 해당하는 트랜잭션을 커밋한다.
     * 
     * @since 21.0.0.0
     * @param status 커밋하려는 트랜잭션
     */
    public void commit(TransactionStatus status) {
        transactionManager.commit(status);
        txStack.remove(status);
    }
    
    /**
     * 가장 최근에 시작된 트랜잭션을 롤백한다.
     * 
     * @since 21.0.0.0
     */
    public void rollback() {
        TransactionStatus currentTx = txStack.pop();
        transactionManager.rollback(currentTx);
    }
    
    /**
     * 입력받은 TransactionStatus에 해당하는 트랜잭션을 롤백한다.
     * 
     * @since 21.0.0.0
     * @param status 롤백하려는 트랜잭션
     */
    public void rollback(TransactionStatus status) {
        transactionManager.rollback(status);
        txStack.remove(status);
    }
    
    public void release() {
        definitionMap.clear();
        txStack.clear();
    }
}
