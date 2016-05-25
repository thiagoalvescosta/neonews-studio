package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_TEMP
 * @generated
 */
@Entity
@Table(name = "\"SYS_TEMP\""


)
@XmlRootElement
public class Temp implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 2605029l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "tmp_con_id")
	private java.lang.String conId;
	
	/**
	 * @generated
	 */
	@Column(name = "tmp_cpy_id", nullable = true, unique = false)
	private java.lang.String cpyId;
	
	/**
	 * @generated
	 */
	@Column(name = "tmp_null", nullable = true, unique = false)
	private java.lang.String tmpNull;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Temp(){
	}

	
	/**
	 * Obtém conId
	 * @param conId conId
	 * return conId
	 * @generated
	 */
	public java.lang.String getConId(){
		return this.conId;
	}
	
	/**
	 * Define conId
	 * @param conId conId
	 * @generated
	 */
	public Temp setConId(java.lang.String conId){
		this.conId = conId;
		return this;
	}
	
	/**
	 * Obtém cpyId
	 * @param cpyId cpyId
	 * return cpyId
	 * @generated
	 */
	public java.lang.String getCpyId(){
		return this.cpyId;
	}
	
	/**
	 * Define cpyId
	 * @param cpyId cpyId
	 * @generated
	 */
	public Temp setCpyId(java.lang.String cpyId){
		this.cpyId = cpyId;
		return this;
	}
	
	/**
	 * Obtém tmpNull
	 * @param tmpNull tmpNull
	 * return tmpNull
	 * @generated
	 */
	public java.lang.String getTmpNull(){
		return this.tmpNull;
	}
	
	/**
	 * Define tmpNull
	 * @param tmpNull tmpNull
	 * @generated
	 */
	public Temp setTmpNull(java.lang.String tmpNull){
		this.tmpNull = tmpNull;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((conId == null) ? 0 : conId.hashCode());

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
	    
	    if(!(obj instanceof Temp))
	      return false;
	    
	    Temp other = (Temp)obj;
	    
		if(this.conId == null && other.conId != null)
	    	return false;
	    else if(!this.conId.equals(other.conId))
	     	return false;
	

	    return true;
	    
	}
}
