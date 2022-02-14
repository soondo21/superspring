package com.nh.dto.common;

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
	date= "21. 11. 24. 오후 4:29",
	comments = "de_johoi_inMsgJson"
)
public class de_johoi_inMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	de_johoi_in _de_johoi_in = (de_johoi_in)obj;
    	
    	if(_de_johoi_in == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _de_johoi_in, jw);
    		
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
    
    
    public void marshal(com.nh.dto.common.de_johoi_in _de_johoi_in, JsonWriter writer )throws IOException {
    
    	writer.name("inq_st_dt"); 
    	if (_de_johoi_in.getInq_st_dt() != null) {
    		writer.value(_de_johoi_in.getInq_st_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_con_tr_yn"); 
    	if (_de_johoi_in.getIo_con_tr_yn() != null) {
    		writer.value(_de_johoi_in.getIo_con_tr_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rlno_chk_dsc"); 
    	if (_de_johoi_in.getRlno_chk_dsc() != null) {
    		writer.value(_de_johoi_in.getRlno_chk_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("inq_dsc"); 
    	if (_de_johoi_in.getInq_dsc() != null) {
    		writer.value(_de_johoi_in.getInq_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("led_inf_lkg_yn"); 
    	if (_de_johoi_in.getLed_inf_lkg_yn() != null) {
    		writer.value(_de_johoi_in.getLed_inf_lkg_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("am_bascd"); 
    	if (_de_johoi_in.getAm_bascd() != null) {
    		writer.value(_de_johoi_in.getAm_bascd());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("pw_cnf_yn"); 
    	if (_de_johoi_in.getPw_cnf_yn() != null) {
    		writer.value(_de_johoi_in.getPw_cnf_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sort_sq"); 
    	if (_de_johoi_in.getSort_sq() != null) {
    		writer.value(_de_johoi_in.getSort_sq());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("inq_ed_dt"); 
    	if (_de_johoi_in.getInq_ed_dt() != null) {
    		writer.value(_de_johoi_in.getInq_ed_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bas_am"); 
    	if (_de_johoi_in.getBas_am() != null) {
    		writer.value(_de_johoi_in.getBas_am());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("qisvc_yn"); 
    	if (_de_johoi_in.getQisvc_yn() != null) {
    		writer.value(_de_johoi_in.getQisvc_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_skip_no"); 
    	if (_de_johoi_in.getIo_skip_no() != null) {
    		writer.value(_de_johoi_in.getIo_skip_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_req_cn"); 
    	if (_de_johoi_in.getIo_req_cn() != null) {
    		writer.value(_de_johoi_in.getIo_req_cn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_data_ttcn"); 
    	if (_de_johoi_in.getIo_data_ttcn() != null) {
    		writer.value(_de_johoi_in.getIo_data_ttcn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_rec_sjt_srch_abr_nm"); 
    	if (_de_johoi_in.getTr_rec_sjt_srch_abr_nm() != null) {
    		writer.value(_de_johoi_in.getTr_rec_sjt_srch_abr_nm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("lkg_acno"); 
    	if (_de_johoi_in.getLkg_acno() != null) {
    		writer.value(_de_johoi_in.getLkg_acno());
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
    
    public de_johoi_in unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	de_johoi_in _de_johoi_in = new de_johoi_in();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new de_johoi_in();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_de_johoi_in = (de_johoi_in)unmarshal( jr,  _de_johoi_in);
    
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
    	return _de_johoi_in;
    }
    	
    public DataObject unmarshal(byte[] bytes, de_johoi_in dto) throws UnmarshalException {
    	
    	de_johoi_in _de_johoi_in = (de_johoi_in) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new de_johoi_in();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_de_johoi_in = (de_johoi_in)unmarshal( jr,  _de_johoi_in);
    
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
    	                       
        return _de_johoi_in;
    }
    
    public de_johoi_in unmarshal(JsonReader reader, de_johoi_in dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(de_johoi_in dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "inq_st_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setInq_st_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_con_tr_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_con_tr_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rlno_chk_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRlno_chk_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "inq_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setInq_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "led_inf_lkg_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLed_inf_lkg_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "am_bascd" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAm_bascd( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "pw_cnf_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPw_cnf_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sort_sq" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSort_sq( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "inq_ed_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setInq_ed_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bas_am" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBas_am( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "qisvc_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setQisvc_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_skip_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_skip_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_req_cn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_req_cn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_data_ttcn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_data_ttcn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_rec_sjt_srch_abr_nm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_rec_sjt_srch_abr_nm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "lkg_acno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLkg_acno( reader.nextString());
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

