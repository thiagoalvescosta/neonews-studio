package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;
import org.eclipse.persistence.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela SYS_FILE
 * @generated
 */
@Entity
@Table(name = "\"SYS_FILE\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class File implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 2191732l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	@JsonIgnore
	private Company company;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_crc", nullable = false, unique = false)
	private java.lang.String crc;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fil_date", nullable = false, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_error", nullable = true, unique = false)
	private java.lang.String error;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="FOL_ID", referencedColumnName = "FOL_ID")
	private Folder folder;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "fil_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "fil_info", nullable = true, unique = false)
	private java.lang.String info;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_phisical_location", nullable = false, unique = false)
	private java.lang.String phisicalLocation;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_preview_img", nullable = true, unique = false)
	private java.lang.String previewImg;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_ready", nullable = true, unique = false)
	private boolean ready;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_resolution", nullable = true, unique = false)
	private java.lang.String resolution;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_size", nullable = false, unique = false)
	private java.lang.Long size;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_time", nullable = true, unique = false)
	private java.lang.Long time;
	
	/**
	 * @generated
	 */
	@Column(name = "fil_type", nullable = false, unique = false)
	private java.lang.String type;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public File(){
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
	public File setCompany(Company company){
		this.company = company;
		return this;
	}
	
	/**
	 * Obtém crc
	 * @param crc crc
	 * return crc
	 * @generated
	 */
	public java.lang.String getCrc(){
		return this.crc;
	}
	
	/**
	 * Define crc
	 * @param crc crc
	 * @generated
	 */
	public File setCrc(java.lang.String crc){
		this.crc = crc;
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
	public File setDate(Date date){
		this.date = date;
		return this;
	}
	
	/**
	 * Obtém error
	 * @param error error
	 * return error
	 * @generated
	 */
	public java.lang.String getError(){
		return this.error;
	}
	
	/**
	 * Define error
	 * @param error error
	 * @generated
	 */
	public File setError(java.lang.String error){
		this.error = error;
		return this;
	}
	
	/**
	 * Obtém folder
	 * @param folder folder
	 * return folder
	 * @generated
	 */
	public Folder getFolder(){
		return this.folder;
	}
	
	/**
	 * Define folder
	 * @param folder folder
	 * @generated
	 */
	public File setFolder(Folder folder){
		this.folder = folder;
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
	public File setId(java.lang.String id){
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
	public File setInfo(java.lang.String info){
		this.info = info;
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
	public File setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém phisicalLocation
	 * @param phisicalLocation phisicalLocation
	 * return phisicalLocation
	 * @generated
	 */
	public java.lang.String getPhisicalLocation(){
		return this.phisicalLocation;
	}
	
	/**
	 * Define phisicalLocation
	 * @param phisicalLocation phisicalLocation
	 * @generated
	 */
	public File setPhisicalLocation(java.lang.String phisicalLocation){
		this.phisicalLocation = phisicalLocation;
		return this;
	}
	
	/**
	 * Obtém previewImg
	 * @param previewImg previewImg
	 * return previewImg
	 * @generated
	 */
	public java.lang.String getPreviewImg(){
		return this.previewImg;
	}
	
	/**
	 * Define previewImg
	 * @param previewImg previewImg
	 * @generated
	 */
	public File setPreviewImg(java.lang.String previewImg){
		this.previewImg = previewImg;
		return this;
	}
	
	/**
	 * Obtém ready
	 * @param ready ready
	 * return ready
	 * @generated
	 */
	public boolean getReady(){
		return this.ready;
	}
	
	/**
	 * Define ready
	 * @param ready ready
	 * @generated
	 */
	public File setReady(boolean ready){
		this.ready = ready;
		return this;
	}
	
	/**
	 * Obtém resolution
	 * @param resolution resolution
	 * return resolution
	 * @generated
	 */
	public java.lang.String getResolution(){
		return this.resolution;
	}
	
	/**
	 * Define resolution
	 * @param resolution resolution
	 * @generated
	 */
	public File setResolution(java.lang.String resolution){
		this.resolution = resolution;
		return this;
	}
	
	/**
	 * Obtém size
	 * @param size size
	 * return size
	 * @generated
	 */
	public java.lang.Long getSize(){
		return this.size;
	}
	
	/**
	 * Define size
	 * @param size size
	 * @generated
	 */
	public File setSize(java.lang.Long size){
		this.size = size;
		return this;
	}
	
	/**
	 * Obtém time
	 * @param time time
	 * return time
	 * @generated
	 */
	public java.lang.Long getTime(){
		return this.time;
	}
	
	/**
	 * Define time
	 * @param time time
	 * @generated
	 */
	public File setTime(java.lang.Long time){
		this.time = time;
		return this;
	}
	
	/**
	 * Obtém type
	 * @param type type
	 * return type
	 * @generated
	 */
	public java.lang.String getType(){
		return this.type;
	}
	
	/**
	 * Define type
	 * @param type type
	 * @generated
	 */
	public File setType(java.lang.String type){
		this.type = type;
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
	    
	    if(!(obj instanceof File))
	      return false;
	    
	    File other = (File)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
