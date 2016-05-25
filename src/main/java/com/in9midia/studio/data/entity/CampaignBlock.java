package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_CAMPAIGN_BLOCK
 * @generated
 */
@Entity
@Table(name = "\"SYS_CAMPAIGN_BLOCK\""


)
@XmlRootElement
public class CampaignBlock implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1838232888l;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_active", nullable = true, unique = false)
	private boolean active;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_content_type", nullable = false, unique = false)
	private java.lang.String contentType;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_fixed_timeout", nullable = true, unique = false)
	private java.lang.Integer fixedTimeout;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "blo_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "blo_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_order", nullable = true, unique = false)
	private java.lang.Integer order;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_priority", nullable = true, unique = false)
	private java.lang.Integer priority;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PFL_ID", referencedColumnName = "PFL_ID")
	private Profile profile;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PTV_ID", referencedColumnName = "PTV_ID")
	private ProfileTv profileTv;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_rotation", nullable = true, unique = false)
	private java.lang.Integer rotation;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SCH_ID", referencedColumnName = "SCH_ID")
	private Schedule schedule;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_show_if_prepared", nullable = true, unique = false)
	private boolean showIfPrepared;
	
	/**
	 * @generated
	 */
	@Column(name = "blo_size", nullable = true, unique = false)
	private java.lang.Integer size;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public CampaignBlock(){
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
	public CampaignBlock setActive(boolean active){
		this.active = active;
		return this;
	}
	
	/**
	 * Obtém contentType
	 * @param contentType contentType
	 * return contentType
	 * @generated
	 */
	public java.lang.String getContentType(){
		return this.contentType;
	}
	
	/**
	 * Define contentType
	 * @param contentType contentType
	 * @generated
	 */
	public CampaignBlock setContentType(java.lang.String contentType){
		this.contentType = contentType;
		return this;
	}
	
	/**
	 * Obtém description
	 * @param description description
	 * return description
	 * @generated
	 */
	public java.lang.String getDescription(){
		return this.description;
	}
	
	/**
	 * Define description
	 * @param description description
	 * @generated
	 */
	public CampaignBlock setDescription(java.lang.String description){
		this.description = description;
		return this;
	}
	
	/**
	 * Obtém fixedTimeout
	 * @param fixedTimeout fixedTimeout
	 * return fixedTimeout
	 * @generated
	 */
	public java.lang.Integer getFixedTimeout(){
		return this.fixedTimeout;
	}
	
	/**
	 * Define fixedTimeout
	 * @param fixedTimeout fixedTimeout
	 * @generated
	 */
	public CampaignBlock setFixedTimeout(java.lang.Integer fixedTimeout){
		this.fixedTimeout = fixedTimeout;
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
	public CampaignBlock setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém name
	 * @param name name
	 * return name
	 * @generated
	 */
	public java.lang.String getName(){
		return this.name;
	}
	
	/**
	 * Define name
	 * @param name name
	 * @generated
	 */
	public CampaignBlock setName(java.lang.String name){
		this.name = name;
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
	public CampaignBlock setOrder(java.lang.Integer order){
		this.order = order;
		return this;
	}
	
	/**
	 * Obtém priority
	 * @param priority priority
	 * return priority
	 * @generated
	 */
	public java.lang.Integer getPriority(){
		return this.priority;
	}
	
	/**
	 * Define priority
	 * @param priority priority
	 * @generated
	 */
	public CampaignBlock setPriority(java.lang.Integer priority){
		this.priority = priority;
		return this;
	}
	
	/**
	 * Obtém profile
	 * @param profile profile
	 * return profile
	 * @generated
	 */
	public Profile getProfile(){
		return this.profile;
	}
	
	/**
	 * Define profile
	 * @param profile profile
	 * @generated
	 */
	public CampaignBlock setProfile(Profile profile){
		this.profile = profile;
		return this;
	}
	
	/**
	 * Obtém profileTv
	 * @param profileTv profileTv
	 * return profileTv
	 * @generated
	 */
	public ProfileTv getProfileTv(){
		return this.profileTv;
	}
	
	/**
	 * Define profileTv
	 * @param profileTv profileTv
	 * @generated
	 */
	public CampaignBlock setProfileTv(ProfileTv profileTv){
		this.profileTv = profileTv;
		return this;
	}
	
	/**
	 * Obtém rotation
	 * @param rotation rotation
	 * return rotation
	 * @generated
	 */
	public java.lang.Integer getRotation(){
		return this.rotation;
	}
	
	/**
	 * Define rotation
	 * @param rotation rotation
	 * @generated
	 */
	public CampaignBlock setRotation(java.lang.Integer rotation){
		this.rotation = rotation;
		return this;
	}
	
	/**
	 * Obtém schedule
	 * @param schedule schedule
	 * return schedule
	 * @generated
	 */
	public Schedule getSchedule(){
		return this.schedule;
	}
	
	/**
	 * Define schedule
	 * @param schedule schedule
	 * @generated
	 */
	public CampaignBlock setSchedule(Schedule schedule){
		this.schedule = schedule;
		return this;
	}
	
	/**
	 * Obtém showIfPrepared
	 * @param showIfPrepared showIfPrepared
	 * return showIfPrepared
	 * @generated
	 */
	public boolean getShowIfPrepared(){
		return this.showIfPrepared;
	}
	
	/**
	 * Define showIfPrepared
	 * @param showIfPrepared showIfPrepared
	 * @generated
	 */
	public CampaignBlock setShowIfPrepared(boolean showIfPrepared){
		this.showIfPrepared = showIfPrepared;
		return this;
	}
	
	/**
	 * Obtém size
	 * @param size size
	 * return size
	 * @generated
	 */
	public java.lang.Integer getSize(){
		return this.size;
	}
	
	/**
	 * Define size
	 * @param size size
	 * @generated
	 */
	public CampaignBlock setSize(java.lang.Integer size){
		this.size = size;
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
	    
	    if(!(obj instanceof CampaignBlock))
	      return false;
	    
	    CampaignBlock other = (CampaignBlock)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
