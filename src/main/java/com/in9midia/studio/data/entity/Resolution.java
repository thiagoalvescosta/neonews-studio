package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_RESOLUTION
 * @generated
 */
@Entity
@Table(name = "\"SYS_RESOLUTION\""


)
@XmlRootElement
public class Resolution implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 393436339l;
	
	/**
	 * @generated
	 */
	@Column(name = "res_height", nullable = true, unique = false)
	private java.lang.Integer height;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "res_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "res_width", nullable = true, unique = false)
	private java.lang.Integer width;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Resolution(){
	}

	
	/**
	 * Obtém height
	 * @param height height
	 * return height
	 * @generated
	 */
	public java.lang.Integer getHeight(){
		return this.height;
	}
	
	/**
	 * Define height
	 * @param height height
	 * @generated
	 */
	public Resolution setHeight(java.lang.Integer height){
		this.height = height;
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
	public Resolution setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém width
	 * @param width width
	 * return width
	 * @generated
	 */
	public java.lang.Integer getWidth(){
		return this.width;
	}
	
	/**
	 * Define width
	 * @param width width
	 * @generated
	 */
	public Resolution setWidth(java.lang.Integer width){
		this.width = width;
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
	    
	    if(!(obj instanceof Resolution))
	      return false;
	    
	    Resolution other = (Resolution)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
