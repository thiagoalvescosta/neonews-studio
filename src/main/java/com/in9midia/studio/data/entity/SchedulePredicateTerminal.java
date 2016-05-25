package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_SCHEDULE_PREDICATE_TERMINAL
 * @generated
 */
@Entity
@Table(name = "\"SYS_SCHEDULE_PREDICATE_TERMINAL\""


)
@XmlRootElement
public class SchedulePredicateTerminal implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 492941158l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PRE_ID", referencedColumnName = "PRE_ID")
	private SchedulePredicate schedulePredicate;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TRM_ID", referencedColumnName = "TRM_ID")
	private Terminal terminal;
	
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
	public SchedulePredicateTerminal(){
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
	public SchedulePredicateTerminal setSchedulePredicate(SchedulePredicate schedulePredicate){
		this.schedulePredicate = schedulePredicate;
		return this;
	}
	
	/**
	 * Obtém terminal
	 * @param terminal terminal
	 * return terminal
	 * @generated
	 */
	public Terminal getTerminal(){
		return this.terminal;
	}
	
	/**
	 * Define terminal
	 * @param terminal terminal
	 * @generated
	 */
	public SchedulePredicateTerminal setTerminal(Terminal terminal){
		this.terminal = terminal;
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
	public SchedulePredicateTerminal setId(java.lang.String id){
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
	    
	    if(!(obj instanceof SchedulePredicateTerminal))
	      return false;
	    
	    SchedulePredicateTerminal other = (SchedulePredicateTerminal)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
