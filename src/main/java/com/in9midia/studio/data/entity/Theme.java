package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_THEME
 * @generated
 */
@Entity
@Table(name = "\"SYS_THEME\""


)
@XmlRootElement
public class Theme implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 80776607l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "thm_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="MOD_ID", referencedColumnName = "MOD_ID")
	private Module module;
	
	/**
	 * @generated
	 */
	@Column(name = "thm_name", nullable = false, unique = false)
	private java.lang.String name;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Theme(){
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
	public Theme setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém module
	 * @param module module
	 * return module
	 * @generated
	 */
	public Module getModule(){
		return this.module;
	}
	
	/**
	 * Define module
	 * @param module module
	 * @generated
	 */
	public Theme setModule(Module module){
		this.module = module;
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
	public Theme setName(java.lang.String name){
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
	    
	    if(!(obj instanceof Theme))
	      return false;
	    
	    Theme other = (Theme)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
