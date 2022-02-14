package com.nh.common.dto.header;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;

import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import com.google.gson.stream.MalformedJsonException;

import com.nh.common.dto.header.eai_comm;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "21. 11. 8. 오전 11:16",
	comments = "eai_commMsgJson"
)
public class eai_commMsgJson
{
    public byte[] marshal(eai_comm obj) throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	eai_comm _eai_comm = (eai_comm)obj;
    	
    	if(_eai_comm == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , "UTF-8" ) );        
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _eai_comm, jw);
    		
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
       		    	    		
    	} finally{
    		try {
    			if(jw != null) jw.close();
    		} finally {
    			if(bw != null) bw.close();
    		}
    	}
    }
    
    
    public void marshal(com.nh.common.dto.header.eai_comm _eai_comm, JsonWriter writer )throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    
    	writer.name("eai_hdr_tgrm_len"); 
    	if (_eai_comm.getEai_hdr_tgrm_len() != null) {
    		writer.value(_eai_comm.getEai_hdr_tgrm_len());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rms_trc"); 
    	if (_eai_comm.getRms_trc() != null) {
    		writer.value(_eai_comm.getRms_trc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("intf_natv_id"); 
    	if (_eai_comm.getIntf_natv_id() != null) {
    		writer.value(_eai_comm.getIntf_natv_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rsp_trc"); 
    	if (_eai_comm.getRsp_trc() != null) {
    		writer.value(_eai_comm.getRsp_trc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trms_bsn_tp_dsc"); 
    	if (_eai_comm.getTrms_bsn_tp_dsc() != null) {
    		writer.value(_eai_comm.getTrms_bsn_tp_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rms_bsn_tp_dsc"); 
    	if (_eai_comm.getRms_bsn_tp_dsc() != null) {
    		writer.value(_eai_comm.getRms_bsn_tp_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("msg_que_grpnm"); 
    	if (_eai_comm.getMsg_que_grpnm() != null) {
    		writer.value(_eai_comm.getMsg_que_grpnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rsp_tp_dsc"); 
    	if (_eai_comm.getRsp_tp_dsc() != null) {
    		writer.value(_eai_comm.getRsp_tp_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bkup_yn"); 
    	if (_eai_comm.getBkup_yn() != null) {
    		writer.value(_eai_comm.getBkup_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("msg_unqu_id"); 
    	if (_eai_comm.getMsg_unqu_id() != null) {
    		writer.value(_eai_comm.getMsg_unqu_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("intf_prcrzt_c"); 
    	if (_eai_comm.getIntf_prcrzt_c() != null) {
    		writer.value(_eai_comm.getIntf_prcrzt_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bsn_err_c"); 
    	if (_eai_comm.getBsn_err_c() != null) {
    		writer.value(_eai_comm.getBsn_err_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("secn_rsp_trc"); 
    	if (_eai_comm.getSecn_rsp_trc() != null) {
    		writer.value(_eai_comm.getSecn_rsp_trc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("snr_adptr_tmout_tm"); 
    	if (_eai_comm.getSnr_adptr_tmout_tm() != null) {
    		writer.value(_eai_comm.getSnr_adptr_tmout_tm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_agg_cnt"); 
    	if (_eai_comm.getIo_agg_cnt() != null) {
    		writer.value(_eai_comm.getIo_agg_cnt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_agg_idx"); 
    	if (_eai_comm.getIo_agg_idx() != null) {
    		writer.value(_eai_comm.getIo_agg_idx());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_agg_list"); 
    	if (_eai_comm.getIo_agg_list() != null) {
    		writer.value(_eai_comm.getIo_agg_list());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("eai_bkg_trry_cntn"); 
    	if (_eai_comm.getEai_bkg_trry_cntn() != null) {
    		writer.value(_eai_comm.getEai_bkg_trry_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("xtn_trry_bfh_cntn"); 
    	if (_eai_comm.getXtn_trry_bfh_cntn() != null) {
    		writer.value(_eai_comm.getXtn_trry_bfh_cntn());
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
    
    public eai_comm unmarshal(byte[] bytes, int i) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	eai_comm _eai_comm = new eai_comm();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new eai_comm();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_eai_comm = (eai_comm)unmarshal( jr,  _eai_comm);
    
    		jr.endObject();
    		jr.close();
    
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	return _eai_comm;
    }
    	
    public eai_comm unmarshal(byte[] bytes, eai_comm dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	eai_comm _eai_comm = (eai_comm) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new eai_comm();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_eai_comm = (eai_comm)unmarshal( jr,  _eai_comm);
    
    		jr.endObject();
    		jr.close();
    			
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	                       
        return _eai_comm;
    }
    
    public eai_comm unmarshal(JsonReader reader, eai_comm dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(eai_comm dto, JsonReader reader, String name) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	
    	switch(name) {
    		case "eai_hdr_tgrm_len" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setEai_hdr_tgrm_len( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rms_trc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRms_trc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "intf_natv_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIntf_natv_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rsp_trc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRsp_trc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trms_bsn_tp_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrms_bsn_tp_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rms_bsn_tp_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRms_bsn_tp_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "msg_que_grpnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setMsg_que_grpnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rsp_tp_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRsp_tp_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bkup_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBkup_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "msg_unqu_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setMsg_unqu_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "intf_prcrzt_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIntf_prcrzt_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bsn_err_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBsn_err_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "secn_rsp_trc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSecn_rsp_trc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "snr_adptr_tmout_tm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSnr_adptr_tmout_tm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_agg_cnt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_agg_cnt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_agg_idx" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_agg_idx( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_agg_list" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_agg_list( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "eai_bkg_trry_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setEai_bkg_trry_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "xtn_trry_bfh_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setXtn_trry_bfh_cntn( reader.nextString());
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
    
}

