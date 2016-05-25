package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_PATRIMONY
 * @generated
 */
@Entity
@Table(name = "\"SYS_PATRIMONY\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Patrimony implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1921705941l;
	
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
	@JoinColumn(name="CPY_ID2", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company2;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "pat_date_acquisition", nullable = true, unique = false)
	private Date dateAcquisition;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "pat_date_install", nullable = true, unique = false)
	private Date dateInstall;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_description", nullable = false, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "pat_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "pat_info", nullable = true, unique = false)
	private java.lang.String info;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_manufacturer", nullable = true, unique = false)
	private java.lang.String manufacturer;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_model", nullable = true, unique = false)
	private java.lang.String model;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_num_serie", nullable = true, unique = false)
	private java.lang.String numSerie;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_num_tag", nullable = true, unique = false)
	private java.lang.String numTag;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PAT_SIT_ID", referencedColumnName = "PAT_SIT_ID")
	private PatrimonySituation patrimonySituation;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PAT_TYP_ID", referencedColumnName = "PAT_TYP_ID")
	private PatrimonyType patrimonyType;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_id", nullable = true, unique = false)
	private java.lang.String trmId;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Patrimony(){
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
	public Patrimony setCompany(Company company){
		this.company = company;
		return this;
	}
	
	/**
	 * Obtém company2
	 * @param company2 company2
	 * return company2
	 * @generated
	 */
	public Company getCompany2(){
		return this.company2;
	}
	
	/**
	 * Define company2
	 * @param company2 company2
	 * @generated
	 */
	public Patrimony setCompany2(Company company2){
		this.company2 = company2;
		return this;
	}
	
	/**
	 * Obtém dateAcquisition
	 * @param dateAcquisition dateAcquisition
	 * return dateAcquisition
	 * @generated
	 */
	public Date getDateAcquisition(){
		return this.dateAcquisition;
	}
	
	/**
	 * Define dateAcquisition
	 * @param dateAcquisition dateAcquisition
	 * @generated
	 */
	public Patrimony setDateAcquisition(Date dateAcquisition){
		this.dateAcquisition = dateAcquisition;
		return this;
	}
	
	/**
	 * Obtém dateInstall
	 * @param dateInstall dateInstall
	 * return dateInstall
	 * @generated
	 */
	public Date getDateInstall(){
		return this.dateInstall;
	}
	
	/**
	 * Define dateInstall
	 * @param dateInstall dateInstall
	 * @generated
	 */
	public Patrimony setDateInstall(Date dateInstall){
		this.dateInstall = dateInstall;
		return this;
	}
	
	/**
	 * Obtém description
	 * @param description description
	 * return description
	 * @generated
	 */
	public java.lang.String getDescription(){
		return this.description;
	}
	
	/**
	 * Define description
	 * @param description description
	 * @generated
	 */
	public Patrimony setDescription(java.lang.String description){
		this.description = description;
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
	public Patrimony setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém info
	 * @param info info
	 * return info
	 * @generated
	 */
	public java.lang.String getInfo(){
		return this.info;
	}
	
	/**
	 * Define info
	 * @param info info
	 * @generated
	 */
	public Patrimony setInfo(java.lang.String info){
		this.info = info;
		return this;
	}
	
	/**
	 * Obtém manufacturer
	 * @param manufacturer manufacturer
	 * return manufacturer
	 * @generated
	 */
	public java.lang.String getManufacturer(){
		return this.manufacturer;
	}
	
	/**
	 * Define manufacturer
	 * @param manufacturer manufacturer
	 * @generated
	 */
	public Patrimony setManufacturer(java.lang.String manufacturer){
		this.manufacturer = manufacturer;
		return this;
	}
	
	/**
	 * Obtém model
	 * @param model model
	 * return model
	 * @generated
	 */
	public java.lang.String getModel(){
		return this.model;
	}
	
	/**
	 * Define model
	 * @param model model
	 * @generated
	 */
	public Patrimony setModel(java.lang.String model){
		this.model = model;
		return this;
	}
	
	/**
	 * Obtém numSerie
	 * @param numSerie numSerie
	 * return numSerie
	 * @generated
	 */
	public java.lang.String getNumSerie(){
		return this.numSerie;
	}
	
	/**
	 * Define numSerie
	 * @param numSerie numSerie
	 * @generated
	 */
	public Patrimony setNumSerie(java.lang.String numSerie){
		this.numSerie = numSerie;
		return this;
	}
	
	/**
	 * Obtém numTag
	 * @param numTag numTag
	 * return numTag
	 * @generated
	 */
	public java.lang.String getNumTag(){
		return this.numTag;
	}
	
	/**
	 * Define numTag
	 * @param numTag numTag
	 * @generated
	 */
	public Patrimony setNumTag(java.lang.String numTag){
		this.numTag = numTag;
		return this;
	}
	
	/**
	 * Obtém patrimonySituation
	 * @param patrimonySituation patrimonySituation
	 * return patrimonySituation
	 * @generated
	 */
	public PatrimonySituation getPatrimonySituation(){
		return this.patrimonySituation;
	}
	
	/**
	 * Define patrimonySituation
	 * @param patrimonySituation patrimonySituation
	 * @generated
	 */
	public Patrimony setPatrimonySituation(PatrimonySituation patrimonySituation){
		this.patrimonySituation = patrimonySituation;
		return this;
	}
	
	/**
	 * Obtém patrimonyType
	 * @param patrimonyType patrimonyType
	 * return patrimonyType
	 * @generated
	 */
	public PatrimonyType getPatrimonyType(){
		return this.patrimonyType;
	}
	
	/**
	 * Define patrimonyType
	 * @param patrimonyType patrimonyType
	 * @generated
	 */
	public Patrimony setPatrimonyType(PatrimonyType patrimonyType){
		this.patrimonyType = patrimonyType;
		return this;
	}
	
	/**
	 * Obtém trmId
	 * @param trmId trmId
	 * return trmId
	 * @generated
	 */
	public java.lang.String getTrmId(){
		return this.trmId;
	}
	
	/**
	 * Define trmId
	 * @param trmId trmId
	 * @generated
	 */
	public Patrimony setTrmId(java.lang.String trmId){
		this.trmId = trmId;
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
	    
	    if(!(obj instanceof Patrimony))
	      return false;
	    
	    Patrimony other = (Patrimony)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
