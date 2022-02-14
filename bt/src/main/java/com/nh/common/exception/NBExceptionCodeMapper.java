package com.nh.common.exception;

import org.springframework.stereotype.Component;

import com.tmax.superspring.core.property.ApplicationProperty;

/**
 * 
 * @author CS523102
 * @version 1.0
 * @category Exception
 * @since 2021-11-25
 * @apiNote NBExceptionCodeMapper
 *
 */
@Component
public class NBExceptionCodeMapper {
	String baseErrProp = "nb.common.exception.code";
	String langCd = LANG_KR;
	static final String LANG_KR = "ko";
	static final String LANG_EN = "en";
	
	
	private String getErrProp(String baseErrProp, String errCode, String langCd) {
		
		return baseErrProp + "." + errCode + "." + langCd;
	}
	
	public String getErrorMsg(String errCode) {
		
		return ApplicationProperty.getProperty(getErrProp(baseErrProp, errCode, langCd));
	}
	
	public String getErrorMsg(String errCode, String langCd) {
		if (langCd != null && (langCd.equalsIgnoreCase("EN") || langCd.equalsIgnoreCase("US_EN"))) {
			langCd = LANG_EN;
		} else {
			// Default로 LANG_KR로 메세지 처리
			langCd = LANG_KR; 
		}
		System.out.println(getErrProp(baseErrProp, errCode, langCd));
		
		return ApplicationProperty.getProperty(getErrProp(baseErrProp, errCode, langCd));
	}
}
