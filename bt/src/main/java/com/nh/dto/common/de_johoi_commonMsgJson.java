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
	date= "22. 2. 14. 오전 10:36",
	comments = "de_johoi_commonMsgJson"
)
public class de_johoi_commonMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	de_johoi_common _de_johoi_common = (de_johoi_common)obj;
    	
    	if(_de_johoi_common == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _de_johoi_common, jw);
    		
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
    
    
    public void marshal(com.nh.dto.common.de_johoi_common _de_johoi_common, JsonWriter writer )throws IOException {
    
    	writer.name("rlno_inq_dsc"); 
    	if (_de_johoi_common.getRlno_inq_dsc() != null) {
    		writer.value(_de_johoi_common.getRlno_inq_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acno"); 
    	if (_de_johoi_common.getAcno() != null) {
    		writer.value(_de_johoi_common.getAcno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_pw_30"); 
    	if (_de_johoi_common.getIo_pw_30() != null) {
    		writer.value(_de_johoi_common.getIo_pw_30());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("biz_hr_af_tr_yn"); 
    	if (_de_johoi_common.getBiz_hr_af_tr_yn() != null) {
    		writer.value(_de_johoi_common.getBiz_hr_af_tr_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_crc_can_dsc"); 
    	if (_de_johoi_common.getTr_crc_can_dsc() != null) {
    		writer.value(_de_johoi_common.getTr_crc_can_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("curc"); 
    	if (_de_johoi_common.getCurc() != null) {
    		writer.value(_de_johoi_common.getCurc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_elt_bb_no"); 
    	if (_de_johoi_common.getIo_elt_bb_no() != null) {
    		writer.value(_de_johoi_common.getIo_elt_bb_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("wrs_c"); 
    	if (_de_johoi_common.getWrs_c() != null) {
    		writer.value(_de_johoi_common.getWrs_c());
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
    
    public de_johoi_common unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	de_johoi_common _de_johoi_common = new de_johoi_common();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new de_johoi_common();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_de_johoi_common = (de_johoi_common)unmarshal( jr,  _de_johoi_common);
    
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
    	return _de_johoi_common;
    }
    	
    public DataObject unmarshal(byte[] bytes, de_johoi_common dto) throws UnmarshalException {
    	
    	de_johoi_common _de_johoi_common = (de_johoi_common) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new de_johoi_common();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_de_johoi_common = (de_johoi_common)unmarshal( jr,  _de_johoi_common);
    
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
    	                       
        return _de_johoi_common;
    }
    
    public de_johoi_common unmarshal(JsonReader reader, de_johoi_common dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(de_johoi_common dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "rlno_inq_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRlno_inq_dsc( reader.nextString());
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
    		case "io_pw_30" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_pw_30( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "biz_hr_af_tr_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBiz_hr_af_tr_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_crc_can_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_crc_can_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "curc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCurc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_elt_bb_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_elt_bb_no( reader.nextString());
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

