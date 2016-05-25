package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_COMMAND_PARAM
 * @generated
 */
@Entity
@Table(name = "\"SYS_COMMAND_PARAM\""


)
@XmlRootElement
public class CommandParam implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 2106162099l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CMD_ID", referencedColumnName = "CMD_ID")
	private Command command;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "par_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "par_key", nullable = false, unique = false)
	private java.lang.String key;
	
	/**
	 * @generated
	 */
	@Column(name = "par_value", nullable = true, unique = false)
	private java.lang.String value;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public CommandParam(){
	}

	
	/**
	 * Obtém command
	 * @param command command
	 * return command
	 * @generated
	 */
	public Command getCommand(){
		return this.command;
	}
	
	/**
	 * Define command
	 * @param command command
	 * @generated
	 */
	public CommandParam setCommand(Command command){
		this.command = command;
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
	public CommandParam setId(java.lang.String id){
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
	public CommandParam setKey(java.lang.String key){
		this.key = key;
		return this;
	}
	
	/**
	 * Obtém value
	 * @param value value
	 * return value
	 * @generated
	 */
	public java.lang.String getValue(){
		return this.value;
	}
	
	/**
	 * Define value
	 * @param value value
	 * @generated
	 */
	public CommandParam setValue(java.lang.String value){
		this.value = value;
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
	    
	    if(!(obj instanceof CommandParam))
	      return false;
	    
	    CommandParam other = (CommandParam)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
