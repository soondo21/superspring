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

import com.nh.common.dto.header.HDR_EXT_MCI;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "21. 11. 8. 오전 11:16",
	comments = "HDR_EXT_MCIMsgJson"
)
public class HDR_EXT_MCIMsgJson
{
    public byte[] marshal(HDR_EXT_MCI obj) throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	HDR_EXT_MCI _HDR_EXT_MCI = (HDR_EXT_MCI)obj;
    	
    	if(_HDR_EXT_MCI == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , "UTF-8" ) );        
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _HDR_EXT_MCI, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.header.HDR_EXT_MCI _HDR_EXT_MCI, JsonWriter writer )throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    
    	com.nh.common.dto.header.sys_commMsgJson __sys_comm = new com.nh.common.dto.header.sys_commMsgJson();	
    	writer.name("sys_comm");
    	if(_HDR_EXT_MCI.getSys_comm() != null) {
    	writer.beginObject();
    	__sys_comm.marshal((com.nh.common.dto.header.sys_comm)_HDR_EXT_MCI.getSys_comm(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.common.dto.header.efn_commMsgJson __efn_comm = new com.nh.common.dto.header.efn_commMsgJson();	
    	writer.name("efn_comm");
    	if(_HDR_EXT_MCI.getEfn_comm() != null) {
    	writer.beginObject();
    	__efn_comm.marshal((com.nh.common.dto.header.efn_comm)_HDR_EXT_MCI.getEfn_comm(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.common.dto.header.dat_commMsgJson __dat_comm = new com.nh.common.dto.header.dat_commMsgJson();	
    	writer.name("dat_comm");
    	if(_HDR_EXT_MCI.getDat_comm() != null) {
    	writer.beginObject();
    	__dat_comm.marshal((com.nh.common.dto.header.dat_comm)_HDR_EXT_MCI.getDat_comm(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.common.dto.header.fep_commMsgJson __fep_comm = new com.nh.common.dto.header.fep_commMsgJson();	
    	writer.name("fep_comm");
    	if(_HDR_EXT_MCI.getFep_comm() != null) {
    	writer.beginObject();
    	__fep_comm.marshal((com.nh.common.dto.header.fep_comm)_HDR_EXT_MCI.getFep_comm(), writer);
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
    
    public HDR_EXT_MCI unmarshal(byte[] bytes, int i) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	HDR_EXT_MCI _HDR_EXT_MCI = new HDR_EXT_MCI();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new HDR_EXT_MCI();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_HDR_EXT_MCI = (HDR_EXT_MCI)unmarshal( jr,  _HDR_EXT_MCI);
    
    		jr.endObject();
    		jr.close();
    
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	return _HDR_EXT_MCI;
    }
    	
    public HDR_EXT_MCI unmarshal(byte[] bytes, HDR_EXT_MCI dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	HDR_EXT_MCI _HDR_EXT_MCI = (HDR_EXT_MCI) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new HDR_EXT_MCI();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_HDR_EXT_MCI = (HDR_EXT_MCI)unmarshal( jr,  _HDR_EXT_MCI);
    
    		jr.endObject();
    		jr.close();
    			
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	                       
        return _HDR_EXT_MCI;
    }
    
    public HDR_EXT_MCI unmarshal(JsonReader reader, HDR_EXT_MCI dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(HDR_EXT_MCI dto, JsonReader reader, String name) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	
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
    		case "fep_comm" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.common.dto.header.fep_commMsgJson __fep_comm = new com.nh.common.dto.header.fep_commMsgJson();
    		
    				com.nh.common.dto.header.fep_comm ___fep_comm = new com.nh.common.dto.header.fep_comm();
    				reader.beginObject();
    				dto.setFep_comm((com.nh.common.dto.header.fep_comm)__fep_comm.unmarshal( reader, ___fep_comm ));
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

