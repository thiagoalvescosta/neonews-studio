package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CMS_CHANNEL_PERSON
 * @generated
 */
@Entity
@Table(name = "\"CMS_CHANNEL_PERSON\""


)
@XmlRootElement
public class ChannelPerson implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 2136223268l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CHN_ID", referencedColumnName = "CHN_ID")
	private Channel channel;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PES_ID", referencedColumnName = "PES_ID")
	private Person person;
	
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
	public ChannelPerson(){
	}

	
	/**
	 * Obtém channel
	 * @param channel channel
	 * return channel
	 * @generated
	 */
	public Channel getChannel(){
		return this.channel;
	}
	
	/**
	 * Define channel
	 * @param channel channel
	 * @generated
	 */
	public ChannelPerson setChannel(Channel channel){
		this.channel = channel;
		return this;
	}
	
	/**
	 * Obtém person
	 * @param person person
	 * return person
	 * @generated
	 */
	public Person getPerson(){
		return this.person;
	}
	
	/**
	 * Define person
	 * @param person person
	 * @generated
	 */
	public ChannelPerson setPerson(Person person){
		this.person = person;
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
	public ChannelPerson setId(java.lang.String id){
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
	    
	    if(!(obj instanceof ChannelPerson))
	      return false;
	    
	    ChannelPerson other = (ChannelPerson)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
