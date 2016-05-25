package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_COMMAND
 * @generated
 */
@Entity
@Table(name = "\"SYS_COMMAND\""


)
@XmlRootElement
public class Command implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1679917266l;
	
	/**
	 * @generated
	 */
	@Column(name = "cmd_command", nullable = false, unique = false)
	private java.lang.String command;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cmd_date", nullable = true, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "cmd_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cmd_start_date", nullable = false, unique = false)
	private Date startDate;
	
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
	public Command(){
	}

	
	/**
	 * Obtém command
	 * @param command command
	 * return command
	 * @generated
	 */
	public java.lang.String getCommand(){
		return this.command;
	}
	
	/**
	 * Define command
	 * @param command command
	 * @generated
	 */
	public Command setCommand(java.lang.String command){
		this.command = command;
		return this;
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
	public Command setDate(Date date){
		this.date = date;
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
	public Command setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém startDate
	 * @param startDate startDate
	 * return startDate
	 * @generated
	 */
	public Date getStartDate(){
		return this.startDate;
	}
	
	/**
	 * Define startDate
	 * @param startDate startDate
	 * @generated
	 */
	public Command setStartDate(Date startDate){
		this.startDate = startDate;
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
	public Command setTerminal(Terminal terminal){
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
	    
	    if(!(obj instanceof Command))
	      return false;
	    
	    Command other = (Command)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
