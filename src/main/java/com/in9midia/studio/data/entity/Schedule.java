package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_SCHEDULE
 * @generated
 */
@Entity
@Table(name = "\"SYS_SCHEDULE\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Schedule implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -633274756l;
	
	/**
	 * @generated
	 */
	@Column(name = "sch_active", nullable = true, unique = false)
	private boolean active;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "sch_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "pre_interval", nullable = true, unique = false)
	private java.lang.String interval;
	
	/**
	 * @generated
	 */
	@Column(name = "sch_is_common", nullable = true, unique = false)
	private boolean isCommon;
	
	/**
	 * @generated
	 */
	@Column(name = "sch_name", nullable = false, unique = false)
	private java.lang.String name;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Schedule(){
	}

	
	/**
	 * Obtém active
	 * @param active active
	 * return active
	 * @generated
	 */
	public boolean getActive(){
		return this.active;
	}
	
	/**
	 * Define active
	 * @param active active
	 * @generated
	 */
	public Schedule setActive(boolean active){
		this.active = active;
		return this;
	}
	
	/**
	 * Obtém company
	 * @param company company
	 * return company
	 * @generated
	 */
	public Company getCompany(){
		return this.company;
	}
	
	/**
	 * Define company
	 * @param company company
	 * @generated
	 */
	public Schedule setCompany(Company company){
		this.company = company;
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
	public Schedule setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém interval
	 * @param interval interval
	 * return interval
	 * @generated
	 */
	public java.lang.String getInterval(){
		return this.interval;
	}
	
	/**
	 * Define interval
	 * @param interval interval
	 * @generated
	 */
	public Schedule setInterval(java.lang.String interval){
		this.interval = interval;
		return this;
	}
	
	/**
	 * Obtém isCommon
	 * @param isCommon isCommon
	 * return isCommon
	 * @generated
	 */
	public boolean getIsCommon(){
		return this.isCommon;
	}
	
	/**
	 * Define isCommon
	 * @param isCommon isCommon
	 * @generated
	 */
	public Schedule setIsCommon(boolean isCommon){
		this.isCommon = isCommon;
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
	public Schedule setName(java.lang.String name){
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
	    
	    if(!(obj instanceof Schedule))
	      return false;
	    
	    Schedule other = (Schedule)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
