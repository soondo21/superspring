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
	date= "21. 11. 24. 오후 4:30",
	comments = "NCCLI003RI_INMsgJson"
)
public class NCCLI003RI_INMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	NCCLI003RI_IN _NCCLI003RI_IN = (NCCLI003RI_IN)obj;
    	
    	if(_NCCLI003RI_IN == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _NCCLI003RI_IN, jw);
    		
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
    
    
    public void marshal(com.nh.dto.NCCLI003RI.NCCLI003RI_IN _NCCLI003RI_IN, JsonWriter writer )throws IOException {
    
    	com.nh.dto.common.pfmidataMsgJson __pfmidata = new com.nh.dto.common.pfmidataMsgJson();	
    	writer.name("pfmidata");
    	if(_NCCLI003RI_IN.getPfmidata() != null) {
    	writer.beginObject();
    	__pfmidata.marshal((com.nh.dto.common.pfmidata)_NCCLI003RI_IN.getPfmidata(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.dto.common.ncclidataMsgJson __ncclidata = new com.nh.dto.common.ncclidataMsgJson();	
    	writer.name("ncclidata");
    	if(_NCCLI003RI_IN.getNcclidata() != null) {
    	writer.beginObject();
    	__ncclidata.marshal((com.nh.dto.common.ncclidata)_NCCLI003RI_IN.getNcclidata(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.dto.common.svcidataMsgJson __svcidata = new com.nh.dto.common.svcidataMsgJson();	
    	writer.name("svcidata");
    	if(_NCCLI003RI_IN.getSvcidata() != null) {
    	writer.beginObject();
    	__svcidata.marshal((com.nh.dto.common.svcidata)_NCCLI003RI_IN.getSvcidata(), writer);
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
    
    public NCCLI003RI_IN unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	NCCLI003RI_IN _NCCLI003RI_IN = new NCCLI003RI_IN();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new NCCLI003RI_IN();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_NCCLI003RI_IN = (NCCLI003RI_IN)unmarshal( jr,  _NCCLI003RI_IN);
    
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
    	return _NCCLI003RI_IN;
    }
    	
    public DataObject unmarshal(byte[] bytes, NCCLI003RI_IN dto) throws UnmarshalException {
    	
    	NCCLI003RI_IN _NCCLI003RI_IN = (NCCLI003RI_IN) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new NCCLI003RI_IN();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_NCCLI003RI_IN = (NCCLI003RI_IN)unmarshal( jr,  _NCCLI003RI_IN);
    
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
    	                       
        return _NCCLI003RI_IN;
    }
    
    public NCCLI003RI_IN unmarshal(JsonReader reader, NCCLI003RI_IN dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(NCCLI003RI_IN dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "pfmidata" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.common.pfmidataMsgJson __pfmidata = new com.nh.dto.common.pfmidataMsgJson();
    		
    				com.nh.dto.common.pfmidata ___pfmidata = new com.nh.dto.common.pfmidata();
    				reader.beginObject();
    				dto.setPfmidata((com.nh.dto.common.pfmidata)__pfmidata.unmarshal( reader, ___pfmidata ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "ncclidata" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.common.ncclidataMsgJson __ncclidata = new com.nh.dto.common.ncclidataMsgJson();
    		
    				com.nh.dto.common.ncclidata ___ncclidata = new com.nh.dto.common.ncclidata();
    				reader.beginObject();
    				dto.setNcclidata((com.nh.dto.common.ncclidata)__ncclidata.unmarshal( reader, ___ncclidata ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "svcidata" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.common.svcidataMsgJson __svcidata = new com.nh.dto.common.svcidataMsgJson();
    		
    				com.nh.dto.common.svcidata ___svcidata = new com.nh.dto.common.svcidata();
    				reader.beginObject();
    				dto.setSvcidata((com.nh.dto.common.svcidata)__svcidata.unmarshal( reader, ___svcidata ));
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

