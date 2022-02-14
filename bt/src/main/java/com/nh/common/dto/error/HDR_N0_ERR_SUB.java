package com.nh.common.dto.error;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 12. 27. 오후 1:42",
	comments = "HDR_N0_ERR_SUB"
)
public class HDR_N0_ERR_SUB extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String std_err_c = new String();
    
    public String getStd_err_c() {
    	return std_err_c;
    }	
    
    public void setStd_err_c(String std_err_c) {
    	if(std_err_c == null) {
    		this.std_err_c = new String();
    	} else {
    		this.std_err_c = std_err_c;
    	}
    }
    private String chan_err_c = new String();
    
    public String getChan_err_c() {
    	return chan_err_c;
    }	
    
    public void setChan_err_c(String chan_err_c) {
    	if(chan_err_c == null) {
    		this.chan_err_c = new String();
    	} else {
    		this.chan_err_c = chan_err_c;
    	}
    }
    private String std_err_msg_cntn = new String();
    
    public String getStd_err_msg_cntn() {
    	return std_err_msg_cntn;
    }	
    
    public void setStd_err_msg_cntn(String std_err_msg_cntn) {
    	if(std_err_msg_cntn == null) {
    		this.std_err_msg_cntn = new String();
    	} else {
    		this.std_err_msg_cntn = std_err_msg_cntn;
    	}
    }
    private String add_msg_cntn = new String();
    
    public String getAdd_msg_cntn() {
    	return add_msg_cntn;
    }	
    
    public void setAdd_msg_cntn(String add_msg_cntn) {
    	if(add_msg_cntn == null) {
    		this.add_msg_cntn = new String();
    	} else {
    		this.add_msg_cntn = add_msg_cntn;
    	}
    }
    private String obs_kdc = new String();
    
    public String getObs_kdc() {
    	return obs_kdc;
    }	
    
    public void setObs_kdc(String obs_kdc) {
    	if(obs_kdc == null) {
    		this.obs_kdc = new String();
    	} else {
    		this.obs_kdc = obs_kdc;
    	}
    }
    private String err_svcnm = new String();
    
    public String getErr_svcnm() {
    	return err_svcnm;
    }	
    
    public void setErr_svcnm(String err_svcnm) {
    	if(err_svcnm == null) {
    		this.err_svcnm = new String();
    	} else {
    		this.err_svcnm = err_svcnm;
    	}
    }
    private String err_flnm = new String();
    
    public String getErr_flnm() {
    	return err_flnm;
    }	
    
    public void setErr_flnm(String err_flnm) {
    	if(err_flnm == null) {
    		this.err_flnm = new String();
    	} else {
    		this.err_flnm = err_flnm;
    	}
    }
    private String err_mthdnm = new String();
    
    public String getErr_mthdnm() {
    	return err_mthdnm;
    }	
    
    public void setErr_mthdnm(String err_mthdnm) {
    	if(err_mthdnm == null) {
    		this.err_mthdnm = new String();
    	} else {
    		this.err_mthdnm = err_mthdnm;
    	}
    }
    private int pgm_line_no = 0;
    
    public int getPgm_line_no() {
    	return pgm_line_no;
    }	
    
    public void setPgm_line_no(int pgm_line_no) {
    	this.pgm_line_no = pgm_line_no;
    }
    public void setPgm_line_no(Integer pgm_line_no) {
    	if( pgm_line_no == null) {
    		this.pgm_line_no = 0;
    	} else{
    		this.pgm_line_no = pgm_line_no.intValue();
    	}
    }
    public void setPgm_line_no(String pgm_line_no) {
    	if  (pgm_line_no==null || pgm_line_no.length() == 0) {
    		this.pgm_line_no = 0;
    	} else {
    		this.pgm_line_no = Integer.parseInt(pgm_line_no);
    	}
    }
    
    public Object clone() {
    	HDR_N0_ERR_SUB copyObj = new HDR_N0_ERR_SUB();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _hDR_N0_ERR_SUB){
    	if(this == _hDR_N0_ERR_SUB)
    		return;
    		
    	HDR_N0_ERR_SUB __hDR_N0_ERR_SUB = (HDR_N0_ERR_SUB) _hDR_N0_ERR_SUB;
    	this.setStd_err_c(__hDR_N0_ERR_SUB.getStd_err_c());
    	this.setChan_err_c(__hDR_N0_ERR_SUB.getChan_err_c());
    	this.setStd_err_msg_cntn(__hDR_N0_ERR_SUB.getStd_err_msg_cntn());
    	this.setAdd_msg_cntn(__hDR_N0_ERR_SUB.getAdd_msg_cntn());
    	this.setObs_kdc(__hDR_N0_ERR_SUB.getObs_kdc());
    	this.setErr_svcnm(__hDR_N0_ERR_SUB.getErr_svcnm());
    	this.setErr_flnm(__hDR_N0_ERR_SUB.getErr_flnm());
    	this.setErr_mthdnm(__hDR_N0_ERR_SUB.getErr_mthdnm());
    	this.setPgm_line_no(__hDR_N0_ERR_SUB.getPgm_line_no());
    }
}

