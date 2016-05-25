package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_MODULE_PROPERTY
 * @generated
 */
@Entity
@Table(name = "\"SYS_MODULE_PROPERTY\""


)
@XmlRootElement
public class ModuleProperty implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1089236864l;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "pro_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "pro_key_name", nullable = false, unique = false)
	private java.lang.String keyName;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="MOD_ID", referencedColumnName = "MOD_ID")
	private Module module;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_order", nullable = true, unique = false)
	private java.lang.Integer order;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PTP_ID", referencedColumnName = "PTP_ID")
	private PropertyType propertyType;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_required", nullable = true, unique = false)
	private boolean required;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_size", nullable = true, unique = false)
	private java.lang.Integer size;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_user_visible", nullable = true, unique = false)
	private boolean userVisible;
	
	/**
	 * @generated
	 */
	@Column(name = "pro_valor_default", nullable = true, unique = false)
	private java.lang.String valorDefault;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ModuleProperty(){
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
	public ModuleProperty setDescription(java.lang.String description){
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
	public ModuleProperty setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém keyName
	 * @param keyName keyName
	 * return keyName
	 * @generated
	 */
	public java.lang.String getKeyName(){
		return this.keyName;
	}
	
	/**
	 * Define keyName
	 * @param keyName keyName
	 * @generated
	 */
	public ModuleProperty setKeyName(java.lang.String keyName){
		this.keyName = keyName;
		return this;
	}
	
	/**
	 * Obtém module
	 * @param module module
	 * return module
	 * @generated
	 */
	public Module getModule(){
		return this.module;
	}
	
	/**
	 * Define module
	 * @param module module
	 * @generated
	 */
	public ModuleProperty setModule(Module module){
		this.module = module;
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
	public ModuleProperty setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém order
	 * @param order order
	 * return order
	 * @generated
	 */
	public java.lang.Integer getOrder(){
		return this.order;
	}
	
	/**
	 * Define order
	 * @param order order
	 * @generated
	 */
	public ModuleProperty setOrder(java.lang.Integer order){
		this.order = order;
		return this;
	}
	
	/**
	 * Obtém propertyType
	 * @param propertyType propertyType
	 * return propertyType
	 * @generated
	 */
	public PropertyType getPropertyType(){
		return this.propertyType;
	}
	
	/**
	 * Define propertyType
	 * @param propertyType propertyType
	 * @generated
	 */
	public ModuleProperty setPropertyType(PropertyType propertyType){
		this.propertyType = propertyType;
		return this;
	}
	
	/**
	 * Obtém required
	 * @param required required
	 * return required
	 * @generated
	 */
	public boolean getRequired(){
		return this.required;
	}
	
	/**
	 * Define required
	 * @param required required
	 * @generated
	 */
	public ModuleProperty setRequired(boolean required){
		this.required = required;
		return this;
	}
	
	/**
	 * Obtém size
	 * @param size size
	 * return size
	 * @generated
	 */
	public java.lang.Integer getSize(){
		return this.size;
	}
	
	/**
	 * Define size
	 * @param size size
	 * @generated
	 */
	public ModuleProperty setSize(java.lang.Integer size){
		this.size = size;
		return this;
	}
	
	/**
	 * Obtém userVisible
	 * @param userVisible userVisible
	 * return userVisible
	 * @generated
	 */
	public boolean getUserVisible(){
		return this.userVisible;
	}
	
	/**
	 * Define userVisible
	 * @param userVisible userVisible
	 * @generated
	 */
	public ModuleProperty setUserVisible(boolean userVisible){
		this.userVisible = userVisible;
		return this;
	}
	
	/**
	 * Obtém valorDefault
	 * @param valorDefault valorDefault
	 * return valorDefault
	 * @generated
	 */
	public java.lang.String getValorDefault(){
		return this.valorDefault;
	}
	
	/**
	 * Define valorDefault
	 * @param valorDefault valorDefault
	 * @generated
	 */
	public ModuleProperty setValorDefault(java.lang.String valorDefault){
		this.valorDefault = valorDefault;
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
	    
	    if(!(obj instanceof ModuleProperty))
	      return false;
	    
	    ModuleProperty other = (ModuleProperty)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
