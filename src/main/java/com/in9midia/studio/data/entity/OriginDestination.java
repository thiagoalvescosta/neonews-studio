package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_ORIGIN_DESTINATION
 * @generated
 */
@Entity
@Table(name = "\"SYS_ORIGIN_DESTINATION\""


)
@XmlRootElement
public class OriginDestination implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1121824990l;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_boarding_place", nullable = true, unique = false)
	private java.lang.String boardingPlace;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ode_boarding_time", nullable = true, unique = false)
	private Date boardingTime;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CTY_ID_D", referencedColumnName = "CTY_ID")
	private City city;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CTY_ID_O", referencedColumnName = "CTY_ID")
	private City city2;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CON_ID", referencedColumnName = "CON_ID")
	private Content content;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_days_valid", nullable = true, unique = false)
	private java.lang.String daysValid;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_friday", nullable = true, unique = false)
	private boolean friday;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "ode_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "ode_identification", nullable = true, unique = false)
	private java.lang.String identification;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_message", nullable = true, unique = false)
	private java.lang.String message;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_monday", nullable = true, unique = false)
	private boolean monday;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PAR_ID_V", referencedColumnName = "PAR_ID")
	private Participant participant;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PAR_ID_P", referencedColumnName = "PAR_ID")
	private Participant participant2;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_saturday", nullable = true, unique = false)
	private boolean saturday;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_state", nullable = true, unique = false)
	private boolean state;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_sunday", nullable = true, unique = false)
	private boolean sunday;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_thursday", nullable = true, unique = false)
	private boolean thursday;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_tuesday", nullable = true, unique = false)
	private boolean tuesday;
	
	/**
	 * @generated
	 */
	@Column(name = "ode_wednesday", nullable = true, unique = false)
	private boolean wednesday;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public OriginDestination(){
	}

	
	/**
	 * Obtém boardingPlace
	 * @param boardingPlace boardingPlace
	 * return boardingPlace
	 * @generated
	 */
	public java.lang.String getBoardingPlace(){
		return this.boardingPlace;
	}
	
	/**
	 * Define boardingPlace
	 * @param boardingPlace boardingPlace
	 * @generated
	 */
	public OriginDestination setBoardingPlace(java.lang.String boardingPlace){
		this.boardingPlace = boardingPlace;
		return this;
	}
	
	/**
	 * Obtém boardingTime
	 * @param boardingTime boardingTime
	 * return boardingTime
	 * @generated
	 */
	public Date getBoardingTime(){
		return this.boardingTime;
	}
	
	/**
	 * Define boardingTime
	 * @param boardingTime boardingTime
	 * @generated
	 */
	public OriginDestination setBoardingTime(Date boardingTime){
		this.boardingTime = boardingTime;
		return this;
	}
	
	/**
	 * Obtém city
	 * @param city city
	 * return city
	 * @generated
	 */
	public City getCity(){
		return this.city;
	}
	
	/**
	 * Define city
	 * @param city city
	 * @generated
	 */
	public OriginDestination setCity(City city){
		this.city = city;
		return this;
	}
	
	/**
	 * Obtém city2
	 * @param city2 city2
	 * return city2
	 * @generated
	 */
	public City getCity2(){
		return this.city2;
	}
	
	/**
	 * Define city2
	 * @param city2 city2
	 * @generated
	 */
	public OriginDestination setCity2(City city2){
		this.city2 = city2;
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
	public OriginDestination setContent(Content content){
		this.content = content;
		return this;
	}
	
	/**
	 * Obtém daysValid
	 * @param daysValid daysValid
	 * return daysValid
	 * @generated
	 */
	public java.lang.String getDaysValid(){
		return this.daysValid;
	}
	
	/**
	 * Define daysValid
	 * @param daysValid daysValid
	 * @generated
	 */
	public OriginDestination setDaysValid(java.lang.String daysValid){
		this.daysValid = daysValid;
		return this;
	}
	
	/**
	 * Obtém friday
	 * @param friday friday
	 * return friday
	 * @generated
	 */
	public boolean getFriday(){
		return this.friday;
	}
	
	/**
	 * Define friday
	 * @param friday friday
	 * @generated
	 */
	public OriginDestination setFriday(boolean friday){
		this.friday = friday;
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
	public OriginDestination setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém identification
	 * @param identification identification
	 * return identification
	 * @generated
	 */
	public java.lang.String getIdentification(){
		return this.identification;
	}
	
	/**
	 * Define identification
	 * @param identification identification
	 * @generated
	 */
	public OriginDestination setIdentification(java.lang.String identification){
		this.identification = identification;
		return this;
	}
	
	/**
	 * Obtém message
	 * @param message message
	 * return message
	 * @generated
	 */
	public java.lang.String getMessage(){
		return this.message;
	}
	
	/**
	 * Define message
	 * @param message message
	 * @generated
	 */
	public OriginDestination setMessage(java.lang.String message){
		this.message = message;
		return this;
	}
	
	/**
	 * Obtém monday
	 * @param monday monday
	 * return monday
	 * @generated
	 */
	public boolean getMonday(){
		return this.monday;
	}
	
	/**
	 * Define monday
	 * @param monday monday
	 * @generated
	 */
	public OriginDestination setMonday(boolean monday){
		this.monday = monday;
		return this;
	}
	
	/**
	 * Obtém participant
	 * @param participant participant
	 * return participant
	 * @generated
	 */
	public Participant getParticipant(){
		return this.participant;
	}
	
	/**
	 * Define participant
	 * @param participant participant
	 * @generated
	 */
	public OriginDestination setParticipant(Participant participant){
		this.participant = participant;
		return this;
	}
	
	/**
	 * Obtém participant2
	 * @param participant2 participant2
	 * return participant2
	 * @generated
	 */
	public Participant getParticipant2(){
		return this.participant2;
	}
	
	/**
	 * Define participant2
	 * @param participant2 participant2
	 * @generated
	 */
	public OriginDestination setParticipant2(Participant participant2){
		this.participant2 = participant2;
		return this;
	}
	
	/**
	 * Obtém saturday
	 * @param saturday saturday
	 * return saturday
	 * @generated
	 */
	public boolean getSaturday(){
		return this.saturday;
	}
	
	/**
	 * Define saturday
	 * @param saturday saturday
	 * @generated
	 */
	public OriginDestination setSaturday(boolean saturday){
		this.saturday = saturday;
		return this;
	}
	
	/**
	 * Obtém state
	 * @param state state
	 * return state
	 * @generated
	 */
	public boolean getState(){
		return this.state;
	}
	
	/**
	 * Define state
	 * @param state state
	 * @generated
	 */
	public OriginDestination setState(boolean state){
		this.state = state;
		return this;
	}
	
	/**
	 * Obtém sunday
	 * @param sunday sunday
	 * return sunday
	 * @generated
	 */
	public boolean getSunday(){
		return this.sunday;
	}
	
	/**
	 * Define sunday
	 * @param sunday sunday
	 * @generated
	 */
	public OriginDestination setSunday(boolean sunday){
		this.sunday = sunday;
		return this;
	}
	
	/**
	 * Obtém thursday
	 * @param thursday thursday
	 * return thursday
	 * @generated
	 */
	public boolean getThursday(){
		return this.thursday;
	}
	
	/**
	 * Define thursday
	 * @param thursday thursday
	 * @generated
	 */
	public OriginDestination setThursday(boolean thursday){
		this.thursday = thursday;
		return this;
	}
	
	/**
	 * Obtém tuesday
	 * @param tuesday tuesday
	 * return tuesday
	 * @generated
	 */
	public boolean getTuesday(){
		return this.tuesday;
	}
	
	/**
	 * Define tuesday
	 * @param tuesday tuesday
	 * @generated
	 */
	public OriginDestination setTuesday(boolean tuesday){
		this.tuesday = tuesday;
		return this;
	}
	
	/**
	 * Obtém wednesday
	 * @param wednesday wednesday
	 * return wednesday
	 * @generated
	 */
	public boolean getWednesday(){
		return this.wednesday;
	}
	
	/**
	 * Define wednesday
	 * @param wednesday wednesday
	 * @generated
	 */
	public OriginDestination setWednesday(boolean wednesday){
		this.wednesday = wednesday;
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
	    
	    if(!(obj instanceof OriginDestination))
	      return false;
	    
	    OriginDestination other = (OriginDestination)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
