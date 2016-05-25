package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela NWS_WRAPPER
 * @generated
 */
@Entity
@Table(name = "\"NWS_WRAPPER\""


)
@XmlRootElement
public class Wrapper implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1034804146l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "wrp_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "wrp_image_expression", nullable = true, unique = false)
	private java.lang.String imageExpression;
	
	/**
	 * @generated
	 */
	@Column(name = "wrp_is_utf8", nullable = true, unique = false)
	private boolean isUtf8;
	
	/**
	 * @generated
	 */
	@Column(name = "wrp_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "wrp_class", nullable = true, unique = false)
	private java.lang.String wrpClass;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Wrapper(){
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
	public Wrapper setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém imageExpression
	 * @param imageExpression imageExpression
	 * return imageExpression
	 * @generated
	 */
	public java.lang.String getImageExpression(){
		return this.imageExpression;
	}
	
	/**
	 * Define imageExpression
	 * @param imageExpression imageExpression
	 * @generated
	 */
	public Wrapper setImageExpression(java.lang.String imageExpression){
		this.imageExpression = imageExpression;
		return this;
	}
	
	/**
	 * Obtém isUtf8
	 * @param isUtf8 isUtf8
	 * return isUtf8
	 * @generated
	 */
	public boolean getIsUtf8(){
		return this.isUtf8;
	}
	
	/**
	 * Define isUtf8
	 * @param isUtf8 isUtf8
	 * @generated
	 */
	public Wrapper setIsUtf8(boolean isUtf8){
		this.isUtf8 = isUtf8;
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
	public Wrapper setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém wrpClass
	 * @param wrpClass wrpClass
	 * return wrpClass
	 * @generated
	 */
	public java.lang.String getWrpClass(){
		return this.wrpClass;
	}
	
	/**
	 * Define wrpClass
	 * @param wrpClass wrpClass
	 * @generated
	 */
	public Wrapper setWrpClass(java.lang.String wrpClass){
		this.wrpClass = wrpClass;
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
	    
	    if(!(obj instanceof Wrapper))
	      return false;
	    
	    Wrapper other = (Wrapper)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
