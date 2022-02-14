package com.nh.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nh.common.dto.error.HDR_N0_ERR;
import com.nh.common.dto.error.HDR_N0_ERR_SUB;
import com.nh.common.exception.BaseNBException;
import com.nh.common.exception.NBExceptionCodeMapper;
import com.tmax.superspring.dto.DataObject;

/**
 * 
 * @author CS523102
 * @version 1.0
 * @category Exception
 * @since 2021-11-25
 * @apiNote NHException 발생 시 해당 에러를 처리하는 로직 구현(일단 단일 Exception 처리로 구현)
 *
 */
@Service
public class ExceptionHandler {
	
	private final NBExceptionCodeMapper errCodeMapper;
	
	@Autowired
	public ExceptionHandler(NBExceptionCodeMapper errCodeMapper) {
		this.errCodeMapper = errCodeMapper;
	}
	
	private HDR_N0_ERR err_dto = new HDR_N0_ERR();
	
	// ERR_SUB DTO 생성 및 값 입력
	private HDR_N0_ERR_SUB err_sub_dto = null;
	
	private String arrayToString(String[] add_msg_cntn) {
		StringBuilder stringBuilder = new StringBuilder();
		int length = 1;
		for(String msg : add_msg_cntn) {
			stringBuilder.append(msg);
			if(length != add_msg_cntn.length) {
				stringBuilder.append(System.lineSeparator());
			}
			length++;
		}
		return stringBuilder.toString();
	}
	
	public DataObject exceptionHandle(Throwable t, String langCd) {
		err_dto.setErr_fildnm("SampleError");  // 이건 뭔지 모르겠음
		err_dto.setStd_err_cn(1);
		
		if(t instanceof BaseNBException) {
			err_sub_dto = new HDR_N0_ERR_SUB();
			err_sub_dto.setStd_err_c(((BaseNBException) t).getStdErrCode());
			err_sub_dto.setChan_err_c(((BaseNBException) t).getChannelErrCode());
			err_sub_dto.setStd_err_msg_cntn(errCodeMapper.getErrorMsg(((BaseNBException) t).getStdErrCode(), langCd));
			err_sub_dto.setAdd_msg_cntn(arrayToString(((BaseNBException)t).getMessageValue()));
			err_sub_dto.setObs_kdc(((BaseNBException) t).getObsKindCode());
			err_sub_dto.setErr_svcnm(((BaseNBException) t).getErrServiceName());
			err_sub_dto.setErr_flnm(((BaseNBException) t).getErrFileName());
			err_sub_dto.setErr_mthdnm(((BaseNBException) t).getErrMethodName());
			err_sub_dto.setPgm_line_no(((BaseNBException) t).getPgmLineNo());
			err_dto.setSub(err_sub_dto);
		}
		
		return err_dto;
	}
}
