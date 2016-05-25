package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_CAMPAIGN
 * @generated
 */
@Entity
@Table(name = "\"SYS_CAMPAIGN\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Campaign implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -75272934l;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_audience", nullable = true, unique = false)
	private boolean audience;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="BLO_ID", referencedColumnName = "BLO_ID")
	private CampaignBlock campaignBlock;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAT_ID", referencedColumnName = "CAT_ID")
	private CampaignCategory campaignCategory;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cam_creation_date", nullable = true, unique = false)
	private Date creationDate;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cam_creation_time", nullable = true, unique = false)
	private Date creationTime;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_global", nullable = true, unique = false)
	private boolean global;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_hour_intervals", nullable = true, unique = false)
	private java.lang.String hourIntervals;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "cam_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "cam_insert_day", nullable = true, unique = false)
	private java.lang.Integer insertDay;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_insert_hour", nullable = true, unique = false)
	private java.lang.Integer insertHour;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_insert_month", nullable = true, unique = false)
	private java.lang.Integer insertMonth;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_insert_total", nullable = true, unique = false)
	private java.lang.Integer insertTotal;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_log", nullable = true, unique = false)
	private boolean log;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="MOD_ID", referencedColumnName = "MOD_ID")
	private Module module;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_month_days", nullable = true, unique = false)
	private java.lang.String monthDays;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_preview_img", nullable = true, unique = false)
	private java.lang.String previewImg;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_price", nullable = true, unique = false)
	private java.lang.Double price;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cam_val_date_end", nullable = true, unique = false)
	private Date valDateEnd;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cam_val_date_start", nullable = true, unique = false)
	private Date valDateStart;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_val_fri", nullable = true, unique = false)
	private boolean valFri;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_val_mon", nullable = true, unique = false)
	private boolean valMon;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_val_sat", nullable = true, unique = false)
	private boolean valSat;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_val_sun", nullable = true, unique = false)
	private boolean valSun;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_val_thu", nullable = true, unique = false)
	private boolean valThu;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_val_tue", nullable = true, unique = false)
	private boolean valTue;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_val_wed", nullable = true, unique = false)
	private boolean valWed;
	
	/**
	 * @generated
	 */
	@Column(name = "cam_validate", nullable = true, unique = false)
	private boolean validate;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Campaign(){
	}

	
	/**
	 * Obtém audience
	 * @param audience audience
	 * return audience
	 * @generated
	 */
	public boolean getAudience(){
		return this.audience;
	}
	
	/**
	 * Define audience
	 * @param audience audience
	 * @generated
	 */
	public Campaign setAudience(boolean audience){
		this.audience = audience;
		return this;
	}
	
	/**
	 * Obtém campaignBlock
	 * @param campaignBlock campaignBlock
	 * return campaignBlock
	 * @generated
	 */
	public CampaignBlock getCampaignBlock(){
		return this.campaignBlock;
	}
	
	/**
	 * Define campaignBlock
	 * @param campaignBlock campaignBlock
	 * @generated
	 */
	public Campaign setCampaignBlock(CampaignBlock campaignBlock){
		this.campaignBlock = campaignBlock;
		return this;
	}
	
	/**
	 * Obtém campaignCategory
	 * @param campaignCategory campaignCategory
	 * return campaignCategory
	 * @generated
	 */
	public CampaignCategory getCampaignCategory(){
		return this.campaignCategory;
	}
	
	/**
	 * Define campaignCategory
	 * @param campaignCategory campaignCategory
	 * @generated
	 */
	public Campaign setCampaignCategory(CampaignCategory campaignCategory){
		this.campaignCategory = campaignCategory;
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
	public Campaign setCompany(Company company){
		this.company = company;
		return this;
	}
	
	/**
	 * Obtém creationDate
	 * @param creationDate creationDate
	 * return creationDate
	 * @generated
	 */
	public Date getCreationDate(){
		return this.creationDate;
	}
	
	/**
	 * Define creationDate
	 * @param creationDate creationDate
	 * @generated
	 */
	public Campaign setCreationDate(Date creationDate){
		this.creationDate = creationDate;
		return this;
	}
	
	/**
	 * Obtém creationTime
	 * @param creationTime creationTime
	 * return creationTime
	 * @generated
	 */
	public Date getCreationTime(){
		return this.creationTime;
	}
	
	/**
	 * Define creationTime
	 * @param creationTime creationTime
	 * @generated
	 */
	public Campaign setCreationTime(Date creationTime){
		this.creationTime = creationTime;
		return this;
	}
	
	/**
	 * Obtém global
	 * @param global global
	 * return global
	 * @generated
	 */
	public boolean getGlobal(){
		return this.global;
	}
	
	/**
	 * Define global
	 * @param global global
	 * @generated
	 */
	public Campaign setGlobal(boolean global){
		this.global = global;
		return this;
	}
	
	/**
	 * Obtém hourIntervals
	 * @param hourIntervals hourIntervals
	 * return hourIntervals
	 * @generated
	 */
	public java.lang.String getHourIntervals(){
		return this.hourIntervals;
	}
	
	/**
	 * Define hourIntervals
	 * @param hourIntervals hourIntervals
	 * @generated
	 */
	public Campaign setHourIntervals(java.lang.String hourIntervals){
		this.hourIntervals = hourIntervals;
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
	public Campaign setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém insertDay
	 * @param insertDay insertDay
	 * return insertDay
	 * @generated
	 */
	public java.lang.Integer getInsertDay(){
		return this.insertDay;
	}
	
	/**
	 * Define insertDay
	 * @param insertDay insertDay
	 * @generated
	 */
	public Campaign setInsertDay(java.lang.Integer insertDay){
		this.insertDay = insertDay;
		return this;
	}
	
	/**
	 * Obtém insertHour
	 * @param insertHour insertHour
	 * return insertHour
	 * @generated
	 */
	public java.lang.Integer getInsertHour(){
		return this.insertHour;
	}
	
	/**
	 * Define insertHour
	 * @param insertHour insertHour
	 * @generated
	 */
	public Campaign setInsertHour(java.lang.Integer insertHour){
		this.insertHour = insertHour;
		return this;
	}
	
	/**
	 * Obtém insertMonth
	 * @param insertMonth insertMonth
	 * return insertMonth
	 * @generated
	 */
	public java.lang.Integer getInsertMonth(){
		return this.insertMonth;
	}
	
	/**
	 * Define insertMonth
	 * @param insertMonth insertMonth
	 * @generated
	 */
	public Campaign setInsertMonth(java.lang.Integer insertMonth){
		this.insertMonth = insertMonth;
		return this;
	}
	
	/**
	 * Obtém insertTotal
	 * @param insertTotal insertTotal
	 * return insertTotal
	 * @generated
	 */
	public java.lang.Integer getInsertTotal(){
		return this.insertTotal;
	}
	
	/**
	 * Define insertTotal
	 * @param insertTotal insertTotal
	 * @generated
	 */
	public Campaign setInsertTotal(java.lang.Integer insertTotal){
		this.insertTotal = insertTotal;
		return this;
	}
	
	/**
	 * Obtém log
	 * @param log log
	 * return log
	 * @generated
	 */
	public boolean getLog(){
		return this.log;
	}
	
	/**
	 * Define log
	 * @param log log
	 * @generated
	 */
	public Campaign setLog(boolean log){
		this.log = log;
		return this;
	}
	
	/**
	 * Obtém module
	 * @param module module
	 * return module
	 * @generated
	 */
	public Module getModule(){
		return this.module;
	}
	
	/**
	 * Define module
	 * @param module module
	 * @generated
	 */
	public Campaign setModule(Module module){
		this.module = module;
		return this;
	}
	
	/**
	 * Obtém monthDays
	 * @param monthDays monthDays
	 * return monthDays
	 * @generated
	 */
	public java.lang.String getMonthDays(){
		return this.monthDays;
	}
	
	/**
	 * Define monthDays
	 * @param monthDays monthDays
	 * @generated
	 */
	public Campaign setMonthDays(java.lang.String monthDays){
		this.monthDays = monthDays;
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
	public Campaign setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém previewImg
	 * @param previewImg previewImg
	 * return previewImg
	 * @generated
	 */
	public java.lang.String getPreviewImg(){
		return this.previewImg;
	}
	
	/**
	 * Define previewImg
	 * @param previewImg previewImg
	 * @generated
	 */
	public Campaign setPreviewImg(java.lang.String previewImg){
		this.previewImg = previewImg;
		return this;
	}
	
	/**
	 * Obtém price
	 * @param price price
	 * return price
	 * @generated
	 */
	public java.lang.Double getPrice(){
		return this.price;
	}
	
	/**
	 * Define price
	 * @param price price
	 * @generated
	 */
	public Campaign setPrice(java.lang.Double price){
		this.price = price;
		return this;
	}
	
	/**
	 * Obtém valDateEnd
	 * @param valDateEnd valDateEnd
	 * return valDateEnd
	 * @generated
	 */
	public Date getValDateEnd(){
		return this.valDateEnd;
	}
	
	/**
	 * Define valDateEnd
	 * @param valDateEnd valDateEnd
	 * @generated
	 */
	public Campaign setValDateEnd(Date valDateEnd){
		this.valDateEnd = valDateEnd;
		return this;
	}
	
	/**
	 * Obtém valDateStart
	 * @param valDateStart valDateStart
	 * return valDateStart
	 * @generated
	 */
	public Date getValDateStart(){
		return this.valDateStart;
	}
	
	/**
	 * Define valDateStart
	 * @param valDateStart valDateStart
	 * @generated
	 */
	public Campaign setValDateStart(Date valDateStart){
		this.valDateStart = valDateStart;
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
	public Campaign setValFri(boolean valFri){
		this.valFri = valFri;
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
	public Campaign setValMon(boolean valMon){
		this.valMon = valMon;
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
	public Campaign setValSat(boolean valSat){
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
	public Campaign setValSun(boolean valSun){
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
	public Campaign setValThu(boolean valThu){
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
	public Campaign setValTue(boolean valTue){
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
	public Campaign setValWed(boolean valWed){
		this.valWed = valWed;
		return this;
	}
	
	/**
	 * Obtém validate
	 * @param validate validate
	 * return validate
	 * @generated
	 */
	public boolean getValidate(){
		return this.validate;
	}
	
	/**
	 * Define validate
	 * @param validate validate
	 * @generated
	 */
	public Campaign setValidate(boolean validate){
		this.validate = validate;
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
	    
	    if(!(obj instanceof Campaign))
	      return false;
	    
	    Campaign other = (Campaign)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
