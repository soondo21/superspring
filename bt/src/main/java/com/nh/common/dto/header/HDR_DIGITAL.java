package com.nh.common.dto.header;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "22. 2. 24. 오후 2:12",
	comments = "HDR_DIGITAL"
)
public class HDR_DIGITAL extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private com.nh.common.dto.header.sys_comm sys_comm = new com.nh.common.dto.header.sys_comm();
    
    public com.nh.common.dto.header.sys_comm getSys_comm() {
    	return sys_comm;
    }	
    
    public void setSys_comm(com.nh.common.dto.header.sys_comm sys_comm) {
    	if(sys_comm == null) {
    		this.sys_comm = new com.nh.common.dto.header.sys_comm();
    	} else {
    		this.sys_comm = sys_comm;
    	}
    }
    private com.nh.common.dto.header.efn_comm efn_comm = new com.nh.common.dto.header.efn_comm();
    
    public com.nh.common.dto.header.efn_comm getEfn_comm() {
    	return efn_comm;
    }	
    
    public void setEfn_comm(com.nh.common.dto.header.efn_comm efn_comm) {
    	if(efn_comm == null) {
    		this.efn_comm = new com.nh.common.dto.header.efn_comm();
    	} else {
    		this.efn_comm = efn_comm;
    	}
    }
    private com.nh.common.dto.header.dat_comm dat_comm = new com.nh.common.dto.header.dat_comm();
    
    public com.nh.common.dto.header.dat_comm getDat_comm() {
    	return dat_comm;
    }	
    
    public void setDat_comm(com.nh.common.dto.header.dat_comm dat_comm) {
    	if(dat_comm == null) {
    		this.dat_comm = new com.nh.common.dto.header.dat_comm();
    	} else {
    		this.dat_comm = dat_comm;
    	}
    }
    
    public Object clone() {
    	HDR_DIGITAL copyObj = new HDR_DIGITAL();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _hDR_DIGITAL){
    	if(this == _hDR_DIGITAL)
    		return;
    		
    	HDR_DIGITAL __hDR_DIGITAL = (HDR_DIGITAL) _hDR_DIGITAL;
    	com.nh.common.dto.header.sys_comm _value0 = __hDR_DIGITAL.getSys_comm();
    	if(_value0 == null) {
    		this.setSys_comm(null);
    	}else {
    		this.setSys_comm((com.nh.common.dto.header.sys_comm)_value0.clone());
    	}
    	com.nh.common.dto.header.efn_comm _value1 = __hDR_DIGITAL.getEfn_comm();
    	if(_value1 == null) {
    		this.setEfn_comm(null);
    	}else {
    		this.setEfn_comm((com.nh.common.dto.header.efn_comm)_value1.clone());
    	}
    	com.nh.common.dto.header.dat_comm _value2 = __hDR_DIGITAL.getDat_comm();
    	if(_value2 == null) {
    		this.setDat_comm(null);
    	}else {
    		this.setDat_comm((com.nh.common.dto.header.dat_comm)_value2.clone());
    	}
    }
}

