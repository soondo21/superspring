package com.nh.service.NCCLI003RI;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

import com.nh.common.exception.BaseNBException;
import com.nh.common.service.interfaces.ServiceObject;
import com.nh.common.transaction.TransactionManagerHolder;
import com.nh.dto.NCCLI003RI.NCCLI003RI_IN;
import com.nh.dto.NCCLI003RI.NCCLI003RI_OUT;
import com.nh.dto.NCCLI003RI.de_johoi_out;
import com.nh.dto.NCCLI003RI.de_johoi_out_sub02;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author CS523102
 * @category Service
 * @className NCCLI003RIService
 * @apiNote 비즈니스 서비스 로직을 구현하는 예제입니다.
 */
@Service
@Slf4j
public class NCCLI003RIService implements ServiceObject<NCCLI003RI_IN, NCCLI003RI_OUT> {

	private static final String serviceTxDef = "serviceTxDef";

	private String serviceName = "NCCLI003RIService";
	private String obsKindCode = "SVC";

	@Override
	public NCCLI003RI_OUT service(NCCLI003RI_IN input) throws Throwable {
		NCCLI003RI_OUT out = new NCCLI003RI_OUT();
		de_johoi_out djo = new de_johoi_out();
		de_johoi_out_sub02 djos02 = new de_johoi_out_sub02();

		// 비즈니스 서비스 레벨의 Transaction을 별도로 사용하는 예제입니다.
		TransactionStatus serviceTx = TransactionManagerHolder.getInstance().beginTransaction(serviceTxDef);

		try {

			// ********************************************************************************
			// *
			// * 비즈니스 서비스 로직 작성하는 영역
			// *
			// ********************************************************************************

			// test용
			log.info("[NCCLI003RIService][service] NCCLI003RI_IN iccd_lmt_sbt_call_yn : "
					+ input.getSvcidata().getIccd_lmt_sbt_call_yn());

			// 위의 비즈니스 로직이 정상적으로 수행되면 Transaction Commit을 수행합니다.
			TransactionManagerHolder.getInstance().commit(serviceTx);
		} catch (Exception e) {
			// 비즈니스 로직 처리 시 Exception이 발생하는 경우 Transaction Rollback을 수행합니다.
			TransactionManagerHolder.getInstance().rollback(serviceTx);

			// 에러 부가메세지 작성
			String[] add_msg_cntn = { "전송시스템에 문의하시기 바랍니다.", "시스템관리부 연락처 : 123-456-789" };

			/*
			 * BaseNBException(표준에러코드, 채널에러코드, 부가메세지, Exception) 현재는 업무 개발자가 채널에러코드를 입력하게 되어
			 * 있지만 추후 표준전문헤더에서 발췌하는 방식으로 변경 예정
			 */
			BaseNBException baseNBException = new BaseNBException("EACO00001", "ERR_500_0001", add_msg_cntn, e);
			baseNBException.setErrServiceName(serviceName);
			baseNBException.setObsKindCode(obsKindCode);
			throw baseNBException;
		}

		return out;
	}

}
