package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CMS_CHANNEL_TYPE_CUSTOM
 * @generated
 */
@Entity
@Table(name = "\"CMS_CHANNEL_TYPE_CUSTOM\""


)
@XmlRootElement
public class ChannelTypeCustom implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 902540421l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CHT_ID", referencedColumnName = "CHT_ID")
	private ChannelType channelType;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "chtc_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "chtc_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "chtc_order", nullable = true, unique = false)
	private java.lang.Integer order;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ChannelTypeCustom(){
	}

	
	/**
	 * Obtém channelType
	 * @param channelType channelType
	 * return channelType
	 * @generated
	 */
	public ChannelType getChannelType(){
		return this.channelType;
	}
	
	/**
	 * Define channelType
	 * @param channelType channelType
	 * @generated
	 */
	public ChannelTypeCustom setChannelType(ChannelType channelType){
		this.channelType = channelType;
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
	public ChannelTypeCustom setId(java.lang.String id){
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
	public ChannelTypeCustom setName(java.lang.String name){
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
	public ChannelTypeCustom setOrder(java.lang.Integer order){
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
	    
	    if(!(obj instanceof ChannelTypeCustom))
	      return false;
	    
	    ChannelTypeCustom other = (ChannelTypeCustom)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
