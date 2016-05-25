package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_RSS
 * @generated
 */
@Entity
@Table(name = "\"SYS_RSS\""


)
@XmlRootElement
public class Rss implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 84481l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "rss_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "rss_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "rss_class", nullable = true, unique = false)
	private java.lang.String rssClass;
	
	/**
	 * @generated
	 */
	@Column(name = "rss_url", nullable = false, unique = false)
	private java.lang.String url;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Rss(){
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
	public Rss setId(java.lang.String id){
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
	public Rss setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém rssClass
	 * @param rssClass rssClass
	 * return rssClass
	 * @generated
	 */
	public java.lang.String getRssClass(){
		return this.rssClass;
	}
	
	/**
	 * Define rssClass
	 * @param rssClass rssClass
	 * @generated
	 */
	public Rss setRssClass(java.lang.String rssClass){
		this.rssClass = rssClass;
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
	public Rss setUrl(java.lang.String url){
		this.url = url;
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
	    
	    if(!(obj instanceof Rss))
	      return false;
	    
	    Rss other = (Rss)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
