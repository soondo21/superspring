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

import com.nh.common.dto.header.HDR_DIGITAL;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "21. 11. 8. 오전 11:16",
	comments = "HDR_DIGITALMsgJson"
)
public class HDR_DIGITALMsgJson
{
    public byte[] marshal(HDR_DIGITAL obj) throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	HDR_DIGITAL _HDR_DIGITAL = (HDR_DIGITAL)obj;
    	
    	if(_HDR_DIGITAL == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , "UTF-8" ) );        
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _HDR_DIGITAL, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.header.HDR_DIGITAL _HDR_DIGITAL, JsonWriter writer )throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    
    	com.nh.common.dto.header.sys_commMsgJson __sys_comm = new com.nh.common.dto.header.sys_commMsgJson();	
    	writer.name("sys_comm");
    	if(_HDR_DIGITAL.getSys_comm() != null) {
    	writer.beginObject();
    	__sys_comm.marshal((com.nh.common.dto.header.sys_comm)_HDR_DIGITAL.getSys_comm(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.common.dto.header.efn_commMsgJson __efn_comm = new com.nh.common.dto.header.efn_commMsgJson();	
    	writer.name("efn_comm");
    	if(_HDR_DIGITAL.getEfn_comm() != null) {
    	writer.beginObject();
    	__efn_comm.marshal((com.nh.common.dto.header.efn_comm)_HDR_DIGITAL.getEfn_comm(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.common.dto.header.dat_commMsgJson __dat_comm = new com.nh.common.dto.header.dat_commMsgJson();	
    	writer.name("dat_comm");
    	if(_HDR_DIGITAL.getDat_comm() != null) {
    	writer.beginObject();
    	__dat_comm.marshal((com.nh.common.dto.header.dat_comm)_HDR_DIGITAL.getDat_comm(), writer);
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
    
    public HDR_DIGITAL unmarshal(byte[] bytes, int i) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	HDR_DIGITAL _HDR_DIGITAL = new HDR_DIGITAL();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new HDR_DIGITAL();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_HDR_DIGITAL = (HDR_DIGITAL)unmarshal( jr,  _HDR_DIGITAL);
    
    		jr.endObject();
    		jr.close();
    
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	return _HDR_DIGITAL;
    }
    	
    public HDR_DIGITAL unmarshal(byte[] bytes, HDR_DIGITAL dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	HDR_DIGITAL _HDR_DIGITAL = (HDR_DIGITAL) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new HDR_DIGITAL();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_HDR_DIGITAL = (HDR_DIGITAL)unmarshal( jr,  _HDR_DIGITAL);
    
    		jr.endObject();
    		jr.close();
    			
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	                       
        return _HDR_DIGITAL;
    }
    
    public HDR_DIGITAL unmarshal(JsonReader reader, HDR_DIGITAL dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(HDR_DIGITAL dto, JsonReader reader, String name) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	
    	switch(name) {
    		case "sys_comm" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.common.dto.header.sys_commMsgJson __sys_comm = new com.nh.common.dto.header.sys_commMsgJson();
    		
    				com.nh.common.dto.header.sys_comm ___sys_comm = new com.nh.common.dto.header.sys_comm();
    				reader.beginObject();
    				dto.setSys_comm((com.nh.common.dto.header.sys_comm)__sys_comm.unmarshal( reader, ___sys_comm ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "efn_comm" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.common.dto.header.efn_commMsgJson __efn_comm = new com.nh.common.dto.header.efn_commMsgJson();
    		
    				com.nh.common.dto.header.efn_comm ___efn_comm = new com.nh.common.dto.header.efn_comm();
    				reader.beginObject();
    				dto.setEfn_comm((com.nh.common.dto.header.efn_comm)__efn_comm.unmarshal( reader, ___efn_comm ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "dat_comm" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.common.dto.header.dat_commMsgJson __dat_comm = new com.nh.common.dto.header.dat_commMsgJson();
    		
    				com.nh.common.dto.header.dat_comm ___dat_comm = new com.nh.common.dto.header.dat_comm();
    				reader.beginObject();
    				dto.setDat_comm((com.nh.common.dto.header.dat_comm)__dat_comm.unmarshal( reader, ___dat_comm ));
    				reader.endObject();
    			}
    			break;
    		}
    		default :
    		reader.skipValue();
    		break;
    	}
    }
    
}

