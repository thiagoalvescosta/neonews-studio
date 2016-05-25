package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_SCHEDULE_PREDICATE_REGION
 * @generated
 */
@Entity
@Table(name = "\"SYS_SCHEDULE_PREDICATE_REGION\""


)
@XmlRootElement
public class SchedulePredicateRegion implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -950928484l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="REG_ID", referencedColumnName = "REG_ID")
	private Region region;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PRE_ID", referencedColumnName = "PRE_ID")
	private SchedulePredicate schedulePredicate;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public SchedulePredicateRegion(){
	}

	
	/**
	 * Obtém region
	 * @param region region
	 * return region
	 * @generated
	 */
	public Region getRegion(){
		return this.region;
	}
	
	/**
	 * Define region
	 * @param region region
	 * @generated
	 */
	public SchedulePredicateRegion setRegion(Region region){
		this.region = region;
		return this;
	}
	
	/**
	 * Obtém schedulePredicate
	 * @param schedulePredicate schedulePredicate
	 * return schedulePredicate
	 * @generated
	 */
	public SchedulePredicate getSchedulePredicate(){
		return this.schedulePredicate;
	}
	
	/**
	 * Define schedulePredicate
	 * @param schedulePredicate schedulePredicate
	 * @generated
	 */
	public SchedulePredicateRegion setSchedulePredicate(SchedulePredicate schedulePredicate){
		this.schedulePredicate = schedulePredicate;
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
	public SchedulePredicateRegion setId(java.lang.String id){
		this.id = id;
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
	    
	    if(!(obj instanceof SchedulePredicateRegion))
	      return false;
	    
	    SchedulePredicateRegion other = (SchedulePredicateRegion)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
