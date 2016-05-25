package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_CAMPAIGN_DATE
 * @generated
 */
@Entity
@Table(name = "\"SYS_CAMPAIGN_DATE\""


)
@XmlRootElement
public class CampaignDate implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 336443648l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAM_ID", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "vdt_date", nullable = false, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "vdt_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "vdt_include", nullable = true, unique = false)
	private boolean include;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public CampaignDate(){
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
	public CampaignDate setCampaign(Campaign campaign){
		this.campaign = campaign;
		return this;
	}
	
	/**
	 * Obtém date
	 * @param date date
	 * return date
	 * @generated
	 */
	public Date getDate(){
		return this.date;
	}
	
	/**
	 * Define date
	 * @param date date
	 * @generated
	 */
	public CampaignDate setDate(Date date){
		this.date = date;
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
	public CampaignDate setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém include
	 * @param include include
	 * return include
	 * @generated
	 */
	public boolean getInclude(){
		return this.include;
	}
	
	/**
	 * Define include
	 * @param include include
	 * @generated
	 */
	public CampaignDate setInclude(boolean include){
		this.include = include;
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
	    
	    if(!(obj instanceof CampaignDate))
	      return false;
	    
	    CampaignDate other = (CampaignDate)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
