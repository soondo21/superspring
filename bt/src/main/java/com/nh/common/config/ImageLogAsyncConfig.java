package com.nh.common.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@Configuration
public class ImageLogAsyncConfig {
	
	@Bean(name = "threadPoolTaskExecutor")
	public Executor threadPoolTaskExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(3);
		taskExecutor.setMaxPoolSize(30);
		taskExecutor.setQueueCapacity(10);
		taskExecutor.setThreadNamePrefix("ImageLog-");
		
		//queue 모든작업 완료후 종료(유실방지)
		taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
		// max 스레드생성 및 queue 가득찬상태에서 추가요청시
		// Abortpolicy(기본설정) RejectedExcutionException 발생, DiscardOldestPolicy 오랜된작업 skip, DiscardPolicy 처리작업 skip
		// CallerRunsPolicy 현제 thread에서 처리(유실방지)
		taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
		// 최대종료대기시간설정
		taskExecutor.setAwaitTerminationSeconds(60); 
		
		taskExecutor.initialize();
		return taskExecutor;
	}
}
