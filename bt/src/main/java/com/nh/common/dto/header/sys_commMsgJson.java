package com.nh.common.dto.header;

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
	date= "22. 2. 28. 오전 8:37",
	comments = "sys_commMsgJson"
)
public class sys_commMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	sys_comm _sys_comm = (sys_comm)obj;
    	
    	if(_sys_comm == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _sys_comm, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.header.sys_comm _sys_comm, JsonWriter writer )throws IOException {
    
    	writer.name("std_tgrm_len"); 
    	if (_sys_comm.getStd_tgrm_len() != null) {
    		writer.value(_sys_comm.getStd_tgrm_len());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_gbl_id"); 
    	if (_sys_comm.getStd_gbl_id() != null) {
    		writer.value(_sys_comm.getStd_gbl_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rms_svc_c"); 
    	if (_sys_comm.getRms_svc_c() != null) {
    		writer.value(_sys_comm.getRms_svc_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rzt_rms_svc_c"); 
    	if (_sys_comm.getRzt_rms_svc_c() != null) {
    		writer.value(_sys_comm.getRzt_rms_svc_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("orgtr_gbl_id"); 
    	if (_sys_comm.getOrgtr_gbl_id() != null) {
    		writer.value(_sys_comm.getOrgtr_gbl_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("can_crc_gbl_id"); 
    	if (_sys_comm.getCan_crc_gbl_id() != null) {
    		writer.value(_sys_comm.getCan_crc_gbl_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trz_gbl_id"); 
    	if (_sys_comm.getTrz_gbl_id() != null) {
    		writer.value(_sys_comm.getTrz_gbl_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("xa_tr_dsc"); 
    	if (_sys_comm.getXa_tr_dsc() != null) {
    		writer.value(_sys_comm.getXa_tr_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("prto_tgrm_dtm"); 
    	if (_sys_comm.getPrto_tgrm_dtm() != null) {
    		writer.value(_sys_comm.getPrto_tgrm_dtm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sync_dsc"); 
    	if (_sys_comm.getSync_dsc() != null) {
    		writer.value(_sys_comm.getSync_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("async_attr_c"); 
    	if (_sys_comm.getAsync_attr_c() != null) {
    		writer.value(_sys_comm.getAsync_attr_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_sysid"); 
    	if (_sys_comm.getTr_sysid() != null) {
    		writer.value(_sys_comm.getTr_sysid());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sys_dtl_dsc"); 
    	if (_sys_comm.getSys_dtl_dsc() != null) {
    		writer.value(_sys_comm.getSys_dtl_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("orgtr_sysid"); 
    	if (_sys_comm.getOrgtr_sysid() != null) {
    		writer.value(_sys_comm.getOrgtr_sysid());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ltgrm_sesn_dsc"); 
    	if (_sys_comm.getLtgrm_sesn_dsc() != null) {
    		writer.value(_sys_comm.getLtgrm_sesn_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ltgrm_prc_sqno"); 
    	if (_sys_comm.getLtgrm_prc_sqno() != null) {
    		writer.value(_sys_comm.getLtgrm_prc_sqno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ttl_ug_ync"); 
    	if (_sys_comm.getTtl_ug_ync() != null) {
    		writer.value(_sys_comm.getTtl_ug_ync());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ttl_fir_sttm"); 
    	if (_sys_comm.getTtl_fir_sttm() != null) {
    		writer.value(_sys_comm.getTtl_fir_sttm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ttl_mtn_tm"); 
    	if (_sys_comm.getTtl_mtn_tm() != null) {
    		writer.value(_sys_comm.getTtl_mtn_tm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tgrm_prto_tpc"); 
    	if (_sys_comm.getTgrm_prto_tpc() != null) {
    		writer.value(_sys_comm.getTgrm_prto_tpc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trms_tr_sesn_id"); 
    	if (_sys_comm.getTrms_tr_sesn_id() != null) {
    		writer.value(_sys_comm.getTrms_tr_sesn_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trm_tpc"); 
    	if (_sys_comm.getTrm_tpc() != null) {
    		writer.value(_sys_comm.getTrm_tpc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trm_id"); 
    	if (_sys_comm.getTrm_id() != null) {
    		writer.value(_sys_comm.getTrm_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_id_no"); 
    	if (_sys_comm.getTr_id_no() != null) {
    		writer.value(_sys_comm.getTr_id_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("mca_chan_svr_id"); 
    	if (_sys_comm.getMca_chan_svr_id() != null) {
    		writer.value(_sys_comm.getMca_chan_svr_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("aut_tr_dsc"); 
    	if (_sys_comm.getAut_tr_dsc() != null) {
    		writer.value(_sys_comm.getAut_tr_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("obs_sys_c"); 
    	if (_sys_comm.getObs_sys_c() != null) {
    		writer.value(_sys_comm.getObs_sys_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("obs_kdc"); 
    	if (_sys_comm.getObs_kdc() != null) {
    		writer.value(_sys_comm.getObs_kdc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_err_c"); 
    	if (_sys_comm.getStd_err_c() != null) {
    		writer.value(_sys_comm.getStd_err_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_rqr_rsp_dsc"); 
    	if (_sys_comm.getStd_tgrm_rqr_rsp_dsc() != null) {
    		writer.value(_sys_comm.getStd_tgrm_rqr_rsp_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_frmt_dsc"); 
    	if (_sys_comm.getStd_tgrm_frmt_dsc() != null) {
    		writer.value(_sys_comm.getStd_tgrm_frmt_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_lclc"); 
    	if (_sys_comm.getStd_tgrm_lclc() != null) {
    		writer.value(_sys_comm.getStd_tgrm_lclc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_sbjc"); 
    	if (_sys_comm.getStd_tgrm_sbjc() != null) {
    		writer.value(_sys_comm.getStd_tgrm_sbjc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_chan_c"); 
    	if (_sys_comm.getStd_tgrm_chan_c() != null) {
    		writer.value(_sys_comm.getStd_tgrm_chan_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("comn_msg_id"); 
    	if (_sys_comm.getComn_msg_id() != null) {
    		writer.value(_sys_comm.getComn_msg_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_trm_ipadr"); 
    	if (_sys_comm.getTr_trm_ipadr() != null) {
    		writer.value(_sys_comm.getTr_trm_ipadr());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_dtm"); 
    	if (_sys_comm.getTr_dtm() != null) {
    		writer.value(_sys_comm.getTr_dtm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_prcrzt_c"); 
    	if (_sys_comm.getStd_tgrm_prcrzt_c() != null) {
    		writer.value(_sys_comm.getStd_tgrm_prcrzt_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tgrm_tionm"); 
    	if (_sys_comm.getTgrm_tionm() != null) {
    		writer.value(_sys_comm.getTgrm_tionm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_msg_tpc"); 
    	if (_sys_comm.getStd_tgrm_msg_tpc() != null) {
    		writer.value(_sys_comm.getStd_tgrm_msg_tpc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_comu_inf_c"); 
    	if (_sys_comm.getStd_tgrm_comu_inf_c() != null) {
    		writer.value(_sys_comm.getStd_tgrm_comu_inf_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("snd_asqno"); 
    	if (_sys_comm.getSnd_asqno() != null) {
    		writer.value(_sys_comm.getSnd_asqno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_tgrm_epy_mode_c"); 
    	if (_sys_comm.getStd_tgrm_epy_mode_c() != null) {
    		writer.value(_sys_comm.getStd_tgrm_epy_mode_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("opr_onl_brc"); 
    	if (_sys_comm.getOpr_onl_brc() != null) {
    		writer.value(_sys_comm.getOpr_onl_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_brc"); 
    	if (_sys_comm.getTr_brc() != null) {
    		writer.value(_sys_comm.getTr_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("naac_dsc"); 
    	if (_sys_comm.getNaac_dsc() != null) {
    		writer.value(_sys_comm.getNaac_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trmn_naac_dsc"); 
    	if (_sys_comm.getTrmn_naac_dsc() != null) {
    		writer.value(_sys_comm.getTrmn_naac_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trmno"); 
    	if (_sys_comm.getTrmno() != null) {
    		writer.value(_sys_comm.getTrmno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trm_kdc"); 
    	if (_sys_comm.getTrm_kdc() != null) {
    		writer.value(_sys_comm.getTrm_kdc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trm_br_ino_dsc"); 
    	if (_sys_comm.getTrm_br_ino_dsc() != null) {
    		writer.value(_sys_comm.getTrm_br_ino_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bat_plc_c"); 
    	if (_sys_comm.getBat_plc_c() != null) {
    		writer.value(_sys_comm.getBat_plc_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("scid"); 
    	if (_sys_comm.getScid() != null) {
    		writer.value(_sys_comm.getScid());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("scrn_vernm"); 
    	if (_sys_comm.getScrn_vernm() != null) {
    		writer.value(_sys_comm.getScrn_vernm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("optr_eno"); 
    	if (_sys_comm.getOptr_eno() != null) {
    		writer.value(_sys_comm.getOptr_eno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_optrnm"); 
    	if (_sys_comm.getTr_optrnm() != null) {
    		writer.value(_sys_comm.getTr_optrnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("optr_pzcc"); 
    	if (_sys_comm.getOptr_pzcc() != null) {
    		writer.value(_sys_comm.getOptr_pzcc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("aud_tr_inq_rsnc"); 
    	if (_sys_comm.getAud_tr_inq_rsnc() != null) {
    		writer.value(_sys_comm.getAud_tr_inq_rsnc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("x_tr_dsc"); 
    	if (_sys_comm.getX_tr_dsc() != null) {
    		writer.value(_sys_comm.getX_tr_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("optr_attc_grdc"); 
    	if (_sys_comm.getOptr_attc_grdc() != null) {
    		writer.value(_sys_comm.getOptr_attc_grdc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sc1_mgr_attc_grdc"); 
    	if (_sys_comm.getSc1_mgr_attc_grdc() != null) {
    		writer.value(_sys_comm.getSc1_mgr_attc_grdc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sq2_mgr_attc_grdc"); 
    	if (_sys_comm.getSq2_mgr_attc_grdc() != null) {
    		writer.value(_sys_comm.getSq2_mgr_attc_grdc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("mgr_apv_c"); 
    	if (_sys_comm.getMgr_apv_c() != null) {
    		writer.value(_sys_comm.getMgr_apv_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sc1_mgr_brc"); 
    	if (_sys_comm.getSc1_mgr_brc() != null) {
    		writer.value(_sys_comm.getSc1_mgr_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sc1_mgr_tk_dlv_yn"); 
    	if (_sys_comm.getSc1_mgr_tk_dlv_yn() != null) {
    		writer.value(_sys_comm.getSc1_mgr_tk_dlv_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sc1_mgr_trmno"); 
    	if (_sys_comm.getSc1_mgr_trmno() != null) {
    		writer.value(_sys_comm.getSc1_mgr_trmno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sc1_mgr_trm_ug_yn"); 
    	if (_sys_comm.getSc1_mgr_trm_ug_yn() != null) {
    		writer.value(_sys_comm.getSc1_mgr_trm_ug_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sc1_mgr_eno"); 
    	if (_sys_comm.getSc1_mgr_eno() != null) {
    		writer.value(_sys_comm.getSc1_mgr_eno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sc1_mgr_name"); 
    	if (_sys_comm.getSc1_mgr_name() != null) {
    		writer.value(_sys_comm.getSc1_mgr_name());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sq2_mgr_brc"); 
    	if (_sys_comm.getSq2_mgr_brc() != null) {
    		writer.value(_sys_comm.getSq2_mgr_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sq2_mgr_tk_dlv_yn"); 
    	if (_sys_comm.getSq2_mgr_tk_dlv_yn() != null) {
    		writer.value(_sys_comm.getSq2_mgr_tk_dlv_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sq2_mgr_trmno"); 
    	if (_sys_comm.getSq2_mgr_trmno() != null) {
    		writer.value(_sys_comm.getSq2_mgr_trmno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sq2_mgr_trm_ug_yn"); 
    	if (_sys_comm.getSq2_mgr_trm_ug_yn() != null) {
    		writer.value(_sys_comm.getSq2_mgr_trm_ug_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sq2_mgr_eno"); 
    	if (_sys_comm.getSq2_mgr_eno() != null) {
    		writer.value(_sys_comm.getSq2_mgr_eno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sq2_mgr_name"); 
    	if (_sys_comm.getSq2_mgr_name() != null) {
    		writer.value(_sys_comm.getSq2_mgr_name());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tk_rgrls_dsc"); 
    	if (_sys_comm.getTk_rgrls_dsc() != null) {
    		writer.value(_sys_comm.getTk_rgrls_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("nslip_exe_yn"); 
    	if (_sys_comm.getNslip_exe_yn() != null) {
    		writer.value(_sys_comm.getNslip_exe_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("inp_med_inf_c"); 
    	if (_sys_comm.getInp_med_inf_c() != null) {
    		writer.value(_sys_comm.getInp_med_inf_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("iccd_setg_ynchar"); 
    	if (_sys_comm.getIccd_setg_ynchar() != null) {
    		writer.value(_sys_comm.getIccd_setg_ynchar());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ppad_inp_yn"); 
    	if (_sys_comm.getPpad_inp_yn() != null) {
    		writer.value(_sys_comm.getPpad_inp_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ms_inp_yn"); 
    	if (_sys_comm.getMs_inp_yn() != null) {
    		writer.value(_sys_comm.getMs_inp_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("db_rbk_ync"); 
    	if (_sys_comm.getDb_rbk_ync() != null) {
    		writer.value(_sys_comm.getDb_rbk_ync());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tst_phr_apl_c"); 
    	if (_sys_comm.getTst_phr_apl_c() != null) {
    		writer.value(_sys_comm.getTst_phr_apl_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sync_attr_c"); 
    	if (_sys_comm.getSync_attr_c() != null) {
    		writer.value(_sys_comm.getSync_attr_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("pgm_vernm"); 
    	if (_sys_comm.getPgm_vernm() != null) {
    		writer.value(_sys_comm.getPgm_vernm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_hop_brc"); 
    	if (_sys_comm.getTr_hop_brc() != null) {
    		writer.value(_sys_comm.getTr_hop_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_hop_br_naac_dsc"); 
    	if (_sys_comm.getTr_hop_br_naac_dsc() != null) {
    		writer.value(_sys_comm.getTr_hop_br_naac_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_bsn_dsc"); 
    	if (_sys_comm.getTr_bsn_dsc() != null) {
    		writer.value(_sys_comm.getTr_bsn_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("accsc_inp_med_c"); 
    	if (_sys_comm.getAccsc_inp_med_c() != null) {
    		writer.value(_sys_comm.getAccsc_inp_med_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_qut_tgrm_c"); 
    	if (_sys_comm.getStd_qut_tgrm_c() != null) {
    		writer.value(_sys_comm.getStd_qut_tgrm_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ax_qut_tgrm_c"); 
    	if (_sys_comm.getAx_qut_tgrm_c() != null) {
    		writer.value(_sys_comm.getAx_qut_tgrm_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bzsunt_med_c"); 
    	if (_sys_comm.getBzsunt_med_c() != null) {
    		writer.value(_sys_comm.getBzsunt_med_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("opr_brc"); 
    	if (_sys_comm.getOpr_brc() != null) {
    		writer.value(_sys_comm.getOpr_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("axtrm_dti_bsn_dsc"); 
    	if (_sys_comm.getAxtrm_dti_bsn_dsc() != null) {
    		writer.value(_sys_comm.getAxtrm_dti_bsn_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("orgtr_std_tgrm_lclc"); 
    	if (_sys_comm.getOrgtr_std_tgrm_lclc() != null) {
    		writer.value(_sys_comm.getOrgtr_std_tgrm_lclc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("agnc_tr_brc"); 
    	if (_sys_comm.getAgnc_tr_brc() != null) {
    		writer.value(_sys_comm.getAgnc_tr_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("agnc_tr_br_naac_dsc"); 
    	if (_sys_comm.getAgnc_tr_br_naac_dsc() != null) {
    		writer.value(_sys_comm.getAgnc_tr_br_naac_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("exe_node_no"); 
    	if (_sys_comm.getExe_node_no() != null) {
    		writer.value(_sys_comm.getExe_node_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trms_sys_dsc"); 
    	if (_sys_comm.getTrms_sys_dsc() != null) {
    		writer.value(_sys_comm.getTrms_sys_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trms_sys_idvd_try_cntn"); 
    	if (_sys_comm.getTrms_sys_idvd_try_cntn() != null) {
    		writer.value(_sys_comm.getTrms_sys_idvd_try_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_dsc"); 
    	if (_sys_comm.getGse_dsc() != null) {
    		writer.value(_sys_comm.getGse_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_surc_sysid"); 
    	if (_sys_comm.getGse_surc_sysid() != null) {
    		writer.value(_sys_comm.getGse_surc_sysid());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_surc_cop_ds"); 
    	if (_sys_comm.getGse_surc_cop_ds() != null) {
    		writer.value(_sys_comm.getGse_surc_cop_ds());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_trgt_sysid"); 
    	if (_sys_comm.getGse_trgt_sysid() != null) {
    		writer.value(_sys_comm.getGse_trgt_sysid());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_trgt_cop_ds"); 
    	if (_sys_comm.getGse_trgt_cop_ds() != null) {
    		writer.value(_sys_comm.getGse_trgt_cop_ds());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_surc_svr_grp_no"); 
    	if (_sys_comm.getGse_surc_svr_grp_no() != null) {
    		writer.value(_sys_comm.getGse_surc_svr_grp_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("elt_doc_yn"); 
    	if (_sys_comm.getElt_doc_yn() != null) {
    		writer.value(_sys_comm.getElt_doc_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ds_brc"); 
    	if (_sys_comm.getDs_brc() != null) {
    		writer.value(_sys_comm.getDs_brc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("natv_id_inf_incd_yn"); 
    	if (_sys_comm.getNatv_id_inf_incd_yn() != null) {
    		writer.value(_sys_comm.getNatv_id_inf_incd_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bpr_idx_id"); 
    	if (_sys_comm.getBpr_idx_id() != null) {
    		writer.value(_sys_comm.getBpr_idx_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("atm_ddl_yn"); 
    	if (_sys_comm.getAtm_ddl_yn() != null) {
    		writer.value(_sys_comm.getAtm_ddl_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("eai_mq_msg_id"); 
    	if (_sys_comm.getEai_mq_msg_id() != null) {
    		writer.value(_sys_comm.getEai_mq_msg_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_intf_id"); 
    	if (_sys_comm.getGse_intf_id() != null) {
    		writer.value(_sys_comm.getGse_intf_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("natv_id_inf_pwize_apl_yn"); 
    	if (_sys_comm.getNatv_id_inf_pwize_apl_yn() != null) {
    		writer.value(_sys_comm.getNatv_id_inf_pwize_apl_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("fst_xtn_trry_cntn"); 
    	if (_sys_comm.getFst_xtn_trry_cntn() != null) {
    		writer.value(_sys_comm.getFst_xtn_trry_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("secn_xtn_trry_cntn"); 
    	if (_sys_comm.getSecn_xtn_trry_cntn() != null) {
    		writer.value(_sys_comm.getSecn_xtn_trry_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("thrd_xtn_trry_cntn"); 
    	if (_sys_comm.getThrd_xtn_trry_cntn() != null) {
    		writer.value(_sys_comm.getThrd_xtn_trry_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("svc_hdr_len"); 
    	if (_sys_comm.getSvc_hdr_len() != null) {
    		writer.value(_sys_comm.getSvc_hdr_len());
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
    
    public sys_comm unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	sys_comm _sys_comm = new sys_comm();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new sys_comm();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_sys_comm = (sys_comm)unmarshal( jr,  _sys_comm);
    
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
    	return _sys_comm;
    }
    	
    public DataObject unmarshal(byte[] bytes, sys_comm dto) throws UnmarshalException {
    	
    	sys_comm _sys_comm = (sys_comm) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new sys_comm();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_sys_comm = (sys_comm)unmarshal( jr,  _sys_comm);
    
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
    	                       
        return _sys_comm;
    }
    
    public sys_comm unmarshal(JsonReader reader, sys_comm dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(sys_comm dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "std_tgrm_len" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_len( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_gbl_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_gbl_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rms_svc_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRms_svc_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rzt_rms_svc_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRzt_rms_svc_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "orgtr_gbl_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOrgtr_gbl_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "can_crc_gbl_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCan_crc_gbl_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trz_gbl_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrz_gbl_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "xa_tr_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setXa_tr_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "prto_tgrm_dtm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPrto_tgrm_dtm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sync_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSync_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "async_attr_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAsync_attr_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_sysid" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_sysid( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sys_dtl_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSys_dtl_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "orgtr_sysid" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOrgtr_sysid( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ltgrm_sesn_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLtgrm_sesn_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ltgrm_prc_sqno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLtgrm_prc_sqno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ttl_ug_ync" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTtl_ug_ync( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ttl_fir_sttm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTtl_fir_sttm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ttl_mtn_tm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTtl_mtn_tm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tgrm_prto_tpc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTgrm_prto_tpc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trms_tr_sesn_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrms_tr_sesn_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trm_tpc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrm_tpc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trm_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrm_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_id_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_id_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "mca_chan_svr_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setMca_chan_svr_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "aut_tr_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAut_tr_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "obs_sys_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setObs_sys_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "obs_kdc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setObs_kdc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_err_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_err_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_rqr_rsp_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_rqr_rsp_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_frmt_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_frmt_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_lclc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_lclc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_sbjc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_sbjc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_chan_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_chan_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "comn_msg_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setComn_msg_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_trm_ipadr" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_trm_ipadr( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_dtm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_dtm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_prcrzt_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_prcrzt_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tgrm_tionm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTgrm_tionm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_msg_tpc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_msg_tpc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_comu_inf_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_comu_inf_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "snd_asqno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSnd_asqno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_tgrm_epy_mode_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_tgrm_epy_mode_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "opr_onl_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOpr_onl_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_brc( reader.nextString());
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
    		case "trmn_naac_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrmn_naac_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trmno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrmno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trm_kdc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrm_kdc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trm_br_ino_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrm_br_ino_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bat_plc_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBat_plc_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "scid" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setScid( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "scrn_vernm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setScrn_vernm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "optr_eno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOptr_eno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_optrnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_optrnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "optr_pzcc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOptr_pzcc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "aud_tr_inq_rsnc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAud_tr_inq_rsnc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "x_tr_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setX_tr_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "optr_attc_grdc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOptr_attc_grdc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sc1_mgr_attc_grdc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSc1_mgr_attc_grdc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sq2_mgr_attc_grdc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSq2_mgr_attc_grdc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "mgr_apv_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setMgr_apv_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sc1_mgr_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSc1_mgr_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sc1_mgr_tk_dlv_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSc1_mgr_tk_dlv_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sc1_mgr_trmno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSc1_mgr_trmno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sc1_mgr_trm_ug_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSc1_mgr_trm_ug_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sc1_mgr_eno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSc1_mgr_eno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sc1_mgr_name" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSc1_mgr_name( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sq2_mgr_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSq2_mgr_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sq2_mgr_tk_dlv_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSq2_mgr_tk_dlv_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sq2_mgr_trmno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSq2_mgr_trmno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sq2_mgr_trm_ug_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSq2_mgr_trm_ug_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sq2_mgr_eno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSq2_mgr_eno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sq2_mgr_name" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSq2_mgr_name( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tk_rgrls_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTk_rgrls_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "nslip_exe_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setNslip_exe_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "inp_med_inf_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setInp_med_inf_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "iccd_setg_ynchar" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIccd_setg_ynchar( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ppad_inp_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPpad_inp_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ms_inp_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setMs_inp_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "db_rbk_ync" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDb_rbk_ync( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tst_phr_apl_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTst_phr_apl_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sync_attr_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSync_attr_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "pgm_vernm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPgm_vernm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_hop_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_hop_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_hop_br_naac_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_hop_br_naac_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_bsn_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_bsn_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "accsc_inp_med_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAccsc_inp_med_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_qut_tgrm_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_qut_tgrm_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ax_qut_tgrm_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAx_qut_tgrm_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bzsunt_med_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBzsunt_med_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "opr_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOpr_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "axtrm_dti_bsn_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAxtrm_dti_bsn_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "orgtr_std_tgrm_lclc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOrgtr_std_tgrm_lclc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "agnc_tr_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAgnc_tr_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "agnc_tr_br_naac_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAgnc_tr_br_naac_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "exe_node_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setExe_node_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trms_sys_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrms_sys_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trms_sys_idvd_try_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrms_sys_idvd_try_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_surc_sysid" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_surc_sysid( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_surc_cop_ds" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_surc_cop_ds( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_trgt_sysid" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_trgt_sysid( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_trgt_cop_ds" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_trgt_cop_ds( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_surc_svr_grp_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_surc_svr_grp_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "elt_doc_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setElt_doc_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ds_brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDs_brc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "natv_id_inf_incd_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setNatv_id_inf_incd_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bpr_idx_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBpr_idx_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "atm_ddl_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAtm_ddl_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "eai_mq_msg_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setEai_mq_msg_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_intf_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_intf_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "natv_id_inf_pwize_apl_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setNatv_id_inf_pwize_apl_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "fst_xtn_trry_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setFst_xtn_trry_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "secn_xtn_trry_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSecn_xtn_trry_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "thrd_xtn_trry_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setThrd_xtn_trry_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "svc_hdr_len" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSvc_hdr_len( reader.nextString());
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

