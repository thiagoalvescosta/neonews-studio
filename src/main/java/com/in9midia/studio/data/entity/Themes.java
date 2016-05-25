package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_THEMES
 * @generated
 */
@Entity
@Table(name = "\"SYS_THEMES\""


)
@XmlRootElement
public class Themes implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1790953487l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "thm_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "thm_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "thm_source", nullable = false, unique = false)
	private java.lang.String source;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Themes(){
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
	public Themes setId(java.lang.String id){
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
	public Themes setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém source
	 * @param source source
	 * return source
	 * @generated
	 */
	public java.lang.String getSource(){
		return this.source;
	}
	
	/**
	 * Define source
	 * @param source source
	 * @generated
	 */
	public Themes setSource(java.lang.String source){
		this.source = source;
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
	    
	    if(!(obj instanceof Themes))
	      return false;
	    
	    Themes other = (Themes)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
