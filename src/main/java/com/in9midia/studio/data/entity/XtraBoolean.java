package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_XTRA_BOOLEAN
 * @generated
 */
@Entity
@Table(name = "\"SYS_XTRA_BOOLEAN\""


)
@XmlRootElement
public class XtraBoolean implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1446760645l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "bol_id")
	private java.lang.Integer id;
	
	/**
	 * @generated
	 */
	@Column(name = "bol_name", nullable = true, unique = false)
	private java.lang.String name;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public XtraBoolean(){
	}

	
	/**
	 * Obtém id
	 * @param id id
	 * return id
	 * @generated
	 */
	public java.lang.Integer getId(){
		return this.id;
	}
	
	/**
	 * Define id
	 * @param id id
	 * @generated
	 */
	public XtraBoolean setId(java.lang.Integer id){
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
	public XtraBoolean setName(java.lang.String name){
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
	    
	    if(!(obj instanceof XtraBoolean))
	      return false;
	    
	    XtraBoolean other = (XtraBoolean)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
