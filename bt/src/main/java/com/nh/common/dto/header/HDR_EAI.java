package com.nh.common.dto.header;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 8. 오전 11:16",
	comments = "HDR_EAI"
)
public class HDR_EAI
{
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
    private com.nh.common.dto.header.eai_comm eai_comm = new com.nh.common.dto.header.eai_comm();
    
    public com.nh.common.dto.header.eai_comm getEai_comm() {
    	return eai_comm;
    }	
    
    public void setEai_comm(com.nh.common.dto.header.eai_comm eai_comm) {
    	if(eai_comm == null) {
    		this.eai_comm = new com.nh.common.dto.header.eai_comm();
    	} else {
    		this.eai_comm = eai_comm;
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
}

