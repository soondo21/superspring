package com.nh.common.dto.error;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 12. 27. 오후 1:42",
	comments = "HDR_N0_ERR"
)
public class HDR_N0_ERR extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String err_fildnm = new String();
    
    public String getErr_fildnm() {
    	return err_fildnm;
    }	
    
    public void setErr_fildnm(String err_fildnm) {
    	if(err_fildnm == null) {
    		this.err_fildnm = new String();
    	} else {
    		this.err_fildnm = err_fildnm;
    	}
    }
    private int std_err_cn = 0;
    
    public int getStd_err_cn() {
    	return std_err_cn;
    }	
    
    public void setStd_err_cn(int std_err_cn) {
    	this.std_err_cn = std_err_cn;
    }
    public void setStd_err_cn(Integer std_err_cn) {
    	if( std_err_cn == null) {
    		this.std_err_cn = 0;
    	} else{
    		this.std_err_cn = std_err_cn.intValue();
    	}
    }
    public void setStd_err_cn(String std_err_cn) {
    	if  (std_err_cn==null || std_err_cn.length() == 0) {
    		this.std_err_cn = 0;
    	} else {
    		this.std_err_cn = Integer.parseInt(std_err_cn);
    	}
    }
    private com.nh.common.dto.error.HDR_N0_ERR_SUB sub = new com.nh.common.dto.error.HDR_N0_ERR_SUB();
    
    public com.nh.common.dto.error.HDR_N0_ERR_SUB getSub() {
    	return sub;
    }	
    
    public void setSub(com.nh.common.dto.error.HDR_N0_ERR_SUB sub) {
    	if(sub == null) {
    		this.sub = new com.nh.common.dto.error.HDR_N0_ERR_SUB();
    	} else {
    		this.sub = sub;
    	}
    }
    
    public Object clone() {
    	HDR_N0_ERR copyObj = new HDR_N0_ERR();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _hDR_N0_ERR){
    	if(this == _hDR_N0_ERR)
    		return;
    		
    	HDR_N0_ERR __hDR_N0_ERR = (HDR_N0_ERR) _hDR_N0_ERR;
    	this.setErr_fildnm(__hDR_N0_ERR.getErr_fildnm());
    	this.setStd_err_cn(__hDR_N0_ERR.getStd_err_cn());
    	com.nh.common.dto.error.HDR_N0_ERR_SUB _value2 = __hDR_N0_ERR.getSub();
    	if(_value2 == null) {
    		this.setSub(null);
    	}else {
    		this.setSub((com.nh.common.dto.error.HDR_N0_ERR_SUB)_value2.clone());
    	}
    }
}

