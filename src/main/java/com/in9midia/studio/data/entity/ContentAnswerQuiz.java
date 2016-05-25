package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CMS_CONTENT_ANSWER_QUIZ
 * @generated
 */
@Entity
@Table(name = "\"CMS_CONTENT_ANSWER_QUIZ\""


)
@XmlRootElement
public class ContentAnswerQuiz implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1864604764l;
	
	/**
	 * @generated
	 */
	@Column(name = "ccq_answer", nullable = false, unique = false)
	private java.lang.String answer;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CON_ID", referencedColumnName = "CON_ID")
	private Content content;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "ccq_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "ccq_order", nullable = true, unique = false)
	private java.lang.Integer order;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ContentAnswerQuiz(){
	}

	
	/**
	 * Obtém answer
	 * @param answer answer
	 * return answer
	 * @generated
	 */
	public java.lang.String getAnswer(){
		return this.answer;
	}
	
	/**
	 * Define answer
	 * @param answer answer
	 * @generated
	 */
	public ContentAnswerQuiz setAnswer(java.lang.String answer){
		this.answer = answer;
		return this;
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
	public ContentAnswerQuiz setContent(Content content){
		this.content = content;
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
	public ContentAnswerQuiz setId(java.lang.String id){
		this.id = id;
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
	public ContentAnswerQuiz setOrder(java.lang.Integer order){
		this.order = order;
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
	    
	    if(!(obj instanceof ContentAnswerQuiz))
	      return false;
	    
	    ContentAnswerQuiz other = (ContentAnswerQuiz)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
