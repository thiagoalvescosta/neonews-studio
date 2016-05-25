package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_USER_COMPANY
 * @generated
 */
@Entity
@Table(name = "\"SYS_USER_COMPANY\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class UserCompany implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1978479082l;
	
	/**
	 * @generated
	 */
	@Column(name = "usc_admin", nullable = true, unique = false)
	private boolean admin;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="USR_ID", referencedColumnName = "USR_ID")
	private NeonewsUser user;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public UserCompany(){
	}

	
	/**
	 * Obtém admin
	 * @param admin admin
	 * return admin
	 * @generated
	 */
	public boolean getAdmin(){
		return this.admin;
	}
	
	/**
	 * Define admin
	 * @param admin admin
	 * @generated
	 */
	public UserCompany setAdmin(boolean admin){
		this.admin = admin;
		return this;
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
	public UserCompany setCompany(Company company){
		this.company = company;
		return this;
	}
	
	/**
	 * Obtém user
	 * @param user user
	 * return user
	 * @generated
	 */
	public NeonewsUser getUser(){
		return this.user;
	}
	
	/**
	 * Define user
	 * @param user user
	 * @generated
	 */
	public UserCompany setUser(NeonewsUser user){
		this.user = user;
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
	public UserCompany setId(java.lang.String id){
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
	    
	    if(!(obj instanceof UserCompany))
	      return false;
	    
	    UserCompany other = (UserCompany)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
