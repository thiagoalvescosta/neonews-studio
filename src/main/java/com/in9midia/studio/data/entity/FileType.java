package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_FILE_TYPE
 * @generated
 */
@Entity
@Table(name = "\"SYS_FILE_TYPE\""


)
@XmlRootElement
public class FileType implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -670873950l;
	
	/**
	 * @generated
	 */
	@Column(name = "fit_allowed", nullable = true, unique = false)
	private boolean allowed;
	
	/**
	 * @generated
	 */
	@Column(name = "fit_form_preview", nullable = true, unique = false)
	private java.lang.String formPreview;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "fit_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "fit_image", nullable = false, unique = false)
	private java.lang.String image;
	
	/**
	 * @generated
	 */
	@Column(name = "fit_type", nullable = false, unique = false)
	private java.lang.String type;
	
	/**
	 * @generated
	 */
	@Column(name = "fit_upload_prepared", nullable = true, unique = false)
	private boolean uploadPrepared;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public FileType(){
	}

	
	/**
	 * Obtém allowed
	 * @param allowed allowed
	 * return allowed
	 * @generated
	 */
	public boolean getAllowed(){
		return this.allowed;
	}
	
	/**
	 * Define allowed
	 * @param allowed allowed
	 * @generated
	 */
	public FileType setAllowed(boolean allowed){
		this.allowed = allowed;
		return this;
	}
	
	/**
	 * Obtém formPreview
	 * @param formPreview formPreview
	 * return formPreview
	 * @generated
	 */
	public java.lang.String getFormPreview(){
		return this.formPreview;
	}
	
	/**
	 * Define formPreview
	 * @param formPreview formPreview
	 * @generated
	 */
	public FileType setFormPreview(java.lang.String formPreview){
		this.formPreview = formPreview;
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
	public FileType setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém image
	 * @param image image
	 * return image
	 * @generated
	 */
	public java.lang.String getImage(){
		return this.image;
	}
	
	/**
	 * Define image
	 * @param image image
	 * @generated
	 */
	public FileType setImage(java.lang.String image){
		this.image = image;
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
	public FileType setType(java.lang.String type){
		this.type = type;
		return this;
	}
	
	/**
	 * Obtém uploadPrepared
	 * @param uploadPrepared uploadPrepared
	 * return uploadPrepared
	 * @generated
	 */
	public boolean getUploadPrepared(){
		return this.uploadPrepared;
	}
	
	/**
	 * Define uploadPrepared
	 * @param uploadPrepared uploadPrepared
	 * @generated
	 */
	public FileType setUploadPrepared(boolean uploadPrepared){
		this.uploadPrepared = uploadPrepared;
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
	    
	    if(!(obj instanceof FileType))
	      return false;
	    
	    FileType other = (FileType)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
