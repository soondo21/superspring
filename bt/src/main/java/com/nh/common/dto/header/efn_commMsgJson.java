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
	date= "21. 11. 11. 오후 6:02",
	comments = "efn_commMsgJson"
)
public class efn_commMsgJson extends Message
{
    public byte[] marshal(DataObject obj) throws MarshalException {
    	efn_comm _efn_comm = (efn_comm)obj;
    	
    	if(_efn_comm == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _efn_comm, jw);
    		
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
    
    
    public void marshal(com.nh.common.dto.header.efn_comm _efn_comm, JsonWriter writer )throws IOException {
    
    	writer.name("ebnk_med_dsc"); 
    	if (_efn_comm.getEbnk_med_dsc() != null) {
    		writer.value(_efn_comm.getEbnk_med_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_cusno"); 
    	if (_efn_comm.getE_fnc_cusno() != null) {
    		writer.value(_efn_comm.getE_fnc_cusno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_usr_id"); 
    	if (_efn_comm.getE_fnc_usr_id() != null) {
    		writer.value(_efn_comm.getE_fnc_usr_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_copr_id"); 
    	if (_efn_comm.getE_fnc_copr_id() != null) {
    		writer.value(_efn_comm.getE_fnc_copr_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("copr_ds"); 
    	if (_efn_comm.getCopr_ds() != null) {
    		writer.value(_efn_comm.getCopr_ds());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("tr_ds"); 
    	if (_efn_comm.getTr_ds() != null) {
    		writer.value(_efn_comm.getTr_ds());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("pwize_yn"); 
    	if (_efn_comm.getPwize_yn() != null) {
    		writer.value(_efn_comm.getPwize_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_pwize_rlno"); 
    	if (_efn_comm.getE_fnc_pwize_rlno() != null) {
    		writer.value(_efn_comm.getE_fnc_pwize_rlno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_tr_acno"); 
    	if (_efn_comm.getE_fnc_tr_acno() != null) {
    		writer.value(_efn_comm.getE_fnc_tr_acno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("inq_cnd_val"); 
    	if (_efn_comm.getInq_cnd_val() != null) {
    		writer.value(_efn_comm.getInq_cnd_val());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("inq_cnd_clf_id"); 
    	if (_efn_comm.getInq_cnd_clf_id() != null) {
    		writer.value(_efn_comm.getInq_cnd_clf_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("intf_natv_id"); 
    	if (_efn_comm.getIntf_natv_id() != null) {
    		writer.value(_efn_comm.getIntf_natv_id());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("exe_yn"); 
    	if (_efn_comm.getExe_yn() != null) {
    		writer.value(_efn_comm.getExe_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_usr_inf_cntn"); 
    	if (_efn_comm.getE_fnc_usr_inf_cntn() != null) {
    		writer.value(_efn_comm.getE_fnc_usr_inf_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_usr_telno"); 
    	if (_efn_comm.getE_fnc_usr_telno() != null) {
    		writer.value(_efn_comm.getE_fnc_usr_telno());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("lang_ds"); 
    	if (_efn_comm.getLang_ds() != null) {
    		writer.value(_efn_comm.getLang_ds());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_lgin_ds"); 
    	if (_efn_comm.getE_fnc_lgin_ds() != null) {
    		writer.value(_efn_comm.getE_fnc_lgin_ds());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_usr_ipadr"); 
    	if (_efn_comm.getE_fnc_usr_ipadr() != null) {
    		writer.value(_efn_comm.getE_fnc_usr_ipadr());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_usr_dvic_inf_cntn"); 
    	if (_efn_comm.getE_fnc_usr_dvic_inf_cntn() != null) {
    		writer.value(_efn_comm.getE_fnc_usr_dvic_inf_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_usr_os_dsc"); 
    	if (_efn_comm.getE_fnc_usr_os_dsc() != null) {
    		writer.value(_efn_comm.getE_fnc_usr_os_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_usr_acs_dsc"); 
    	if (_efn_comm.getE_fnc_usr_acs_dsc() != null) {
    		writer.value(_efn_comm.getE_fnc_usr_acs_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_med_svcid"); 
    	if (_efn_comm.getE_fnc_med_svcid() != null) {
    		writer.value(_efn_comm.getE_fnc_med_svcid());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_med_svrnm"); 
    	if (_efn_comm.getE_fnc_med_svrnm() != null) {
    		writer.value(_efn_comm.getE_fnc_med_svrnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_rsp_c"); 
    	if (_efn_comm.getE_fnc_rsp_c() != null) {
    		writer.value(_efn_comm.getE_fnc_rsp_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("brc"); 
    	if (_efn_comm.getBrc() != null) {
    		writer.value(_efn_comm.getBrc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_ap_svrnm"); 
    	if (_efn_comm.getE_fnc_ap_svrnm() != null) {
    		writer.value(_efn_comm.getE_fnc_ap_svrnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bkng_sys_err_c"); 
    	if (_efn_comm.getBkng_sys_err_c() != null) {
    		writer.value(_efn_comm.getBkng_sys_err_c());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bkng_sys_err_svcnm"); 
    	if (_efn_comm.getBkng_sys_err_svcnm() != null) {
    		writer.value(_efn_comm.getBkng_sys_err_svcnm());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("bkng_sys_err_line_no"); 
    	if (_efn_comm.getBkng_sys_err_line_no() != null) {
    		writer.value(_efn_comm.getBkng_sys_err_line_no());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("rept_yn"); 
    	if (_efn_comm.getRept_yn() != null) {
    		writer.value(_efn_comm.getRept_yn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("skip_cn"); 
    	if (_efn_comm.getSkip_cn() != null) {
    		writer.value(_efn_comm.getSkip_cn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("ttcn"); 
    	if (_efn_comm.getTtcn() != null) {
    		writer.value(_efn_comm.getTtcn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("inq_cn"); 
    	if (_efn_comm.getInq_cn() != null) {
    		writer.value(_efn_comm.getInq_cn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("e_fnc_rg_inf_cntn"); 
    	if (_efn_comm.getE_fnc_rg_inf_cntn() != null) {
    		writer.value(_efn_comm.getE_fnc_rg_inf_cntn());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("naac_dsc"); 
    	if (_efn_comm.getNaac_dsc() != null) {
    		writer.value(_efn_comm.getNaac_dsc());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("reserve"); 
    	if (_efn_comm.getReserve() != null) {
    		writer.value(_efn_comm.getReserve());
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
    
    public efn_comm unmarshal(byte[] bytes, int i) throws UnmarshalException {
    	efn_comm _efn_comm = new efn_comm();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if( bytes.length <= 0)
    		return new efn_comm();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_efn_comm = (efn_comm)unmarshal( jr,  _efn_comm);
    
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
    	return _efn_comm;
    }
    	
    public DataObject unmarshal(byte[] bytes, efn_comm dto) throws UnmarshalException {
    	
    	efn_comm _efn_comm = (efn_comm) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if( bytes.length <= 0)
    		return new efn_comm();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_efn_comm = (efn_comm)unmarshal( jr,  _efn_comm);
    
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
    	                       
        return _efn_comm;
    }
    
    public efn_comm unmarshal(JsonReader reader, efn_comm dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(efn_comm dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "ebnk_med_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setEbnk_med_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_cusno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_cusno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_usr_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_usr_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_copr_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_copr_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "copr_ds" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setCopr_ds( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "tr_ds" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTr_ds( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "pwize_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setPwize_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_pwize_rlno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_pwize_rlno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_tr_acno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_tr_acno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "inq_cnd_val" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setInq_cnd_val( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "inq_cnd_clf_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setInq_cnd_clf_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "intf_natv_id" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setIntf_natv_id( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "exe_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setExe_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_usr_inf_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_usr_inf_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_usr_telno" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_usr_telno( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "lang_ds" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setLang_ds( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_lgin_ds" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_lgin_ds( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_usr_ipadr" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_usr_ipadr( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_usr_dvic_inf_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_usr_dvic_inf_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_usr_os_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_usr_os_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_usr_acs_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_usr_acs_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_med_svcid" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_med_svcid( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_med_svrnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_med_svrnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_rsp_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_rsp_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "brc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBrc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_ap_svrnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_ap_svrnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bkng_sys_err_c" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBkng_sys_err_c( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bkng_sys_err_svcnm" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBkng_sys_err_svcnm( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "bkng_sys_err_line_no" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setBkng_sys_err_line_no( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "rept_yn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setRept_yn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "skip_cn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setSkip_cn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "ttcn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setTtcn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "inq_cn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setInq_cn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "e_fnc_rg_inf_cntn" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setE_fnc_rg_inf_cntn( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "naac_dsc" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setNaac_dsc( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "reserve" :
    		{	
    			if(reader.peek() != JsonToken.NULL) {
    				dto.setReserve( reader.nextString());
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

