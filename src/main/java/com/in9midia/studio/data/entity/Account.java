package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_ACCOUNT
 * @generated
 */
@Entity
@Table(name = "\"SYS_ACCOUNT\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Account implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 487336408l;
	
	/**
	 * @generated
	 */
	@Column(name = "bil_aliquot", nullable = true, unique = false)
	private java.lang.Double aliquot;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAM_ID", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bil_date", nullable = false, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Column(name = "monitor_id", nullable = false, unique = false)
	private java.lang.Integer monitorId;
	
	/**
	 * @generated
	 */
	@Column(name = "bil_notes", nullable = true, unique = false)
	private java.lang.String notes;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bil_opr_date", nullable = false, unique = false)
	private Date oprDate;
	
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
	@Column(name = "bil_value", nullable = true, unique = false)
	private java.lang.Double value;
	
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
	public Account(){
	}

	
	/**
	 * Obtém aliquot
	 * @param aliquot aliquot
	 * return aliquot
	 * @generated
	 */
	public java.lang.Double getAliquot(){
		return this.aliquot;
	}
	
	/**
	 * Define aliquot
	 * @param aliquot aliquot
	 * @generated
	 */
	public Account setAliquot(java.lang.Double aliquot){
		this.aliquot = aliquot;
		return this;
	}
	
	/**
	 * Obtém campaign
	 * @param campaign campaign
	 * return campaign
	 * @generated
	 */
	public Campaign getCampaign(){
		return this.campaign;
	}
	
	/**
	 * Define campaign
	 * @param campaign campaign
	 * @generated
	 */
	public Account setCampaign(Campaign campaign){
		this.campaign = campaign;
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
	public Account setCompany(Company company){
		this.company = company;
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
	public Account setDate(Date date){
		this.date = date;
		return this;
	}
	
	/**
	 * Obtém monitorId
	 * @param monitorId monitorId
	 * return monitorId
	 * @generated
	 */
	public java.lang.Integer getMonitorId(){
		return this.monitorId;
	}
	
	/**
	 * Define monitorId
	 * @param monitorId monitorId
	 * @generated
	 */
	public Account setMonitorId(java.lang.Integer monitorId){
		this.monitorId = monitorId;
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
	public Account setNotes(java.lang.String notes){
		this.notes = notes;
		return this;
	}
	
	/**
	 * Obtém oprDate
	 * @param oprDate oprDate
	 * return oprDate
	 * @generated
	 */
	public Date getOprDate(){
		return this.oprDate;
	}
	
	/**
	 * Define oprDate
	 * @param oprDate oprDate
	 * @generated
	 */
	public Account setOprDate(Date oprDate){
		this.oprDate = oprDate;
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
	public Account setPerson(Person person){
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
	public Account setTerminal(Terminal terminal){
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
	public Account setValue(java.lang.Double value){
		this.value = value;
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
	public Account setId(java.lang.String id){
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
	    
	    if(!(obj instanceof Account))
	      return false;
	    
	    Account other = (Account)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
