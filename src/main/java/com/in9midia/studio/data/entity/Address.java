package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_ADDRESS
 * @generated
 */
@Entity
@Table(name = "\"SYS_ADDRESS\""


)
@XmlRootElement
public class Address implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 516963297l;
	
	/**
	 * @generated
	 */
	@Column(name = "add_address", nullable = false, unique = false)
	private java.lang.String address;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CTY_ID", referencedColumnName = "CTY_ID")
	private City city;
	
	/**
	 * @generated
	 */
	@Column(name = "add_complement", nullable = true, unique = false)
	private java.lang.String complement;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CNT_ID", referencedColumnName = "CNT_ID")
	private Country country;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "add_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "add_neighborhood", nullable = false, unique = false)
	private java.lang.String neighborhood;
	
	/**
	 * @generated
	 */
	@Column(name = "add_number", nullable = true, unique = false)
	private java.lang.Integer number;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="STA_ID", referencedColumnName = "STA_ID")
	private State state;
	
	/**
	 * @generated
	 */
	@Column(name = "add_zipcode", nullable = false, unique = false)
	private java.lang.String zipcode;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Address(){
	}

	
	/**
	 * Obtém address
	 * @param address address
	 * return address
	 * @generated
	 */
	public java.lang.String getAddress(){
		return this.address;
	}
	
	/**
	 * Define address
	 * @param address address
	 * @generated
	 */
	public Address setAddress(java.lang.String address){
		this.address = address;
		return this;
	}
	
	/**
	 * Obtém city
	 * @param city city
	 * return city
	 * @generated
	 */
	public City getCity(){
		return this.city;
	}
	
	/**
	 * Define city
	 * @param city city
	 * @generated
	 */
	public Address setCity(City city){
		this.city = city;
		return this;
	}
	
	/**
	 * Obtém complement
	 * @param complement complement
	 * return complement
	 * @generated
	 */
	public java.lang.String getComplement(){
		return this.complement;
	}
	
	/**
	 * Define complement
	 * @param complement complement
	 * @generated
	 */
	public Address setComplement(java.lang.String complement){
		this.complement = complement;
		return this;
	}
	
	/**
	 * Obtém country
	 * @param country country
	 * return country
	 * @generated
	 */
	public Country getCountry(){
		return this.country;
	}
	
	/**
	 * Define country
	 * @param country country
	 * @generated
	 */
	public Address setCountry(Country country){
		this.country = country;
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
	public Address setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém neighborhood
	 * @param neighborhood neighborhood
	 * return neighborhood
	 * @generated
	 */
	public java.lang.String getNeighborhood(){
		return this.neighborhood;
	}
	
	/**
	 * Define neighborhood
	 * @param neighborhood neighborhood
	 * @generated
	 */
	public Address setNeighborhood(java.lang.String neighborhood){
		this.neighborhood = neighborhood;
		return this;
	}
	
	/**
	 * Obtém number
	 * @param number number
	 * return number
	 * @generated
	 */
	public java.lang.Integer getNumber(){
		return this.number;
	}
	
	/**
	 * Define number
	 * @param number number
	 * @generated
	 */
	public Address setNumber(java.lang.Integer number){
		this.number = number;
		return this;
	}
	
	/**
	 * Obtém state
	 * @param state state
	 * return state
	 * @generated
	 */
	public State getState(){
		return this.state;
	}
	
	/**
	 * Define state
	 * @param state state
	 * @generated
	 */
	public Address setState(State state){
		this.state = state;
		return this;
	}
	
	/**
	 * Obtém zipcode
	 * @param zipcode zipcode
	 * return zipcode
	 * @generated
	 */
	public java.lang.String getZipcode(){
		return this.zipcode;
	}
	
	/**
	 * Define zipcode
	 * @param zipcode zipcode
	 * @generated
	 */
	public Address setZipcode(java.lang.String zipcode){
		this.zipcode = zipcode;
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
	    
	    if(!(obj instanceof Address))
	      return false;
	    
	    Address other = (Address)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
