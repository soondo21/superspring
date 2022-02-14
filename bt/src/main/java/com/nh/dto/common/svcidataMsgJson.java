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
	comments = "svcidataMsgJson"
)
public class svcidataMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	svcidata _svcidata = (svcidata)obj;
    	
    	if(_svcidata == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _svcidata, jw);
    		
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
    
    
    public void marshal(com.nh.dto.common.svcidata _svcidata, JsonWriter writer )throws IOException {
    
    	writer.name("rlno"); 
    	if (_svcidata.getRlno() != null) {
    		writer.value(_svcidata.getRlno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("iccd_lmt_sbt_call_yn"); 
    	if (_svcidata.getIccd_lmt_sbt_call_yn() != null) {
    		writer.value(_svcidata.getIccd_lmt_sbt_call_yn());
    	} else {
    		writer.nullValue();
    	}
    	com.nh.dto.common.de_johoi_commonMsgJson __de_johoi_common = new com.nh.dto.common.de_johoi_commonMsgJson();	
    	writer.name("de_johoi_common");
    	if(_svcidata.getDe_johoi_common() != null) {
    	writer.beginObject();
    	__de_johoi_common.marshal((com.nh.dto.common.de_johoi_common)_svcidata.getDe_johoi_common(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.dto.common.de_johoi_inMsgJson __de_johoi_in = new com.nh.dto.common.de_johoi_inMsgJson();	
    	writer.name("de_johoi_in");
    	if(_svcidata.getDe_johoi_in() != null) {
    	writer.beginObject();
    	__de_johoi_in.marshal((com.nh.dto.common.de_johoi_in)_svcidata.getDe_johoi_in(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.dto.common.iccm_commonMsgJson __iccm_common = new com.nh.dto.common.iccm_commonMsgJson();	
    	writer.name("iccm_common");
    	if(_svcidata.getIccm_common() != null) {
    	writer.beginObject();
    	__iccm_common.marshal((com.nh.dto.common.iccm_common)_svcidata.getIccm_common(), writer);
    	writer.endObject();
    	} else {
    		writer.nullValue();
    	}
    	com.nh.dto.common.iccm_johoi_inMsgJson __iccm_johoi_in = new com.nh.dto.common.iccm_johoi_inMsgJson();	
    	writer.name("iccm_johoi_in");
    	if(_svcidata.getIccm_johoi_in() != null) {
    	writer.beginObject();
    	__iccm_johoi_in.marshal((com.nh.dto.common.iccm_johoi_in)_svcidata.getIccm_johoi_in(), writer);
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
    
    public svcidata unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	svcidata _svcidata = new svcidata();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new svcidata();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_svcidata = (svcidata)unmarshal( jr,  _svcidata);
    
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
    	return _svcidata;
    }
    	
    public DataObject unmarshal(byte[] bytes, svcidata dto) throws UnmarshalException {
    	
    	svcidata _svcidata = (svcidata) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new svcidata();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_svcidata = (svcidata)unmarshal( jr,  _svcidata);
    
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
    	                       
        return _svcidata;
    }
    
    public svcidata unmarshal(JsonReader reader, svcidata dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(svcidata dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "rlno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRlno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "iccd_lmt_sbt_call_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIccd_lmt_sbt_call_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "de_johoi_common" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.common.de_johoi_commonMsgJson __de_johoi_common = new com.nh.dto.common.de_johoi_commonMsgJson();
    		
    				com.nh.dto.common.de_johoi_common ___de_johoi_common = new com.nh.dto.common.de_johoi_common();
    				reader.beginObject();
    				dto.setDe_johoi_common((com.nh.dto.common.de_johoi_common)__de_johoi_common.unmarshal( reader, ___de_johoi_common ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "de_johoi_in" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.common.de_johoi_inMsgJson __de_johoi_in = new com.nh.dto.common.de_johoi_inMsgJson();
    		
    				com.nh.dto.common.de_johoi_in ___de_johoi_in = new com.nh.dto.common.de_johoi_in();
    				reader.beginObject();
    				dto.setDe_johoi_in((com.nh.dto.common.de_johoi_in)__de_johoi_in.unmarshal( reader, ___de_johoi_in ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "iccm_common" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.common.iccm_commonMsgJson __iccm_common = new com.nh.dto.common.iccm_commonMsgJson();
    		
    				com.nh.dto.common.iccm_common ___iccm_common = new com.nh.dto.common.iccm_common();
    				reader.beginObject();
    				dto.setIccm_common((com.nh.dto.common.iccm_common)__iccm_common.unmarshal( reader, ___iccm_common ));
    				reader.endObject();
    			}
    			break;
    		}
    		case "iccm_johoi_in" :
    		{	
    			if(reader.peek() == JsonToken.NULL) {
    				reader.nextNull();
    			} else {
    				com.nh.dto.common.iccm_johoi_inMsgJson __iccm_johoi_in = new com.nh.dto.common.iccm_johoi_inMsgJson();
    		
    				com.nh.dto.common.iccm_johoi_in ___iccm_johoi_in = new com.nh.dto.common.iccm_johoi_in();
    				reader.beginObject();
    				dto.setIccm_johoi_in((com.nh.dto.common.iccm_johoi_in)__iccm_johoi_in.unmarshal( reader, ___iccm_johoi_in ));
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

