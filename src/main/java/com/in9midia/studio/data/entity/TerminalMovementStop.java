package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_TERMINAL_MOVEMENT_STOP
 * @generated
 */
@Entity
@Table(name = "\"SYS_TERMINAL_MOVEMENT_STOP\""


)
@XmlRootElement
public class TerminalMovementStop implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 812635687l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="mov_rou_stop_id", referencedColumnName = "sys_rou_stop_id")
	private RouteStop routeStop;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "mov_stp_date", nullable = true, unique = false)
	private Date stpDate;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "mov_stp_id")
	private java.lang.String stpId = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "mov_stp_latitude", nullable = true, unique = false)
	private java.lang.String stpLatitude;
	
	/**
	 * @generated
	 */
	@Column(name = "mov_stp_longitude", nullable = true, unique = false)
	private java.lang.String stpLongitude;
	
	/**
	 * @generated
	 */
	@Column(name = "mov_stp_onroute", nullable = true, unique = false)
	private boolean stpOnroute;
	
	/**
	 * @generated
	 */
	@Column(name = "mov_stp_speed", nullable = true, unique = false)
	private java.lang.String stpSpeed;
	
	/**
	 * @generated
	 */
	@Column(name = "mov_stp_stop", nullable = true, unique = false)
	private boolean stpStop;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="mov_id", referencedColumnName = "MOV_ID")
	private TerminalMovement terminalMovement;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public TerminalMovementStop(){
	}

	
	/**
	 * Obtém routeStop
	 * @param routeStop routeStop
	 * return routeStop
	 * @generated
	 */
	public RouteStop getRouteStop(){
		return this.routeStop;
	}
	
	/**
	 * Define routeStop
	 * @param routeStop routeStop
	 * @generated
	 */
	public TerminalMovementStop setRouteStop(RouteStop routeStop){
		this.routeStop = routeStop;
		return this;
	}
	
	/**
	 * Obtém stpDate
	 * @param stpDate stpDate
	 * return stpDate
	 * @generated
	 */
	public Date getStpDate(){
		return this.stpDate;
	}
	
	/**
	 * Define stpDate
	 * @param stpDate stpDate
	 * @generated
	 */
	public TerminalMovementStop setStpDate(Date stpDate){
		this.stpDate = stpDate;
		return this;
	}
	
	/**
	 * Obtém stpId
	 * @param stpId stpId
	 * return stpId
	 * @generated
	 */
	public java.lang.String getStpId(){
		return this.stpId;
	}
	
	/**
	 * Define stpId
	 * @param stpId stpId
	 * @generated
	 */
	public TerminalMovementStop setStpId(java.lang.String stpId){
		this.stpId = stpId;
		return this;
	}
	
	/**
	 * Obtém stpLatitude
	 * @param stpLatitude stpLatitude
	 * return stpLatitude
	 * @generated
	 */
	public java.lang.String getStpLatitude(){
		return this.stpLatitude;
	}
	
	/**
	 * Define stpLatitude
	 * @param stpLatitude stpLatitude
	 * @generated
	 */
	public TerminalMovementStop setStpLatitude(java.lang.String stpLatitude){
		this.stpLatitude = stpLatitude;
		return this;
	}
	
	/**
	 * Obtém stpLongitude
	 * @param stpLongitude stpLongitude
	 * return stpLongitude
	 * @generated
	 */
	public java.lang.String getStpLongitude(){
		return this.stpLongitude;
	}
	
	/**
	 * Define stpLongitude
	 * @param stpLongitude stpLongitude
	 * @generated
	 */
	public TerminalMovementStop setStpLongitude(java.lang.String stpLongitude){
		this.stpLongitude = stpLongitude;
		return this;
	}
	
	/**
	 * Obtém stpOnroute
	 * @param stpOnroute stpOnroute
	 * return stpOnroute
	 * @generated
	 */
	public boolean getStpOnroute(){
		return this.stpOnroute;
	}
	
	/**
	 * Define stpOnroute
	 * @param stpOnroute stpOnroute
	 * @generated
	 */
	public TerminalMovementStop setStpOnroute(boolean stpOnroute){
		this.stpOnroute = stpOnroute;
		return this;
	}
	
	/**
	 * Obtém stpSpeed
	 * @param stpSpeed stpSpeed
	 * return stpSpeed
	 * @generated
	 */
	public java.lang.String getStpSpeed(){
		return this.stpSpeed;
	}
	
	/**
	 * Define stpSpeed
	 * @param stpSpeed stpSpeed
	 * @generated
	 */
	public TerminalMovementStop setStpSpeed(java.lang.String stpSpeed){
		this.stpSpeed = stpSpeed;
		return this;
	}
	
	/**
	 * Obtém stpStop
	 * @param stpStop stpStop
	 * return stpStop
	 * @generated
	 */
	public boolean getStpStop(){
		return this.stpStop;
	}
	
	/**
	 * Define stpStop
	 * @param stpStop stpStop
	 * @generated
	 */
	public TerminalMovementStop setStpStop(boolean stpStop){
		this.stpStop = stpStop;
		return this;
	}
	
	/**
	 * Obtém terminalMovement
	 * @param terminalMovement terminalMovement
	 * return terminalMovement
	 * @generated
	 */
	public TerminalMovement getTerminalMovement(){
		return this.terminalMovement;
	}
	
	/**
	 * Define terminalMovement
	 * @param terminalMovement terminalMovement
	 * @generated
	 */
	public TerminalMovementStop setTerminalMovement(TerminalMovement terminalMovement){
		this.terminalMovement = terminalMovement;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((stpId == null) ? 0 : stpId.hashCode());

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
	    
	    if(!(obj instanceof TerminalMovementStop))
	      return false;
	    
	    TerminalMovementStop other = (TerminalMovementStop)obj;
	    
		if(this.stpId == null && other.stpId != null)
	    	return false;
	    else if(!this.stpId.equals(other.stpId))
	     	return false;
	

	    return true;
	    
	}
}
