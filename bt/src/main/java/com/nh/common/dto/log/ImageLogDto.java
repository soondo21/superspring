package com.nh.common.dto.log;

import com.tmax.superspring.dto.DataObject;

import java.util.Date;

@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 22. 오후 5:11",
	comments = "ImageLogDto"
)
public class ImageLogDto extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String STD_GBL_ID = new String();
    
    public String getSTD_GBL_ID() {
    	return STD_GBL_ID;
    }	
    
    public void setSTD_GBL_ID(String STD_GBL_ID) {
    	if(STD_GBL_ID == null) {
    		this.STD_GBL_ID = new String();
    	} else {
    		this.STD_GBL_ID = STD_GBL_ID;
    	}
    }
    private String APP_NAME = new String();
    
    public String getAPP_NAME() {
    	return APP_NAME;
    }	
    
    public void setAPP_NAME(String APP_NAME) {
    	if(APP_NAME == null) {
    		this.APP_NAME = new String();
    	} else {
    		this.APP_NAME = APP_NAME;
    	}
    }
    private String APP_PID = new String();
    
    public String getAPP_PID() {
    	return APP_PID;
    }	
    
    public void setAPP_PID(String APP_PID) {
    	if(APP_PID == null) {
    		this.APP_PID = new String();
    	} else {
    		this.APP_PID = APP_PID;
    	}
    }
    private String SERVICE_ID = new String();
    
    public String getSERVICE_ID() {
    	return SERVICE_ID;
    }	
    
    public void setSERVICE_ID(String SERVICE_ID) {
    	if(SERVICE_ID == null) {
    		this.SERVICE_ID = new String();
    	} else {
    		this.SERVICE_ID = SERVICE_ID;
    	}
    }
    private String INPUT_DATA = new String();
    
    public String getINPUT_DATA() {
    	return INPUT_DATA;
    }	
    
    public void setINPUT_DATA(String INPUT_DATA) {
    	if(INPUT_DATA == null) {
    		this.INPUT_DATA = new String();
    	} else {
    		this.INPUT_DATA = INPUT_DATA;
    	}
    }
    private String OUTPUT_DATA = new String();
    
    public String getOUTPUT_DATA() {
    	return OUTPUT_DATA;
    }	
    
    public void setOUTPUT_DATA(String OUTPUT_DATA) {
    	if(OUTPUT_DATA == null) {
    		this.OUTPUT_DATA = new String();
    	} else {
    		this.OUTPUT_DATA = OUTPUT_DATA;
    	}
    }
    private String REQ_PATH = new String();
    
    public String getREQ_PATH() {
    	return REQ_PATH;
    }	
    
    public void setREQ_PATH(String REQ_PATH) {
    	if(REQ_PATH == null) {
    		this.REQ_PATH = new String();
    	} else {
    		this.REQ_PATH = REQ_PATH;
    	}
    }
    private String REQ_METHOD = new String();
    
    public String getREQ_METHOD() {
    	return REQ_METHOD;
    }	
    
    public void setREQ_METHOD(String REQ_METHOD) {
    	if(REQ_METHOD == null) {
    		this.REQ_METHOD = new String();
    	} else {
    		this.REQ_METHOD = REQ_METHOD;
    	}
    }
    private String REQ_CONTENT_TYPE = new String();
    
    public String getREQ_CONTENT_TYPE() {
    	return REQ_CONTENT_TYPE;
    }	
    
    public void setREQ_CONTENT_TYPE(String REQ_CONTENT_TYPE) {
    	if(REQ_CONTENT_TYPE == null) {
    		this.REQ_CONTENT_TYPE = new String();
    	} else {
    		this.REQ_CONTENT_TYPE = REQ_CONTENT_TYPE;
    	}
    }
    private String REQ_REMOTE_ADDR = new String();
    
    public String getREQ_REMOTE_ADDR() {
    	return REQ_REMOTE_ADDR;
    }	
    
    public void setREQ_REMOTE_ADDR(String REQ_REMOTE_ADDR) {
    	if(REQ_REMOTE_ADDR == null) {
    		this.REQ_REMOTE_ADDR = new String();
    	} else {
    		this.REQ_REMOTE_ADDR = REQ_REMOTE_ADDR;
    	}
    }
    private Date CREADTED_TIME = null;
    
    public Date getCREADTED_TIME() {
    	return CREADTED_TIME;
    }	
    
    public void setCREADTED_TIME(Date CREADTED_TIME) {
    	if(CREADTED_TIME == null) {
    		this.CREADTED_TIME = null;
    	} else {
    		this.CREADTED_TIME = CREADTED_TIME;
    	}
    }
    public void setCREADTED_TIME(java.sql.Date CREADTED_TIME) {
    	if(CREADTED_TIME == null) {
    		this.CREADTED_TIME = null;
    	} else{
    		this.CREADTED_TIME = new Date(CREADTED_TIME.getTime());
    	}
    }
    public void setCREADTED_TIME(long CREADTED_TIME) {
    	this.CREADTED_TIME = new Date(CREADTED_TIME);
    }
    private Date END_TIME = null;
    
    public Date getEND_TIME() {
    	return END_TIME;
    }	
    
    public void setEND_TIME(Date END_TIME) {
    	if(END_TIME == null) {
    		this.END_TIME = null;
    	} else {
    		this.END_TIME = END_TIME;
    	}
    }
    public void setEND_TIME(java.sql.Date END_TIME) {
    	if(END_TIME == null) {
    		this.END_TIME = null;
    	} else{
    		this.END_TIME = new Date(END_TIME.getTime());
    	}
    }
    public void setEND_TIME(long END_TIME) {
    	this.END_TIME = new Date(END_TIME);
    }
    
    public Object clone() {
    	ImageLogDto copyObj = new ImageLogDto();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _imageLogDto){
    	if(this == _imageLogDto)
    		return;
    		
    	ImageLogDto __imageLogDto = (ImageLogDto) _imageLogDto;
    	this.setSTD_GBL_ID(__imageLogDto.getSTD_GBL_ID());
    	this.setAPP_NAME(__imageLogDto.getAPP_NAME());
    	this.setAPP_PID(__imageLogDto.getAPP_PID());
    	this.setSERVICE_ID(__imageLogDto.getSERVICE_ID());
    	this.setINPUT_DATA(__imageLogDto.getINPUT_DATA());
    	this.setOUTPUT_DATA(__imageLogDto.getOUTPUT_DATA());
    	this.setREQ_PATH(__imageLogDto.getREQ_PATH());
    	this.setREQ_METHOD(__imageLogDto.getREQ_METHOD());
    	this.setREQ_CONTENT_TYPE(__imageLogDto.getREQ_CONTENT_TYPE());
    	this.setREQ_REMOTE_ADDR(__imageLogDto.getREQ_REMOTE_ADDR());
    	Date _value10 = __imageLogDto.getCREADTED_TIME();
    	if(_value10 == null) {
    		this.setCREADTED_TIME(null);
    	}else {
    		this.setCREADTED_TIME((Date)_value10.clone());
    	}
    	Date _value11 = __imageLogDto.getEND_TIME();
    	if(_value11 == null) {
    		this.setEND_TIME(null);
    	}else {
    		this.setEND_TIME((Date)_value11.clone());
    	}
    }
}

