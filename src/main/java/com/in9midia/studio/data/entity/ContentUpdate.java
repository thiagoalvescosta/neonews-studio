package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_CONTENT_UPDATE
 * @generated
 */
@Entity
@Table(name = "\"SYS_CONTENT_UPDATE\""


)
@XmlRootElement
public class ContentUpdate implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 525767259l;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "upd_date_end", nullable = true, unique = false)
	private Date dateEnd;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "upd_date_start", nullable = true, unique = false)
	private Date dateStart;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "upd_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "trm_md5", nullable = true, unique = false)
	private java.lang.String md5;
	
	/**
	 * @generated
	 */
	@Column(name = "upd_notes", nullable = true, unique = false)
	private java.lang.String notes;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PFL_ID", referencedColumnName = "PFL_ID")
	private Profile profile;
	
	/**
	 * @generated
	 */
	@Column(name = "upd_status", nullable = true, unique = false)
	private java.lang.String status;
	
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
	public ContentUpdate(){
	}

	
	/**
	 * Obtém dateEnd
	 * @param dateEnd dateEnd
	 * return dateEnd
	 * @generated
	 */
	public Date getDateEnd(){
		return this.dateEnd;
	}
	
	/**
	 * Define dateEnd
	 * @param dateEnd dateEnd
	 * @generated
	 */
	public ContentUpdate setDateEnd(Date dateEnd){
		this.dateEnd = dateEnd;
		return this;
	}
	
	/**
	 * Obtém dateStart
	 * @param dateStart dateStart
	 * return dateStart
	 * @generated
	 */
	public Date getDateStart(){
		return this.dateStart;
	}
	
	/**
	 * Define dateStart
	 * @param dateStart dateStart
	 * @generated
	 */
	public ContentUpdate setDateStart(Date dateStart){
		this.dateStart = dateStart;
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
	public ContentUpdate setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém md5
	 * @param md5 md5
	 * return md5
	 * @generated
	 */
	public java.lang.String getMd5(){
		return this.md5;
	}
	
	/**
	 * Define md5
	 * @param md5 md5
	 * @generated
	 */
	public ContentUpdate setMd5(java.lang.String md5){
		this.md5 = md5;
		return this;
	}
	
	/**
	 * Obtém notes
	 * @param notes notes
	 * return notes
	 * @generated
	 */
	public java.lang.String getNotes(){
		return this.notes;
	}
	
	/**
	 * Define notes
	 * @param notes notes
	 * @generated
	 */
	public ContentUpdate setNotes(java.lang.String notes){
		this.notes = notes;
		return this;
	}
	
	/**
	 * Obtém profile
	 * @param profile profile
	 * return profile
	 * @generated
	 */
	public Profile getProfile(){
		return this.profile;
	}
	
	/**
	 * Define profile
	 * @param profile profile
	 * @generated
	 */
	public ContentUpdate setProfile(Profile profile){
		this.profile = profile;
		return this;
	}
	
	/**
	 * Obtém status
	 * @param status status
	 * return status
	 * @generated
	 */
	public java.lang.String getStatus(){
		return this.status;
	}
	
	/**
	 * Define status
	 * @param status status
	 * @generated
	 */
	public ContentUpdate setStatus(java.lang.String status){
		this.status = status;
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
	public ContentUpdate setTerminal(Terminal terminal){
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
	    
	    if(!(obj instanceof ContentUpdate))
	      return false;
	    
	    ContentUpdate other = (ContentUpdate)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
