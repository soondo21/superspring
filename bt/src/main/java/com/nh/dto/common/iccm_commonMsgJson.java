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
	comments = "iccm_commonMsgJson"
)
public class iccm_commonMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	iccm_common _iccm_common = (iccm_common)obj;
    	
    	if(_iccm_common == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _iccm_common, jw);
    		
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
    
    
    public void marshal(com.nh.dto.common.iccm_common _iccm_common, JsonWriter writer )throws IOException {
    
    	writer.name("ac_cd_idx_val"); 
    	if (_iccm_common.getAc_cd_idx_val() != null) {
    		writer.value(_iccm_common.getAc_cd_idx_val());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("cd_no"); 
    	if (_iccm_common.getCd_no() != null) {
    		writer.value(_iccm_common.getCd_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("acno"); 
    	if (_iccm_common.getAcno() != null) {
    		writer.value(_iccm_common.getAcno());
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
    
    public iccm_common unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	iccm_common _iccm_common = new iccm_common();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new iccm_common();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_iccm_common = (iccm_common)unmarshal( jr,  _iccm_common);
    
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
    	return _iccm_common;
    }
    	
    public DataObject unmarshal(byte[] bytes, iccm_common dto) throws UnmarshalException {
    	
    	iccm_common _iccm_common = (iccm_common) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new iccm_common();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_iccm_common = (iccm_common)unmarshal( jr,  _iccm_common);
    
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
    	                       
        return _iccm_common;
    }
    
    public iccm_common unmarshal(JsonReader reader, iccm_common dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(iccm_common dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "ac_cd_idx_val" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAc_cd_idx_val( reader.nextString());
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
    		case "acno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAcno( reader.nextString());
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

