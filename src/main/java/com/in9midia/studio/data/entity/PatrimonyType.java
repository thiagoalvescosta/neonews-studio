package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_PATRIMONY_TYPE
 * @generated
 */
@Entity
@Table(name = "\"SYS_PATRIMONY_TYPE\""


)
@XmlRootElement
public class PatrimonyType implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1893900150l;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_typ_description", nullable = false, unique = false)
	private java.lang.String typDescription;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "pat_typ_id")
	private java.lang.String typId = UUID.randomUUID().toString().toUpperCase();
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public PatrimonyType(){
	}

	
	/**
	 * Obtém typDescription
	 * @param typDescription typDescription
	 * return typDescription
	 * @generated
	 */
	public java.lang.String getTypDescription(){
		return this.typDescription;
	}
	
	/**
	 * Define typDescription
	 * @param typDescription typDescription
	 * @generated
	 */
	public PatrimonyType setTypDescription(java.lang.String typDescription){
		this.typDescription = typDescription;
		return this;
	}
	
	/**
	 * Obtém typId
	 * @param typId typId
	 * return typId
	 * @generated
	 */
	public java.lang.String getTypId(){
		return this.typId;
	}
	
	/**
	 * Define typId
	 * @param typId typId
	 * @generated
	 */
	public PatrimonyType setTypId(java.lang.String typId){
		this.typId = typId;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((typId == null) ? 0 : typId.hashCode());

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
	    
	    if(!(obj instanceof PatrimonyType))
	      return false;
	    
	    PatrimonyType other = (PatrimonyType)obj;
	    
		if(this.typId == null && other.typId != null)
	    	return false;
	    else if(!this.typId.equals(other.typId))
	     	return false;
	

	    return true;
	    
	}
}
