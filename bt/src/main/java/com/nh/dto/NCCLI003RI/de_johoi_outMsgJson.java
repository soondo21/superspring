package com.nh.dto.NCCLI003RI;

import com.tmax.superspring.dto.engine.base.Message;
import com.tmax.superspring.dto.engine.exception.UnmarshalException;
import com.tmax.superspring.dto.engine.exception.MarshalException;
import com.tmax.superspring.dto.DataObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;
import org.w3c.dom.Node;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "21. 11. 24. 오후 4:30",
	comments = "de_johoi_outMsgJson"
)
public class de_johoi_outMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	de_johoi_out _de_johoi_out = (de_johoi_out)obj;
    	
    	if(_de_johoi_out == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _de_johoi_out, jw);
    		
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
       	} catch(Exception e) {
       		throw new MarshalException(e);
       	} finally{
       		try {
       			if( jw != null )
    				try {
    					jw.close();
    				} catch (IOException e) {
    					throw new MarshalException(e);
    				}
    		} finally {
    			if( bw != null )
    				try {
    					bw.close();
    				} catch (IOException e) {
    					throw new MarshalException(e);
    				}
    		}
    	}
    }
    
    
    public void marshal(com.nh.dto.NCCLI003RI.de_johoi_out _de_johoi_out, JsonWriter writer )throws IOException {
    
    	writer.name("acno"); 
    	if (_de_johoi_out.getAcno() != null) {
    		writer.value(_de_johoi_out.getAcno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dpz_ac_stsc"); 
    	if (_de_johoi_out.getDpz_ac_stsc() != null) {
    		writer.value(_de_johoi_out.getDpz_ac_stsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("anw_brc"); 
    	if (_de_johoi_out.getAnw_brc() != null) {
    		writer.value(_de_johoi_out.getAnw_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ac_amn_brc"); 
    	if (_de_johoi_out.getAc_amn_brc() != null) {
    		writer.value(_de_johoi_out.getAc_amn_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("naac_dsc"); 
    	if (_de_johoi_out.getNaac_dsc() != null) {
    		writer.value(_de_johoi_out.getNaac_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_rep_cusno_l"); 
    	if (_de_johoi_out.getIo_rep_cusno_l() != null) {
    		writer.value(_de_johoi_out.getIo_rep_cusno_l());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_cusno_l"); 
    	if (_de_johoi_out.getIo_cusno_l() != null) {
    		writer.value(_de_johoi_out.getIo_cusno_l());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dprnm_dsc"); 
    	if (_de_johoi_out.getDprnm_dsc() != null) {
    		writer.value(_de_johoi_out.getDprnm_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dprnm"); 
    	if (_de_johoi_out.getDprnm() != null) {
    		writer.value(_de_johoi_out.getDprnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gru_bkpnm"); 
    	if (_de_johoi_out.getGru_bkpnm() != null) {
    		writer.value(_de_johoi_out.getGru_bkpnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dmd_ac_anonm"); 
    	if (_de_johoi_out.getDmd_ac_anonm() != null) {
    		writer.value(_de_johoi_out.getDmd_ac_anonm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rlno"); 
    	if (_de_johoi_out.getRlno() != null) {
    		writer.value(_de_johoi_out.getRlno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("pwize_rlno"); 
    	if (_de_johoi_out.getPwize_rlno() != null) {
    		writer.value(_de_johoi_out.getPwize_rlno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rnm_cnf_yn"); 
    	if (_de_johoi_out.getRnm_cnf_yn() != null) {
    		writer.value(_de_johoi_out.getRnm_cnf_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rnm_dsc"); 
    	if (_de_johoi_out.getRnm_dsc() != null) {
    		writer.value(_de_johoi_out.getRnm_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("wrs_c"); 
    	if (_de_johoi_out.getWrs_c() != null) {
    		writer.value(_de_johoi_out.getWrs_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("wrsnm"); 
    	if (_de_johoi_out.getWrsnm() != null) {
    		writer.value(_de_johoi_out.getWrsnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sbjc"); 
    	if (_de_johoi_out.getSbjc() != null) {
    		writer.value(_de_johoi_out.getSbjc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sbjnm"); 
    	if (_de_johoi_out.getSbjnm() != null) {
    		writer.value(_de_johoi_out.getSbjnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("txt_c"); 
    	if (_de_johoi_out.getTxt_c() != null) {
    		writer.value(_de_johoi_out.getTxt_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dpzitr_dsc"); 
    	if (_de_johoi_out.getDpzitr_dsc() != null) {
    		writer.value(_de_johoi_out.getDpzitr_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dmd_dp_itr_n11"); 
    	if (_de_johoi_out.getIo_dmd_dp_itr_n11() != null) {
    		writer.value(_de_johoi_out.getIo_dmd_dp_itr_n11());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_pw_dcrd_nt_l"); 
    	if (_de_johoi_out.getIo_pw_dcrd_nt_l() != null) {
    		writer.value(_de_johoi_out.getIo_pw_dcrd_nt_l());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("lscus_py_dt"); 
    	if (_de_johoi_out.getLscus_py_dt() != null) {
    		writer.value(_de_johoi_out.getLscus_py_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("lscus_rv_dt"); 
    	if (_de_johoi_out.getLscus_rv_dt() != null) {
    		writer.value(_de_johoi_out.getLscus_rv_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("lscus_tr_dt"); 
    	if (_de_johoi_out.getLscus_tr_dt() != null) {
    		writer.value(_de_johoi_out.getLscus_tr_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ls_tr_dsc"); 
    	if (_de_johoi_out.getLs_tr_dsc() != null) {
    		writer.value(_de_johoi_out.getLs_tr_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ls_tr_curc"); 
    	if (_de_johoi_out.getLs_tr_curc() != null) {
    		writer.value(_de_johoi_out.getLs_tr_curc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_ls_tram_n19"); 
    	if (_de_johoi_out.getIo_ls_tram_n19() != null) {
    		writer.value(_de_johoi_out.getIo_ls_tram_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ls_tr_trt_brc"); 
    	if (_de_johoi_out.getLs_tr_trt_brc() != null) {
    		writer.value(_de_johoi_out.getLs_tr_trt_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dmd_xfee_rsnc"); 
    	if (_de_johoi_out.getDmd_xfee_rsnc() != null) {
    		writer.value(_de_johoi_out.getDmd_xfee_rsnc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("xfee_ed_dt"); 
    	if (_de_johoi_out.getXfee_ed_dt() != null) {
    		writer.value(_de_johoi_out.getXfee_ed_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("anw_dt"); 
    	if (_de_johoi_out.getAnw_dt() != null) {
    		writer.value(_de_johoi_out.getAnw_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("cptz_dt"); 
    	if (_de_johoi_out.getCptz_dt() != null) {
    		writer.value(_de_johoi_out.getCptz_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("cam_chg_dt"); 
    	if (_de_johoi_out.getCam_chg_dt() != null) {
    		writer.value(_de_johoi_out.getCam_chg_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dpz_obc_am_n19"); 
    	if (_de_johoi_out.getIo_dpz_obc_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_dpz_obc_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dmd_td_bnkck_am_n19"); 
    	if (_de_johoi_out.getIo_dmd_td_bnkck_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_dmd_td_bnkck_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dmd_td_bil_am_n19"); 
    	if (_de_johoi_out.getIo_dmd_td_bil_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_dmd_td_bil_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dmd_td_hhck_am_n19"); 
    	if (_de_johoi_out.getIo_dmd_td_hhck_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_dmd_td_hhck_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_nxd_bnkck_am_n19"); 
    	if (_de_johoi_out.getIo_nxd_bnkck_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_nxd_bnkck_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_nxd_bil_am_n19"); 
    	if (_de_johoi_out.getIo_nxd_bil_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_nxd_bil_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_nxd_hhck_am_n19"); 
    	if (_de_johoi_out.getIo_nxd_hhck_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_nxd_hhck_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_nxd2_bnkck_am_n19"); 
    	if (_de_johoi_out.getIo_nxd2_bnkck_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_nxd2_bnkck_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_nxd2_bil_am_n19"); 
    	if (_de_johoi_out.getIo_nxd2_bil_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_nxd2_bil_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_nxd2_hhck_am_n19"); 
    	if (_de_johoi_out.getIo_nxd2_hhck_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_nxd2_hhck_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dshxt_am_n"); 
    	if (_de_johoi_out.getIo_dshxt_am_n() != null) {
    		writer.value(_de_johoi_out.getIo_dshxt_am_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_rgn_xtn_am_n19"); 
    	if (_de_johoi_out.getIo_rgn_xtn_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_rgn_xtn_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("led_bac_signc"); 
    	if (_de_johoi_out.getLed_bac_signc() != null) {
    		writer.value(_de_johoi_out.getLed_bac_signc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_led_bac_n19"); 
    	if (_de_johoi_out.getIo_led_bac_n19() != null) {
    		writer.value(_de_johoi_out.getIo_led_bac_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dpz_bb_bac_n19"); 
    	if (_de_johoi_out.getIo_dpz_bb_bac_n19() != null) {
    		writer.value(_de_johoi_out.getIo_dpz_bb_bac_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_pat_py_stop_am_n"); 
    	if (_de_johoi_out.getIo_pat_py_stop_am_n() != null) {
    		writer.value(_de_johoi_out.getIo_pat_py_stop_am_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_tru_prf_n19"); 
    	if (_de_johoi_out.getIo_tru_prf_n19() != null) {
    		writer.value(_de_johoi_out.getIo_tru_prf_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dpz_dfypsb_bac_n19"); 
    	if (_de_johoi_out.getIo_dpz_dfypsb_bac_n19() != null) {
    		writer.value(_de_johoi_out.getIo_dpz_dfypsb_bac_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ln_acno"); 
    	if (_de_johoi_out.getLn_acno() != null) {
    		writer.value(_de_johoi_out.getLn_acno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ln_pmi_dt"); 
    	if (_de_johoi_out.getLn_pmi_dt() != null) {
    		writer.value(_de_johoi_out.getLn_pmi_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ln_due_dt"); 
    	if (_de_johoi_out.getLn_due_dt() != null) {
    		writer.value(_de_johoi_out.getLn_due_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dmd_ln_pmi_am_n"); 
    	if (_de_johoi_out.getIo_dmd_ln_pmi_am_n() != null) {
    		writer.value(_de_johoi_out.getIo_dmd_ln_pmi_am_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ovd_dt"); 
    	if (_de_johoi_out.getOvd_dt() != null) {
    		writer.value(_de_johoi_out.getOvd_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_sybb_lnint_n"); 
    	if (_de_johoi_out.getIo_sybb_lnint_n() != null) {
    		writer.value(_de_johoi_out.getIo_sybb_lnint_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_ls_bbprt_linecn_l"); 
    	if (_de_johoi_out.getIo_ls_bbprt_linecn_l() != null) {
    		writer.value(_de_johoi_out.getIo_ls_bbprt_linecn_l());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bb_reisu_dt"); 
    	if (_de_johoi_out.getBb_reisu_dt() != null) {
    		writer.value(_de_johoi_out.getBb_reisu_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_ls_reisu_sqno_l"); 
    	if (_de_johoi_out.getIo_ls_reisu_sqno_l() != null) {
    		writer.value(_de_johoi_out.getIo_ls_reisu_sqno_l());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_ea_nwbok_cn1_l"); 
    	if (_de_johoi_out.getIo_ea_nwbok_cn1_l() != null) {
    		writer.value(_de_johoi_out.getIo_ea_nwbok_cn1_l());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("scrac_yn"); 
    	if (_de_johoi_out.getScrac_yn() != null) {
    		writer.value(_de_johoi_out.getScrac_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dp_tr_tms_org_c"); 
    	if (_de_johoi_out.getDp_tr_tms_org_c() != null) {
    		writer.value(_de_johoi_out.getDp_tr_tms_org_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("cms_org_c"); 
    	if (_de_johoi_out.getCms_org_c() != null) {
    		writer.value(_de_johoi_out.getCms_org_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sctsco_c"); 
    	if (_de_johoi_out.getSctsco_c() != null) {
    		writer.value(_de_johoi_out.getSctsco_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("scts_acno"); 
    	if (_de_johoi_out.getScts_acno() != null) {
    		writer.value(_de_johoi_out.getScts_acno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("fst_inqps_yn"); 
    	if (_de_johoi_out.getFst_inqps_yn() != null) {
    		writer.value(_de_johoi_out.getFst_inqps_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bccd_stlac_yn"); 
    	if (_de_johoi_out.getBccd_stlac_yn() != null) {
    		writer.value(_de_johoi_out.getBccd_stlac_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tlbk_inq_imp_yn"); 
    	if (_de_johoi_out.getTlbk_inq_imp_yn() != null) {
    		writer.value(_de_johoi_out.getTlbk_inq_imp_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("atm_bb_py_rg_yn"); 
    	if (_de_johoi_out.getAtm_bb_py_rg_yn() != null) {
    		writer.value(_de_johoi_out.getAtm_bb_py_rg_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("egth_rg_yn"); 
    	if (_de_johoi_out.getEgth_rg_yn() != null) {
    		writer.value(_de_johoi_out.getEgth_rg_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("hdac_yn"); 
    	if (_de_johoi_out.getHdac_yn() != null) {
    		writer.value(_de_johoi_out.getHdac_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("cprs_wbok_yn"); 
    	if (_de_johoi_out.getCprs_wbok_yn() != null) {
    		writer.value(_de_johoi_out.getCprs_wbok_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ltrm_notr_yn"); 
    	if (_de_johoi_out.getLtrm_notr_yn() != null) {
    		writer.value(_de_johoi_out.getLtrm_notr_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("inet_anw_yn"); 
    	if (_de_johoi_out.getInet_anw_yn() != null) {
    		writer.value(_de_johoi_out.getInet_anw_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("iac_yn"); 
    	if (_de_johoi_out.getIac_yn() != null) {
    		writer.value(_de_johoi_out.getIac_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trsr_dp_yn"); 
    	if (_de_johoi_out.getTrsr_dp_yn() != null) {
    		writer.value(_de_johoi_out.getTrsr_dp_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rec_sjt_ess_inp_dsc"); 
    	if (_de_johoi_out.getRec_sjt_ess_inp_dsc() != null) {
    		writer.value(_de_johoi_out.getRec_sjt_ess_inp_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ejbb_yn"); 
    	if (_de_johoi_out.getEjbb_yn() != null) {
    		writer.value(_de_johoi_out.getEjbb_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("xuse_bsn_dsc"); 
    	if (_de_johoi_out.getXuse_bsn_dsc() != null) {
    		writer.value(_de_johoi_out.getXuse_bsn_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acd_rg_yn"); 
    	if (_de_johoi_out.getAcd_rg_yn() != null) {
    		writer.value(_de_johoi_out.getAcd_rg_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd1_seal_chg_yn"); 
    	if (_de_johoi_out.getAcdkd1_seal_chg_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd1_seal_chg_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd1_name_chg_yn"); 
    	if (_de_johoi_out.getAcdkd1_name_chg_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd1_name_chg_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd2_rvpy_imp_yn"); 
    	if (_de_johoi_out.getAcdkd2_rvpy_imp_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd2_rvpy_imp_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd2_msf_deth_yn"); 
    	if (_de_johoi_out.getAcdkd2_msf_deth_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd2_msf_deth_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd2_brcy_jud_yn"); 
    	if (_de_johoi_out.getAcdkd2_brcy_jud_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd2_brcy_jud_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd2_crim_rpt_yn"); 
    	if (_de_johoi_out.getAcdkd2_crim_rpt_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd2_crim_rpt_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd2_plce_rpt_yn"); 
    	if (_de_johoi_out.getAcdkd2_plce_rpt_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd2_plce_rpt_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd3_seal_los_yn"); 
    	if (_de_johoi_out.getAcdkd3_seal_los_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd3_seal_los_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd3_bb_los_yn"); 
    	if (_de_johoi_out.getAcdkd3_bb_los_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd3_bb_los_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd3_szrg_yn"); 
    	if (_de_johoi_out.getAcdkd3_szrg_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd3_szrg_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd3_py_imp_yn"); 
    	if (_de_johoi_out.getAcdkd3_py_imp_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd3_py_imp_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd3_pbsv_nrpy_yn"); 
    	if (_de_johoi_out.getAcdkd3_pbsv_nrpy_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd3_pbsv_nrpy_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acdkd3_nseal_bb_isu_yn"); 
    	if (_de_johoi_out.getAcdkd3_nseal_bb_isu_yn() != null) {
    		writer.value(_de_johoi_out.getAcdkd3_nseal_bb_isu_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_tmm_sal_ftr_sam_n"); 
    	if (_de_johoi_out.getIo_tmm_sal_ftr_sam_n() != null) {
    		writer.value(_de_johoi_out.getIo_tmm_sal_ftr_sam_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_bf_jan_sal_ftr_am_n19"); 
    	if (_de_johoi_out.getIo_bf_jan_sal_ftr_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_bf_jan_sal_ftr_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_bf_feb_sal_ftr_am_n19"); 
    	if (_de_johoi_out.getIo_bf_feb_sal_ftr_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_bf_feb_sal_ftr_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_bf_mar_sal_ftr_am_n19"); 
    	if (_de_johoi_out.getIo_bf_mar_sal_ftr_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_bf_mar_sal_ftr_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_bf_jan_dp_ab_n19"); 
    	if (_de_johoi_out.getIo_bf_jan_dp_ab_n19() != null) {
    		writer.value(_de_johoi_out.getIo_bf_jan_dp_ab_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_bf_feb_dp_ab_n19"); 
    	if (_de_johoi_out.getIo_bf_feb_dp_ab_n19() != null) {
    		writer.value(_de_johoi_out.getIo_bf_feb_dp_ab_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_bf_mar_dp_ab_n19"); 
    	if (_de_johoi_out.getIo_bf_mar_dp_ab_n19() != null) {
    		writer.value(_de_johoi_out.getIo_bf_mar_dp_ab_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_ls_tr_trt_brc_nm"); 
    	if (_de_johoi_out.getIo_ls_tr_trt_brc_nm() != null) {
    		writer.value(_de_johoi_out.getIo_ls_tr_trt_brc_nm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dpz_py_pla_am_n19"); 
    	if (_de_johoi_out.getIo_dpz_py_pla_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_dpz_py_pla_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_cnvn_trt_sam_n19"); 
    	if (_de_johoi_out.getIo_cnvn_trt_sam_n19() != null) {
    		writer.value(_de_johoi_out.getIo_cnvn_trt_sam_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_atm_td_wdw_am_n19"); 
    	if (_de_johoi_out.getIo_atm_td_wdw_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_atm_td_wdw_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_atm_td_ftr_am_n19"); 
    	if (_de_johoi_out.getIo_atm_td_ftr_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_atm_td_ftr_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_atm_biz_ovtm_wdw_am_n19"); 
    	if (_de_johoi_out.getIo_atm_biz_ovtm_wdw_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_atm_biz_ovtm_wdw_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_rv_lmt_am_n19"); 
    	if (_de_johoi_out.getIo_rv_lmt_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_rv_lmt_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_buy_xuse_ftr_am_n19"); 
    	if (_de_johoi_out.getIo_buy_xuse_ftr_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_buy_xuse_ftr_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dp_cam_n25"); 
    	if (_de_johoi_out.getIo_dp_cam_n25() != null) {
    		writer.value(_de_johoi_out.getIo_dp_cam_n25());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dp_itr_cam_n25"); 
    	if (_de_johoi_out.getIo_dp_itr_cam_n25() != null) {
    		writer.value(_de_johoi_out.getIo_dp_itr_cam_n25());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dp_pritr_n11"); 
    	if (_de_johoi_out.getIo_dp_pritr_n11() != null) {
    		writer.value(_de_johoi_out.getIo_dp_pritr_n11());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_hitr_bas_am_n19"); 
    	if (_de_johoi_out.getIo_hitr_bas_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_hitr_bas_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mmda_bf_bac_n19"); 
    	if (_de_johoi_out.getIo_mmda_bf_bac_n19() != null) {
    		writer.value(_de_johoi_out.getIo_mmda_bf_bac_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mmda_dd7_bf_int_n19"); 
    	if (_de_johoi_out.getIo_mmda_dd7_bf_int_n19() != null) {
    		writer.value(_de_johoi_out.getIo_mmda_dd7_bf_int_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dp_itr_chg_dt"); 
    	if (_de_johoi_out.getDp_itr_chg_dt() != null) {
    		writer.value(_de_johoi_out.getDp_itr_chg_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dmd_intclc_tpc"); 
    	if (_de_johoi_out.getDmd_intclc_tpc() != null) {
    		writer.value(_de_johoi_out.getDmd_intclc_tpc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dp_nint_yn"); 
    	if (_de_johoi_out.getDp_nint_yn() != null) {
    		writer.value(_de_johoi_out.getDp_nint_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_lnitr_n11"); 
    	if (_de_johoi_out.getIo_lnitr_n11() != null) {
    		writer.value(_de_johoi_out.getIo_lnitr_n11());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_tot_lnint_n"); 
    	if (_de_johoi_out.getIo_tot_lnint_n() != null) {
    		writer.value(_de_johoi_out.getIo_tot_lnint_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rpy_dt"); 
    	if (_de_johoi_out.getRpy_dt() != null) {
    		writer.value(_de_johoi_out.getRpy_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ac_dsc"); 
    	if (_de_johoi_out.getAc_dsc() != null) {
    		writer.value(_de_johoi_out.getAc_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_usdc_am_n19"); 
    	if (_de_johoi_out.getIo_usdc_am_n19() != null) {
    		writer.value(_de_johoi_out.getIo_usdc_am_n19());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_krwc_am_n"); 
    	if (_de_johoi_out.getIo_krwc_am_n() != null) {
    		writer.value(_de_johoi_out.getIo_krwc_am_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("prm_svc_dsc"); 
    	if (_de_johoi_out.getPrm_svc_dsc() != null) {
    		writer.value(_de_johoi_out.getPrm_svc_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_iccd_hld_cnt"); 
    	if (_de_johoi_out.getIo_iccd_hld_cnt() != null) {
    		writer.value(_de_johoi_out.getIo_iccd_hld_cnt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("seal_sgnt_dsc"); 
    	if (_de_johoi_out.getSeal_sgnt_dsc() != null) {
    		writer.value(_de_johoi_out.getSeal_sgnt_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_la_aditr_n11"); 
    	if (_de_johoi_out.getIo_la_aditr_n11() != null) {
    		writer.value(_de_johoi_out.getIo_la_aditr_n11());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_basitr_n11"); 
    	if (_de_johoi_out.getIo_basitr_n11() != null) {
    		writer.value(_de_johoi_out.getIo_basitr_n11());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("itr_cntn"); 
    	if (_de_johoi_out.getItr_cntn() != null) {
    		writer.value(_de_johoi_out.getItr_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_acby_atm_dd1_ftr_lmt_am_n"); 
    	if (_de_johoi_out.getIo_acby_atm_dd1_ftr_lmt_am_n() != null) {
    		writer.value(_de_johoi_out.getIo_acby_atm_dd1_ftr_lmt_am_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_acby_atm_tm1_ftr_lmt_am_n"); 
    	if (_de_johoi_out.getIo_acby_atm_tm1_ftr_lmt_am_n() != null) {
    		writer.value(_de_johoi_out.getIo_acby_atm_tm1_ftr_lmt_am_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_dd1_lmt_am_l"); 
    	if (_de_johoi_out.getIo_dd1_lmt_am_l() != null) {
    		writer.value(_de_johoi_out.getIo_dd1_lmt_am_l());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_tm1_lmt_am_l"); 
    	if (_de_johoi_out.getIo_tm1_lmt_am_l() != null) {
    		writer.value(_de_johoi_out.getIo_tm1_lmt_am_l());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_tt_n"); 
    	if (_de_johoi_out.getIo_tt_n() != null) {
    		writer.value(_de_johoi_out.getIo_tt_n());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("dla_drw_ls_rv_tm"); 
    	if (_de_johoi_out.getDla_drw_ls_rv_tm() != null) {
    		writer.value(_de_johoi_out.getDla_drw_ls_rv_tm());
    	} else {
    		writer.nullValue();
    	}
    }
    	
    public String removeNullChar(String charString) {
    	if( charString == null )
        	return "";
        
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0 ; i<charString.length(); i++) {
    		if(charString.charAt(i) == (char)0) {
    			sb.append("");
    		} else {
    			sb.append(charString.charAt(i));
    		}
    	}
    	return sb.toString();
    }
    
    @Override
    public void marshal(DataObject arg0, Node arg1) throws MarshalException {
    }
    
    public de_johoi_out unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	de_johoi_out _de_johoi_out = new de_johoi_out();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new de_johoi_out();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_de_johoi_out = (de_johoi_out)unmarshal( jr,  _de_johoi_out);
    
    		jr.endObject();
    		jr.close();
    
    	} catch(Exception e) {
    	    throw new UnmarshalException(e);
    	}finally{
    		try{
    			if( jr != null )
    				try {
    					jr.close();
    				} catch (IOException e) {
    					throw new UnmarshalException(e);
    				}
    		} finally {
    			if( reader != null )
    				try {
    					reader.close();
    				} catch (IOException e) {
    					throw new UnmarshalException(e);
    				}
    		}
    	}
    	return _de_johoi_out;
    }
    	
    public DataObject unmarshal(byte[] bytes, de_johoi_out dto) throws UnmarshalException {
    	
    	de_johoi_out _de_johoi_out = (de_johoi_out) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new de_johoi_out();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_de_johoi_out = (de_johoi_out)unmarshal( jr,  _de_johoi_out);
    
    		jr.endObject();
    		jr.close();
    	
    	} catch(Exception e) {
    		throw new UnmarshalException(e);
    	} finally {
    		try{
    			if( jr != null ) 
    				try{
    					jr.close();
    				} catch (IOException e) {
    					throw new UnmarshalException(e);
    				}
    		} finally {
    			if( reader != null )
    				try {
    					reader.close();
    				} catch (IOException e) {
    					throw new UnmarshalException(e);
    				}
    			
    		}
    	}
    	                       
        return _de_johoi_out;
    }
    
    public de_johoi_out unmarshal(JsonReader reader, de_johoi_out dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(de_johoi_out dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "acno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dpz_ac_stsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDpz_ac_stsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "anw_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAnw_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ac_amn_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAc_amn_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "naac_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setNaac_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_rep_cusno_l" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_rep_cusno_l( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_cusno_l" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_cusno_l( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dprnm_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDprnm_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dprnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDprnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gru_bkpnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGru_bkpnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dmd_ac_anonm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDmd_ac_anonm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rlno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRlno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "pwize_rlno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPwize_rlno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rnm_cnf_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRnm_cnf_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rnm_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRnm_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "wrs_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setWrs_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "wrsnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setWrsnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sbjc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSbjc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sbjnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSbjnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "txt_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTxt_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dpzitr_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDpzitr_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dmd_dp_itr_n11" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dmd_dp_itr_n11( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_pw_dcrd_nt_l" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_pw_dcrd_nt_l( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "lscus_py_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLscus_py_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "lscus_rv_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLscus_rv_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "lscus_tr_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLscus_tr_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ls_tr_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLs_tr_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ls_tr_curc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLs_tr_curc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_ls_tram_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_ls_tram_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ls_tr_trt_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLs_tr_trt_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dmd_xfee_rsnc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDmd_xfee_rsnc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "xfee_ed_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setXfee_ed_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "anw_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAnw_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "cptz_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCptz_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "cam_chg_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCam_chg_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dpz_obc_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dpz_obc_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dmd_td_bnkck_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dmd_td_bnkck_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dmd_td_bil_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dmd_td_bil_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dmd_td_hhck_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dmd_td_hhck_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_nxd_bnkck_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_nxd_bnkck_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_nxd_bil_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_nxd_bil_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_nxd_hhck_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_nxd_hhck_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_nxd2_bnkck_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_nxd2_bnkck_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_nxd2_bil_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_nxd2_bil_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_nxd2_hhck_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_nxd2_hhck_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dshxt_am_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dshxt_am_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_rgn_xtn_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_rgn_xtn_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "led_bac_signc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLed_bac_signc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_led_bac_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_led_bac_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dpz_bb_bac_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dpz_bb_bac_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_pat_py_stop_am_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_pat_py_stop_am_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_tru_prf_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_tru_prf_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dpz_dfypsb_bac_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dpz_dfypsb_bac_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ln_acno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLn_acno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ln_pmi_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLn_pmi_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ln_due_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLn_due_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dmd_ln_pmi_am_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dmd_ln_pmi_am_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ovd_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOvd_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_sybb_lnint_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_sybb_lnint_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_ls_bbprt_linecn_l" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_ls_bbprt_linecn_l( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bb_reisu_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBb_reisu_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_ls_reisu_sqno_l" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_ls_reisu_sqno_l( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_ea_nwbok_cn1_l" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_ea_nwbok_cn1_l( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "scrac_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setScrac_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dp_tr_tms_org_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDp_tr_tms_org_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "cms_org_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCms_org_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sctsco_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSctsco_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "scts_acno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setScts_acno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "fst_inqps_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setFst_inqps_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bccd_stlac_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBccd_stlac_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tlbk_inq_imp_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTlbk_inq_imp_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "atm_bb_py_rg_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAtm_bb_py_rg_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "egth_rg_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setEgth_rg_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "hdac_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setHdac_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "cprs_wbok_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCprs_wbok_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ltrm_notr_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLtrm_notr_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "inet_anw_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setInet_anw_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "iac_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIac_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trsr_dp_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrsr_dp_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rec_sjt_ess_inp_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRec_sjt_ess_inp_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ejbb_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setEjbb_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "xuse_bsn_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setXuse_bsn_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acd_rg_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcd_rg_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd1_seal_chg_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd1_seal_chg_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd1_name_chg_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd1_name_chg_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd2_rvpy_imp_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd2_rvpy_imp_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd2_msf_deth_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd2_msf_deth_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd2_brcy_jud_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd2_brcy_jud_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd2_crim_rpt_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd2_crim_rpt_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd2_plce_rpt_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd2_plce_rpt_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd3_seal_los_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd3_seal_los_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd3_bb_los_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd3_bb_los_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd3_szrg_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd3_szrg_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd3_py_imp_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd3_py_imp_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd3_pbsv_nrpy_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd3_pbsv_nrpy_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acdkd3_nseal_bb_isu_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcdkd3_nseal_bb_isu_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_tmm_sal_ftr_sam_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_tmm_sal_ftr_sam_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_bf_jan_sal_ftr_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_bf_jan_sal_ftr_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_bf_feb_sal_ftr_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_bf_feb_sal_ftr_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_bf_mar_sal_ftr_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_bf_mar_sal_ftr_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_bf_jan_dp_ab_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_bf_jan_dp_ab_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_bf_feb_dp_ab_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_bf_feb_dp_ab_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_bf_mar_dp_ab_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_bf_mar_dp_ab_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_ls_tr_trt_brc_nm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_ls_tr_trt_brc_nm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dpz_py_pla_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dpz_py_pla_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_cnvn_trt_sam_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_cnvn_trt_sam_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_atm_td_wdw_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_atm_td_wdw_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_atm_td_ftr_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_atm_td_ftr_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_atm_biz_ovtm_wdw_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_atm_biz_ovtm_wdw_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_rv_lmt_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_rv_lmt_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_buy_xuse_ftr_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_buy_xuse_ftr_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dp_cam_n25" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dp_cam_n25( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dp_itr_cam_n25" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dp_itr_cam_n25( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dp_pritr_n11" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dp_pritr_n11( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_hitr_bas_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_hitr_bas_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mmda_bf_bac_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mmda_bf_bac_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mmda_dd7_bf_int_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mmda_dd7_bf_int_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dp_itr_chg_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDp_itr_chg_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dmd_intclc_tpc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDmd_intclc_tpc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dp_nint_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDp_nint_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_lnitr_n11" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_lnitr_n11( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_tot_lnint_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_tot_lnint_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rpy_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRpy_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ac_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAc_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_usdc_am_n19" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_usdc_am_n19( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_krwc_am_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_krwc_am_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "prm_svc_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPrm_svc_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_iccd_hld_cnt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_iccd_hld_cnt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "seal_sgnt_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSeal_sgnt_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_la_aditr_n11" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_la_aditr_n11( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_basitr_n11" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_basitr_n11( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "itr_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setItr_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_acby_atm_dd1_ftr_lmt_am_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_acby_atm_dd1_ftr_lmt_am_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_acby_atm_tm1_ftr_lmt_am_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_acby_atm_tm1_ftr_lmt_am_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_dd1_lmt_am_l" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_dd1_lmt_am_l( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_tm1_lmt_am_l" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_tm1_lmt_am_l( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_tt_n" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_tt_n( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "dla_drw_ls_rv_tm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDla_drw_ls_rv_tm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		default :
    		reader.skipValue();
    		break;
    	}
    }
    
    @Override
    public DataObject unmarshal(Node arg0) throws UnmarshalException {
    		return null;
    }
    
    
    @Override
    public int unmarshal(byte[] arg0, int arg1, DataObject arg2) throws Exception {
    	return 0;
    }
    
}

