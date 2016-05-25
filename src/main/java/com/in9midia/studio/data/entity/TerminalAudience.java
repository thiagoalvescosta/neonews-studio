package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_TERMINAL_AUDIENCE
 * @generated
 */
@Entity
@Table(name = "\"SYS_TERMINAL_AUDIENCE\""


)
@XmlRootElement
public class TerminalAudience implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 382791848l;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "aud_date", nullable = false, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="EMP_CARD", referencedColumnName = "EMP_CARD")
	private Employer employer;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "aud_id")
	private java.lang.Double id;
	
	/**
	 * @generated
	 */
	@Column(name = "aud_latitude", nullable = false, unique = false)
	private java.lang.String latitude;
	
	/**
	 * @generated
	 */
	@Column(name = "aud_longitude", nullable = false, unique = false)
	private java.lang.String longitude;
	
	/**
	 * @generated
	 */
	@Column(name = "aud_sensor", nullable = true, unique = false)
	private java.lang.Integer sensor;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TRM_ID", referencedColumnName = "TRM_ID")
	private Terminal terminal;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public TerminalAudience(){
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
	public TerminalAudience setDate(Date date){
		this.date = date;
		return this;
	}
	
	/**
	 * Obtém employer
	 * @param employer employer
	 * return employer
	 * @generated
	 */
	public Employer getEmployer(){
		return this.employer;
	}
	
	/**
	 * Define employer
	 * @param employer employer
	 * @generated
	 */
	public TerminalAudience setEmployer(Employer employer){
		this.employer = employer;
		return this;
	}
	
	/**
	 * Obtém id
	 * @param id id
	 * return id
	 * @generated
	 */
	public java.lang.Double getId(){
		return this.id;
	}
	
	/**
	 * Define id
	 * @param id id
	 * @generated
	 */
	public TerminalAudience setId(java.lang.Double id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém latitude
	 * @param latitude latitude
	 * return latitude
	 * @generated
	 */
	public java.lang.String getLatitude(){
		return this.latitude;
	}
	
	/**
	 * Define latitude
	 * @param latitude latitude
	 * @generated
	 */
	public TerminalAudience setLatitude(java.lang.String latitude){
		this.latitude = latitude;
		return this;
	}
	
	/**
	 * Obtém longitude
	 * @param longitude longitude
	 * return longitude
	 * @generated
	 */
	public java.lang.String getLongitude(){
		return this.longitude;
	}
	
	/**
	 * Define longitude
	 * @param longitude longitude
	 * @generated
	 */
	public TerminalAudience setLongitude(java.lang.String longitude){
		this.longitude = longitude;
		return this;
	}
	
	/**
	 * Obtém sensor
	 * @param sensor sensor
	 * return sensor
	 * @generated
	 */
	public java.lang.Integer getSensor(){
		return this.sensor;
	}
	
	/**
	 * Define sensor
	 * @param sensor sensor
	 * @generated
	 */
	public TerminalAudience setSensor(java.lang.Integer sensor){
		this.sensor = sensor;
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
	public TerminalAudience setTerminal(Terminal terminal){
		this.terminal = terminal;
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
	    
	    if(!(obj instanceof TerminalAudience))
	      return false;
	    
	    TerminalAudience other = (TerminalAudience)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
