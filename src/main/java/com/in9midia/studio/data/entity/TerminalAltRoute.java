package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_TERMINAL_ALT_ROUTE
 * @generated
 */
@Entity
@Table(name = "\"SYS_TERMINAL_ALT_ROUTE\""


)
@XmlRootElement
public class TerminalAltRoute implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1422323932l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="FIL_ID", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@Column(name = "art_order", nullable = true, unique = false)
	private java.lang.Integer order;
	
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
	public TerminalAltRoute(){
	}

	
	/**
	 * Obtém file
	 * @param file file
	 * return file
	 * @generated
	 */
	public File getFile(){
		return this.file;
	}
	
	/**
	 * Define file
	 * @param file file
	 * @generated
	 */
	public TerminalAltRoute setFile(File file){
		this.file = file;
		return this;
	}
	
	/**
	 * Obtém order
	 * @param order order
	 * return order
	 * @generated
	 */
	public java.lang.Integer getOrder(){
		return this.order;
	}
	
	/**
	 * Define order
	 * @param order order
	 * @generated
	 */
	public TerminalAltRoute setOrder(java.lang.Integer order){
		this.order = order;
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
	public TerminalAltRoute setTerminal(Terminal terminal){
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
	public TerminalAltRoute setId(java.lang.String id){
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
	    
	    if(!(obj instanceof TerminalAltRoute))
	      return false;
	    
	    TerminalAltRoute other = (TerminalAltRoute)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
