package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela CMS_CONTENT
 * @generated
 */
@Entity
@Table(name = "\"CMS_CONTENT\""


)
@XmlRootElement
public class Content implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1678781387l;
	
	/**
	 * @generated
	 */
	@Column(name = "con_active", nullable = true, unique = false)
	private boolean active;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CHN_ID", referencedColumnName = "CHN_ID")
	private Channel channel;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "con_date", nullable = false, unique = false)
	private Date date;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "con_date_end", nullable = true, unique = false)
	private Date dateEnd;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "con_date_start", nullable = true, unique = false)
	private Date dateStart;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "con_date_update", nullable = true, unique = false)
	private Date dateUpdate;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="FIL_ID", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "con_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "con_last_user", nullable = true, unique = false)
	private java.lang.String lastUser;
	
	/**
	 * @generated
	 */
	@Column(name = "con_repeat", nullable = true, unique = false)
	private short repeat;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TPL_ID", referencedColumnName = "TPL_ID")
	private Template template;
	
	/**
	 * @generated
	 */
	@Column(name = "con_text", nullable = true, unique = false)
	private java.lang.String text;
	
	/**
	 * @generated
	 */
	@Column(name = "con_title", nullable = false, unique = false)
	private java.lang.String title;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_fri", nullable = true, unique = false)
	private boolean valFri;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_hour_interval", nullable = true, unique = false)
	private java.lang.String valHourInterval;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_mon", nullable = true, unique = false)
	private boolean valMon;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_month_days", nullable = true, unique = false)
	private java.lang.String valMonthDays;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_sat", nullable = true, unique = false)
	private boolean valSat;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_sun", nullable = true, unique = false)
	private boolean valSun;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_thu", nullable = true, unique = false)
	private boolean valThu;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_tue", nullable = true, unique = false)
	private boolean valTue;
	
	/**
	 * @generated
	 */
	@Column(name = "con_val_wed", nullable = true, unique = false)
	private boolean valWed;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Content(){
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
	public Content setActive(boolean active){
		this.active = active;
		return this;
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
	public Content setChannel(Channel channel){
		this.channel = channel;
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
	public Content setDate(Date date){
		this.date = date;
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
	public Content setDateEnd(Date dateEnd){
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
	public Content setDateStart(Date dateStart){
		this.dateStart = dateStart;
		return this;
	}
	
	/**
	 * Obtém dateUpdate
	 * @param dateUpdate dateUpdate
	 * return dateUpdate
	 * @generated
	 */
	public Date getDateUpdate(){
		return this.dateUpdate;
	}
	
	/**
	 * Define dateUpdate
	 * @param dateUpdate dateUpdate
	 * @generated
	 */
	public Content setDateUpdate(Date dateUpdate){
		this.dateUpdate = dateUpdate;
		return this;
	}
	
	/**
	 * Obtém file
	 * @param file file
	 * return file
	 * @generated
	 */
	public File getFile(){
		return this.file;
	}
	
	/**
	 * Define file
	 * @param file file
	 * @generated
	 */
	public Content setFile(File file){
		this.file = file;
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
	public Content setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém lastUser
	 * @param lastUser lastUser
	 * return lastUser
	 * @generated
	 */
	public java.lang.String getLastUser(){
		return this.lastUser;
	}
	
	/**
	 * Define lastUser
	 * @param lastUser lastUser
	 * @generated
	 */
	public Content setLastUser(java.lang.String lastUser){
		this.lastUser = lastUser;
		return this;
	}
	
	/**
	 * Obtém repeat
	 * @param repeat repeat
	 * return repeat
	 * @generated
	 */
	public short getRepeat(){
		return this.repeat;
	}
	
	/**
	 * Define repeat
	 * @param repeat repeat
	 * @generated
	 */
	public Content setRepeat(short repeat){
		this.repeat = repeat;
		return this;
	}
	
	/**
	 * Obtém template
	 * @param template template
	 * return template
	 * @generated
	 */
	public Template getTemplate(){
		return this.template;
	}
	
	/**
	 * Define template
	 * @param template template
	 * @generated
	 */
	public Content setTemplate(Template template){
		this.template = template;
		return this;
	}
	
	/**
	 * Obtém text
	 * @param text text
	 * return text
	 * @generated
	 */
	public java.lang.String getText(){
		return this.text;
	}
	
	/**
	 * Define text
	 * @param text text
	 * @generated
	 */
	public Content setText(java.lang.String text){
		this.text = text;
		return this;
	}
	
	/**
	 * Obtém title
	 * @param title title
	 * return title
	 * @generated
	 */
	public java.lang.String getTitle(){
		return this.title;
	}
	
	/**
	 * Define title
	 * @param title title
	 * @generated
	 */
	public Content setTitle(java.lang.String title){
		this.title = title;
		return this;
	}
	
	/**
	 * Obtém valFri
	 * @param valFri valFri
	 * return valFri
	 * @generated
	 */
	public boolean getValFri(){
		return this.valFri;
	}
	
	/**
	 * Define valFri
	 * @param valFri valFri
	 * @generated
	 */
	public Content setValFri(boolean valFri){
		this.valFri = valFri;
		return this;
	}
	
	/**
	 * Obtém valHourInterval
	 * @param valHourInterval valHourInterval
	 * return valHourInterval
	 * @generated
	 */
	public java.lang.String getValHourInterval(){
		return this.valHourInterval;
	}
	
	/**
	 * Define valHourInterval
	 * @param valHourInterval valHourInterval
	 * @generated
	 */
	public Content setValHourInterval(java.lang.String valHourInterval){
		this.valHourInterval = valHourInterval;
		return this;
	}
	
	/**
	 * Obtém valMon
	 * @param valMon valMon
	 * return valMon
	 * @generated
	 */
	public boolean getValMon(){
		return this.valMon;
	}
	
	/**
	 * Define valMon
	 * @param valMon valMon
	 * @generated
	 */
	public Content setValMon(boolean valMon){
		this.valMon = valMon;
		return this;
	}
	
	/**
	 * Obtém valMonthDays
	 * @param valMonthDays valMonthDays
	 * return valMonthDays
	 * @generated
	 */
	public java.lang.String getValMonthDays(){
		return this.valMonthDays;
	}
	
	/**
	 * Define valMonthDays
	 * @param valMonthDays valMonthDays
	 * @generated
	 */
	public Content setValMonthDays(java.lang.String valMonthDays){
		this.valMonthDays = valMonthDays;
		return this;
	}
	
	/**
	 * Obtém valSat
	 * @param valSat valSat
	 * return valSat
	 * @generated
	 */
	public boolean getValSat(){
		return this.valSat;
	}
	
	/**
	 * Define valSat
	 * @param valSat valSat
	 * @generated
	 */
	public Content setValSat(boolean valSat){
		this.valSat = valSat;
		return this;
	}
	
	/**
	 * Obtém valSun
	 * @param valSun valSun
	 * return valSun
	 * @generated
	 */
	public boolean getValSun(){
		return this.valSun;
	}
	
	/**
	 * Define valSun
	 * @param valSun valSun
	 * @generated
	 */
	public Content setValSun(boolean valSun){
		this.valSun = valSun;
		return this;
	}
	
	/**
	 * Obtém valThu
	 * @param valThu valThu
	 * return valThu
	 * @generated
	 */
	public boolean getValThu(){
		return this.valThu;
	}
	
	/**
	 * Define valThu
	 * @param valThu valThu
	 * @generated
	 */
	public Content setValThu(boolean valThu){
		this.valThu = valThu;
		return this;
	}
	
	/**
	 * Obtém valTue
	 * @param valTue valTue
	 * return valTue
	 * @generated
	 */
	public boolean getValTue(){
		return this.valTue;
	}
	
	/**
	 * Define valTue
	 * @param valTue valTue
	 * @generated
	 */
	public Content setValTue(boolean valTue){
		this.valTue = valTue;
		return this;
	}
	
	/**
	 * Obtém valWed
	 * @param valWed valWed
	 * return valWed
	 * @generated
	 */
	public boolean getValWed(){
		return this.valWed;
	}
	
	/**
	 * Define valWed
	 * @param valWed valWed
	 * @generated
	 */
	public Content setValWed(boolean valWed){
		this.valWed = valWed;
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
	    
	    if(!(obj instanceof Content))
	      return false;
	    
	    Content other = (Content)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
