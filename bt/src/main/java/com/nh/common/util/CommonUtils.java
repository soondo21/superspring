package com.nh.common.util;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nh.common.dto.header.HDR_DIGITAL;
import com.nh.common.dto.header.dat_comm;
import com.nh.common.dto.header.efn_comm;
import com.nh.common.dto.header.sys_comm;
//import com.nhbank.common.util.NHUuidGenerator.NHUuidGenerator;
//import com.tmax.nhbank.common.util.DateUtil;

public class CommonUtils {
	
	public HDR_DIGITAL getCommonHeaderDigtal() {
//		NHUuidGenerator uu = new NHUuidGenerator();
        
		HDR_DIGITAL header = new HDR_DIGITAL(); // 시스템 공통 헤더 객체 생성

		sys_comm sys = new sys_comm(); // 시스템 헤더
		efn_comm efn = new efn_comm(); // e-금융 헤더
		dat_comm dat = new dat_comm(); // 데이터 헤더
		
		/* 생성 객체 시스템 공통 헤더에 바인딩 */
		header.setSys_comm(sys);
		header.setEfn_comm(efn);
		header.setDat_comm(dat);
		
		/* 기본 시스템 헤더 내용 작성 */
		header.getSys_comm().setStd_gbl_id("123412341234");                    // 표준글로벌ID(uu.generateUuid())
		header.getSys_comm().setOrgtr_gbl_id("223412341234");                  // 원거래글로벌ID
		header.getSys_comm().setTrz_gbl_id("323412341234");                    // 트랜잭션글로벌ID
		
		header.getSys_comm().setXa_tr_dsc("0");                      // XA거래구분코드
		header.getSys_comm().setSync_dsc("R");                       // 동기구분코드 (동기 = 'S', 비동기 = 'R')
		header.getSys_comm().setAsync_attr_c("0");                   // 비동기속성코드 (응답유 = '0', 응답무 = '1')
		header.getSys_comm().setTr_sysid("BC");                      // 거래시스템ID
		header.getSys_comm().setOrgtr_sysid("BC");                   // 원거래시스템ID
		header.getSys_comm().setLtgrm_sesn_dsc("1");                 // 장전문세션구분코드
		header.getSys_comm().setLtgrm_prc_sqno("000");               // 장전문처리일련번호
		header.getSys_comm().setTtl_ug_ync("0");                     // TTL사용여부코드
		header.getSys_comm().setTtl_fir_sttm("000000");              // TTL최초시작시각
		header.getSys_comm().setTtl_mtn_tm("0");                     // TTL유지시각
		header.getSys_comm().setTgrm_prto_tpc("1");                  // 전문출력유형코드 (단말->서버 = '0', 단전문 = '1', 장전문 (시작:'2',중간:'3',끝:'4')
		header.getSys_comm().setTr_id_no("0");                       // 거래ID번호
		header.getSys_comm().setAut_tr_dsc("0");                     // 자동거래구분코드
		header.getSys_comm().setStd_tgrm_rqr_rsp_dsc("1");           // 표준전문요청응답구분코드 (요청 = '1', 응답 = '2', timeout = 'T'
		header.getSys_comm().setStd_tgrm_lclc("15");                 // 표준전문대분류코드 (... , 15:전자금융, ...)
		header.getSys_comm().setStd_tgrm_chan_c("I0");               // 표준전문채널코드
		//header.getSys_comm().setTr_trm_ipadr("16.24.114.42");        // 거래단말기IP주소 (인터넷뱅킹 = IP, 텔레뱅킹 = 발신자 전화번호)
//		header.getSys_comm().setTr_dtm(DateUtil.toDateTimeString()); // 거래일시 (YYYYMMDDHHmmSS)
		header.getSys_comm().setTgrm_tionm("XXXXXXXXX");             // 전문IO명 (단말 전문 IO명 (ex:10_2001_01), 인터넷뱅킹거래일 경우 USER ID 셋팅가능)
		header.getSys_comm().setStd_tgrm_msg_tpc("0");               // 표준전문메시지유형코드 (0:Normal Message, 1:Broadcasting(착신전문), 2:공통정보메시지(착신전문), 3:장표출력, 4:장표출력(착신전문)
		header.getSys_comm().setOpr_onl_brc("999999");               // 조작온라인사무소코드
		header.getSys_comm().setNaac_dsc("1");                       // 중앙회조합구분코드 (중앙회 = '1', 조합 = '2')
		header.getSys_comm().setTrmn_naac_dsc("1");                  // 거래자중앙회조합구분코드 (중앙회 = '1', 조합 = '2')
		header.getSys_comm().setTrmno("161");                        // 단말기번호
		header.getSys_comm().setOptr_eno("0");                       // 조작자개인번호
		header.getSys_comm().setInp_med_inf_c("0");                  // 입력매체정보코드
		header.getSys_comm().setIccd_setg_ynchar("0");               // IC카드세팅여부
		header.getSys_comm().setPpad_inp_yn("0");                    // PINPAD입력여부
		header.getSys_comm().setMs_inp_yn("0");                      // MS입력여부
		header.getSys_comm().setTr_bsn_dsc("27");                    // 거래업무구분코드
		header.getSys_comm().setAccsc_inp_med_c("302");              // 계정계입력매체코드
		header.getSys_comm().setBzsunt_med_c("100");                 // 사무단위매체코드
		header.getSys_comm().setOpr_brc("999999");                   // 조작사무소코드
		header.getSys_comm().setAxtrm_dti_bsn_dsc("000");            // 부수단말기세부업무구분코드
		header.getSys_comm().setExe_node_no("01");                   // 실행NODE번호
		
		/* 기본 데이터 헤더 내용 작성 */
		header.getDat_comm().setIop_dsc("Y");
		
		return header;
	}
	
	public void headerUtil( ) {
		
	}
	
	public <T> T mapToDto (Map map, Class<T> t) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
		return mapper.convertValue(map, t);
    }
}
