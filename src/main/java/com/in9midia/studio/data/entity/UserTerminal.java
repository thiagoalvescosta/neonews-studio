package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_USER_TERMINAL
 * @generated
 */
@Entity
@Table(name = "\"SYS_USER_TERMINAL\""


)
@XmlRootElement
public class UserTerminal implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1784855777l;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_id", nullable = true, unique = false)
	private java.lang.String user;
	
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
	public UserTerminal(){
	}

	
	/**
	 * Obtém user
	 * @param user user
	 * return user
	 * @generated
	 */
	public java.lang.String getUser(){
		return this.user;
	}
	
	/**
	 * Define user
	 * @param user user
	 * @generated
	 */
	public UserTerminal setUser(java.lang.String user){
		this.user = user;
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
	public UserTerminal setTerminal(Terminal terminal){
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
	public UserTerminal setId(java.lang.String id){
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
	    
	    if(!(obj instanceof UserTerminal))
	      return false;
	    
	    UserTerminal other = (UserTerminal)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
