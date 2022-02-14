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
	comments = "ncclidataMsgJson"
)
public class ncclidataMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	ncclidata _ncclidata = (ncclidata)obj;
    	
    	if(_ncclidata == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _ncclidata, jw);
    		
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
    
    
    public void marshal(com.nh.dto.common.ncclidata _ncclidata, JsonWriter writer )throws IOException {
    
    	writer.name("io_gse_dti_bsn_dsc"); 
    	if (_ncclidata.getIo_gse_dti_bsn_dsc() != null) {
    		writer.value(_ncclidata.getIo_gse_dti_bsn_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("cfls_tr_dsc"); 
    	if (_ncclidata.getCfls_tr_dsc() != null) {
    		writer.value(_ncclidata.getCfls_tr_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_bsn_dsc"); 
    	if (_ncclidata.getGse_bsn_dsc() != null) {
    		writer.value(_ncclidata.getGse_bsn_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("prc_rqr_cn"); 
    	if (_ncclidata.getPrc_rqr_cn() != null) {
    		writer.value(_ncclidata.getPrc_rqr_cn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("gse_dti_bsn_dsc"); 
    	if (_ncclidata.getGse_dti_bsn_dsc() != null) {
    		writer.value(_ncclidata.getGse_dti_bsn_dsc());
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
    
    public ncclidata unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	ncclidata _ncclidata = new ncclidata();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new ncclidata();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_ncclidata = (ncclidata)unmarshal( jr,  _ncclidata);
    
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
    	return _ncclidata;
    }
    	
    public DataObject unmarshal(byte[] bytes, ncclidata dto) throws UnmarshalException {
    	
    	ncclidata _ncclidata = (ncclidata) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new ncclidata();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_ncclidata = (ncclidata)unmarshal( jr,  _ncclidata);
    
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
    	                       
        return _ncclidata;
    }
    
    public ncclidata unmarshal(JsonReader reader, ncclidata dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(ncclidata dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "io_gse_dti_bsn_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIo_gse_dti_bsn_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "cfls_tr_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCfls_tr_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_bsn_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_bsn_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "prc_rqr_cn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPrc_rqr_cn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "gse_dti_bsn_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setGse_dti_bsn_dsc( reader.nextString());
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

