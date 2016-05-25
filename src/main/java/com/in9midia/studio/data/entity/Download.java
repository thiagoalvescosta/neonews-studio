package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_DOWNLOAD
 * @generated
 */
@Entity
@Table(name = "\"SYS_DOWNLOAD\""


)
@XmlRootElement
public class Download implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1492464799l;
	
	/**
	 * @generated
	 */
	@Column(name = "dwn_ative", nullable = true, unique = false)
	private boolean ative;
	
	/**
	 * @generated
	 */
	@Column(name = "dwn_clicks", nullable = true, unique = false)
	private java.lang.Integer clicks;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dwn_date", nullable = true, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "dwn_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "dwn_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "dwn_size", nullable = true, unique = false)
	private java.lang.Integer size;
	
	/**
	 * @generated
	 */
	@Column(name = "dwn_url", nullable = false, unique = false)
	private java.lang.String url;
	
	/**
	 * @generated
	 */
	@Column(name = "dwn_version", nullable = false, unique = false)
	private java.lang.String version;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Download(){
	}

	
	/**
	 * Obtém ative
	 * @param ative ative
	 * return ative
	 * @generated
	 */
	public boolean getAtive(){
		return this.ative;
	}
	
	/**
	 * Define ative
	 * @param ative ative
	 * @generated
	 */
	public Download setAtive(boolean ative){
		this.ative = ative;
		return this;
	}
	
	/**
	 * Obtém clicks
	 * @param clicks clicks
	 * return clicks
	 * @generated
	 */
	public java.lang.Integer getClicks(){
		return this.clicks;
	}
	
	/**
	 * Define clicks
	 * @param clicks clicks
	 * @generated
	 */
	public Download setClicks(java.lang.Integer clicks){
		this.clicks = clicks;
		return this;
	}
	
	/**
	 * Obtém date
	 * @param date date
	 * return date
	 * @generated
	 */
	public Date getDate(){
		return this.date;
	}
	
	/**
	 * Define date
	 * @param date date
	 * @generated
	 */
	public Download setDate(Date date){
		this.date = date;
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
	public Download setId(java.lang.String id){
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
	public Download setName(java.lang.String name){
		this.name = name;
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
	public Download setSize(java.lang.Integer size){
		this.size = size;
		return this;
	}
	
	/**
	 * Obtém url
	 * @param url url
	 * return url
	 * @generated
	 */
	public java.lang.String getUrl(){
		return this.url;
	}
	
	/**
	 * Define url
	 * @param url url
	 * @generated
	 */
	public Download setUrl(java.lang.String url){
		this.url = url;
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
	public Download setVersion(java.lang.String version){
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
	    
	    if(!(obj instanceof Download))
	      return false;
	    
	    Download other = (Download)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
