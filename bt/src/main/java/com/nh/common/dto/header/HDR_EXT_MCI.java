package com.nh.common.dto.header;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 8. 오전 11:16",
	comments = "HDR_EXT_MCI"
)
public class HDR_EXT_MCI
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
    private com.nh.common.dto.header.fep_comm fep_comm = new com.nh.common.dto.header.fep_comm();
    
    public com.nh.common.dto.header.fep_comm getFep_comm() {
    	return fep_comm;
    }	
    
    public void setFep_comm(com.nh.common.dto.header.fep_comm fep_comm) {
    	if(fep_comm == null) {
    		this.fep_comm = new com.nh.common.dto.header.fep_comm();
    	} else {
    		this.fep_comm = fep_comm;
    	}
    }
}

