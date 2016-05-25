package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_LOG
 * @generated
 */
@Entity
@Table(name = "\"SYS_LOG\""


)
@XmlRootElement
public class Log implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 78619l;
	
	/**
	 * @generated
	 */
	@Column(name = "log_audience", nullable = true, unique = false)
	private java.lang.Integer audience;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAM_ID", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "log_date", nullable = false, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "log_date_create", nullable = true, unique = false)
	private Date dateCreate;
	
	/**
	 * @generated
	 */
	@Column(name = "log_exhibitions", nullable = true, unique = false)
	private java.lang.Integer exhibitions;
	
	/**
	 * @generated
	 */
	@Column(name = "log_hour", nullable = true, unique = false)
	private java.lang.String hour;
	
	/**
	 * @generated
	 */
	@Column(name = "log_monitor", nullable = false, unique = false)
	private java.lang.Integer monitor;
	
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
	public Log(){
	}

	
	/**
	 * Obtém audience
	 * @param audience audience
	 * return audience
	 * @generated
	 */
	public java.lang.Integer getAudience(){
		return this.audience;
	}
	
	/**
	 * Define audience
	 * @param audience audience
	 * @generated
	 */
	public Log setAudience(java.lang.Integer audience){
		this.audience = audience;
		return this;
	}
	
	/**
	 * Obtém campaign
	 * @param campaign campaign
	 * return campaign
	 * @generated
	 */
	public Campaign getCampaign(){
		return this.campaign;
	}
	
	/**
	 * Define campaign
	 * @param campaign campaign
	 * @generated
	 */
	public Log setCampaign(Campaign campaign){
		this.campaign = campaign;
		return this;
	}
	
	/**
	 * Obtém date
	 * @param date date
	 * return date
	 * @generated
	 */
	public Date getDate(){
		return this.date;
	}
	
	/**
	 * Define date
	 * @param date date
	 * @generated
	 */
	public Log setDate(Date date){
		this.date = date;
		return this;
	}
	
	/**
	 * Obtém dateCreate
	 * @param dateCreate dateCreate
	 * return dateCreate
	 * @generated
	 */
	public Date getDateCreate(){
		return this.dateCreate;
	}
	
	/**
	 * Define dateCreate
	 * @param dateCreate dateCreate
	 * @generated
	 */
	public Log setDateCreate(Date dateCreate){
		this.dateCreate = dateCreate;
		return this;
	}
	
	/**
	 * Obtém exhibitions
	 * @param exhibitions exhibitions
	 * return exhibitions
	 * @generated
	 */
	public java.lang.Integer getExhibitions(){
		return this.exhibitions;
	}
	
	/**
	 * Define exhibitions
	 * @param exhibitions exhibitions
	 * @generated
	 */
	public Log setExhibitions(java.lang.Integer exhibitions){
		this.exhibitions = exhibitions;
		return this;
	}
	
	/**
	 * Obtém hour
	 * @param hour hour
	 * return hour
	 * @generated
	 */
	public java.lang.String getHour(){
		return this.hour;
	}
	
	/**
	 * Define hour
	 * @param hour hour
	 * @generated
	 */
	public Log setHour(java.lang.String hour){
		this.hour = hour;
		return this;
	}
	
	/**
	 * Obtém monitor
	 * @param monitor monitor
	 * return monitor
	 * @generated
	 */
	public java.lang.Integer getMonitor(){
		return this.monitor;
	}
	
	/**
	 * Define monitor
	 * @param monitor monitor
	 * @generated
	 */
	public Log setMonitor(java.lang.Integer monitor){
		this.monitor = monitor;
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
	public Log setTerminal(Terminal terminal){
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
	public Log setId(java.lang.String id){
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
	    
	    if(!(obj instanceof Log))
	      return false;
	    
	    Log other = (Log)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
