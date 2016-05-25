package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_CAMPAIGN_REGION
 * @generated
 */
@Entity
@Table(name = "\"SYS_CAMPAIGN_REGION\""


)
@XmlRootElement
public class CampaignRegion implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1601952800l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAM_ID", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="REG_ID", referencedColumnName = "REG_ID")
	private Region region;
	
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
	public CampaignRegion(){
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
	public CampaignRegion setCampaign(Campaign campaign){
		this.campaign = campaign;
		return this;
	}
	
	/**
	 * Obtém region
	 * @param region region
	 * return region
	 * @generated
	 */
	public Region getRegion(){
		return this.region;
	}
	
	/**
	 * Define region
	 * @param region region
	 * @generated
	 */
	public CampaignRegion setRegion(Region region){
		this.region = region;
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
	public CampaignRegion setId(java.lang.String id){
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
	    
	    if(!(obj instanceof CampaignRegion))
	      return false;
	    
	    CampaignRegion other = (CampaignRegion)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
