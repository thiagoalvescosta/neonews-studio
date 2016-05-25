package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_CAMPAIGN_CAMPAIGN_BLOCK
 * @generated
 */
@Entity
@Table(name = "\"SYS_CAMPAIGN_CAMPAIGN_BLOCK\""


)
@XmlRootElement
public class CampaignCampaignBlock implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1494203885l;
	
	/**
	 * @generated
	 */
	@Column(name = "cbl_active", nullable = true, unique = false)
	private boolean active;
	
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
	@JoinColumn(name="BLO_ID", referencedColumnName = "BLO_ID")
	private CampaignBlock campaignBlock;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cbl_creation_time", nullable = true, unique = false)
	private Date creationTime;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "cbl_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "cbl_order", nullable = true, unique = false)
	private java.lang.Integer order;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public CampaignCampaignBlock(){
	}

	
	/**
	 * Obtém active
	 * @param active active
	 * return active
	 * @generated
	 */
	public boolean getActive(){
		return this.active;
	}
	
	/**
	 * Define active
	 * @param active active
	 * @generated
	 */
	public CampaignCampaignBlock setActive(boolean active){
		this.active = active;
		return this;
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
	public CampaignCampaignBlock setCampaign(Campaign campaign){
		this.campaign = campaign;
		return this;
	}
	
	/**
	 * Obtém campaignBlock
	 * @param campaignBlock campaignBlock
	 * return campaignBlock
	 * @generated
	 */
	public CampaignBlock getCampaignBlock(){
		return this.campaignBlock;
	}
	
	/**
	 * Define campaignBlock
	 * @param campaignBlock campaignBlock
	 * @generated
	 */
	public CampaignCampaignBlock setCampaignBlock(CampaignBlock campaignBlock){
		this.campaignBlock = campaignBlock;
		return this;
	}
	
	/**
	 * Obtém creationTime
	 * @param creationTime creationTime
	 * return creationTime
	 * @generated
	 */
	public Date getCreationTime(){
		return this.creationTime;
	}
	
	/**
	 * Define creationTime
	 * @param creationTime creationTime
	 * @generated
	 */
	public CampaignCampaignBlock setCreationTime(Date creationTime){
		this.creationTime = creationTime;
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
	public CampaignCampaignBlock setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém order
	 * @param order order
	 * return order
	 * @generated
	 */
	public java.lang.Integer getOrder(){
		return this.order;
	}
	
	/**
	 * Define order
	 * @param order order
	 * @generated
	 */
	public CampaignCampaignBlock setOrder(java.lang.Integer order){
		this.order = order;
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
	    
	    if(!(obj instanceof CampaignCampaignBlock))
	      return false;
	    
	    CampaignCampaignBlock other = (CampaignCampaignBlock)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
