package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_PROFILE_TV
 * @generated
 */
@Entity
@Table(name = "\"SYS_PROFILE_TV\""


)
@XmlRootElement
public class ProfileTv implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 998569387l;
	
	/**
	 * @generated
	 */
	@Column(name = "ptv_extend", nullable = true, unique = false)
	private java.lang.Integer extend;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "ptv_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "ptv_image", nullable = true, unique = false)
	private java.lang.String image;
	
	/**
	 * @generated
	 */
	@Column(name = "ptv_name", nullable = true, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "ptv_number", nullable = true, unique = false)
	private java.lang.Integer number;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_id", nullable = true, unique = false)
	private java.lang.String pflId;
	
	/**
	 * @generated
	 */
	@Column(name = "ptv_using", nullable = true, unique = false)
	private boolean using;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ProfileTv(){
	}

	
	/**
	 * Obtém extend
	 * @param extend extend
	 * return extend
	 * @generated
	 */
	public java.lang.Integer getExtend(){
		return this.extend;
	}
	
	/**
	 * Define extend
	 * @param extend extend
	 * @generated
	 */
	public ProfileTv setExtend(java.lang.Integer extend){
		this.extend = extend;
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
	public ProfileTv setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém image
	 * @param image image
	 * return image
	 * @generated
	 */
	public java.lang.String getImage(){
		return this.image;
	}
	
	/**
	 * Define image
	 * @param image image
	 * @generated
	 */
	public ProfileTv setImage(java.lang.String image){
		this.image = image;
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
	public ProfileTv setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém number
	 * @param number number
	 * return number
	 * @generated
	 */
	public java.lang.Integer getNumber(){
		return this.number;
	}
	
	/**
	 * Define number
	 * @param number number
	 * @generated
	 */
	public ProfileTv setNumber(java.lang.Integer number){
		this.number = number;
		return this;
	}
	
	/**
	 * Obtém pflId
	 * @param pflId pflId
	 * return pflId
	 * @generated
	 */
	public java.lang.String getPflId(){
		return this.pflId;
	}
	
	/**
	 * Define pflId
	 * @param pflId pflId
	 * @generated
	 */
	public ProfileTv setPflId(java.lang.String pflId){
		this.pflId = pflId;
		return this;
	}
	
	/**
	 * Obtém using
	 * @param using using
	 * return using
	 * @generated
	 */
	public boolean getUsing(){
		return this.using;
	}
	
	/**
	 * Define using
	 * @param using using
	 * @generated
	 */
	public ProfileTv setUsing(boolean using){
		this.using = using;
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
	    
	    if(!(obj instanceof ProfileTv))
	      return false;
	    
	    ProfileTv other = (ProfileTv)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
