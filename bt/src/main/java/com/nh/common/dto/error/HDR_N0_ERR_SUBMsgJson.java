package com.nh.common.dto.error;

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
	date= "21. 12. 27. 오후 1:42",
	comments = "HDR_N0_ERR_SUBMsgJson"
)
public class HDR_N0_ERR_SUBMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	HDR_N0_ERR_SUB _HDR_N0_ERR_SUB = (HDR_N0_ERR_SUB)obj;
    	
    	if(_HDR_N0_ERR_SUB == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _HDR_N0_ERR_SUB, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.error.HDR_N0_ERR_SUB _HDR_N0_ERR_SUB, JsonWriter writer )throws IOException {
    
    	writer.name("std_err_c"); 
    	if (_HDR_N0_ERR_SUB.getStd_err_c() != null) {
    		writer.value(_HDR_N0_ERR_SUB.getStd_err_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("chan_err_c"); 
    	if (_HDR_N0_ERR_SUB.getChan_err_c() != null) {
    		writer.value(_HDR_N0_ERR_SUB.getChan_err_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_err_msg_cntn"); 
    	if (_HDR_N0_ERR_SUB.getStd_err_msg_cntn() != null) {
    		writer.value(_HDR_N0_ERR_SUB.getStd_err_msg_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("add_msg_cntn"); 
    	if (_HDR_N0_ERR_SUB.getAdd_msg_cntn() != null) {
    		writer.value(_HDR_N0_ERR_SUB.getAdd_msg_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("obs_kdc"); 
    	if (_HDR_N0_ERR_SUB.getObs_kdc() != null) {
    		writer.value(_HDR_N0_ERR_SUB.getObs_kdc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("err_svcnm"); 
    	if (_HDR_N0_ERR_SUB.getErr_svcnm() != null) {
    		writer.value(_HDR_N0_ERR_SUB.getErr_svcnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("err_flnm"); 
    	if (_HDR_N0_ERR_SUB.getErr_flnm() != null) {
    		writer.value(_HDR_N0_ERR_SUB.getErr_flnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("err_mthdnm"); 
    	if (_HDR_N0_ERR_SUB.getErr_mthdnm() != null) {
    		writer.value(_HDR_N0_ERR_SUB.getErr_mthdnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("pgm_line_no");
    	writer.value(_HDR_N0_ERR_SUB.getPgm_line_no());
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
    
    public HDR_N0_ERR_SUB unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	HDR_N0_ERR_SUB _HDR_N0_ERR_SUB = new HDR_N0_ERR_SUB();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new HDR_N0_ERR_SUB();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_HDR_N0_ERR_SUB = (HDR_N0_ERR_SUB)unmarshal( jr,  _HDR_N0_ERR_SUB);
    
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
    	return _HDR_N0_ERR_SUB;
    }
    	
    public DataObject unmarshal(byte[] bytes, HDR_N0_ERR_SUB dto) throws UnmarshalException {
    	
    	HDR_N0_ERR_SUB _HDR_N0_ERR_SUB = (HDR_N0_ERR_SUB) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new HDR_N0_ERR_SUB();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_HDR_N0_ERR_SUB = (HDR_N0_ERR_SUB)unmarshal( jr,  _HDR_N0_ERR_SUB);
    
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
    	                       
        return _HDR_N0_ERR_SUB;
    }
    
    public HDR_N0_ERR_SUB unmarshal(JsonReader reader, HDR_N0_ERR_SUB dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(HDR_N0_ERR_SUB dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "std_err_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_err_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "chan_err_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setChan_err_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_err_msg_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_err_msg_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "add_msg_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAdd_msg_cntn( reader.nextString());
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
    		case "err_svcnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setErr_svcnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "err_flnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setErr_flnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "err_mthdnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setErr_mthdnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "pgm_line_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPgm_line_no( reader.nextInt());
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

