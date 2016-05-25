package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_REPORT_CAMPAIGN_SCHEDULE
 * @generated
 */
@Entity
@Table(name = "\"SYS_REPORT_CAMPAIGN_SCHEDULE\""


)
@XmlRootElement
public class ReportCampaignSchedule implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 405818698l;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAM_ID", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_id", nullable = true, unique = false)
	private java.lang.String cpyId;
	
	/**
	 * @generated
	 */
	@Column(name = "rcs_day_month", nullable = true, unique = false)
	private java.lang.Integer dayMonth;
	
	/**
	 * @generated
	 */
	@Column(name = "rcs_emails", nullable = false, unique = false)
	private java.lang.String emails;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "rcs_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "rcs_interval", nullable = true, unique = false)
	private java.lang.Integer interval;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TRM_ID", referencedColumnName = "TRM_ID")
	private Terminal terminal;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public ReportCampaignSchedule(){
	}

	
	/**
	 * Obtém campaign
	 * @param campaign campaign
	 * return campaign
	 * @generated
	 */
	public Campaign getCampaign(){
		return this.campaign;
	}
	
	/**
	 * Define campaign
	 * @param campaign campaign
	 * @generated
	 */
	public ReportCampaignSchedule setCampaign(Campaign campaign){
		this.campaign = campaign;
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
	public ReportCampaignSchedule setCpyId(java.lang.String cpyId){
		this.cpyId = cpyId;
		return this;
	}
	
	/**
	 * Obtém dayMonth
	 * @param dayMonth dayMonth
	 * return dayMonth
	 * @generated
	 */
	public java.lang.Integer getDayMonth(){
		return this.dayMonth;
	}
	
	/**
	 * Define dayMonth
	 * @param dayMonth dayMonth
	 * @generated
	 */
	public ReportCampaignSchedule setDayMonth(java.lang.Integer dayMonth){
		this.dayMonth = dayMonth;
		return this;
	}
	
	/**
	 * Obtém emails
	 * @param emails emails
	 * return emails
	 * @generated
	 */
	public java.lang.String getEmails(){
		return this.emails;
	}
	
	/**
	 * Define emails
	 * @param emails emails
	 * @generated
	 */
	public ReportCampaignSchedule setEmails(java.lang.String emails){
		this.emails = emails;
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
	public ReportCampaignSchedule setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém interval
	 * @param interval interval
	 * return interval
	 * @generated
	 */
	public java.lang.Integer getInterval(){
		return this.interval;
	}
	
	/**
	 * Define interval
	 * @param interval interval
	 * @generated
	 */
	public ReportCampaignSchedule setInterval(java.lang.Integer interval){
		this.interval = interval;
		return this;
	}
	
	/**
	 * Obtém terminal
	 * @param terminal terminal
	 * return terminal
	 * @generated
	 */
	public Terminal getTerminal(){
		return this.terminal;
	}
	
	/**
	 * Define terminal
	 * @param terminal terminal
	 * @generated
	 */
	public ReportCampaignSchedule setTerminal(Terminal terminal){
		this.terminal = terminal;
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
	    
	    if(!(obj instanceof ReportCampaignSchedule))
	      return false;
	    
	    ReportCampaignSchedule other = (ReportCampaignSchedule)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
