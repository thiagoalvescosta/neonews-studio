package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_STATE
 * @generated
 */
@Entity
@Table(name = "\"SYS_STATE\""


)
@XmlRootElement
public class State implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 80206904l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CNT_ID", referencedColumnName = "CNT_ID")
	private Country country;
	
	/**
	 * @generated
	 */
	@Column(name = "sta_dst", nullable = true, unique = false)
	private boolean dst;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "sta_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "sta_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "sta_uf", nullable = true, unique = false)
	private java.lang.String uf;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public State(){
	}

	
	/**
	 * Obtém country
	 * @param country country
	 * return country
	 * @generated
	 */
	public Country getCountry(){
		return this.country;
	}
	
	/**
	 * Define country
	 * @param country country
	 * @generated
	 */
	public State setCountry(Country country){
		this.country = country;
		return this;
	}
	
	/**
	 * Obtém dst
	 * @param dst dst
	 * return dst
	 * @generated
	 */
	public boolean getDst(){
		return this.dst;
	}
	
	/**
	 * Define dst
	 * @param dst dst
	 * @generated
	 */
	public State setDst(boolean dst){
		this.dst = dst;
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
	public State setId(java.lang.String id){
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
	public State setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém uf
	 * @param uf uf
	 * return uf
	 * @generated
	 */
	public java.lang.String getUf(){
		return this.uf;
	}
	
	/**
	 * Define uf
	 * @param uf uf
	 * @generated
	 */
	public State setUf(java.lang.String uf){
		this.uf = uf;
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
	    
	    if(!(obj instanceof State))
	      return false;
	    
	    State other = (State)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
