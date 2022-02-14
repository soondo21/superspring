package com.nh.dto.common;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 24. 오후 4:29",
	comments = "ncclidata"
)
public class ncclidata extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String io_gse_dti_bsn_dsc = new String();
    
    public String getIo_gse_dti_bsn_dsc() {
    	return io_gse_dti_bsn_dsc;
    }	
    
    public void setIo_gse_dti_bsn_dsc(String io_gse_dti_bsn_dsc) {
    	if(io_gse_dti_bsn_dsc == null) {
    		this.io_gse_dti_bsn_dsc = new String();
    	} else {
    		this.io_gse_dti_bsn_dsc = io_gse_dti_bsn_dsc;
    	}
    }
    private String cfls_tr_dsc = new String();
    
    public String getCfls_tr_dsc() {
    	return cfls_tr_dsc;
    }	
    
    public void setCfls_tr_dsc(String cfls_tr_dsc) {
    	if(cfls_tr_dsc == null) {
    		this.cfls_tr_dsc = new String();
    	} else {
    		this.cfls_tr_dsc = cfls_tr_dsc;
    	}
    }
    private String gse_bsn_dsc = new String();
    
    public String getGse_bsn_dsc() {
    	return gse_bsn_dsc;
    }	
    
    public void setGse_bsn_dsc(String gse_bsn_dsc) {
    	if(gse_bsn_dsc == null) {
    		this.gse_bsn_dsc = new String();
    	} else {
    		this.gse_bsn_dsc = gse_bsn_dsc;
    	}
    }
    private String prc_rqr_cn = new String();
    
    public String getPrc_rqr_cn() {
    	return prc_rqr_cn;
    }	
    
    public void setPrc_rqr_cn(String prc_rqr_cn) {
    	if(prc_rqr_cn == null) {
    		this.prc_rqr_cn = new String();
    	} else {
    		this.prc_rqr_cn = prc_rqr_cn;
    	}
    }
    private String gse_dti_bsn_dsc = new String();
    
    public String getGse_dti_bsn_dsc() {
    	return gse_dti_bsn_dsc;
    }	
    
    public void setGse_dti_bsn_dsc(String gse_dti_bsn_dsc) {
    	if(gse_dti_bsn_dsc == null) {
    		this.gse_dti_bsn_dsc = new String();
    	} else {
    		this.gse_dti_bsn_dsc = gse_dti_bsn_dsc;
    	}
    }
    
    public Object clone() {
    	ncclidata copyObj = new ncclidata();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _ncclidata){
    	if(this == _ncclidata)
    		return;
    		
    	ncclidata __ncclidata = (ncclidata) _ncclidata;
    	this.setIo_gse_dti_bsn_dsc(__ncclidata.getIo_gse_dti_bsn_dsc());
    	this.setCfls_tr_dsc(__ncclidata.getCfls_tr_dsc());
    	this.setGse_bsn_dsc(__ncclidata.getGse_bsn_dsc());
    	this.setPrc_rqr_cn(__ncclidata.getPrc_rqr_cn());
    	this.setGse_dti_bsn_dsc(__ncclidata.getGse_dti_bsn_dsc());
    }
}

