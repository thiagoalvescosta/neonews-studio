package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_EXTENSION_VIDEO
 * @generated
 */
@Entity
@Table(name = "\"SYS_EXTENSION_VIDEO\""


)
@XmlRootElement
public class ExtensionVideo implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -955667595l;
	
	/**
	 * @generated
	 */
	@Column(name = "ext_extension", nullable = true, unique = false)
	private java.lang.String extension;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "ext_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "ext_value", nullable = true, unique = false)
	private java.lang.Integer value;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ExtensionVideo(){
	}

	
	/**
	 * Obtém extension
	 * @param extension extension
	 * return extension
	 * @generated
	 */
	public java.lang.String getExtension(){
		return this.extension;
	}
	
	/**
	 * Define extension
	 * @param extension extension
	 * @generated
	 */
	public ExtensionVideo setExtension(java.lang.String extension){
		this.extension = extension;
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
	public ExtensionVideo setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém value
	 * @param value value
	 * return value
	 * @generated
	 */
	public java.lang.Integer getValue(){
		return this.value;
	}
	
	/**
	 * Define value
	 * @param value value
	 * @generated
	 */
	public ExtensionVideo setValue(java.lang.Integer value){
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
	    
	    if(!(obj instanceof ExtensionVideo))
	      return false;
	    
	    ExtensionVideo other = (ExtensionVideo)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
