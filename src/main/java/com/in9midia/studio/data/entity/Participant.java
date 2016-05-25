package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_PARTICIPANT
 * @generated
 */
@Entity
@Table(name = "\"SYS_PARTICIPANT\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Participant implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1859674337l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
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
	@JoinColumn(name="FIL_ID", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "par_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "par_name", nullable = true, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "par_verbalization", nullable = true, unique = false)
	private java.lang.String verbalization;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Participant(){
	}

	
	/**
	 * Obtém company
	 * @param company company
	 * return company
	 * @generated
	 */
	public Company getCompany(){
		return this.company;
	}
	
	/**
	 * Define company
	 * @param company company
	 * @generated
	 */
	public Participant setCompany(Company company){
		this.company = company;
		return this;
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
	public Participant setContent(Content content){
		this.content = content;
		return this;
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
	public Participant setFile(File file){
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
	public Participant setId(java.lang.String id){
		this.id = id;
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
	public Participant setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém verbalization
	 * @param verbalization verbalization
	 * return verbalization
	 * @generated
	 */
	public java.lang.String getVerbalization(){
		return this.verbalization;
	}
	
	/**
	 * Define verbalization
	 * @param verbalization verbalization
	 * @generated
	 */
	public Participant setVerbalization(java.lang.String verbalization){
		this.verbalization = verbalization;
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
	    
	    if(!(obj instanceof Participant))
	      return false;
	    
	    Participant other = (Participant)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
