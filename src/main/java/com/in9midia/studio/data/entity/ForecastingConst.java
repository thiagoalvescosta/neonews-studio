package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_FORECASTING_CONST
 * @generated
 */
@Entity
@Table(name = "\"SYS_FORECASTING_CONST\""


)
@XmlRootElement
public class ForecastingConst implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1396295797l;
	
	/**
	 * @generated
	 */
	@Column(name = "for_const", nullable = false, unique = false)
	private java.lang.String forConst;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "for_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "for_name", nullable = false, unique = false)
	private java.lang.String name;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ForecastingConst(){
	}

	
	/**
	 * Obtém forConst
	 * @param forConst forConst
	 * return forConst
	 * @generated
	 */
	public java.lang.String getForConst(){
		return this.forConst;
	}
	
	/**
	 * Define forConst
	 * @param forConst forConst
	 * @generated
	 */
	public ForecastingConst setForConst(java.lang.String forConst){
		this.forConst = forConst;
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
	public ForecastingConst setId(java.lang.String id){
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
	public ForecastingConst setName(java.lang.String name){
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
	    
	    if(!(obj instanceof ForecastingConst))
	      return false;
	    
	    ForecastingConst other = (ForecastingConst)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
