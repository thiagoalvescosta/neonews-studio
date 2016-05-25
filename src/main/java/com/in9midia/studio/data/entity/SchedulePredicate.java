package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_SCHEDULE_PREDICATE
 * @generated
 */
@Entity
@Table(name = "\"SYS_SCHEDULE_PREDICATE\""


)
@XmlRootElement
public class SchedulePredicate implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 135035076l;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "pre_date_end", nullable = true, unique = false)
	private Date dateEnd;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "pre_date_start", nullable = true, unique = false)
	private Date dateStart;
	
	/**
	 * @generated
	 */
	@Column(name = "pre_hour_end", nullable = true, unique = false)
	private java.lang.Integer hourEnd;
	
	/**
	 * @generated
	 */
	@Column(name = "pre_hour_interval", nullable = true, unique = false)
	private java.lang.String hourInterval;
	
	/**
	 * @generated
	 */
	@Column(name = "pre_hour_start", nullable = true, unique = false)
	private java.lang.Integer hourStart;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "pre_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "pre_interval_type", nullable = true, unique = false)
	private java.lang.String intervalType;
	
	/**
	 * @generated
	 */
	@Column(name = "pre_name", nullable = true, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SCH_ID", referencedColumnName = "SCH_ID")
	private Schedule schedule;
	
	/**
	 * @generated
	 */
	@Column(name = "pre_type", nullable = true, unique = false)
	private java.lang.String type;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public SchedulePredicate(){
	}

	
	/**
	 * Obtém dateEnd
	 * @param dateEnd dateEnd
	 * return dateEnd
	 * @generated
	 */
	public Date getDateEnd(){
		return this.dateEnd;
	}
	
	/**
	 * Define dateEnd
	 * @param dateEnd dateEnd
	 * @generated
	 */
	public SchedulePredicate setDateEnd(Date dateEnd){
		this.dateEnd = dateEnd;
		return this;
	}
	
	/**
	 * Obtém dateStart
	 * @param dateStart dateStart
	 * return dateStart
	 * @generated
	 */
	public Date getDateStart(){
		return this.dateStart;
	}
	
	/**
	 * Define dateStart
	 * @param dateStart dateStart
	 * @generated
	 */
	public SchedulePredicate setDateStart(Date dateStart){
		this.dateStart = dateStart;
		return this;
	}
	
	/**
	 * Obtém hourEnd
	 * @param hourEnd hourEnd
	 * return hourEnd
	 * @generated
	 */
	public java.lang.Integer getHourEnd(){
		return this.hourEnd;
	}
	
	/**
	 * Define hourEnd
	 * @param hourEnd hourEnd
	 * @generated
	 */
	public SchedulePredicate setHourEnd(java.lang.Integer hourEnd){
		this.hourEnd = hourEnd;
		return this;
	}
	
	/**
	 * Obtém hourInterval
	 * @param hourInterval hourInterval
	 * return hourInterval
	 * @generated
	 */
	public java.lang.String getHourInterval(){
		return this.hourInterval;
	}
	
	/**
	 * Define hourInterval
	 * @param hourInterval hourInterval
	 * @generated
	 */
	public SchedulePredicate setHourInterval(java.lang.String hourInterval){
		this.hourInterval = hourInterval;
		return this;
	}
	
	/**
	 * Obtém hourStart
	 * @param hourStart hourStart
	 * return hourStart
	 * @generated
	 */
	public java.lang.Integer getHourStart(){
		return this.hourStart;
	}
	
	/**
	 * Define hourStart
	 * @param hourStart hourStart
	 * @generated
	 */
	public SchedulePredicate setHourStart(java.lang.Integer hourStart){
		this.hourStart = hourStart;
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
	public SchedulePredicate setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém intervalType
	 * @param intervalType intervalType
	 * return intervalType
	 * @generated
	 */
	public java.lang.String getIntervalType(){
		return this.intervalType;
	}
	
	/**
	 * Define intervalType
	 * @param intervalType intervalType
	 * @generated
	 */
	public SchedulePredicate setIntervalType(java.lang.String intervalType){
		this.intervalType = intervalType;
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
	public SchedulePredicate setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém schedule
	 * @param schedule schedule
	 * return schedule
	 * @generated
	 */
	public Schedule getSchedule(){
		return this.schedule;
	}
	
	/**
	 * Define schedule
	 * @param schedule schedule
	 * @generated
	 */
	public SchedulePredicate setSchedule(Schedule schedule){
		this.schedule = schedule;
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
	public SchedulePredicate setType(java.lang.String type){
		this.type = type;
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
	    
	    if(!(obj instanceof SchedulePredicate))
	      return false;
	    
	    SchedulePredicate other = (SchedulePredicate)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
