package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_TV_TYPE
 * @generated
 */
@Entity
@Table(name = "\"SYS_TV_TYPE\""


)
@XmlRootElement
public class TvType implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1778518785l;
	
	/**
	 * @generated
	 */
	@Column(name = "tvt_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Column(name = "tvt_format", nullable = false, unique = false)
	private java.lang.String format;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "tvt_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "tvt_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "tvt_res_height", nullable = true, unique = false)
	private java.lang.Integer resHeight;
	
	/**
	 * @generated
	 */
	@Column(name = "tvt_res_width", nullable = true, unique = false)
	private java.lang.Integer resWidth;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="RES_ID", referencedColumnName = "RES_ID")
	private Resolution resolution;
	
	/**
	 * @generated
	 */
	@Column(name = "tvt_size", nullable = true, unique = false)
	private java.lang.Integer size;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public TvType(){
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
	public TvType setDescription(java.lang.String description){
		this.description = description;
		return this;
	}
	
	/**
	 * Obtém format
	 * @param format format
	 * return format
	 * @generated
	 */
	public java.lang.String getFormat(){
		return this.format;
	}
	
	/**
	 * Define format
	 * @param format format
	 * @generated
	 */
	public TvType setFormat(java.lang.String format){
		this.format = format;
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
	public TvType setId(java.lang.String id){
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
	public TvType setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém resHeight
	 * @param resHeight resHeight
	 * return resHeight
	 * @generated
	 */
	public java.lang.Integer getResHeight(){
		return this.resHeight;
	}
	
	/**
	 * Define resHeight
	 * @param resHeight resHeight
	 * @generated
	 */
	public TvType setResHeight(java.lang.Integer resHeight){
		this.resHeight = resHeight;
		return this;
	}
	
	/**
	 * Obtém resWidth
	 * @param resWidth resWidth
	 * return resWidth
	 * @generated
	 */
	public java.lang.Integer getResWidth(){
		return this.resWidth;
	}
	
	/**
	 * Define resWidth
	 * @param resWidth resWidth
	 * @generated
	 */
	public TvType setResWidth(java.lang.Integer resWidth){
		this.resWidth = resWidth;
		return this;
	}
	
	/**
	 * Obtém resolution
	 * @param resolution resolution
	 * return resolution
	 * @generated
	 */
	public Resolution getResolution(){
		return this.resolution;
	}
	
	/**
	 * Define resolution
	 * @param resolution resolution
	 * @generated
	 */
	public TvType setResolution(Resolution resolution){
		this.resolution = resolution;
		return this;
	}
	
	/**
	 * Obtém size
	 * @param size size
	 * return size
	 * @generated
	 */
	public java.lang.Integer getSize(){
		return this.size;
	}
	
	/**
	 * Define size
	 * @param size size
	 * @generated
	 */
	public TvType setSize(java.lang.Integer size){
		this.size = size;
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
	    
	    if(!(obj instanceof TvType))
	      return false;
	    
	    TvType other = (TvType)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
