package com.nh.common.dto.header;

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
	date= "22. 2. 28. 오전 8:37",
	comments = "dat_commMsgJson"
)
public class dat_commMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	dat_comm _dat_comm = (dat_comm)obj;
    	
    	if(_dat_comm == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _dat_comm, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.header.dat_comm _dat_comm, JsonWriter writer )throws IOException {
    
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
    
    @Override
    public void marshal(DataObject arg0, Node arg1) throws MarshalException {
    }
    
    public dat_comm unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	dat_comm _dat_comm = new dat_comm();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new dat_comm();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_dat_comm = (dat_comm)unmarshal( jr,  _dat_comm);
    
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
    	return _dat_comm;
    }
    	
    public DataObject unmarshal(byte[] bytes, dat_comm dto) throws UnmarshalException {
    	
    	dat_comm _dat_comm = (dat_comm) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new dat_comm();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_dat_comm = (dat_comm)unmarshal( jr,  _dat_comm);
    
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
    	                       
        return _dat_comm;
    }
    
    public dat_comm unmarshal(JsonReader reader, dat_comm dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(dat_comm dto, JsonReader reader, String name) throws IOException {
    	
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
    
    @Override
    public DataObject unmarshal(Node arg0) throws UnmarshalException {
    		return null;
    }
    
    
    @Override
    public int unmarshal(byte[] arg0, int arg1, DataObject arg2) throws Exception {
    	return 0;
    }
    
}

