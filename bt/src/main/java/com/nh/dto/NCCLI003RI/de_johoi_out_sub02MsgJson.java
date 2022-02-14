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
	date= "22. 2. 14. 오전 10:36",
	comments = "de_johoi_out_sub02MsgJson"
)
public class de_johoi_out_sub02MsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	de_johoi_out_sub02 _de_johoi_out_sub02 = (de_johoi_out_sub02)obj;
    	
    	if(_de_johoi_out_sub02 == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _de_johoi_out_sub02, jw);
    		
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
    
    
    public void marshal(com.nh.dto.NCCLI003RI.de_johoi_out_sub02 _de_johoi_out_sub02, JsonWriter writer )throws IOException {
    
    	writer.name("dpz_wrs_sq3_cfc"); 
    	if (_de_johoi_out_sub02.getDpz_wrs_sq3_cfc() != null) {
    		writer.value(_de_johoi_out_sub02.getDpz_wrs_sq3_cfc());
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
    
    public de_johoi_out_sub02 unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	de_johoi_out_sub02 _de_johoi_out_sub02 = new de_johoi_out_sub02();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new de_johoi_out_sub02();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_de_johoi_out_sub02 = (de_johoi_out_sub02)unmarshal( jr,  _de_johoi_out_sub02);
    
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
    	return _de_johoi_out_sub02;
    }
    	
    public DataObject unmarshal(byte[] bytes, de_johoi_out_sub02 dto) throws UnmarshalException {
    	
    	de_johoi_out_sub02 _de_johoi_out_sub02 = (de_johoi_out_sub02) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new de_johoi_out_sub02();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_de_johoi_out_sub02 = (de_johoi_out_sub02)unmarshal( jr,  _de_johoi_out_sub02);
    
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
    	                       
        return _de_johoi_out_sub02;
    }
    
    public de_johoi_out_sub02 unmarshal(JsonReader reader, de_johoi_out_sub02 dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(de_johoi_out_sub02 dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "dpz_wrs_sq3_cfc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setDpz_wrs_sq3_cfc( reader.nextString());
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

