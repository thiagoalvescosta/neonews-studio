package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_FILE_EXTENSION
 * @generated
 */
@Entity
@Table(name = "\"SYS_FILE_EXTENSION\""


)
@XmlRootElement
public class FileExtension implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -468391457l;
	
	/**
	 * @generated
	 */
	@Column(name = "fie_extension", nullable = false, unique = false)
	private java.lang.String extension;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="FIT_ID", referencedColumnName = "FIT_ID")
	private FileType fileType;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "fie_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public FileExtension(){
	}

	
	/**
	 * Obtém extension
	 * @param extension extension
	 * return extension
	 * @generated
	 */
	public java.lang.String getExtension(){
		return this.extension;
	}
	
	/**
	 * Define extension
	 * @param extension extension
	 * @generated
	 */
	public FileExtension setExtension(java.lang.String extension){
		this.extension = extension;
		return this;
	}
	
	/**
	 * Obtém fileType
	 * @param fileType fileType
	 * return fileType
	 * @generated
	 */
	public FileType getFileType(){
		return this.fileType;
	}
	
	/**
	 * Define fileType
	 * @param fileType fileType
	 * @generated
	 */
	public FileExtension setFileType(FileType fileType){
		this.fileType = fileType;
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
	public FileExtension setId(java.lang.String id){
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
	    
	    if(!(obj instanceof FileExtension))
	      return false;
	    
	    FileExtension other = (FileExtension)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
