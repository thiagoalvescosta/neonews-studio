package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela NWS_EXPRESSION_EX
 * @generated
 */
@Entity
@Table(name = "\"NWS_EXPRESSION_EX\""


)
@XmlRootElement
public class ExpressionEx implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1311551883l;
	
	/**
	 * @generated
	 */
	@Column(name = "nex_expression", nullable = true, unique = false)
	private java.lang.String expression;
	
	/**
	 * @generated
	 */
	@Column(name = "nex_expression_dst", nullable = true, unique = false)
	private java.lang.String expressionDst;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "nex_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "nex_name", nullable = false, unique = false)
	private java.lang.String name;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ExpressionEx(){
	}

	
	/**
	 * Obtém expression
	 * @param expression expression
	 * return expression
	 * @generated
	 */
	public java.lang.String getExpression(){
		return this.expression;
	}
	
	/**
	 * Define expression
	 * @param expression expression
	 * @generated
	 */
	public ExpressionEx setExpression(java.lang.String expression){
		this.expression = expression;
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
	public ExpressionEx setExpressionDst(java.lang.String expressionDst){
		this.expressionDst = expressionDst;
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
	public ExpressionEx setId(java.lang.String id){
		this.id = id;
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
	public ExpressionEx setName(java.lang.String name){
		this.name = name;
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
	    
	    if(!(obj instanceof ExpressionEx))
	      return false;
	    
	    ExpressionEx other = (ExpressionEx)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
