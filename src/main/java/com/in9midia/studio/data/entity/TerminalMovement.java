package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_TERMINAL_MOVEMENT
 * @generated
 */
@Entity
@Table(name = "\"SYS_TERMINAL_MOVEMENT\""


)
@XmlRootElement
public class TerminalMovement implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -696514700l;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "mov_end_date", nullable = false, unique = false)
	private Date endDate;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "mov_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "mov_movement", nullable = false, unique = false)
	private java.lang.String movement;
	
	/**
	 * @generated
	 */
	@Column(name = "mov_processed", nullable = true, unique = false)
	private boolean processed;
	
	/**
	 * @generated
	 */
	@Column(name = "mov_send", nullable = true, unique = false)
	private java.lang.Integer send;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "mov_start_date", nullable = false, unique = false)
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
	public TerminalMovement(){
	}

	
	/**
	 * Obtém endDate
	 * @param endDate endDate
	 * return endDate
	 * @generated
	 */
	public Date getEndDate(){
		return this.endDate;
	}
	
	/**
	 * Define endDate
	 * @param endDate endDate
	 * @generated
	 */
	public TerminalMovement setEndDate(Date endDate){
		this.endDate = endDate;
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
	public TerminalMovement setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém movement
	 * @param movement movement
	 * return movement
	 * @generated
	 */
	public java.lang.String getMovement(){
		return this.movement;
	}
	
	/**
	 * Define movement
	 * @param movement movement
	 * @generated
	 */
	public TerminalMovement setMovement(java.lang.String movement){
		this.movement = movement;
		return this;
	}
	
	/**
	 * Obtém processed
	 * @param processed processed
	 * return processed
	 * @generated
	 */
	public boolean getProcessed(){
		return this.processed;
	}
	
	/**
	 * Define processed
	 * @param processed processed
	 * @generated
	 */
	public TerminalMovement setProcessed(boolean processed){
		this.processed = processed;
		return this;
	}
	
	/**
	 * Obtém send
	 * @param send send
	 * return send
	 * @generated
	 */
	public java.lang.Integer getSend(){
		return this.send;
	}
	
	/**
	 * Define send
	 * @param send send
	 * @generated
	 */
	public TerminalMovement setSend(java.lang.Integer send){
		this.send = send;
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
	public TerminalMovement setStartDate(Date startDate){
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
	public TerminalMovement setTerminal(Terminal terminal){
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
	    
	    if(!(obj instanceof TerminalMovement))
	      return false;
	    
	    TerminalMovement other = (TerminalMovement)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
