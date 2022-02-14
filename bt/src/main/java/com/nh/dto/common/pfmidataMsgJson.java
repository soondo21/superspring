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
	comments = "pfmidataMsgJson"
)
public class pfmidataMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	pfmidata _pfmidata = (pfmidata)obj;
    	
    	if(_pfmidata == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _pfmidata, jw);
    		
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
    
    
    public void marshal(com.nh.dto.common.pfmidata _pfmidata, JsonWriter writer )throws IOException {
    
    	writer.name("rlno_dsc"); 
    	if (_pfmidata.getRlno_dsc() != null) {
    		writer.value(_pfmidata.getRlno_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("cusno"); 
    	if (_pfmidata.getCusno() != null) {
    		writer.value(_pfmidata.getCusno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rlno"); 
    	if (_pfmidata.getRlno() != null) {
    		writer.value(_pfmidata.getRlno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rckn_dt"); 
    	if (_pfmidata.getRckn_dt() != null) {
    		writer.value(_pfmidata.getRckn_dt());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("otbrc"); 
    	if (_pfmidata.getOtbrc() != null) {
    		writer.value(_pfmidata.getOtbrc());
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
    
    public pfmidata unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	pfmidata _pfmidata = new pfmidata();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new pfmidata();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_pfmidata = (pfmidata)unmarshal( jr,  _pfmidata);
    
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
    	return _pfmidata;
    }
    	
    public DataObject unmarshal(byte[] bytes, pfmidata dto) throws UnmarshalException {
    	
    	pfmidata _pfmidata = (pfmidata) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new pfmidata();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_pfmidata = (pfmidata)unmarshal( jr,  _pfmidata);
    
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
    	                       
        return _pfmidata;
    }
    
    public pfmidata unmarshal(JsonReader reader, pfmidata dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(pfmidata dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "rlno_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRlno_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "cusno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCusno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rlno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRlno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rckn_dt" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRckn_dt( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "otbrc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setOtbrc( reader.nextString());
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

