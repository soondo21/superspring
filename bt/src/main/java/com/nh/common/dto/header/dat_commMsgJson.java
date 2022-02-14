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

import com.nh.common.dto.header.dat_comm;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "21. 11. 8. 오전 11:16",
	comments = "dat_commMsgJson"
)
public class dat_commMsgJson
{
    public byte[] marshal(dat_comm obj) throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	dat_comm _dat_comm = (dat_comm)obj;
    	
    	if(_dat_comm == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , "UTF-8" ) );        
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _dat_comm, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.header.dat_comm _dat_comm, JsonWriter writer )throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    
    	writer.name("iop_dsc"); 
    	if (_dat_comm.getIop_dsc() != null) {
    		writer.value(_dat_comm.getIop_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("screen_id"); 
    	if (_dat_comm.getScreen_id() != null) {
    		writer.value(_dat_comm.getScreen_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("data_hdr_dtlc"); 
    	if (_dat_comm.getData_hdr_dtlc() != null) {
    		writer.value(_dat_comm.getData_hdr_dtlc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("data_hdr_pranm"); 
    	if (_dat_comm.getData_hdr_pranm() != null) {
    		writer.value(_dat_comm.getData_hdr_pranm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tgrm_data_len"); 
    	if (_dat_comm.getTgrm_data_len() != null) {
    		writer.value(_dat_comm.getTgrm_data_len());
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
    
    public dat_comm unmarshal(byte[] bytes, int i) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	dat_comm _dat_comm = new dat_comm();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new dat_comm();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_dat_comm = (dat_comm)unmarshal( jr,  _dat_comm);
    
    		jr.endObject();
    		jr.close();
    
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	return _dat_comm;
    }
    	
    public dat_comm unmarshal(byte[] bytes, dat_comm dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	dat_comm _dat_comm = (dat_comm) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new dat_comm();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_dat_comm = (dat_comm)unmarshal( jr,  _dat_comm);
    
    		jr.endObject();
    		jr.close();
    			
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	                       
        return _dat_comm;
    }
    
    public dat_comm unmarshal(JsonReader reader, dat_comm dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(dat_comm dto, JsonReader reader, String name) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	
    	switch(name) {
    		case "iop_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIop_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "screen_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setScreen_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "data_hdr_dtlc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setData_hdr_dtlc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "data_hdr_pranm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setData_hdr_pranm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tgrm_data_len" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTgrm_data_len( reader.nextString());
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

