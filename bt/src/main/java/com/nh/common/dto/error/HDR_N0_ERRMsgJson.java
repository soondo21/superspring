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
	comments = "HDR_N0_ERRMsgJson"
)
public class HDR_N0_ERRMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	HDR_N0_ERR _HDR_N0_ERR = (HDR_N0_ERR)obj;
    	
    	if(_HDR_N0_ERR == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _HDR_N0_ERR, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.error.HDR_N0_ERR _HDR_N0_ERR, JsonWriter writer )throws IOException {
    
    	writer.name("err_fildnm"); 
    	if (_HDR_N0_ERR.getErr_fildnm() != null) {
    		writer.value(_HDR_N0_ERR.getErr_fildnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("std_err_cn");
    	writer.value(_HDR_N0_ERR.getStd_err_cn());
    	com.nh.common.dto.error.HDR_N0_ERR_SUBMsgJson __sub = new com.nh.common.dto.error.HDR_N0_ERR_SUBMsgJson();	
    	writer.name("sub");
    	if(_HDR_N0_ERR.getSub() != null) {
    	writer.beginObject();
    	__sub.marshal((com.nh.common.dto.error.HDR_N0_ERR_SUB)_HDR_N0_ERR.getSub(), writer);
    	writer.endObject();
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
    
    public HDR_N0_ERR unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	HDR_N0_ERR _HDR_N0_ERR = new HDR_N0_ERR();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new HDR_N0_ERR();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_HDR_N0_ERR = (HDR_N0_ERR)unmarshal( jr,  _HDR_N0_ERR);
    
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
    	return _HDR_N0_ERR;
    }
    	
    public DataObject unmarshal(byte[] bytes, HDR_N0_ERR dto) throws UnmarshalException {
    	
    	HDR_N0_ERR _HDR_N0_ERR = (HDR_N0_ERR) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new HDR_N0_ERR();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_HDR_N0_ERR = (HDR_N0_ERR)unmarshal( jr,  _HDR_N0_ERR);
    
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
    	                       
        return _HDR_N0_ERR;
    }
    
    public HDR_N0_ERR unmarshal(JsonReader reader, HDR_N0_ERR dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(HDR_N0_ERR dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "err_fildnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setErr_fildnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "std_err_cn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setStd_err_cn( reader.nextInt());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sub" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.common.dto.error.HDR_N0_ERR_SUBMsgJson __sub = new com.nh.common.dto.error.HDR_N0_ERR_SUBMsgJson();
    		
    				com.nh.common.dto.error.HDR_N0_ERR_SUB ___HDR_N0_ERR_SUB = new com.nh.common.dto.error.HDR_N0_ERR_SUB();
    				reader.beginObject();
    				dto.setSub((com.nh.common.dto.error.HDR_N0_ERR_SUB)__sub.unmarshal( reader, ___HDR_N0_ERR_SUB ));
    				reader.endObject();
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

