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
	comments = "iccm_johoi_inMsgJson"
)
public class iccm_johoi_inMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	iccm_johoi_in _iccm_johoi_in = (iccm_johoi_in)obj;
    	
    	if(_iccm_johoi_in == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _iccm_johoi_in, jw);
    		
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
    
    
    public void marshal(com.nh.dto.common.iccm_johoi_in _iccm_johoi_in, JsonWriter writer )throws IOException {
    
    	writer.name("io_key_ver_02"); 
    	if (_iccm_johoi_in.getIo_key_ver_02() != null) {
    		writer.value(_iccm_johoi_in.getIo_key_ver_02());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bsn_dsc"); 
    	if (_iccm_johoi_in.getBsn_dsc() != null) {
    		writer.value(_iccm_johoi_in.getBsn_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_tram"); 
    	if (_iccm_johoi_in.getIo_tram() != null) {
    		writer.value(_iccm_johoi_in.getIo_tram());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_vld_prd"); 
    	if (_iccm_johoi_in.getIo_vld_prd() != null) {
    		writer.value(_iccm_johoi_in.getIo_vld_prd());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acno"); 
    	if (_iccm_johoi_in.getAcno() != null) {
    		writer.value(_iccm_johoi_in.getAcno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rep_cusno"); 
    	if (_iccm_johoi_in.getRep_cusno() != null) {
    		writer.value(_iccm_johoi_in.getRep_cusno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("pwize_cd_pw"); 
    	if (_iccm_johoi_in.getPwize_cd_pw() != null) {
    		writer.value(_iccm_johoi_in.getPwize_cd_pw());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("pwize_dsc"); 
    	if (_iccm_johoi_in.getPwize_dsc() != null) {
    		writer.value(_iccm_johoi_in.getPwize_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("fr_us_fee"); 
    	if (_iccm_johoi_in.getFr_us_fee() != null) {
    		writer.value(_iccm_johoi_in.getFr_us_fee());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_nan2_32"); 
    	if (_iccm_johoi_in.getIo_nan2_32() != null) {
    		writer.value(_iccm_johoi_in.getIo_nan2_32());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_nan1_32"); 
    	if (_iccm_johoi_in.getIo_nan1_32() != null) {
    		writer.value(_iccm_johoi_in.getIo_nan1_32());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("isu_sc"); 
    	if (_iccm_johoi_in.getIsu_sc() != null) {
    		writer.value(_iccm_johoi_in.getIsu_sc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("jstp_verf_cd_rndno"); 
    	if (_iccm_johoi_in.getJstp_verf_cd_rndno() != null) {
    		writer.value(_iccm_johoi_in.getJstp_verf_cd_rndno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("cd_no"); 
    	if (_iccm_johoi_in.getCd_no() != null) {
    		writer.value(_iccm_johoi_in.getCd_no());
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
    
    public iccm_johoi_in unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	iccm_johoi_in _iccm_johoi_in = new iccm_johoi_in();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new iccm_johoi_in();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_iccm_johoi_in = (iccm_johoi_in)unmarshal( jr,  _iccm_johoi_in);
    
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
    	return _iccm_johoi_in;
    }
    	
    public DataObject unmarshal(byte[] bytes, iccm_johoi_in dto) throws UnmarshalException {
    	
    	iccm_johoi_in _iccm_johoi_in = (iccm_johoi_in) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new iccm_johoi_in();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_iccm_johoi_in = (iccm_johoi_in)unmarshal( jr,  _iccm_johoi_in);
    
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
    	                       
        return _iccm_johoi_in;
    }
    
    public iccm_johoi_in unmarshal(JsonReader reader, iccm_johoi_in dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(iccm_johoi_in dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "io_key_ver_02" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_key_ver_02( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bsn_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBsn_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_tram" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_tram( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_vld_prd" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_vld_prd( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "acno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rep_cusno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRep_cusno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "pwize_cd_pw" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPwize_cd_pw( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "pwize_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPwize_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "fr_us_fee" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setFr_us_fee( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_nan2_32" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_nan2_32( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_nan1_32" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_nan1_32( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "isu_sc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIsu_sc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "jstp_verf_cd_rndno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setJstp_verf_cd_rndno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "cd_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCd_no( reader.nextString());
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

