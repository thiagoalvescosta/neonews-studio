package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_SGA
 * @generated
 */
@Entity
@Table(name = "\"SYS_SGA\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Sga implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 85090l;
	
	/**
	 * @generated
	 */
	@Column(name = "sga_activation_key", nullable = true, unique = false)
	private java.lang.String activationKey;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Column(name = "sga_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Column(name = "sga_enabled", nullable = true, unique = false)
	private boolean enabled;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sga_expiration", nullable = true, unique = false)
	private Date expiration;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "sga_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "sga_light", nullable = true, unique = false)
	private boolean light;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sga_purchase", nullable = true, unique = false)
	private Date purchase;
	
	/**
	 * @generated
	 */
	@Column(name = "sga_server_id", nullable = true, unique = false)
	private java.lang.String serverId;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Sga(){
	}

	
	/**
	 * Obtém activationKey
	 * @param activationKey activationKey
	 * return activationKey
	 * @generated
	 */
	public java.lang.String getActivationKey(){
		return this.activationKey;
	}
	
	/**
	 * Define activationKey
	 * @param activationKey activationKey
	 * @generated
	 */
	public Sga setActivationKey(java.lang.String activationKey){
		this.activationKey = activationKey;
		return this;
	}
	
	/**
	 * Obtém company
	 * @param company company
	 * return company
	 * @generated
	 */
	public Company getCompany(){
		return this.company;
	}
	
	/**
	 * Define company
	 * @param company company
	 * @generated
	 */
	public Sga setCompany(Company company){
		this.company = company;
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
	public Sga setDescription(java.lang.String description){
		this.description = description;
		return this;
	}
	
	/**
	 * Obtém enabled
	 * @param enabled enabled
	 * return enabled
	 * @generated
	 */
	public boolean getEnabled(){
		return this.enabled;
	}
	
	/**
	 * Define enabled
	 * @param enabled enabled
	 * @generated
	 */
	public Sga setEnabled(boolean enabled){
		this.enabled = enabled;
		return this;
	}
	
	/**
	 * Obtém expiration
	 * @param expiration expiration
	 * return expiration
	 * @generated
	 */
	public Date getExpiration(){
		return this.expiration;
	}
	
	/**
	 * Define expiration
	 * @param expiration expiration
	 * @generated
	 */
	public Sga setExpiration(Date expiration){
		this.expiration = expiration;
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
	public Sga setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém light
	 * @param light light
	 * return light
	 * @generated
	 */
	public boolean getLight(){
		return this.light;
	}
	
	/**
	 * Define light
	 * @param light light
	 * @generated
	 */
	public Sga setLight(boolean light){
		this.light = light;
		return this;
	}
	
	/**
	 * Obtém purchase
	 * @param purchase purchase
	 * return purchase
	 * @generated
	 */
	public Date getPurchase(){
		return this.purchase;
	}
	
	/**
	 * Define purchase
	 * @param purchase purchase
	 * @generated
	 */
	public Sga setPurchase(Date purchase){
		this.purchase = purchase;
		return this;
	}
	
	/**
	 * Obtém serverId
	 * @param serverId serverId
	 * return serverId
	 * @generated
	 */
	public java.lang.String getServerId(){
		return this.serverId;
	}
	
	/**
	 * Define serverId
	 * @param serverId serverId
	 * @generated
	 */
	public Sga setServerId(java.lang.String serverId){
		this.serverId = serverId;
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
	    
	    if(!(obj instanceof Sga))
	      return false;
	    
	    Sga other = (Sga)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
