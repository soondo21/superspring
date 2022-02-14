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

import com.nh.common.dto.header.fep_comm;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "21. 11. 8. 오전 11:16",
	comments = "fep_commMsgJson"
)
public class fep_commMsgJson
{
    public byte[] marshal(fep_comm obj) throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	fep_comm _fep_comm = (fep_comm)obj;
    	
    	if(_fep_comm == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , "UTF-8" ) );        
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _fep_comm, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.header.fep_comm _fep_comm, JsonWriter writer )throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    
    	writer.name("io_mcx_tot_len"); 
    	if (_fep_comm.getIo_mcx_tot_len() != null) {
    		writer.value(_fep_comm.getIo_mcx_tot_len());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_trx_code"); 
    	if (_fep_comm.getIo_mcx_trx_code() != null) {
    		writer.value(_fep_comm.getIo_mcx_trx_code());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_x25_line_name"); 
    	if (_fep_comm.getIo_mcx_x25_line_name() != null) {
    		writer.value(_fep_comm.getIo_mcx_x25_line_name());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_x25_lu_no"); 
    	if (_fep_comm.getIo_mcx_x25_lu_no() != null) {
    		writer.value(_fep_comm.getIo_mcx_x25_lu_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_sys_name"); 
    	if (_fep_comm.getIo_mcx_sys_name() != null) {
    		writer.value(_fep_comm.getIo_mcx_sys_name());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_sys_no"); 
    	if (_fep_comm.getIo_mcx_sys_no() != null) {
    		writer.value(_fep_comm.getIo_mcx_sys_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_real_len"); 
    	if (_fep_comm.getIo_mcx_real_len() != null) {
    		writer.value(_fep_comm.getIo_mcx_real_len());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_msg_code"); 
    	if (_fep_comm.getIo_mcx_msg_code() != null) {
    		writer.value(_fep_comm.getIo_mcx_msg_code());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_msg_dsc"); 
    	if (_fep_comm.getIo_mcx_msg_dsc() != null) {
    		writer.value(_fep_comm.getIo_mcx_msg_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_biz_code"); 
    	if (_fep_comm.getIo_mcx_biz_code() != null) {
    		writer.value(_fep_comm.getIo_mcx_biz_code());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_tgrm_dsc"); 
    	if (_fep_comm.getIo_mcx_tgrm_dsc() != null) {
    		writer.value(_fep_comm.getIo_mcx_tgrm_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_prc_rzt"); 
    	if (_fep_comm.getIo_mcx_prc_rzt() != null) {
    		writer.value(_fep_comm.getIo_mcx_prc_rzt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_src_id"); 
    	if (_fep_comm.getIo_mcx_src_id() != null) {
    		writer.value(_fep_comm.getIo_mcx_src_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_dest_id"); 
    	if (_fep_comm.getIo_mcx_dest_id() != null) {
    		writer.value(_fep_comm.getIo_mcx_dest_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_snr_org"); 
    	if (_fep_comm.getIo_mcx_snr_org() != null) {
    		writer.value(_fep_comm.getIo_mcx_snr_org());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_snd_dsc"); 
    	if (_fep_comm.getIo_mcx_snd_dsc() != null) {
    		writer.value(_fep_comm.getIo_mcx_snd_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_tr_natv_no"); 
    	if (_fep_comm.getIo_mcx_tr_natv_no() != null) {
    		writer.value(_fep_comm.getIo_mcx_tr_natv_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_x25_biz_idx"); 
    	if (_fep_comm.getIo_mcx_x25_biz_idx() != null) {
    		writer.value(_fep_comm.getIo_mcx_x25_biz_idx());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_x25_lu_flag"); 
    	if (_fep_comm.getIo_mcx_x25_lu_flag() != null) {
    		writer.value(_fep_comm.getIo_mcx_x25_lu_flag());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_loopback"); 
    	if (_fep_comm.getIo_mcx_loopback() != null) {
    		writer.value(_fep_comm.getIo_mcx_loopback());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_mcx_rsv"); 
    	if (_fep_comm.getIo_mcx_rsv() != null) {
    		writer.value(_fep_comm.getIo_mcx_rsv());
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
    
    public fep_comm unmarshal(byte[] bytes, int i) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	fep_comm _fep_comm = new fep_comm();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new fep_comm();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_fep_comm = (fep_comm)unmarshal( jr,  _fep_comm);
    
    		jr.endObject();
    		jr.close();
    
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	return _fep_comm;
    }
    	
    public fep_comm unmarshal(byte[] bytes, fep_comm dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	fep_comm _fep_comm = (fep_comm) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new fep_comm();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_fep_comm = (fep_comm)unmarshal( jr,  _fep_comm);
    
    		jr.endObject();
    		jr.close();
    			
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	                       
        return _fep_comm;
    }
    
    public fep_comm unmarshal(JsonReader reader, fep_comm dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(fep_comm dto, JsonReader reader, String name) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	
    	switch(name) {
    		case "io_mcx_tot_len" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_tot_len( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_trx_code" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_trx_code( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_x25_line_name" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_x25_line_name( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_x25_lu_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_x25_lu_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_sys_name" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_sys_name( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_sys_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_sys_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_real_len" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_real_len( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_msg_code" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_msg_code( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_msg_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_msg_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_biz_code" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_biz_code( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_tgrm_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_tgrm_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_prc_rzt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_prc_rzt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_src_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_src_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_dest_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_dest_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_snr_org" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_snr_org( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_snd_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_snd_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_tr_natv_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_tr_natv_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_x25_biz_idx" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_x25_biz_idx( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_x25_lu_flag" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_x25_lu_flag( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_loopback" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_loopback( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_mcx_rsv" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_mcx_rsv( reader.nextString());
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

