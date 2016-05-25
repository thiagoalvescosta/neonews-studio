package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_PATRIMONY_REMOTE
 * @generated
 */
@Entity
@Table(name = "\"SYS_PATRIMONY_REMOTE\""


)
@XmlRootElement
public class PatrimonyRemote implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1105788128l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PAT_ID", referencedColumnName = "PAT_ID")
	private Patrimony patrimony;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_rem_description", nullable = false, unique = false)
	private java.lang.String remDescription;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "pat_rem_id")
	private java.lang.String remId = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "pat_rem_ip", nullable = true, unique = false)
	private java.lang.String remIp;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_rem_passwd", nullable = true, unique = false)
	private java.lang.String remPasswd;
	
	/**
	 * @generated
	 */
	@Column(name = "pat_rem_user", nullable = true, unique = false)
	private java.lang.String remUser;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public PatrimonyRemote(){
	}

	
	/**
	 * Obtém patrimony
	 * @param patrimony patrimony
	 * return patrimony
	 * @generated
	 */
	public Patrimony getPatrimony(){
		return this.patrimony;
	}
	
	/**
	 * Define patrimony
	 * @param patrimony patrimony
	 * @generated
	 */
	public PatrimonyRemote setPatrimony(Patrimony patrimony){
		this.patrimony = patrimony;
		return this;
	}
	
	/**
	 * Obtém remDescription
	 * @param remDescription remDescription
	 * return remDescription
	 * @generated
	 */
	public java.lang.String getRemDescription(){
		return this.remDescription;
	}
	
	/**
	 * Define remDescription
	 * @param remDescription remDescription
	 * @generated
	 */
	public PatrimonyRemote setRemDescription(java.lang.String remDescription){
		this.remDescription = remDescription;
		return this;
	}
	
	/**
	 * Obtém remId
	 * @param remId remId
	 * return remId
	 * @generated
	 */
	public java.lang.String getRemId(){
		return this.remId;
	}
	
	/**
	 * Define remId
	 * @param remId remId
	 * @generated
	 */
	public PatrimonyRemote setRemId(java.lang.String remId){
		this.remId = remId;
		return this;
	}
	
	/**
	 * Obtém remIp
	 * @param remIp remIp
	 * return remIp
	 * @generated
	 */
	public java.lang.String getRemIp(){
		return this.remIp;
	}
	
	/**
	 * Define remIp
	 * @param remIp remIp
	 * @generated
	 */
	public PatrimonyRemote setRemIp(java.lang.String remIp){
		this.remIp = remIp;
		return this;
	}
	
	/**
	 * Obtém remPasswd
	 * @param remPasswd remPasswd
	 * return remPasswd
	 * @generated
	 */
	public java.lang.String getRemPasswd(){
		return this.remPasswd;
	}
	
	/**
	 * Define remPasswd
	 * @param remPasswd remPasswd
	 * @generated
	 */
	public PatrimonyRemote setRemPasswd(java.lang.String remPasswd){
		this.remPasswd = remPasswd;
		return this;
	}
	
	/**
	 * Obtém remUser
	 * @param remUser remUser
	 * return remUser
	 * @generated
	 */
	public java.lang.String getRemUser(){
		return this.remUser;
	}
	
	/**
	 * Define remUser
	 * @param remUser remUser
	 * @generated
	 */
	public PatrimonyRemote setRemUser(java.lang.String remUser){
		this.remUser = remUser;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((remId == null) ? 0 : remId.hashCode());

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
	    
	    if(!(obj instanceof PatrimonyRemote))
	      return false;
	    
	    PatrimonyRemote other = (PatrimonyRemote)obj;
	    
		if(this.remId == null && other.remId != null)
	    	return false;
	    else if(!this.remId.equals(other.remId))
	     	return false;
	

	    return true;
	    
	}
}
