package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_CONTENT_TERMINAL
 * @generated
 */
@Entity
@Table(name = "\"SYS_CONTENT_TERMINAL\""


)
@XmlRootElement
public class ContentTerminal implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 245391893l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CON_ID", referencedColumnName = "CON_ID")
	private Content content;
	
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
	public ContentTerminal(){
	}

	
	/**
	 * Obtém content
	 * @param content content
	 * return content
	 * @generated
	 */
	public Content getContent(){
		return this.content;
	}
	
	/**
	 * Define content
	 * @param content content
	 * @generated
	 */
	public ContentTerminal setContent(Content content){
		this.content = content;
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
	public ContentTerminal setTerminal(Terminal terminal){
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
	public ContentTerminal setId(java.lang.String id){
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
	    
	    if(!(obj instanceof ContentTerminal))
	      return false;
	    
	    ContentTerminal other = (ContentTerminal)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
