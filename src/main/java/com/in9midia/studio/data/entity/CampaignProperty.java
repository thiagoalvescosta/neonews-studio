package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_CAMPAIGN_PROPERTY
 * @generated
 */
@Entity
@Table(name = "\"SYS_CAMPAIGN_PROPERTY\""


)
@XmlRootElement
public class CampaignProperty implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1573617381l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAM_ID", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_hash", nullable = true, unique = false)
	private java.lang.String hash;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "cpr_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PRO_ID", referencedColumnName = "PRO_ID")
	private ModuleProperty moduleProperty;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="RES_ID", referencedColumnName = "RES_ID")
	private Resolution resolution;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_value", nullable = true, unique = false)
	private java.lang.String value;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public CampaignProperty(){
	}

	
	/**
	 * Obtém campaign
	 * @param campaign campaign
	 * return campaign
	 * @generated
	 */
	public Campaign getCampaign(){
		return this.campaign;
	}
	
	/**
	 * Define campaign
	 * @param campaign campaign
	 * @generated
	 */
	public CampaignProperty setCampaign(Campaign campaign){
		this.campaign = campaign;
		return this;
	}
	
	/**
	 * Obtém hash
	 * @param hash hash
	 * return hash
	 * @generated
	 */
	public java.lang.String getHash(){
		return this.hash;
	}
	
	/**
	 * Define hash
	 * @param hash hash
	 * @generated
	 */
	public CampaignProperty setHash(java.lang.String hash){
		this.hash = hash;
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
	public CampaignProperty setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém moduleProperty
	 * @param moduleProperty moduleProperty
	 * return moduleProperty
	 * @generated
	 */
	public ModuleProperty getModuleProperty(){
		return this.moduleProperty;
	}
	
	/**
	 * Define moduleProperty
	 * @param moduleProperty moduleProperty
	 * @generated
	 */
	public CampaignProperty setModuleProperty(ModuleProperty moduleProperty){
		this.moduleProperty = moduleProperty;
		return this;
	}
	
	/**
	 * Obtém resolution
	 * @param resolution resolution
	 * return resolution
	 * @generated
	 */
	public Resolution getResolution(){
		return this.resolution;
	}
	
	/**
	 * Define resolution
	 * @param resolution resolution
	 * @generated
	 */
	public CampaignProperty setResolution(Resolution resolution){
		this.resolution = resolution;
		return this;
	}
	
	/**
	 * Obtém value
	 * @param value value
	 * return value
	 * @generated
	 */
	public java.lang.String getValue(){
		return this.value;
	}
	
	/**
	 * Define value
	 * @param value value
	 * @generated
	 */
	public CampaignProperty setValue(java.lang.String value){
		this.value = value;
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
	    
	    if(!(obj instanceof CampaignProperty))
	      return false;
	    
	    CampaignProperty other = (CampaignProperty)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
