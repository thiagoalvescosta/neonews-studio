package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_CAMPAIGN_TERMINAL
 * @generated
 */
@Entity
@Table(name = "\"SYS_CAMPAIGN_TERMINAL\""


)
@XmlRootElement
public class CampaignTerminal implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1385509794l;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_id", nullable = false, unique = false)
	private java.lang.String camId;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_id", nullable = false, unique = false)
	private java.lang.String trmId;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public CampaignTerminal(){
	}

	
	/**
	 * Obtém camId
	 * @param camId camId
	 * return camId
	 * @generated
	 */
	public java.lang.String getCamId(){
		return this.camId;
	}
	
	/**
	 * Define camId
	 * @param camId camId
	 * @generated
	 */
	public CampaignTerminal setCamId(java.lang.String camId){
		this.camId = camId;
		return this;
	}
	
	/**
	 * Obtém trmId
	 * @param trmId trmId
	 * return trmId
	 * @generated
	 */
	public java.lang.String getTrmId(){
		return this.trmId;
	}
	
	/**
	 * Define trmId
	 * @param trmId trmId
	 * @generated
	 */
	public CampaignTerminal setTrmId(java.lang.String trmId){
		this.trmId = trmId;
		return this;
	}
	
	/**
	 * Obtém id
	 * @param id id
	 * return id
	 * @generated
	 */
	public java.lang.String getId(){
		return this.id;
	}
	
	/**
	 * Define id
	 * @param id id
	 * @generated
	 */
	public CampaignTerminal setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
	
	/**
	 * @generated
	 */	
	@Override
  	public boolean equals(Object obj) {
    
	    if(this == obj)
	      return true;
	    
	    if(obj == null)
	      return false;
	    
	    if(!(obj instanceof CampaignTerminal))
	      return false;
	    
	    CampaignTerminal other = (CampaignTerminal)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
