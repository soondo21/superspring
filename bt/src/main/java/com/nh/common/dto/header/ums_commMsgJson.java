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

import com.nh.common.dto.header.ums_comm;


@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "21. 11. 8. 오전 11:16",
	comments = "ums_commMsgJson"
)
public class ums_commMsgJson
{
    public byte[] marshal(ums_comm obj) throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	ums_comm _ums_comm = (ums_comm)obj;
    	
    	if(_ums_comm == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , "UTF-8" ) );        
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _ums_comm, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.header.ums_comm _ums_comm, JsonWriter writer )throws IOException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    
    	writer.name("length"); 
    	if (_ums_comm.getLength() != null) {
    		writer.value(_ums_comm.getLength());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("job_id"); 
    	if (_ums_comm.getJob_id() != null) {
    		writer.value(_ums_comm.getJob_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("snd_media"); 
    	if (_ums_comm.getSnd_media() != null) {
    		writer.value(_ums_comm.getSnd_media());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("svc_id"); 
    	if (_ums_comm.getSvc_id() != null) {
    		writer.value(_ums_comm.getSvc_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("trm_no"); 
    	if (_ums_comm.getTrm_no() != null) {
    		writer.value(_ums_comm.getTrm_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sql_id"); 
    	if (_ums_comm.getSql_id() != null) {
    		writer.value(_ums_comm.getSql_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("err_condition"); 
    	if (_ums_comm.getErr_condition() != null) {
    		writer.value(_ums_comm.getErr_condition());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("snd_key"); 
    	if (_ums_comm.getSnd_key() != null) {
    		writer.value(_ums_comm.getSnd_key());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("sync_async"); 
    	if (_ums_comm.getSync_async() != null) {
    		writer.value(_ums_comm.getSync_async());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("async"); 
    	if (_ums_comm.getAsync() != null) {
    		writer.value(_ums_comm.getAsync());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("async_nm"); 
    	if (_ums_comm.getAsync_nm() != null) {
    		writer.value(_ums_comm.getAsync_nm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("person_no"); 
    	if (_ums_comm.getPerson_no() != null) {
    		writer.value(_ums_comm.getPerson_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("agent_no"); 
    	if (_ums_comm.getAgent_no() != null) {
    		writer.value(_ums_comm.getAgent_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("nh_gubun"); 
    	if (_ums_comm.getNh_gubun() != null) {
    		writer.value(_ums_comm.getNh_gubun());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("reserved"); 
    	if (_ums_comm.getReserved() != null) {
    		writer.value(_ums_comm.getReserved());
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
    
    public ums_comm unmarshal(byte[] bytes, int i) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	ums_comm _ums_comm = new ums_comm();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new ums_comm();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_ums_comm = (ums_comm)unmarshal( jr,  _ums_comm);
    
    		jr.endObject();
    		jr.close();
    
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	return _ums_comm;
    }
    	
    public ums_comm unmarshal(byte[] bytes, ums_comm dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	ums_comm _ums_comm = (ums_comm) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new ums_comm();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), "UTF-8"));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_ums_comm = (ums_comm)unmarshal( jr,  _ums_comm);
    
    		jr.endObject();
    		jr.close();
    			
    	}finally{
    		if( jr != null ) jr.close();
    		if( reader != null ) reader.close();
    	}
    	                       
        return _ums_comm;
    }
    
    public ums_comm unmarshal(JsonReader reader, ums_comm dto) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(ums_comm dto, JsonReader reader, String name) throws IOException, MalformedJsonException, IllegalArgumentException, NullPointerException, UnsupportedEncodingException {
    	
    	switch(name) {
    		case "length" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLength( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "job_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setJob_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "snd_media" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSnd_media( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "svc_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSvc_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "trm_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTrm_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sql_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSql_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "err_condition" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setErr_condition( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "snd_key" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSnd_key( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "sync_async" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSync_async( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "async" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAsync( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "async_nm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAsync_nm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "person_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPerson_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "agent_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setAgent_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "nh_gubun" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setNh_gubun( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "reserved" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setReserved( reader.nextString());
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

