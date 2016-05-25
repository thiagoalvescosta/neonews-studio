package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_HELP_CONTENT
 * @generated
 */
@Entity
@Table(name = "\"SYS_HELP_CONTENT\""


)
@XmlRootElement
public class HelpContent implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -593612333l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="HLD_ID", referencedColumnName = "HLD_ID")
	private HelpDocument helpDocument;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="HLN_ID", referencedColumnName = "HLN_ID")
	private HelpName helpName;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "hlp_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "hlp_page", nullable = true, unique = false)
	private java.lang.Integer page;
	
	/**
	 * @generated
	 */
	@Column(name = "hlp_summary", nullable = true, unique = false)
	private java.lang.String summary;
	
	/**
	 * @generated
	 */
	@Column(name = "hlp_text", nullable = true, unique = false)
	private java.lang.String text;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public HelpContent(){
	}

	
	/**
	 * Obtém helpDocument
	 * @param helpDocument helpDocument
	 * return helpDocument
	 * @generated
	 */
	public HelpDocument getHelpDocument(){
		return this.helpDocument;
	}
	
	/**
	 * Define helpDocument
	 * @param helpDocument helpDocument
	 * @generated
	 */
	public HelpContent setHelpDocument(HelpDocument helpDocument){
		this.helpDocument = helpDocument;
		return this;
	}
	
	/**
	 * Obtém helpName
	 * @param helpName helpName
	 * return helpName
	 * @generated
	 */
	public HelpName getHelpName(){
		return this.helpName;
	}
	
	/**
	 * Define helpName
	 * @param helpName helpName
	 * @generated
	 */
	public HelpContent setHelpName(HelpName helpName){
		this.helpName = helpName;
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
	public HelpContent setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém page
	 * @param page page
	 * return page
	 * @generated
	 */
	public java.lang.Integer getPage(){
		return this.page;
	}
	
	/**
	 * Define page
	 * @param page page
	 * @generated
	 */
	public HelpContent setPage(java.lang.Integer page){
		this.page = page;
		return this;
	}
	
	/**
	 * Obtém summary
	 * @param summary summary
	 * return summary
	 * @generated
	 */
	public java.lang.String getSummary(){
		return this.summary;
	}
	
	/**
	 * Define summary
	 * @param summary summary
	 * @generated
	 */
	public HelpContent setSummary(java.lang.String summary){
		this.summary = summary;
		return this;
	}
	
	/**
	 * Obtém text
	 * @param text text
	 * return text
	 * @generated
	 */
	public java.lang.String getText(){
		return this.text;
	}
	
	/**
	 * Define text
	 * @param text text
	 * @generated
	 */
	public HelpContent setText(java.lang.String text){
		this.text = text;
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
	    
	    if(!(obj instanceof HelpContent))
	      return false;
	    
	    HelpContent other = (HelpContent)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
