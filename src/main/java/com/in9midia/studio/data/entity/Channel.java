package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CMS_CHANNEL
 * @generated
 */
@Entity
@Table(name = "\"CMS_CHANNEL\""


)
@XmlRootElement
public class Channel implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1891361584l;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_id", nullable = false, unique = false)
	private java.lang.String cpyId;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "chn_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "chn_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TMP_CON_ID", referencedColumnName = "TMP_CON_ID")
	private Temp temp;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_type", nullable = true, unique = false)
	private java.lang.Integer type;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Channel(){
	}

	
	/**
	 * Obtém cpyId
	 * @param cpyId cpyId
	 * return cpyId
	 * @generated
	 */
	public java.lang.String getCpyId(){
		return this.cpyId;
	}
	
	/**
	 * Define cpyId
	 * @param cpyId cpyId
	 * @generated
	 */
	public Channel setCpyId(java.lang.String cpyId){
		this.cpyId = cpyId;
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
	public Channel setDescription(java.lang.String description){
		this.description = description;
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
	public Channel setId(java.lang.String id){
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
	public Channel setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém temp
	 * @param temp temp
	 * return temp
	 * @generated
	 */
	public Temp getTemp(){
		return this.temp;
	}
	
	/**
	 * Define temp
	 * @param temp temp
	 * @generated
	 */
	public Channel setTemp(Temp temp){
		this.temp = temp;
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
	public Channel setType(java.lang.Integer type){
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
	    
	    if(!(obj instanceof Channel))
	      return false;
	    
	    Channel other = (Channel)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
