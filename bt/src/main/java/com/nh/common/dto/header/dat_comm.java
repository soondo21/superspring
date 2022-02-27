package com.nh.common.dto.header;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "22. 2. 28. 오전 8:37",
	comments = "dat_comm"
)
public class dat_comm extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String iop_dsc = new String();
    
    public String getIop_dsc() {
    	return iop_dsc;
    }	
    
    public void setIop_dsc(String iop_dsc) {
    	if(iop_dsc == null) {
    		this.iop_dsc = new String();
    	} else {
    		this.iop_dsc = iop_dsc;
    	}
    }
    private String screen_id = new String();
    
    public String getScreen_id() {
    	return screen_id;
    }	
    
    public void setScreen_id(String screen_id) {
    	if(screen_id == null) {
    		this.screen_id = new String();
    	} else {
    		this.screen_id = screen_id;
    	}
    }
    private String data_hdr_dtlc = new String();
    
    public String getData_hdr_dtlc() {
    	return data_hdr_dtlc;
    }	
    
    public void setData_hdr_dtlc(String data_hdr_dtlc) {
    	if(data_hdr_dtlc == null) {
    		this.data_hdr_dtlc = new String();
    	} else {
    		this.data_hdr_dtlc = data_hdr_dtlc;
    	}
    }
    private String data_hdr_pranm = new String();
    
    public String getData_hdr_pranm() {
    	return data_hdr_pranm;
    }	
    
    public void setData_hdr_pranm(String data_hdr_pranm) {
    	if(data_hdr_pranm == null) {
    		this.data_hdr_pranm = new String();
    	} else {
    		this.data_hdr_pranm = data_hdr_pranm;
    	}
    }
    private String tgrm_data_len = new String();
    
    public String getTgrm_data_len() {
    	return tgrm_data_len;
    }	
    
    public void setTgrm_data_len(String tgrm_data_len) {
    	if(tgrm_data_len == null) {
    		this.tgrm_data_len = new String();
    	} else {
    		this.tgrm_data_len = tgrm_data_len;
    	}
    }
    
    public Object clone() {
    	dat_comm copyObj = new dat_comm();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _dat_comm){
    	if(this == _dat_comm)
    		return;
    		
    	dat_comm __dat_comm = (dat_comm) _dat_comm;
    	this.setIop_dsc(__dat_comm.getIop_dsc());
    	this.setScreen_id(__dat_comm.getScreen_id());
    	this.setData_hdr_dtlc(__dat_comm.getData_hdr_dtlc());
    	this.setData_hdr_pranm(__dat_comm.getData_hdr_pranm());
    	this.setTgrm_data_len(__dat_comm.getTgrm_data_len());
    }
}

