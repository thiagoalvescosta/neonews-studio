package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_SOFTWARE
 * @generated
 */
@Entity
@Table(name = "\"SYS_SOFTWARE\""


)
@XmlRootElement
public class Software implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1383976379l;
	
	/**
	 * @generated
	 */
	@Column(name = "sfw_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "sfw_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "swf_type", nullable = false, unique = false)
	private java.lang.String type;
	
	/**
	 * @generated
	 */
	@Column(name = "sfw_version", nullable = false, unique = false)
	private java.lang.String version;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Software(){
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
	public Software setDescription(java.lang.String description){
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
	public Software setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém type
	 * @param type type
	 * return type
	 * @generated
	 */
	public java.lang.String getType(){
		return this.type;
	}
	
	/**
	 * Define type
	 * @param type type
	 * @generated
	 */
	public Software setType(java.lang.String type){
		this.type = type;
		return this;
	}
	
	/**
	 * Obtém version
	 * @param version version
	 * return version
	 * @generated
	 */
	public java.lang.String getVersion(){
		return this.version;
	}
	
	/**
	 * Define version
	 * @param version version
	 * @generated
	 */
	public Software setVersion(java.lang.String version){
		this.version = version;
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
	    
	    if(!(obj instanceof Software))
	      return false;
	    
	    Software other = (Software)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
