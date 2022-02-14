package com.nh.common.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import com.nh.common.dao.ImageLogMapperDao;
import com.nh.common.dto.header.HDR_DIGITAL;
import com.nh.common.dto.log.ImageLogDto;
import com.tmax.superspring.core.property.ApplicationProperty;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ImageLogService {
	@Autowired
	ImageLogMapperDao imageLogMapperDao;
	
	// 비동기 호출
	@Async("threadPoolTaskExecutor")
	public void run(Runnable runnable) {
		runnable.run();
	}
	
	public void ptest() throws Exception {
		Thread.sleep(5000);
	}
	
	// 선처리 로그
	public void preLog(HttpServletRequest req, HDR_DIGITAL headerDto, String input) {
//		ImageLogDto logDto = new ImageLogDto();
//		
//		logDto.setSTD_GBL_ID(headerDto.getSys_comm().getStd_gbl_id());
//		logDto.setSERVICE_ID(headerDto.getSys_comm().getRms_svc_c());
//		logDto.setINPUT_DATA(input);
//		
//		logDto.setAPP_NAME(ApplicationProperty.getProperty("spring.application.name"));
//		logDto.setAPP_PID(new ApplicationPid().toString());
//		logDto.setREQ_PATH(req.getRequestURI());
//		logDto.setREQ_METHOD(req.getMethod());
//		logDto.setREQ_CONTENT_TYPE(req.getContentType());
//		logDto.setREQ_REMOTE_ADDR(req.getRemoteHost() + ":" + req.getRemotePort());
//		logDto.setCREADTED_TIME(new Date());
//		
//		insertImageLog(logDto);
		log.info("[IMAGE-LOGGING][PRELOG]");
	}
	
	// 후처리 로그
	public void postLog() {
		log.info("[IMAGE-LOGGING][POSTLOG]");
	}
	
	public void writeLog(ImageLogDto logDto) {
		String msg = "[ImageLog] " + "[" + logDto.getSTD_GBL_ID() + "] " + logDto.toString();
		//String msg = "[ImageLog] " + "[" + logDto.getSTD_GBL_ID() + "] " + logDto.toString();
		log.info(msg);
	}
	
	// 로그 저장
	public void insertImageLog(ImageLogDto logDto) {
		imageLogMapperDao.insertImageLog(logDto);
	}
	
	public void updateImageLog(ImageLogDto logDto) {
		imageLogMapperDao.updateImageLog(logDto);
	}
	
}
