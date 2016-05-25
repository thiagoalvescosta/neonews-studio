package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_ROUTE_STOP
 * @generated
 */
@Entity
@Table(name = "\"SYS_ROUTE_STOP\""


)
@XmlRootElement
public class RouteStop implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -2123363907l;
	
	/**
	 * @generated
	 */
	@Column(name = "sys_rou_stop_direction", nullable = true, unique = false)
	private java.lang.String rouStopDirection;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "sys_rou_stop_id")
	private java.lang.String rouStopId = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "sys_rou_stop_latitude", nullable = true, unique = false)
	private java.lang.String rouStopLatitude;
	
	/**
	 * @generated
	 */
	@Column(name = "sys_rou_stop_longitude", nullable = true, unique = false)
	private java.lang.String rouStopLongitude;
	
	/**
	 * @generated
	 */
	@Column(name = "sys_rou_stop_nome", nullable = true, unique = false)
	private java.lang.String rouStopNome;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="rou_id", referencedColumnName = "ROU_ID")
	private Route route;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public RouteStop(){
	}

	
	/**
	 * Obtém rouStopDirection
	 * @param rouStopDirection rouStopDirection
	 * return rouStopDirection
	 * @generated
	 */
	public java.lang.String getRouStopDirection(){
		return this.rouStopDirection;
	}
	
	/**
	 * Define rouStopDirection
	 * @param rouStopDirection rouStopDirection
	 * @generated
	 */
	public RouteStop setRouStopDirection(java.lang.String rouStopDirection){
		this.rouStopDirection = rouStopDirection;
		return this;
	}
	
	/**
	 * Obtém rouStopId
	 * @param rouStopId rouStopId
	 * return rouStopId
	 * @generated
	 */
	public java.lang.String getRouStopId(){
		return this.rouStopId;
	}
	
	/**
	 * Define rouStopId
	 * @param rouStopId rouStopId
	 * @generated
	 */
	public RouteStop setRouStopId(java.lang.String rouStopId){
		this.rouStopId = rouStopId;
		return this;
	}
	
	/**
	 * Obtém rouStopLatitude
	 * @param rouStopLatitude rouStopLatitude
	 * return rouStopLatitude
	 * @generated
	 */
	public java.lang.String getRouStopLatitude(){
		return this.rouStopLatitude;
	}
	
	/**
	 * Define rouStopLatitude
	 * @param rouStopLatitude rouStopLatitude
	 * @generated
	 */
	public RouteStop setRouStopLatitude(java.lang.String rouStopLatitude){
		this.rouStopLatitude = rouStopLatitude;
		return this;
	}
	
	/**
	 * Obtém rouStopLongitude
	 * @param rouStopLongitude rouStopLongitude
	 * return rouStopLongitude
	 * @generated
	 */
	public java.lang.String getRouStopLongitude(){
		return this.rouStopLongitude;
	}
	
	/**
	 * Define rouStopLongitude
	 * @param rouStopLongitude rouStopLongitude
	 * @generated
	 */
	public RouteStop setRouStopLongitude(java.lang.String rouStopLongitude){
		this.rouStopLongitude = rouStopLongitude;
		return this;
	}
	
	/**
	 * Obtém rouStopNome
	 * @param rouStopNome rouStopNome
	 * return rouStopNome
	 * @generated
	 */
	public java.lang.String getRouStopNome(){
		return this.rouStopNome;
	}
	
	/**
	 * Define rouStopNome
	 * @param rouStopNome rouStopNome
	 * @generated
	 */
	public RouteStop setRouStopNome(java.lang.String rouStopNome){
		this.rouStopNome = rouStopNome;
		return this;
	}
	
	/**
	 * Obtém route
	 * @param route route
	 * return route
	 * @generated
	 */
	public Route getRoute(){
		return this.route;
	}
	
	/**
	 * Define route
	 * @param route route
	 * @generated
	 */
	public RouteStop setRoute(Route route){
		this.route = route;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((rouStopId == null) ? 0 : rouStopId.hashCode());

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
	    
	    if(!(obj instanceof RouteStop))
	      return false;
	    
	    RouteStop other = (RouteStop)obj;
	    
		if(this.rouStopId == null && other.rouStopId != null)
	    	return false;
	    else if(!this.rouStopId.equals(other.rouStopId))
	     	return false;
	

	    return true;
	    
	}
}
