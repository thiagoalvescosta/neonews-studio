package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_TERMINAL_TYPE
 * @generated
 */
@Entity
@Table(name = "\"SYS_TERMINAL_TYPE\""


)
@XmlRootElement
public class TerminalType implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 809849853l;
	
	/**
	 * @generated
	 */
	@Column(name = "type_ativo", nullable = true, unique = false)
	private java.lang.String ativo;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "type_id")
	private java.lang.String id;
	
	/**
	 * @generated
	 */
	@Column(name = "type_inativo", nullable = true, unique = false)
	private java.lang.String inativo;
	
	/**
	 * @generated
	 */
	@Column(name = "type_name", nullable = true, unique = false)
	private java.lang.String name;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public TerminalType(){
	}

	
	/**
	 * Obtém ativo
	 * @param ativo ativo
	 * return ativo
	 * @generated
	 */
	public java.lang.String getAtivo(){
		return this.ativo;
	}
	
	/**
	 * Define ativo
	 * @param ativo ativo
	 * @generated
	 */
	public TerminalType setAtivo(java.lang.String ativo){
		this.ativo = ativo;
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
	public TerminalType setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém inativo
	 * @param inativo inativo
	 * return inativo
	 * @generated
	 */
	public java.lang.String getInativo(){
		return this.inativo;
	}
	
	/**
	 * Define inativo
	 * @param inativo inativo
	 * @generated
	 */
	public TerminalType setInativo(java.lang.String inativo){
		this.inativo = inativo;
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
	public TerminalType setName(java.lang.String name){
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
	    
	    if(!(obj instanceof TerminalType))
	      return false;
	    
	    TerminalType other = (TerminalType)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
