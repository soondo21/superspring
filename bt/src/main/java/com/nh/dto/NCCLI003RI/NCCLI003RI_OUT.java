package com.nh.dto.NCCLI003RI;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 24. 오후 4:30",
	comments = "NCCLI003RI_OUT"
)
public class NCCLI003RI_OUT extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private com.nh.dto.NCCLI003RI.de_johoi_out de_johoi_out = new com.nh.dto.NCCLI003RI.de_johoi_out();
    
    public com.nh.dto.NCCLI003RI.de_johoi_out getDe_johoi_out() {
    	return de_johoi_out;
    }	
    
    public void setDe_johoi_out(com.nh.dto.NCCLI003RI.de_johoi_out de_johoi_out) {
    	if(de_johoi_out == null) {
    		this.de_johoi_out = new com.nh.dto.NCCLI003RI.de_johoi_out();
    	} else {
    		this.de_johoi_out = de_johoi_out;
    	}
    }
    private com.nh.dto.NCCLI003RI.de_johoi_out_sub02 de_johoi_out_sub02 = new com.nh.dto.NCCLI003RI.de_johoi_out_sub02();
    
    public com.nh.dto.NCCLI003RI.de_johoi_out_sub02 getDe_johoi_out_sub02() {
    	return de_johoi_out_sub02;
    }	
    
    public void setDe_johoi_out_sub02(com.nh.dto.NCCLI003RI.de_johoi_out_sub02 de_johoi_out_sub02) {
    	if(de_johoi_out_sub02 == null) {
    		this.de_johoi_out_sub02 = new com.nh.dto.NCCLI003RI.de_johoi_out_sub02();
    	} else {
    		this.de_johoi_out_sub02 = de_johoi_out_sub02;
    	}
    }
    private String io_gi_row_cnt = new String();
    
    public String getIo_gi_row_cnt() {
    	return io_gi_row_cnt;
    }	
    
    public void setIo_gi_row_cnt(String io_gi_row_cnt) {
    	if(io_gi_row_cnt == null) {
    		this.io_gi_row_cnt = new String();
    	} else {
    		this.io_gi_row_cnt = io_gi_row_cnt;
    	}
    }
    private String io_gi_row_cnt2 = new String();
    
    public String getIo_gi_row_cnt2() {
    	return io_gi_row_cnt2;
    }	
    
    public void setIo_gi_row_cnt2(String io_gi_row_cnt2) {
    	if(io_gi_row_cnt2 == null) {
    		this.io_gi_row_cnt2 = new String();
    	} else {
    		this.io_gi_row_cnt2 = io_gi_row_cnt2;
    	}
    }
    
    public Object clone() {
    	NCCLI003RI_OUT copyObj = new NCCLI003RI_OUT();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _nCCLI003RI_OUT){
    	if(this == _nCCLI003RI_OUT)
    		return;
    		
    	NCCLI003RI_OUT __nCCLI003RI_OUT = (NCCLI003RI_OUT) _nCCLI003RI_OUT;
    	com.nh.dto.NCCLI003RI.de_johoi_out _value0 = __nCCLI003RI_OUT.getDe_johoi_out();
    	if(_value0 == null) {
    		this.setDe_johoi_out(null);
    	}else {
    		this.setDe_johoi_out((com.nh.dto.NCCLI003RI.de_johoi_out)_value0.clone());
    	}
    	com.nh.dto.NCCLI003RI.de_johoi_out_sub02 _value1 = __nCCLI003RI_OUT.getDe_johoi_out_sub02();
    	if(_value1 == null) {
    		this.setDe_johoi_out_sub02(null);
    	}else {
    		this.setDe_johoi_out_sub02((com.nh.dto.NCCLI003RI.de_johoi_out_sub02)_value1.clone());
    	}
    	this.setIo_gi_row_cnt(__nCCLI003RI_OUT.getIo_gi_row_cnt());
    	this.setIo_gi_row_cnt2(__nCCLI003RI_OUT.getIo_gi_row_cnt2());
    }
}

