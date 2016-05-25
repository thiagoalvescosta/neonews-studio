package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela EXC_STOCK_EXCHANGES
 * @generated
 */
@Entity
@Table(name = "\"EXC_STOCK_EXCHANGES\""


)
@XmlRootElement
public class StockExchanges implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 662424658l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "stk_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "stk_key", nullable = false, unique = false)
	private java.lang.String key;
	
	/**
	 * @generated
	 */
	@Column(name = "stk_name", nullable = false, unique = false)
	private java.lang.String name;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public StockExchanges(){
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
	public StockExchanges setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém key
	 * @param key key
	 * return key
	 * @generated
	 */
	public java.lang.String getKey(){
		return this.key;
	}
	
	/**
	 * Define key
	 * @param key key
	 * @generated
	 */
	public StockExchanges setKey(java.lang.String key){
		this.key = key;
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
	public StockExchanges setName(java.lang.String name){
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
	    
	    if(!(obj instanceof StockExchanges))
	      return false;
	    
	    StockExchanges other = (StockExchanges)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
