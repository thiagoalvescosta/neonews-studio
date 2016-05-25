package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela CMS_CHANNEL_TYPE
 * @generated
 */
@Entity
@Table(name = "\"CMS_CHANNEL_TYPE\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class ChannelType implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1942025876l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "cht_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "cht_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_type", nullable = true, unique = false)
	private java.lang.Integer type;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ChannelType(){
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
	public ChannelType setCompany(Company company){
		this.company = company;
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
	public ChannelType setId(java.lang.String id){
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
	public ChannelType setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém type
	 * @param type type
	 * return type
	 * @generated
	 */
	public java.lang.Integer getType(){
		return this.type;
	}
	
	/**
	 * Define type
	 * @param type type
	 * @generated
	 */
	public ChannelType setType(java.lang.Integer type){
		this.type = type;
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
	    
	    if(!(obj instanceof ChannelType))
	      return false;
	    
	    ChannelType other = (ChannelType)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
