package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_PERSON
 * @generated
 */
@Entity
@Table(name = "\"SYS_PERSON\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Person implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1907847322l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="ADD_ID", referencedColumnName = "ADD_ID")
	private Address address;
	
	/**
	 * @generated
	 */
	@Column(name = "pes_cnpj", nullable = true, unique = false)
	private java.lang.String cnpj;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Column(name = "pes_cpf", nullable = true, unique = false)
	private java.lang.String cpf;
	
	/**
	 * @generated
	 */
	@Column(name = "pes_email", nullable = false, unique = false)
	private java.lang.String email;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "pes_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "pes_login", nullable = false, unique = false)
	private java.lang.String login;
	
	/**
	 * @generated
	 */
	@Column(name = "pes_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "pes_password", nullable = false, unique = false)
	private java.lang.String password;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Person(){
	}

	
	/**
	 * Obtém address
	 * @param address address
	 * return address
	 * @generated
	 */
	public Address getAddress(){
		return this.address;
	}
	
	/**
	 * Define address
	 * @param address address
	 * @generated
	 */
	public Person setAddress(Address address){
		this.address = address;
		return this;
	}
	
	/**
	 * Obtém cnpj
	 * @param cnpj cnpj
	 * return cnpj
	 * @generated
	 */
	public java.lang.String getCnpj(){
		return this.cnpj;
	}
	
	/**
	 * Define cnpj
	 * @param cnpj cnpj
	 * @generated
	 */
	public Person setCnpj(java.lang.String cnpj){
		this.cnpj = cnpj;
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
	public Person setCompany(Company company){
		this.company = company;
		return this;
	}
	
	/**
	 * Obtém cpf
	 * @param cpf cpf
	 * return cpf
	 * @generated
	 */
	public java.lang.String getCpf(){
		return this.cpf;
	}
	
	/**
	 * Define cpf
	 * @param cpf cpf
	 * @generated
	 */
	public Person setCpf(java.lang.String cpf){
		this.cpf = cpf;
		return this;
	}
	
	/**
	 * Obtém email
	 * @param email email
	 * return email
	 * @generated
	 */
	public java.lang.String getEmail(){
		return this.email;
	}
	
	/**
	 * Define email
	 * @param email email
	 * @generated
	 */
	public Person setEmail(java.lang.String email){
		this.email = email;
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
	public Person setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém login
	 * @param login login
	 * return login
	 * @generated
	 */
	public java.lang.String getLogin(){
		return this.login;
	}
	
	/**
	 * Define login
	 * @param login login
	 * @generated
	 */
	public Person setLogin(java.lang.String login){
		this.login = login;
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
	public Person setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém password
	 * @param password password
	 * return password
	 * @generated
	 */
	public java.lang.String getPassword(){
		return this.password;
	}
	
	/**
	 * Define password
	 * @param password password
	 * @generated
	 */
	public Person setPassword(java.lang.String password){
		this.password = password;
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
	    
	    if(!(obj instanceof Person))
	      return false;
	    
	    Person other = (Person)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
