package com.nh.dto.common;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 24. 오후 4:29",
	comments = "svcidata"
)
public class svcidata extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String rlno = new String();
    
    public String getRlno() {
    	return rlno;
    }	
    
    public void setRlno(String rlno) {
    	if(rlno == null) {
    		this.rlno = new String();
    	} else {
    		this.rlno = rlno;
    	}
    }
    private String iccd_lmt_sbt_call_yn = new String();
    
    public String getIccd_lmt_sbt_call_yn() {
    	return iccd_lmt_sbt_call_yn;
    }	
    
    public void setIccd_lmt_sbt_call_yn(String iccd_lmt_sbt_call_yn) {
    	if(iccd_lmt_sbt_call_yn == null) {
    		this.iccd_lmt_sbt_call_yn = new String();
    	} else {
    		this.iccd_lmt_sbt_call_yn = iccd_lmt_sbt_call_yn;
    	}
    }
    private com.nh.dto.common.de_johoi_common de_johoi_common = new com.nh.dto.common.de_johoi_common();
    
    public com.nh.dto.common.de_johoi_common getDe_johoi_common() {
    	return de_johoi_common;
    }	
    
    public void setDe_johoi_common(com.nh.dto.common.de_johoi_common de_johoi_common) {
    	if(de_johoi_common == null) {
    		this.de_johoi_common = new com.nh.dto.common.de_johoi_common();
    	} else {
    		this.de_johoi_common = de_johoi_common;
    	}
    }
    private com.nh.dto.common.de_johoi_in de_johoi_in = new com.nh.dto.common.de_johoi_in();
    
    public com.nh.dto.common.de_johoi_in getDe_johoi_in() {
    	return de_johoi_in;
    }	
    
    public void setDe_johoi_in(com.nh.dto.common.de_johoi_in de_johoi_in) {
    	if(de_johoi_in == null) {
    		this.de_johoi_in = new com.nh.dto.common.de_johoi_in();
    	} else {
    		this.de_johoi_in = de_johoi_in;
    	}
    }
    private com.nh.dto.common.iccm_common iccm_common = new com.nh.dto.common.iccm_common();
    
    public com.nh.dto.common.iccm_common getIccm_common() {
    	return iccm_common;
    }	
    
    public void setIccm_common(com.nh.dto.common.iccm_common iccm_common) {
    	if(iccm_common == null) {
    		this.iccm_common = new com.nh.dto.common.iccm_common();
    	} else {
    		this.iccm_common = iccm_common;
    	}
    }
    private com.nh.dto.common.iccm_johoi_in iccm_johoi_in = new com.nh.dto.common.iccm_johoi_in();
    
    public com.nh.dto.common.iccm_johoi_in getIccm_johoi_in() {
    	return iccm_johoi_in;
    }	
    
    public void setIccm_johoi_in(com.nh.dto.common.iccm_johoi_in iccm_johoi_in) {
    	if(iccm_johoi_in == null) {
    		this.iccm_johoi_in = new com.nh.dto.common.iccm_johoi_in();
    	} else {
    		this.iccm_johoi_in = iccm_johoi_in;
    	}
    }
    
    public Object clone() {
    	svcidata copyObj = new svcidata();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _svcidata){
    	if(this == _svcidata)
    		return;
    		
    	svcidata __svcidata = (svcidata) _svcidata;
    	this.setRlno(__svcidata.getRlno());
    	this.setIccd_lmt_sbt_call_yn(__svcidata.getIccd_lmt_sbt_call_yn());
    	com.nh.dto.common.de_johoi_common _value2 = __svcidata.getDe_johoi_common();
    	if(_value2 == null) {
    		this.setDe_johoi_common(null);
    	}else {
    		this.setDe_johoi_common((com.nh.dto.common.de_johoi_common)_value2.clone());
    	}
    	com.nh.dto.common.de_johoi_in _value3 = __svcidata.getDe_johoi_in();
    	if(_value3 == null) {
    		this.setDe_johoi_in(null);
    	}else {
    		this.setDe_johoi_in((com.nh.dto.common.de_johoi_in)_value3.clone());
    	}
    	com.nh.dto.common.iccm_common _value4 = __svcidata.getIccm_common();
    	if(_value4 == null) {
    		this.setIccm_common(null);
    	}else {
    		this.setIccm_common((com.nh.dto.common.iccm_common)_value4.clone());
    	}
    	com.nh.dto.common.iccm_johoi_in _value5 = __svcidata.getIccm_johoi_in();
    	if(_value5 == null) {
    		this.setIccm_johoi_in(null);
    	}else {
    		this.setIccm_johoi_in((com.nh.dto.common.iccm_johoi_in)_value5.clone());
    	}
    }
}

