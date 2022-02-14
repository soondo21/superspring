package com.nh.dto.common;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "22. 2. 14. 오전 10:36",
	comments = "de_johoi_common"
)
public class de_johoi_common extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String rlno_inq_dsc = new String();
    
    public String getRlno_inq_dsc() {
    	return rlno_inq_dsc;
    }	
    
    public void setRlno_inq_dsc(String rlno_inq_dsc) {
    	if(rlno_inq_dsc == null) {
    		this.rlno_inq_dsc = new String();
    	} else {
    		this.rlno_inq_dsc = rlno_inq_dsc;
    	}
    }
    private String acno = new String();
    
    public String getAcno() {
    	return acno;
    }	
    
    public void setAcno(String acno) {
    	if(acno == null) {
    		this.acno = new String();
    	} else {
    		this.acno = acno;
    	}
    }
    private String io_pw_30 = new String();
    
    public String getIo_pw_30() {
    	return io_pw_30;
    }	
    
    public void setIo_pw_30(String io_pw_30) {
    	if(io_pw_30 == null) {
    		this.io_pw_30 = new String();
    	} else {
    		this.io_pw_30 = io_pw_30;
    	}
    }
    private String biz_hr_af_tr_yn = new String();
    
    public String getBiz_hr_af_tr_yn() {
    	return biz_hr_af_tr_yn;
    }	
    
    public void setBiz_hr_af_tr_yn(String biz_hr_af_tr_yn) {
    	if(biz_hr_af_tr_yn == null) {
    		this.biz_hr_af_tr_yn = new String();
    	} else {
    		this.biz_hr_af_tr_yn = biz_hr_af_tr_yn;
    	}
    }
    private String tr_crc_can_dsc = new String();
    
    public String getTr_crc_can_dsc() {
    	return tr_crc_can_dsc;
    }	
    
    public void setTr_crc_can_dsc(String tr_crc_can_dsc) {
    	if(tr_crc_can_dsc == null) {
    		this.tr_crc_can_dsc = new String();
    	} else {
    		this.tr_crc_can_dsc = tr_crc_can_dsc;
    	}
    }
    private String curc = new String();
    
    public String getCurc() {
    	return curc;
    }	
    
    public void setCurc(String curc) {
    	if(curc == null) {
    		this.curc = new String();
    	} else {
    		this.curc = curc;
    	}
    }
    private String io_elt_bb_no = new String();
    
    public String getIo_elt_bb_no() {
    	return io_elt_bb_no;
    }	
    
    public void setIo_elt_bb_no(String io_elt_bb_no) {
    	if(io_elt_bb_no == null) {
    		this.io_elt_bb_no = new String();
    	} else {
    		this.io_elt_bb_no = io_elt_bb_no;
    	}
    }
    private String wrs_c = new String();
    
    public String getWrs_c() {
    	return wrs_c;
    }	
    
    public void setWrs_c(String wrs_c) {
    	if(wrs_c == null) {
    		this.wrs_c = new String();
    	} else {
    		this.wrs_c = wrs_c;
    	}
    }
    
    public Object clone() {
    	de_johoi_common copyObj = new de_johoi_common();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _de_johoi_common){
    	if(this == _de_johoi_common)
    		return;
    		
    	de_johoi_common __de_johoi_common = (de_johoi_common) _de_johoi_common;
    	this.setRlno_inq_dsc(__de_johoi_common.getRlno_inq_dsc());
    	this.setAcno(__de_johoi_common.getAcno());
    	this.setIo_pw_30(__de_johoi_common.getIo_pw_30());
    	this.setBiz_hr_af_tr_yn(__de_johoi_common.getBiz_hr_af_tr_yn());
    	this.setTr_crc_can_dsc(__de_johoi_common.getTr_crc_can_dsc());
    	this.setCurc(__de_johoi_common.getCurc());
    	this.setIo_elt_bb_no(__de_johoi_common.getIo_elt_bb_no());
    	this.setWrs_c(__de_johoi_common.getWrs_c());
    }
}

