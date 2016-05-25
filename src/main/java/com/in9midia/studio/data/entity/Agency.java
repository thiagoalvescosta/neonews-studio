package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela NWS_AGENCY
 * @generated
 */
@Entity
@Table(name = "\"NWS_AGENCY\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Agency implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1959137305l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Column(name = "age_cut_days", nullable = true, unique = false)
	private java.lang.Integer cutDays;
	
	/**
	 * @generated
	 */
	@Column(name = "age_default_image", nullable = true, unique = false)
	private java.lang.String defaultImage;
	
	/**
	 * @generated
	 */
	@Column(name = "age_expression_dst", nullable = true, unique = false)
	private java.lang.String expressionDst;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="NEX_ID", referencedColumnName = "NEX_ID")
	private ExpressionEx expressionEx;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="AGE_LOGO", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@Column(name = "age_filter", nullable = true, unique = false)
	private java.lang.String filter;
	
	/**
	 * @generated
	 */
	@Column(name = "age_filter_category", nullable = true, unique = false)
	private java.lang.String filterCategory;
	
	/**
	 * @generated
	 */
	@Column(name = "age_global", nullable = true, unique = false)
	private boolean global;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "age_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "age_image_expression", nullable = true, unique = false)
	private java.lang.String imageExpression;
	
	/**
	 * @generated
	 */
	@Column(name = "age_include_only", nullable = true, unique = false)
	private java.lang.String includeOnly;
	
	/**
	 * @generated
	 */
	@Column(name = "age_key_name", nullable = true, unique = false)
	private java.lang.String keyName;
	
	/**
	 * @generated
	 */
	@Column(name = "age_limit_description", nullable = true, unique = false)
	private java.lang.Integer limitDescription;
	
	/**
	 * @generated
	 */
	@Column(name = "age_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "age_replace", nullable = true, unique = false)
	private java.lang.String replace;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Agency(){
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
	public Agency setCompany(Company company){
		this.company = company;
		return this;
	}
	
	/**
	 * Obtém cutDays
	 * @param cutDays cutDays
	 * return cutDays
	 * @generated
	 */
	public java.lang.Integer getCutDays(){
		return this.cutDays;
	}
	
	/**
	 * Define cutDays
	 * @param cutDays cutDays
	 * @generated
	 */
	public Agency setCutDays(java.lang.Integer cutDays){
		this.cutDays = cutDays;
		return this;
	}
	
	/**
	 * Obtém defaultImage
	 * @param defaultImage defaultImage
	 * return defaultImage
	 * @generated
	 */
	public java.lang.String getDefaultImage(){
		return this.defaultImage;
	}
	
	/**
	 * Define defaultImage
	 * @param defaultImage defaultImage
	 * @generated
	 */
	public Agency setDefaultImage(java.lang.String defaultImage){
		this.defaultImage = defaultImage;
		return this;
	}
	
	/**
	 * Obtém expressionDst
	 * @param expressionDst expressionDst
	 * return expressionDst
	 * @generated
	 */
	public java.lang.String getExpressionDst(){
		return this.expressionDst;
	}
	
	/**
	 * Define expressionDst
	 * @param expressionDst expressionDst
	 * @generated
	 */
	public Agency setExpressionDst(java.lang.String expressionDst){
		this.expressionDst = expressionDst;
		return this;
	}
	
	/**
	 * Obtém expressionEx
	 * @param expressionEx expressionEx
	 * return expressionEx
	 * @generated
	 */
	public ExpressionEx getExpressionEx(){
		return this.expressionEx;
	}
	
	/**
	 * Define expressionEx
	 * @param expressionEx expressionEx
	 * @generated
	 */
	public Agency setExpressionEx(ExpressionEx expressionEx){
		this.expressionEx = expressionEx;
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
	public Agency setFile(File file){
		this.file = file;
		return this;
	}
	
	/**
	 * Obtém filter
	 * @param filter filter
	 * return filter
	 * @generated
	 */
	public java.lang.String getFilter(){
		return this.filter;
	}
	
	/**
	 * Define filter
	 * @param filter filter
	 * @generated
	 */
	public Agency setFilter(java.lang.String filter){
		this.filter = filter;
		return this;
	}
	
	/**
	 * Obtém filterCategory
	 * @param filterCategory filterCategory
	 * return filterCategory
	 * @generated
	 */
	public java.lang.String getFilterCategory(){
		return this.filterCategory;
	}
	
	/**
	 * Define filterCategory
	 * @param filterCategory filterCategory
	 * @generated
	 */
	public Agency setFilterCategory(java.lang.String filterCategory){
		this.filterCategory = filterCategory;
		return this;
	}
	
	/**
	 * Obtém global
	 * @param global global
	 * return global
	 * @generated
	 */
	public boolean getGlobal(){
		return this.global;
	}
	
	/**
	 * Define global
	 * @param global global
	 * @generated
	 */
	public Agency setGlobal(boolean global){
		this.global = global;
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
	public Agency setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém imageExpression
	 * @param imageExpression imageExpression
	 * return imageExpression
	 * @generated
	 */
	public java.lang.String getImageExpression(){
		return this.imageExpression;
	}
	
	/**
	 * Define imageExpression
	 * @param imageExpression imageExpression
	 * @generated
	 */
	public Agency setImageExpression(java.lang.String imageExpression){
		this.imageExpression = imageExpression;
		return this;
	}
	
	/**
	 * Obtém includeOnly
	 * @param includeOnly includeOnly
	 * return includeOnly
	 * @generated
	 */
	public java.lang.String getIncludeOnly(){
		return this.includeOnly;
	}
	
	/**
	 * Define includeOnly
	 * @param includeOnly includeOnly
	 * @generated
	 */
	public Agency setIncludeOnly(java.lang.String includeOnly){
		this.includeOnly = includeOnly;
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
	public Agency setKeyName(java.lang.String keyName){
		this.keyName = keyName;
		return this;
	}
	
	/**
	 * Obtém limitDescription
	 * @param limitDescription limitDescription
	 * return limitDescription
	 * @generated
	 */
	public java.lang.Integer getLimitDescription(){
		return this.limitDescription;
	}
	
	/**
	 * Define limitDescription
	 * @param limitDescription limitDescription
	 * @generated
	 */
	public Agency setLimitDescription(java.lang.Integer limitDescription){
		this.limitDescription = limitDescription;
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
	public Agency setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém replace
	 * @param replace replace
	 * return replace
	 * @generated
	 */
	public java.lang.String getReplace(){
		return this.replace;
	}
	
	/**
	 * Define replace
	 * @param replace replace
	 * @generated
	 */
	public Agency setReplace(java.lang.String replace){
		this.replace = replace;
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
	    
	    if(!(obj instanceof Agency))
	      return false;
	    
	    Agency other = (Agency)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
