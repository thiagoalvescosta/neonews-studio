package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_SCHEDULE_TIME
 * @generated
 */
@Entity
@Table(name = "\"SYS_SCHEDULE_TIME\""


)
@XmlRootElement
public class ScheduleTime implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1326486066l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "sct_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PRE_ID", referencedColumnName = "PRE_ID")
	private SchedulePredicate schedulePredicate;
	
	/**
	 * @generated
	 */
	@Column(name = "sct_type", nullable = false, unique = false)
	private java.lang.String type;
	
	/**
	 * @generated
	 */
	@Column(name = "sct_value", nullable = true, unique = false)
	private java.lang.Integer value;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ScheduleTime(){
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
	public ScheduleTime setId(java.lang.String id){
		this.id = id;
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
	public ScheduleTime setSchedulePredicate(SchedulePredicate schedulePredicate){
		this.schedulePredicate = schedulePredicate;
		return this;
	}
	
	/**
	 * Obtém type
	 * @param type type
	 * return type
	 * @generated
	 */
	public java.lang.String getType(){
		return this.type;
	}
	
	/**
	 * Define type
	 * @param type type
	 * @generated
	 */
	public ScheduleTime setType(java.lang.String type){
		this.type = type;
		return this;
	}
	
	/**
	 * Obtém value
	 * @param value value
	 * return value
	 * @generated
	 */
	public java.lang.Integer getValue(){
		return this.value;
	}
	
	/**
	 * Define value
	 * @param value value
	 * @generated
	 */
	public ScheduleTime setValue(java.lang.Integer value){
		this.value = value;
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
	    
	    if(!(obj instanceof ScheduleTime))
	      return false;
	    
	    ScheduleTime other = (ScheduleTime)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
