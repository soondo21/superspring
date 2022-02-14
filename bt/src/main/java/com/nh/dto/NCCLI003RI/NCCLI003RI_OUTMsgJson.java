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
	comments = "NCCLI003RI_OUTMsgJson"
)
public class NCCLI003RI_OUTMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	NCCLI003RI_OUT _NCCLI003RI_OUT = (NCCLI003RI_OUT)obj;
    	
    	if(_NCCLI003RI_OUT == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _NCCLI003RI_OUT, jw);
    		
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
    
    
    public void marshal(com.nh.dto.NCCLI003RI.NCCLI003RI_OUT _NCCLI003RI_OUT, JsonWriter writer )throws IOException {
    
    	com.nh.dto.NCCLI003RI.de_johoi_outMsgJson __de_johoi_out = new com.nh.dto.NCCLI003RI.de_johoi_outMsgJson();	
    	writer.name("de_johoi_out");
    	if(_NCCLI003RI_OUT.getDe_johoi_out() != null) {
    	writer.beginObject();
    	__de_johoi_out.marshal((com.nh.dto.NCCLI003RI.de_johoi_out)_NCCLI003RI_OUT.getDe_johoi_out(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.dto.NCCLI003RI.de_johoi_out_sub02MsgJson __de_johoi_out_sub02 = new com.nh.dto.NCCLI003RI.de_johoi_out_sub02MsgJson();	
    	writer.name("de_johoi_out_sub02");
    	if(_NCCLI003RI_OUT.getDe_johoi_out_sub02() != null) {
    	writer.beginObject();
    	__de_johoi_out_sub02.marshal((com.nh.dto.NCCLI003RI.de_johoi_out_sub02)_NCCLI003RI_OUT.getDe_johoi_out_sub02(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_gi_row_cnt"); 
    	if (_NCCLI003RI_OUT.getIo_gi_row_cnt() != null) {
    		writer.value(_NCCLI003RI_OUT.getIo_gi_row_cnt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("io_gi_row_cnt2"); 
    	if (_NCCLI003RI_OUT.getIo_gi_row_cnt2() != null) {
    		writer.value(_NCCLI003RI_OUT.getIo_gi_row_cnt2());
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
    
    public NCCLI003RI_OUT unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	NCCLI003RI_OUT _NCCLI003RI_OUT = new NCCLI003RI_OUT();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new NCCLI003RI_OUT();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_NCCLI003RI_OUT = (NCCLI003RI_OUT)unmarshal( jr,  _NCCLI003RI_OUT);
    
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
    	return _NCCLI003RI_OUT;
    }
    	
    public DataObject unmarshal(byte[] bytes, NCCLI003RI_OUT dto) throws UnmarshalException {
    	
    	NCCLI003RI_OUT _NCCLI003RI_OUT = (NCCLI003RI_OUT) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new NCCLI003RI_OUT();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_NCCLI003RI_OUT = (NCCLI003RI_OUT)unmarshal( jr,  _NCCLI003RI_OUT);
    
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
    	                       
        return _NCCLI003RI_OUT;
    }
    
    public NCCLI003RI_OUT unmarshal(JsonReader reader, NCCLI003RI_OUT dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(NCCLI003RI_OUT dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "de_johoi_out" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.NCCLI003RI.de_johoi_outMsgJson __de_johoi_out = new com.nh.dto.NCCLI003RI.de_johoi_outMsgJson();
    		
    				com.nh.dto.NCCLI003RI.de_johoi_out ___de_johoi_out = new com.nh.dto.NCCLI003RI.de_johoi_out();
    				reader.beginObject();
    				dto.setDe_johoi_out((com.nh.dto.NCCLI003RI.de_johoi_out)__de_johoi_out.unmarshal( reader, ___de_johoi_out ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "de_johoi_out_sub02" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.NCCLI003RI.de_johoi_out_sub02MsgJson __de_johoi_out_sub02 = new com.nh.dto.NCCLI003RI.de_johoi_out_sub02MsgJson();
    		
    				com.nh.dto.NCCLI003RI.de_johoi_out_sub02 ___de_johoi_out_sub02 = new com.nh.dto.NCCLI003RI.de_johoi_out_sub02();
    				reader.beginObject();
    				dto.setDe_johoi_out_sub02((com.nh.dto.NCCLI003RI.de_johoi_out_sub02)__de_johoi_out_sub02.unmarshal( reader, ___de_johoi_out_sub02 ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "io_gi_row_cnt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_gi_row_cnt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "io_gi_row_cnt2" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_gi_row_cnt2( reader.nextString());
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

