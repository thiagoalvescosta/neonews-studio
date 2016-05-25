package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_SGA_PURCHASED
 * @generated
 */
@Entity
@Table(name = "\"SYS_SGA_PURCHASED\""


)
@XmlRootElement
public class SgaPurchased implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 52046224l;
	
	/**
	 * @generated
	 */
	@Column(name = "sgp_generated_key", nullable = true, unique = false)
	private java.lang.String generatedKey;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sga_generation", nullable = true, unique = false)
	private Date generation;
	
	/**
	 * @generated
	 */
	@Column(name = "sgp_generation_type", nullable = true, unique = false)
	private java.lang.String generationType;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "sgp_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SGA_ID", referencedColumnName = "SGA_ID")
	private Sga sga;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public SgaPurchased(){
	}

	
	/**
	 * Obtém generatedKey
	 * @param generatedKey generatedKey
	 * return generatedKey
	 * @generated
	 */
	public java.lang.String getGeneratedKey(){
		return this.generatedKey;
	}
	
	/**
	 * Define generatedKey
	 * @param generatedKey generatedKey
	 * @generated
	 */
	public SgaPurchased setGeneratedKey(java.lang.String generatedKey){
		this.generatedKey = generatedKey;
		return this;
	}
	
	/**
	 * Obtém generation
	 * @param generation generation
	 * return generation
	 * @generated
	 */
	public Date getGeneration(){
		return this.generation;
	}
	
	/**
	 * Define generation
	 * @param generation generation
	 * @generated
	 */
	public SgaPurchased setGeneration(Date generation){
		this.generation = generation;
		return this;
	}
	
	/**
	 * Obtém generationType
	 * @param generationType generationType
	 * return generationType
	 * @generated
	 */
	public java.lang.String getGenerationType(){
		return this.generationType;
	}
	
	/**
	 * Define generationType
	 * @param generationType generationType
	 * @generated
	 */
	public SgaPurchased setGenerationType(java.lang.String generationType){
		this.generationType = generationType;
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
	public SgaPurchased setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém sga
	 * @param sga sga
	 * return sga
	 * @generated
	 */
	public Sga getSga(){
		return this.sga;
	}
	
	/**
	 * Define sga
	 * @param sga sga
	 * @generated
	 */
	public SgaPurchased setSga(Sga sga){
		this.sga = sga;
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
	    
	    if(!(obj instanceof SgaPurchased))
	      return false;
	    
	    SgaPurchased other = (SgaPurchased)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
