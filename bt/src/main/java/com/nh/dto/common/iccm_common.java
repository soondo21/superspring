package com.nh.dto.common;

import com.tmax.superspring.dto.DataObject;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "21. 11. 24. 오후 4:29",
	comments = "iccm_common"
)
public class iccm_common extends DataObject
{
    private static final long serialVersionUID= 1L;
    
    private String ac_cd_idx_val = null;
    
    public String getAc_cd_idx_val() {
    	return ac_cd_idx_val;
    }	
    
    public void setAc_cd_idx_val(String ac_cd_idx_val) {
    	if(ac_cd_idx_val == null) {
    		this.ac_cd_idx_val = null;
    	} else {
    		this.ac_cd_idx_val = ac_cd_idx_val;
    	}
    }
    private String cd_no = null;
    
    public String getCd_no() {
    	return cd_no;
    }	
    
    public void setCd_no(String cd_no) {
    	if(cd_no == null) {
    		this.cd_no = null;
    	} else {
    		this.cd_no = cd_no;
    	}
    }
    private String acno = null;
    
    public String getAcno() {
    	return acno;
    }	
    
    public void setAcno(String acno) {
    	if(acno == null) {
    		this.acno = null;
    	} else {
    		this.acno = acno;
    	}
    }
    
    public Object clone() {
    	iccm_common copyObj = new iccm_common();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(DataObject _iccm_common){
    	if(this == _iccm_common)
    		return;
    		
    	iccm_common __iccm_common = (iccm_common) _iccm_common;
    	this.setAc_cd_idx_val(__iccm_common.getAc_cd_idx_val());
    	this.setCd_no(__iccm_common.getCd_no());
    	this.setAcno(__iccm_common.getAcno());
    }
}

