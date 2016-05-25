package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_USER
 * @generated
 */
@Entity
@Table(name = "\"SYS_USER\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "USR_LAST_COMPANY", contextProperty = "multitenancy.tenant-id")
public class NeonewsUser implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1534626487l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="ADD_ID", referencedColumnName = "ADD_ID")
	private Address address;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_change_pass", nullable = true, unique = false)
	private java.lang.String changePass;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="USR_LAST_COMPANY", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_email", nullable = true, unique = false)
	private java.lang.String email;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_enable_sga_light", nullable = true, unique = false)
	private boolean enableSgaLight;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_enable_sga_trial", nullable = true, unique = false)
	private boolean enableSgaTrial;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_global_admin", nullable = true, unique = false)
	private boolean globalAdmin;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "usr_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "usr_key_active", nullable = true, unique = false)
	private java.lang.String keyActive;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_login", nullable = false, unique = false)
	private java.lang.String login;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_password", nullable = false, unique = false)
	private java.lang.String password;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_product_choice", nullable = true, unique = false)
	private java.lang.String productChoice;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_select_company", nullable = true, unique = false)
	private boolean selectCompany;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="FR_USR_CODIGO", referencedColumnName = "USR_CODIGO")
	private Usuario usuario;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public NeonewsUser(){
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
	public NeonewsUser setAddress(Address address){
		this.address = address;
		return this;
	}
	
	/**
	 * Obtém changePass
	 * @param changePass changePass
	 * return changePass
	 * @generated
	 */
	public java.lang.String getChangePass(){
		return this.changePass;
	}
	
	/**
	 * Define changePass
	 * @param changePass changePass
	 * @generated
	 */
	public NeonewsUser setChangePass(java.lang.String changePass){
		this.changePass = changePass;
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
	public NeonewsUser setCompany(Company company){
		this.company = company;
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
	public NeonewsUser setEmail(java.lang.String email){
		this.email = email;
		return this;
	}
	
	/**
	 * Obtém enableSgaLight
	 * @param enableSgaLight enableSgaLight
	 * return enableSgaLight
	 * @generated
	 */
	public boolean getEnableSgaLight(){
		return this.enableSgaLight;
	}
	
	/**
	 * Define enableSgaLight
	 * @param enableSgaLight enableSgaLight
	 * @generated
	 */
	public NeonewsUser setEnableSgaLight(boolean enableSgaLight){
		this.enableSgaLight = enableSgaLight;
		return this;
	}
	
	/**
	 * Obtém enableSgaTrial
	 * @param enableSgaTrial enableSgaTrial
	 * return enableSgaTrial
	 * @generated
	 */
	public boolean getEnableSgaTrial(){
		return this.enableSgaTrial;
	}
	
	/**
	 * Define enableSgaTrial
	 * @param enableSgaTrial enableSgaTrial
	 * @generated
	 */
	public NeonewsUser setEnableSgaTrial(boolean enableSgaTrial){
		this.enableSgaTrial = enableSgaTrial;
		return this;
	}
	
	/**
	 * Obtém globalAdmin
	 * @param globalAdmin globalAdmin
	 * return globalAdmin
	 * @generated
	 */
	public boolean getGlobalAdmin(){
		return this.globalAdmin;
	}
	
	/**
	 * Define globalAdmin
	 * @param globalAdmin globalAdmin
	 * @generated
	 */
	public NeonewsUser setGlobalAdmin(boolean globalAdmin){
		this.globalAdmin = globalAdmin;
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
	public NeonewsUser setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém keyActive
	 * @param keyActive keyActive
	 * return keyActive
	 * @generated
	 */
	public java.lang.String getKeyActive(){
		return this.keyActive;
	}
	
	/**
	 * Define keyActive
	 * @param keyActive keyActive
	 * @generated
	 */
	public NeonewsUser setKeyActive(java.lang.String keyActive){
		this.keyActive = keyActive;
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
	public NeonewsUser setLogin(java.lang.String login){
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
	public NeonewsUser setName(java.lang.String name){
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
	public NeonewsUser setPassword(java.lang.String password){
		this.password = password;
		return this;
	}
	
	/**
	 * Obtém productChoice
	 * @param productChoice productChoice
	 * return productChoice
	 * @generated
	 */
	public java.lang.String getProductChoice(){
		return this.productChoice;
	}
	
	/**
	 * Define productChoice
	 * @param productChoice productChoice
	 * @generated
	 */
	public NeonewsUser setProductChoice(java.lang.String productChoice){
		this.productChoice = productChoice;
		return this;
	}
	
	/**
	 * Obtém selectCompany
	 * @param selectCompany selectCompany
	 * return selectCompany
	 * @generated
	 */
	public boolean getSelectCompany(){
		return this.selectCompany;
	}
	
	/**
	 * Define selectCompany
	 * @param selectCompany selectCompany
	 * @generated
	 */
	public NeonewsUser setSelectCompany(boolean selectCompany){
		this.selectCompany = selectCompany;
		return this;
	}
	
	/**
	 * Obtém usuario
	 * @param usuario usuario
	 * return usuario
	 * @generated
	 */
	public Usuario getUsuario(){
		return this.usuario;
	}
	
	/**
	 * Define usuario
	 * @param usuario usuario
	 * @generated
	 */
	public NeonewsUser setUsuario(Usuario usuario){
		this.usuario = usuario;
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
	    
	    if(!(obj instanceof NeonewsUser))
	      return false;
	    
	    NeonewsUser other = (NeonewsUser)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
