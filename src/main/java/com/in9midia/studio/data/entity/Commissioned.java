package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_COMMISSIONED
 * @generated
 */
@Entity
@Table(name = "\"SYS_COMMISSIONED\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Commissioned implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -535734606l;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_id", nullable = true, unique = false)
	private java.lang.String camId;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "com_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PES_ID", referencedColumnName = "PES_ID")
	private Person person;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TRM_ID", referencedColumnName = "TRM_ID")
	private Terminal terminal;
	
	/**
	 * @generated
	 */
	@Column(name = "com_value", nullable = true, unique = false)
	private java.lang.Double value;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Commissioned(){
	}

	
	/**
	 * Obtém camId
	 * @param camId camId
	 * return camId
	 * @generated
	 */
	public java.lang.String getCamId(){
		return this.camId;
	}
	
	/**
	 * Define camId
	 * @param camId camId
	 * @generated
	 */
	public Commissioned setCamId(java.lang.String camId){
		this.camId = camId;
		return this;
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
	public Commissioned setCompany(Company company){
		this.company = company;
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
	public Commissioned setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém person
	 * @param person person
	 * return person
	 * @generated
	 */
	public Person getPerson(){
		return this.person;
	}
	
	/**
	 * Define person
	 * @param person person
	 * @generated
	 */
	public Commissioned setPerson(Person person){
		this.person = person;
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
	public Commissioned setTerminal(Terminal terminal){
		this.terminal = terminal;
		return this;
	}
	
	/**
	 * Obtém value
	 * @param value value
	 * return value
	 * @generated
	 */
	public java.lang.Double getValue(){
		return this.value;
	}
	
	/**
	 * Define value
	 * @param value value
	 * @generated
	 */
	public Commissioned setValue(java.lang.Double value){
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
	    
	    if(!(obj instanceof Commissioned))
	      return false;
	    
	    Commissioned other = (Commissioned)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
