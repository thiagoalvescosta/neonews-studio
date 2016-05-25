package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_TERMINAL_LOG
 * @generated
 */
@Entity
@Table(name = "\"SYS_TERMINAL_LOG\""


)
@XmlRootElement
public class TerminalLog implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -250976473l;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "log_date", nullable = false, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Column(name = "log_file", nullable = false, unique = false)
	private java.lang.String file;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "log_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
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
	public TerminalLog(){
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
	public TerminalLog setDate(Date date){
		this.date = date;
		return this;
	}
	
	/**
	 * Obtém file
	 * @param file file
	 * return file
	 * @generated
	 */
	public java.lang.String getFile(){
		return this.file;
	}
	
	/**
	 * Define file
	 * @param file file
	 * @generated
	 */
	public TerminalLog setFile(java.lang.String file){
		this.file = file;
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
	public TerminalLog setId(java.lang.String id){
		this.id = id;
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
	public TerminalLog setTerminal(Terminal terminal){
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
	    
	    if(!(obj instanceof TerminalLog))
	      return false;
	    
	    TerminalLog other = (TerminalLog)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
