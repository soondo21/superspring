package com.nh.dto.common;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 24. 오후 4:29",
	comments = "pfmidata"
)
public class pfmidata extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String rlno_dsc = new String();
    
    public String getRlno_dsc() {
    	return rlno_dsc;
    }	
    
    public void setRlno_dsc(String rlno_dsc) {
    	if(rlno_dsc == null) {
    		this.rlno_dsc = new String();
    	} else {
    		this.rlno_dsc = rlno_dsc;
    	}
    }
    private String cusno = new String();
    
    public String getCusno() {
    	return cusno;
    }	
    
    public void setCusno(String cusno) {
    	if(cusno == null) {
    		this.cusno = new String();
    	} else {
    		this.cusno = cusno;
    	}
    }
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
    private String rckn_dt = new String();
    
    public String getRckn_dt() {
    	return rckn_dt;
    }	
    
    public void setRckn_dt(String rckn_dt) {
    	if(rckn_dt == null) {
    		this.rckn_dt = new String();
    	} else {
    		this.rckn_dt = rckn_dt;
    	}
    }
    private String otbrc = new String();
    
    public String getOtbrc() {
    	return otbrc;
    }	
    
    public void setOtbrc(String otbrc) {
    	if(otbrc == null) {
    		this.otbrc = new String();
    	} else {
    		this.otbrc = otbrc;
    	}
    }
    
    public Object clone() {
    	pfmidata copyObj = new pfmidata();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _pfmidata){
    	if(this == _pfmidata)
    		return;
    		
    	pfmidata __pfmidata = (pfmidata) _pfmidata;
    	this.setRlno_dsc(__pfmidata.getRlno_dsc());
    	this.setCusno(__pfmidata.getCusno());
    	this.setRlno(__pfmidata.getRlno());
    	this.setRckn_dt(__pfmidata.getRckn_dt());
    	this.setOtbrc(__pfmidata.getOtbrc());
    }
}

