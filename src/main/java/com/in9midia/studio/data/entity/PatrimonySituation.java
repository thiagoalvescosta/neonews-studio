package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_PATRIMONY_SITUATION
 * @generated
 */
@Entity
@Table(name = "\"SYS_PATRIMONY_SITUATION\""


)
@XmlRootElement
public class PatrimonySituation implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1550346795l;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_sit_description", nullable = false, unique = false)
	private java.lang.String sitDescription;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "pat_sit_id")
	private java.lang.String sitId = UUID.randomUUID().toString().toUpperCase();
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public PatrimonySituation(){
	}

	
	/**
	 * Obtém sitDescription
	 * @param sitDescription sitDescription
	 * return sitDescription
	 * @generated
	 */
	public java.lang.String getSitDescription(){
		return this.sitDescription;
	}
	
	/**
	 * Define sitDescription
	 * @param sitDescription sitDescription
	 * @generated
	 */
	public PatrimonySituation setSitDescription(java.lang.String sitDescription){
		this.sitDescription = sitDescription;
		return this;
	}
	
	/**
	 * Obtém sitId
	 * @param sitId sitId
	 * return sitId
	 * @generated
	 */
	public java.lang.String getSitId(){
		return this.sitId;
	}
	
	/**
	 * Define sitId
	 * @param sitId sitId
	 * @generated
	 */
	public PatrimonySituation setSitId(java.lang.String sitId){
		this.sitId = sitId;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((sitId == null) ? 0 : sitId.hashCode());

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
	    
	    if(!(obj instanceof PatrimonySituation))
	      return false;
	    
	    PatrimonySituation other = (PatrimonySituation)obj;
	    
		if(this.sitId == null && other.sitId != null)
	    	return false;
	    else if(!this.sitId.equals(other.sitId))
	     	return false;
	

	    return true;
	    
	}
}
