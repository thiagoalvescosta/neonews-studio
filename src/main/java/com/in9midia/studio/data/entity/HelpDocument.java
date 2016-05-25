package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_HELP_DOCUMENT
 * @generated
 */
@Entity
@Table(name = "\"SYS_HELP_DOCUMENT\""


)
@XmlRootElement
public class HelpDocument implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 206868370l;
	
	/**
	 * @generated
	 */
	@Column(name = "hld_directory", nullable = false, unique = false)
	private java.lang.String directory;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "hld_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "hld_name", nullable = false, unique = false)
	private java.lang.String name;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public HelpDocument(){
	}

	
	/**
	 * Obtém directory
	 * @param directory directory
	 * return directory
	 * @generated
	 */
	public java.lang.String getDirectory(){
		return this.directory;
	}
	
	/**
	 * Define directory
	 * @param directory directory
	 * @generated
	 */
	public HelpDocument setDirectory(java.lang.String directory){
		this.directory = directory;
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
	public HelpDocument setId(java.lang.String id){
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
	public HelpDocument setName(java.lang.String name){
		this.name = name;
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
	    
	    if(!(obj instanceof HelpDocument))
	      return false;
	    
	    HelpDocument other = (HelpDocument)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
