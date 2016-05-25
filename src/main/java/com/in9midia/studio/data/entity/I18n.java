package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_I18N
 * @generated
 */
@Entity
@Table(name = "\"SYS_I18N\""


)
@XmlRootElement
public class I18n implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 2225643l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "i18_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "i18_lang", nullable = false, unique = false)
	private java.lang.String lang;
	
	/**
	 * @generated
	 */
	@Column(name = "i18_text", nullable = false, unique = false)
	private java.lang.String text;
	
	/**
	 * @generated
	 */
	@Column(name = "i18_translated", nullable = false, unique = false)
	private java.lang.String translated;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public I18n(){
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
	public I18n setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém lang
	 * @param lang lang
	 * return lang
	 * @generated
	 */
	public java.lang.String getLang(){
		return this.lang;
	}
	
	/**
	 * Define lang
	 * @param lang lang
	 * @generated
	 */
	public I18n setLang(java.lang.String lang){
		this.lang = lang;
		return this;
	}
	
	/**
	 * Obtém text
	 * @param text text
	 * return text
	 * @generated
	 */
	public java.lang.String getText(){
		return this.text;
	}
	
	/**
	 * Define text
	 * @param text text
	 * @generated
	 */
	public I18n setText(java.lang.String text){
		this.text = text;
		return this;
	}
	
	/**
	 * Obtém translated
	 * @param translated translated
	 * return translated
	 * @generated
	 */
	public java.lang.String getTranslated(){
		return this.translated;
	}
	
	/**
	 * Define translated
	 * @param translated translated
	 * @generated
	 */
	public I18n setTranslated(java.lang.String translated){
		this.translated = translated;
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
	    
	    if(!(obj instanceof I18n))
	      return false;
	    
	    I18n other = (I18n)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
