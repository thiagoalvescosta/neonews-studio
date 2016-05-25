package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela EXC_EXCHANGES_RATES
 * @generated
 */
@Entity
@Table(name = "\"EXC_EXCHANGES_RATES\""


)
@XmlRootElement
public class ExchangesRates implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -580474143l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "exc_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "exc_key_name", nullable = false, unique = false)
	private java.lang.String keyName;
	
	/**
	 * @generated
	 */
	@Column(name = "exc_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "exc_symbol", nullable = true, unique = false)
	private java.lang.String symbol;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ExchangesRates(){
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
	public ExchangesRates setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém keyName
	 * @param keyName keyName
	 * return keyName
	 * @generated
	 */
	public java.lang.String getKeyName(){
		return this.keyName;
	}
	
	/**
	 * Define keyName
	 * @param keyName keyName
	 * @generated
	 */
	public ExchangesRates setKeyName(java.lang.String keyName){
		this.keyName = keyName;
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
	public ExchangesRates setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém symbol
	 * @param symbol symbol
	 * return symbol
	 * @generated
	 */
	public java.lang.String getSymbol(){
		return this.symbol;
	}
	
	/**
	 * Define symbol
	 * @param symbol symbol
	 * @generated
	 */
	public ExchangesRates setSymbol(java.lang.String symbol){
		this.symbol = symbol;
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
	    
	    if(!(obj instanceof ExchangesRates))
	      return false;
	    
	    ExchangesRates other = (ExchangesRates)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
