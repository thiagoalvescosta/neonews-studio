package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_CAMPAIGN_LOG
 * @generated
 */
@Entity
@Table(name = "\"SYS_CAMPAIGN_LOG\""


)
@XmlRootElement
public class CampaignLog implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -543326278l;
	
	/**
	 * @generated
	 */
	@Column(name = "log_audience", nullable = true, unique = false)
	private java.lang.Integer audience;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAM_ID", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "log_date_end", nullable = true, unique = false)
	private Date dateEnd;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "log_date_start", nullable = false, unique = false)
	private Date dateStart;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "log_id")
	private java.lang.Long id;
	
	/**
	 * @generated
	 */
	@Column(name = "log_monitor", nullable = true, unique = false)
	private java.lang.Integer monitor;
	
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
	public CampaignLog(){
	}

	
	/**
	 * Obtém audience
	 * @param audience audience
	 * return audience
	 * @generated
	 */
	public java.lang.Integer getAudience(){
		return this.audience;
	}
	
	/**
	 * Define audience
	 * @param audience audience
	 * @generated
	 */
	public CampaignLog setAudience(java.lang.Integer audience){
		this.audience = audience;
		return this;
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
	public CampaignLog setCampaign(Campaign campaign){
		this.campaign = campaign;
		return this;
	}
	
	/**
	 * Obtém dateEnd
	 * @param dateEnd dateEnd
	 * return dateEnd
	 * @generated
	 */
	public Date getDateEnd(){
		return this.dateEnd;
	}
	
	/**
	 * Define dateEnd
	 * @param dateEnd dateEnd
	 * @generated
	 */
	public CampaignLog setDateEnd(Date dateEnd){
		this.dateEnd = dateEnd;
		return this;
	}
	
	/**
	 * Obtém dateStart
	 * @param dateStart dateStart
	 * return dateStart
	 * @generated
	 */
	public Date getDateStart(){
		return this.dateStart;
	}
	
	/**
	 * Define dateStart
	 * @param dateStart dateStart
	 * @generated
	 */
	public CampaignLog setDateStart(Date dateStart){
		this.dateStart = dateStart;
		return this;
	}
	
	/**
	 * Obtém id
	 * @param id id
	 * return id
	 * @generated
	 */
	public java.lang.Long getId(){
		return this.id;
	}
	
	/**
	 * Define id
	 * @param id id
	 * @generated
	 */
	public CampaignLog setId(java.lang.Long id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém monitor
	 * @param monitor monitor
	 * return monitor
	 * @generated
	 */
	public java.lang.Integer getMonitor(){
		return this.monitor;
	}
	
	/**
	 * Define monitor
	 * @param monitor monitor
	 * @generated
	 */
	public CampaignLog setMonitor(java.lang.Integer monitor){
		this.monitor = monitor;
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
	public CampaignLog setTerminal(Terminal terminal){
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
	    
	    if(!(obj instanceof CampaignLog))
	      return false;
	    
	    CampaignLog other = (CampaignLog)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
