package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_CITY
 * @generated
 */
@Entity
@Table(name = "\"SYS_CITY\""


)
@XmlRootElement
public class City implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 2102639l;
	
	/**
	 * @generated
	 */
	@Column(name = "cty_agent", nullable = true, unique = false)
	private java.lang.String agent;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "cty_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "cty_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "cty_rss", nullable = true, unique = false)
	private java.lang.String rss;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="STA_ID", referencedColumnName = "STA_ID")
	private State state;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public City(){
	}

	
	/**
	 * Obtém agent
	 * @param agent agent
	 * return agent
	 * @generated
	 */
	public java.lang.String getAgent(){
		return this.agent;
	}
	
	/**
	 * Define agent
	 * @param agent agent
	 * @generated
	 */
	public City setAgent(java.lang.String agent){
		this.agent = agent;
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
	public City setId(java.lang.String id){
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
	public City setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém rss
	 * @param rss rss
	 * return rss
	 * @generated
	 */
	public java.lang.String getRss(){
		return this.rss;
	}
	
	/**
	 * Define rss
	 * @param rss rss
	 * @generated
	 */
	public City setRss(java.lang.String rss){
		this.rss = rss;
		return this;
	}
	
	/**
	 * Obtém state
	 * @param state state
	 * return state
	 * @generated
	 */
	public State getState(){
		return this.state;
	}
	
	/**
	 * Define state
	 * @param state state
	 * @generated
	 */
	public City setState(State state){
		this.state = state;
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
	    
	    if(!(obj instanceof City))
	      return false;
	    
	    City other = (City)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
