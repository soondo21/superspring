package com.nh.common.exception;

import java.util.Arrays;
import java.util.Map;

/**
 * 
 * @author CS523102
 * @version 1.0
 * @category Exception
 * @since 2021-11-24
 * @apiNote BaseNBException 구현
 *
 */

public class BaseNBException extends Exception {
	private static final long serialVersionUID = 1L;

	private String stdErrCode;
	
	private String channelErrCode;
	
	private String stdErrMsgContents;
	
	private String addMsgContents;
	
	private String obsKindCode;
	
	private String errServiceName;
	
	private String errFileName;
	
	private String errMethodName;
	
	private int pgmLineNo;       // 여기까지 PfmErrorHeaderStrExt Field 정의
	
	private String[] messageValue;
	
	private String debuggingMessage;
	
	private String errorPageUrl;
	
	private Map httpResponseHeaderMap;
	
	public enum TYPE {
		COMMON, WEB, BIZ, USER, AUTH, SERVICE;
	}
	
	private boolean useOriginTemplate = true;
	
	private boolean isUseOriginTemplateSetByUser = false;
	
	private Map<String, Object> exceptionCommon;
	
	private Map<String, Object> exceptionCause;
	
	private boolean ignoreMetaReturnServiceId = false;
	
	private boolean doNotWriteErrorLog = false;
	
	public BaseNBException() {
		setStdErrCode(null);
		setChannelErrCode(null);
		this.messageValue = null;
		this.debuggingMessage = null;
		getErrClassInfo(this);
	}
	
	public BaseNBException(String _stdErrCode, Throwable _e) {
		this(_stdErrCode, _stdErrCode, null, _e);
	}
	
	public BaseNBException(String _stdErrCode) {
		this(_stdErrCode, _stdErrCode, (String[])null);
	}
	
	public BaseNBException(String _stdErrCode, String[] _messageValue, Throwable _e) {
		this(_stdErrCode, _stdErrCode, _messageValue, _e);
	}
	
	public BaseNBException(String _stdErrCode, String[] _messageValue) {
		this(_stdErrCode, _stdErrCode, _messageValue);
	}
	
	public BaseNBException(String _stdErrCode, String _channelErrCode, String[] _messageValue, Throwable _e) {
		super(_e);
		setStdErrCode(_stdErrCode);
		setChannelErrCode(_channelErrCode);
		this.messageValue = _messageValue;
		getErrClassInfo(_e);
	}
	
	public BaseNBException(String _stdErrCode, String _channelErrCode, String[] _messageValue) {
		setStdErrCode(_stdErrCode);
		setChannelErrCode(_channelErrCode);
		this.messageValue = _messageValue;
		getErrClassInfo(this);
	}
	
	private void getErrClassInfo(Throwable e) {
		StackTraceElement[] se = e.getStackTrace();
		if (se != null && se.length > 0) {
			this.errFileName = se[0].getClassName();
			this.errMethodName = se[0].getMethodName();
			this.pgmLineNo = se[0].getLineNumber();
		} 
	}

	public String getStdErrCode() {
		return stdErrCode;
	}

	public void setStdErrCode(String stdErrCode) {
		this.stdErrCode = stdErrCode;
	}

	public String getChannelErrCode() {
		return channelErrCode;
	}

	public void setChannelErrCode(String channelErrCode) {
		this.channelErrCode = channelErrCode;
	}

	public String getStdErrMsgContents() {
		return stdErrMsgContents;
	}

	public void setStdErrMsgContents(String stdErrMsgContents) {
		this.stdErrMsgContents = stdErrMsgContents;
	}

	public String getAddMsgContents() {
		return addMsgContents;
	}

	public void setAddMsgContents(String addMsgContents) {
		this.addMsgContents = addMsgContents;
	}

	public String getObsKindCode() {
		return obsKindCode;
	}

	public void setObsKindCode(String obsKindCode) {
		this.obsKindCode = obsKindCode;
	}

	public String getErrServiceName() {
		return errServiceName;
	}

	public void setErrServiceName(String errServiceName) {
		this.errServiceName = errServiceName;
	}

	public String getErrFileName() {
		return errFileName;
	}

	public void setErrFileName(String errFileName) {
		this.errFileName = errFileName;
	}

	public String getErrMethodName() {
		return errMethodName;
	}

	public void setErrMethodName(String errMethodName) {
		this.errMethodName = errMethodName;
	}

	public int getPgmLineNo() {
		return pgmLineNo;
	}

	public void setPgmLineNo(int pgmLineNo) {
		this.pgmLineNo = pgmLineNo;
	}

	public String[] getMessageValue() {
		return messageValue;
	}

	public void setMessageValue(String[] messageValue) {
		this.messageValue = messageValue;
	}

	public String getDebuggingMessage() {
		return debuggingMessage;
	}

	public void setDebuggingMessage(String debuggingMessage) {
		this.debuggingMessage = debuggingMessage;
	}

	public String getErrorPageUrl() {
		return errorPageUrl;
	}

	public void setErrorPageUrl(String errorPageUrl) {
		this.errorPageUrl = errorPageUrl;
	}

	public Map getHttpResponseHeaderMap() {
		return httpResponseHeaderMap;
	}

	public void setHttpResponseHeaderMap(Map httpResponseHeaderMap) {
		this.httpResponseHeaderMap = httpResponseHeaderMap;
	}

	public boolean isUseOriginTemplate() {
		return useOriginTemplate;
	}

	public void setUseOriginTemplate(boolean useOriginTemplate) {
		this.useOriginTemplate = useOriginTemplate;
	}

	public boolean isUseOriginTemplateSetByUser() {
		return isUseOriginTemplateSetByUser;
	}

	public void setUseOriginTemplateSetByUser(boolean isUseOriginTemplateSetByUser) {
		this.isUseOriginTemplateSetByUser = isUseOriginTemplateSetByUser;
	}

	public Map<String, Object> getExceptionCommon() {
		return exceptionCommon;
	}

	public void setExceptionCommon(Map<String, Object> exceptionCommon) {
		this.exceptionCommon = exceptionCommon;
	}

	public Map<String, Object> getExceptionCause() {
		return exceptionCause;
	}

	public void setExceptionCause(Map<String, Object> exceptionCause) {
		this.exceptionCause = exceptionCause;
	}

	public boolean isIgnoreMetaReturnServiceId() {
		return ignoreMetaReturnServiceId;
	}

	public void setIgnoreMetaReturnServiceId(boolean ignoreMetaReturnServiceId) {
		this.ignoreMetaReturnServiceId = ignoreMetaReturnServiceId;
	}

	public boolean isDoNotWriteErrorLog() {
		return doNotWriteErrorLog;
	}

	public void setDoNotWriteErrorLog(boolean doNotWriteErrorLog) {
		this.doNotWriteErrorLog = doNotWriteErrorLog;
	}
	
	
	public String toString() {
		return String.valueOf(getClass().getName()) + "	[std_err_c=" + this.stdErrCode + ", chan_err_c=" + this.channelErrCode + 
			", std_err_msg_cntn=" + this.stdErrMsgContents + ", add_msg_cntn=" + this.addMsgContents + ", err_svcnm=" + this.errServiceName + 
			", err_flnm=" + this.errFileName + ", err_mthdnm=" + this.errMethodName + ", pgm_line_no=" + this.pgmLineNo + "]";
	}
}
