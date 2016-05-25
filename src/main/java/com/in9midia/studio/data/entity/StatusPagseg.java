package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_STATUS_PAGSEG
 * @generated
 */
@Entity
@Table(name = "\"SYS_STATUS_PAGSEG\""


)
@XmlRootElement
public class StatusPagseg implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -2140072348l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "sps_id")
	private java.lang.Integer id;
	
	/**
	 * @generated
	 */
	@Column(name = "sps_type_payment", nullable = false, unique = false)
	private java.lang.String typePayment;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public StatusPagseg(){
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
	public StatusPagseg setId(java.lang.Integer id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém typePayment
	 * @param typePayment typePayment
	 * return typePayment
	 * @generated
	 */
	public java.lang.String getTypePayment(){
		return this.typePayment;
	}
	
	/**
	 * Define typePayment
	 * @param typePayment typePayment
	 * @generated
	 */
	public StatusPagseg setTypePayment(java.lang.String typePayment){
		this.typePayment = typePayment;
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
	    
	    if(!(obj instanceof StatusPagseg))
	      return false;
	    
	    StatusPagseg other = (StatusPagseg)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
