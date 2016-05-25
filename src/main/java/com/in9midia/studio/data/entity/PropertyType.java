package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_PROPERTY_TYPE
 * @generated
 */
@Entity
@Table(name = "\"SYS_PROPERTY_TYPE\""


)
@XmlRootElement
public class PropertyType implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -700167443l;
	
	/**
	 * @generated
	 */
	@Column(name = "ptp_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Column(name = "ptp_form_editor", nullable = true, unique = false)
	private java.lang.String formEditor;
	
	/**
	 * @generated
	 */
	@Column(name = "ptp_height", nullable = true, unique = false)
	private java.lang.Integer height;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "ptp_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "ptp_mime_type", nullable = false, unique = false)
	private java.lang.String mimeType;
	
	/**
	 * @generated
	 */
	@Column(name = "ptp_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "ptp_web_editor", nullable = true, unique = false)
	private java.lang.String webEditor;
	
	/**
	 * @generated
	 */
	@Column(name = "ptp_width", nullable = true, unique = false)
	private java.lang.Integer width;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public PropertyType(){
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
	public PropertyType setDescription(java.lang.String description){
		this.description = description;
		return this;
	}
	
	/**
	 * Obtém formEditor
	 * @param formEditor formEditor
	 * return formEditor
	 * @generated
	 */
	public java.lang.String getFormEditor(){
		return this.formEditor;
	}
	
	/**
	 * Define formEditor
	 * @param formEditor formEditor
	 * @generated
	 */
	public PropertyType setFormEditor(java.lang.String formEditor){
		this.formEditor = formEditor;
		return this;
	}
	
	/**
	 * Obtém height
	 * @param height height
	 * return height
	 * @generated
	 */
	public java.lang.Integer getHeight(){
		return this.height;
	}
	
	/**
	 * Define height
	 * @param height height
	 * @generated
	 */
	public PropertyType setHeight(java.lang.Integer height){
		this.height = height;
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
	public PropertyType setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém mimeType
	 * @param mimeType mimeType
	 * return mimeType
	 * @generated
	 */
	public java.lang.String getMimeType(){
		return this.mimeType;
	}
	
	/**
	 * Define mimeType
	 * @param mimeType mimeType
	 * @generated
	 */
	public PropertyType setMimeType(java.lang.String mimeType){
		this.mimeType = mimeType;
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
	public PropertyType setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém webEditor
	 * @param webEditor webEditor
	 * return webEditor
	 * @generated
	 */
	public java.lang.String getWebEditor(){
		return this.webEditor;
	}
	
	/**
	 * Define webEditor
	 * @param webEditor webEditor
	 * @generated
	 */
	public PropertyType setWebEditor(java.lang.String webEditor){
		this.webEditor = webEditor;
		return this;
	}
	
	/**
	 * Obtém width
	 * @param width width
	 * return width
	 * @generated
	 */
	public java.lang.Integer getWidth(){
		return this.width;
	}
	
	/**
	 * Define width
	 * @param width width
	 * @generated
	 */
	public PropertyType setWidth(java.lang.Integer width){
		this.width = width;
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
	    
	    if(!(obj instanceof PropertyType))
	      return false;
	    
	    PropertyType other = (PropertyType)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
