package com.nh.dto.NCCLI003RI;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 24. 오후 4:30",
	comments = "NCCLI003RI_IN"
)
public class NCCLI003RI_IN extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private com.nh.dto.common.pfmidata pfmidata = new com.nh.dto.common.pfmidata();
    
    public com.nh.dto.common.pfmidata getPfmidata() {
    	return pfmidata;
    }	
    
    public void setPfmidata(com.nh.dto.common.pfmidata pfmidata) {
    	if(pfmidata == null) {
    		this.pfmidata = new com.nh.dto.common.pfmidata();
    	} else {
    		this.pfmidata = pfmidata;
    	}
    }
    private com.nh.dto.common.ncclidata ncclidata = new com.nh.dto.common.ncclidata();
    
    public com.nh.dto.common.ncclidata getNcclidata() {
    	return ncclidata;
    }	
    
    public void setNcclidata(com.nh.dto.common.ncclidata ncclidata) {
    	if(ncclidata == null) {
    		this.ncclidata = new com.nh.dto.common.ncclidata();
    	} else {
    		this.ncclidata = ncclidata;
    	}
    }
    private com.nh.dto.common.svcidata svcidata = new com.nh.dto.common.svcidata();
    
    public com.nh.dto.common.svcidata getSvcidata() {
    	return svcidata;
    }	
    
    public void setSvcidata(com.nh.dto.common.svcidata svcidata) {
    	if(svcidata == null) {
    		this.svcidata = new com.nh.dto.common.svcidata();
    	} else {
    		this.svcidata = svcidata;
    	}
    }
    
    public Object clone() {
    	NCCLI003RI_IN copyObj = new NCCLI003RI_IN();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _nCCLI003RI_IN){
    	if(this == _nCCLI003RI_IN)
    		return;
    		
    	NCCLI003RI_IN __nCCLI003RI_IN = (NCCLI003RI_IN) _nCCLI003RI_IN;
    	com.nh.dto.common.pfmidata _value0 = __nCCLI003RI_IN.getPfmidata();
    	if(_value0 == null) {
    		this.setPfmidata(null);
    	}else {
    		this.setPfmidata((com.nh.dto.common.pfmidata)_value0.clone());
    	}
    	com.nh.dto.common.ncclidata _value1 = __nCCLI003RI_IN.getNcclidata();
    	if(_value1 == null) {
    		this.setNcclidata(null);
    	}else {
    		this.setNcclidata((com.nh.dto.common.ncclidata)_value1.clone());
    	}
    	com.nh.dto.common.svcidata _value2 = __nCCLI003RI_IN.getSvcidata();
    	if(_value2 == null) {
    		this.setSvcidata(null);
    	}else {
    		this.setSvcidata((com.nh.dto.common.svcidata)_value2.clone());
    	}
    }
}

