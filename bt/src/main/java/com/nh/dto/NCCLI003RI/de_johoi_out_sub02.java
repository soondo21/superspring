package com.nh.dto.NCCLI003RI;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "22. 2. 14. 오전 10:36",
	comments = "de_johoi_out_sub02"
)
public class de_johoi_out_sub02 extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String dpz_wrs_sq3_cfc = new String();
    
    public String getDpz_wrs_sq3_cfc() {
    	return dpz_wrs_sq3_cfc;
    }	
    
    public void setDpz_wrs_sq3_cfc(String dpz_wrs_sq3_cfc) {
    	if(dpz_wrs_sq3_cfc == null) {
    		this.dpz_wrs_sq3_cfc = new String();
    	} else {
    		this.dpz_wrs_sq3_cfc = dpz_wrs_sq3_cfc;
    	}
    }
    
    public Object clone() {
    	de_johoi_out_sub02 copyObj = new de_johoi_out_sub02();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _de_johoi_out_sub02){
    	if(this == _de_johoi_out_sub02)
    		return;
    		
    	de_johoi_out_sub02 __de_johoi_out_sub02 = (de_johoi_out_sub02) _de_johoi_out_sub02;
    	this.setDpz_wrs_sq3_cfc(__de_johoi_out_sub02.getDpz_wrs_sq3_cfc());
    }
}

