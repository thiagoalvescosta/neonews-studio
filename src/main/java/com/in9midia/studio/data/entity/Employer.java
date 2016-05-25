package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_EMPLOYER
 * @generated
 */
@Entity
@Table(name = "\"SYS_EMPLOYER\""


)
@XmlRootElement
public class Employer implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1258115784l;
	
	/**
	 * @generated
	 */
	@Column(name = "emp_active", nullable = true, unique = false)
	private boolean active;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "emp_card")
	private java.lang.String card;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "emp_date", nullable = true, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Column(name = "emp_department", nullable = true, unique = false)
	private java.lang.String department;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_id", nullable = false, unique = false)
	private java.lang.String comapny;
	
	/**
	 * @generated
	 */
	@Column(name = "emp_mail", nullable = true, unique = false)
	private java.lang.String mail;
	
	/**
	 * @generated
	 */
	@Column(name = "emp_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "emp_phone", nullable = true, unique = false)
	private java.lang.String phone;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Employer(){
	}

	
	/**
	 * Obtém active
	 * @param active active
	 * return active
	 * @generated
	 */
	public boolean getActive(){
		return this.active;
	}
	
	/**
	 * Define active
	 * @param active active
	 * @generated
	 */
	public Employer setActive(boolean active){
		this.active = active;
		return this;
	}
	
	/**
	 * Obtém card
	 * @param card card
	 * return card
	 * @generated
	 */
	public java.lang.String getCard(){
		return this.card;
	}
	
	/**
	 * Define card
	 * @param card card
	 * @generated
	 */
	public Employer setCard(java.lang.String card){
		this.card = card;
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
	public Employer setDate(Date date){
		this.date = date;
		return this;
	}
	
	/**
	 * Obtém department
	 * @param department department
	 * return department
	 * @generated
	 */
	public java.lang.String getDepartment(){
		return this.department;
	}
	
	/**
	 * Define department
	 * @param department department
	 * @generated
	 */
	public Employer setDepartment(java.lang.String department){
		this.department = department;
		return this;
	}
	
	/**
	 * Obtém comapny
	 * @param comapny comapny
	 * return comapny
	 * @generated
	 */
	public java.lang.String getComapny(){
		return this.comapny;
	}
	
	/**
	 * Define comapny
	 * @param comapny comapny
	 * @generated
	 */
	public Employer setComapny(java.lang.String comapny){
		this.comapny = comapny;
		return this;
	}
	
	/**
	 * Obtém mail
	 * @param mail mail
	 * return mail
	 * @generated
	 */
	public java.lang.String getMail(){
		return this.mail;
	}
	
	/**
	 * Define mail
	 * @param mail mail
	 * @generated
	 */
	public Employer setMail(java.lang.String mail){
		this.mail = mail;
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
	public Employer setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém phone
	 * @param phone phone
	 * return phone
	 * @generated
	 */
	public java.lang.String getPhone(){
		return this.phone;
	}
	
	/**
	 * Define phone
	 * @param phone phone
	 * @generated
	 */
	public Employer setPhone(java.lang.String phone){
		this.phone = phone;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((card == null) ? 0 : card.hashCode());

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
	    
	    if(!(obj instanceof Employer))
	      return false;
	    
	    Employer other = (Employer)obj;
	    
		if(this.card == null && other.card != null)
	    	return false;
	    else if(!this.card.equals(other.card))
	     	return false;
	

	    return true;
	    
	}
}
