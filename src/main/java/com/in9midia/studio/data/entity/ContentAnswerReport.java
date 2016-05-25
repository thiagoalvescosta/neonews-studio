package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela CMS_CONTENT_ANSWER_REPORT
 * @generated
 */
@Entity
@Table(name = "\"CMS_CONTENT_ANSWER_REPORT\""


)
@XmlRootElement
public class ContentAnswerReport implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 895919509l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CON_ID", referencedColumnName = "CON_ID")
	private Content content;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CCQ_ID", referencedColumnName = "CCQ_ID")
	private ContentAnswerQuiz contentAnswerQuiz;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ccqr_date", nullable = false, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "ccqr_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ContentAnswerReport(){
	}

	
	/**
	 * Obtém content
	 * @param content content
	 * return content
	 * @generated
	 */
	public Content getContent(){
		return this.content;
	}
	
	/**
	 * Define content
	 * @param content content
	 * @generated
	 */
	public ContentAnswerReport setContent(Content content){
		this.content = content;
		return this;
	}
	
	/**
	 * Obtém contentAnswerQuiz
	 * @param contentAnswerQuiz contentAnswerQuiz
	 * return contentAnswerQuiz
	 * @generated
	 */
	public ContentAnswerQuiz getContentAnswerQuiz(){
		return this.contentAnswerQuiz;
	}
	
	/**
	 * Define contentAnswerQuiz
	 * @param contentAnswerQuiz contentAnswerQuiz
	 * @generated
	 */
	public ContentAnswerReport setContentAnswerQuiz(ContentAnswerQuiz contentAnswerQuiz){
		this.contentAnswerQuiz = contentAnswerQuiz;
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
	public ContentAnswerReport setDate(Date date){
		this.date = date;
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
	public ContentAnswerReport setId(java.lang.String id){
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
	    
	    if(!(obj instanceof ContentAnswerReport))
	      return false;
	    
	    ContentAnswerReport other = (ContentAnswerReport)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
