package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_REGION
 * @generated
 */
@Entity
@Table(name = "\"SYS_REGION\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Region implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1850926342l;
	
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
    
	@Column(name = "reg_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "reg_inbound", nullable = true, unique = false)
	private boolean inbound;
	
	/**
	 * @generated
	 */
	@Column(name = "reg_latitude", nullable = false, unique = false)
	private java.lang.String latitude;
	
	/**
	 * @generated
	 */
	@Column(name = "reg_longitude", nullable = false, unique = false)
	private java.lang.String longitude;
	
	/**
	 * @generated
	 */
	@Column(name = "reg_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "reg_radius", nullable = true, unique = false)
	private java.lang.Integer radius;
	
	/**
	 * @generated
	 */
	@Column(name = "reg_zoom", nullable = true, unique = false)
	private java.lang.Integer zoom;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Region(){
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
	public Region setCompany(Company company){
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
	public Region setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém inbound
	 * @param inbound inbound
	 * return inbound
	 * @generated
	 */
	public boolean getInbound(){
		return this.inbound;
	}
	
	/**
	 * Define inbound
	 * @param inbound inbound
	 * @generated
	 */
	public Region setInbound(boolean inbound){
		this.inbound = inbound;
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
	public Region setLatitude(java.lang.String latitude){
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
	public Region setLongitude(java.lang.String longitude){
		this.longitude = longitude;
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
	public Region setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém radius
	 * @param radius radius
	 * return radius
	 * @generated
	 */
	public java.lang.Integer getRadius(){
		return this.radius;
	}
	
	/**
	 * Define radius
	 * @param radius radius
	 * @generated
	 */
	public Region setRadius(java.lang.Integer radius){
		this.radius = radius;
		return this;
	}
	
	/**
	 * Obtém zoom
	 * @param zoom zoom
	 * return zoom
	 * @generated
	 */
	public java.lang.Integer getZoom(){
		return this.zoom;
	}
	
	/**
	 * Define zoom
	 * @param zoom zoom
	 * @generated
	 */
	public Region setZoom(java.lang.Integer zoom){
		this.zoom = zoom;
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
	    
	    if(!(obj instanceof Region))
	      return false;
	    
	    Region other = (Region)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
