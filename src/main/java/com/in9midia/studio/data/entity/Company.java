package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela SYS_COMPANY
 * @generated
 */
@Entity
@Table(name = "\"SYS_COMPANY\""


)
@XmlRootElement
public class Company implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1679827954l;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_active", nullable = true, unique = false)
	private boolean active;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="ADD_ID", referencedColumnName = "ADD_ID")
	private Address address;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_con_type", nullable = true, unique = false)
	private java.lang.String conType;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cpy_confirm_sync", nullable = true, unique = false)
	private Date confirmSync;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_cpf_cnpj", nullable = true, unique = false)
	private java.lang.String cpfCnpj;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cpy_date_create", nullable = true, unique = false)
	private Date dateCreate;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_ddd", nullable = true, unique = false)
	private java.lang.String ddd;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_email", nullable = true, unique = false)
	private java.lang.String email;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_LOGO", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_file_quota", nullable = true, unique = false)
	private java.lang.Integer fileQuota;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_https_download", nullable = true, unique = false)
	private boolean httpsDownload;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "cpy_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_id_financeiro", nullable = true, unique = false)
	private java.lang.Integer idFinanceiro;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_ip_type", nullable = true, unique = false)
	private java.lang.String ipType;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cpy_last_update", nullable = true, unique = false)
	private Date lastUpdate;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_monitoring_off", nullable = true, unique = false)
	private boolean monitoringOff;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_news", nullable = true, unique = false)
	private boolean news;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_notification", nullable = true, unique = false)
	private boolean notification;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_preview_img", nullable = true, unique = false)
	private java.lang.String previewImg;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_responsible", nullable = false, unique = false)
	private java.lang.String responsible;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_show_debt", nullable = true, unique = false)
	private boolean showDebt;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_show_news", nullable = true, unique = false)
	private boolean showNews;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_site", nullable = true, unique = false)
	private java.lang.String site;
	
	/**
	 * @generated
	 */
	@Column(name = "tcp_id", nullable = true, unique = false)
	private java.lang.String tcpId;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_telephone", nullable = true, unique = false)
	private java.lang.String telephone;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_time_minute_off", nullable = true, unique = false)
	private java.lang.Integer timeMinuteOff;
	
	/**
	 * @generated
	 */
	@Column(name = "cpy_user_web", nullable = true, unique = false)
	private java.lang.String userWeb;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Company(){
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
	public Company setActive(boolean active){
		this.active = active;
		return this;
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
	public Company setAddress(Address address){
		this.address = address;
		return this;
	}
	
	/**
	 * Obtém conType
	 * @param conType conType
	 * return conType
	 * @generated
	 */
	public java.lang.String getConType(){
		return this.conType;
	}
	
	/**
	 * Define conType
	 * @param conType conType
	 * @generated
	 */
	public Company setConType(java.lang.String conType){
		this.conType = conType;
		return this;
	}
	
	/**
	 * Obtém confirmSync
	 * @param confirmSync confirmSync
	 * return confirmSync
	 * @generated
	 */
	public Date getConfirmSync(){
		return this.confirmSync;
	}
	
	/**
	 * Define confirmSync
	 * @param confirmSync confirmSync
	 * @generated
	 */
	public Company setConfirmSync(Date confirmSync){
		this.confirmSync = confirmSync;
		return this;
	}
	
	/**
	 * Obtém cpfCnpj
	 * @param cpfCnpj cpfCnpj
	 * return cpfCnpj
	 * @generated
	 */
	public java.lang.String getCpfCnpj(){
		return this.cpfCnpj;
	}
	
	/**
	 * Define cpfCnpj
	 * @param cpfCnpj cpfCnpj
	 * @generated
	 */
	public Company setCpfCnpj(java.lang.String cpfCnpj){
		this.cpfCnpj = cpfCnpj;
		return this;
	}
	
	/**
	 * Obtém dateCreate
	 * @param dateCreate dateCreate
	 * return dateCreate
	 * @generated
	 */
	public Date getDateCreate(){
		return this.dateCreate;
	}
	
	/**
	 * Define dateCreate
	 * @param dateCreate dateCreate
	 * @generated
	 */
	public Company setDateCreate(Date dateCreate){
		this.dateCreate = dateCreate;
		return this;
	}
	
	/**
	 * Obtém ddd
	 * @param ddd ddd
	 * return ddd
	 * @generated
	 */
	public java.lang.String getDdd(){
		return this.ddd;
	}
	
	/**
	 * Define ddd
	 * @param ddd ddd
	 * @generated
	 */
	public Company setDdd(java.lang.String ddd){
		this.ddd = ddd;
		return this;
	}
	
	/**
	 * Obtém description
	 * @param description description
	 * return description
	 * @generated
	 */
	public java.lang.String getDescription(){
		return this.description;
	}
	
	/**
	 * Define description
	 * @param description description
	 * @generated
	 */
	public Company setDescription(java.lang.String description){
		this.description = description;
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
	public Company setEmail(java.lang.String email){
		this.email = email;
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
	public Company setFile(File file){
		this.file = file;
		return this;
	}
	
	/**
	 * Obtém fileQuota
	 * @param fileQuota fileQuota
	 * return fileQuota
	 * @generated
	 */
	public java.lang.Integer getFileQuota(){
		return this.fileQuota;
	}
	
	/**
	 * Define fileQuota
	 * @param fileQuota fileQuota
	 * @generated
	 */
	public Company setFileQuota(java.lang.Integer fileQuota){
		this.fileQuota = fileQuota;
		return this;
	}
	
	/**
	 * Obtém httpsDownload
	 * @param httpsDownload httpsDownload
	 * return httpsDownload
	 * @generated
	 */
	public boolean getHttpsDownload(){
		return this.httpsDownload;
	}
	
	/**
	 * Define httpsDownload
	 * @param httpsDownload httpsDownload
	 * @generated
	 */
	public Company setHttpsDownload(boolean httpsDownload){
		this.httpsDownload = httpsDownload;
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
	public Company setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém idFinanceiro
	 * @param idFinanceiro idFinanceiro
	 * return idFinanceiro
	 * @generated
	 */
	public java.lang.Integer getIdFinanceiro(){
		return this.idFinanceiro;
	}
	
	/**
	 * Define idFinanceiro
	 * @param idFinanceiro idFinanceiro
	 * @generated
	 */
	public Company setIdFinanceiro(java.lang.Integer idFinanceiro){
		this.idFinanceiro = idFinanceiro;
		return this;
	}
	
	/**
	 * Obtém ipType
	 * @param ipType ipType
	 * return ipType
	 * @generated
	 */
	public java.lang.String getIpType(){
		return this.ipType;
	}
	
	/**
	 * Define ipType
	 * @param ipType ipType
	 * @generated
	 */
	public Company setIpType(java.lang.String ipType){
		this.ipType = ipType;
		return this;
	}
	
	/**
	 * Obtém lastUpdate
	 * @param lastUpdate lastUpdate
	 * return lastUpdate
	 * @generated
	 */
	public Date getLastUpdate(){
		return this.lastUpdate;
	}
	
	/**
	 * Define lastUpdate
	 * @param lastUpdate lastUpdate
	 * @generated
	 */
	public Company setLastUpdate(Date lastUpdate){
		this.lastUpdate = lastUpdate;
		return this;
	}
	
	/**
	 * Obtém monitoringOff
	 * @param monitoringOff monitoringOff
	 * return monitoringOff
	 * @generated
	 */
	public boolean getMonitoringOff(){
		return this.monitoringOff;
	}
	
	/**
	 * Define monitoringOff
	 * @param monitoringOff monitoringOff
	 * @generated
	 */
	public Company setMonitoringOff(boolean monitoringOff){
		this.monitoringOff = monitoringOff;
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
	public Company setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém news
	 * @param news news
	 * return news
	 * @generated
	 */
	public boolean getNews(){
		return this.news;
	}
	
	/**
	 * Define news
	 * @param news news
	 * @generated
	 */
	public Company setNews(boolean news){
		this.news = news;
		return this;
	}
	
	/**
	 * Obtém notification
	 * @param notification notification
	 * return notification
	 * @generated
	 */
	public boolean getNotification(){
		return this.notification;
	}
	
	/**
	 * Define notification
	 * @param notification notification
	 * @generated
	 */
	public Company setNotification(boolean notification){
		this.notification = notification;
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
	public Company setPreviewImg(java.lang.String previewImg){
		this.previewImg = previewImg;
		return this;
	}
	
	/**
	 * Obtém responsible
	 * @param responsible responsible
	 * return responsible
	 * @generated
	 */
	public java.lang.String getResponsible(){
		return this.responsible;
	}
	
	/**
	 * Define responsible
	 * @param responsible responsible
	 * @generated
	 */
	public Company setResponsible(java.lang.String responsible){
		this.responsible = responsible;
		return this;
	}
	
	/**
	 * Obtém showDebt
	 * @param showDebt showDebt
	 * return showDebt
	 * @generated
	 */
	public boolean getShowDebt(){
		return this.showDebt;
	}
	
	/**
	 * Define showDebt
	 * @param showDebt showDebt
	 * @generated
	 */
	public Company setShowDebt(boolean showDebt){
		this.showDebt = showDebt;
		return this;
	}
	
	/**
	 * Obtém showNews
	 * @param showNews showNews
	 * return showNews
	 * @generated
	 */
	public boolean getShowNews(){
		return this.showNews;
	}
	
	/**
	 * Define showNews
	 * @param showNews showNews
	 * @generated
	 */
	public Company setShowNews(boolean showNews){
		this.showNews = showNews;
		return this;
	}
	
	/**
	 * Obtém site
	 * @param site site
	 * return site
	 * @generated
	 */
	public java.lang.String getSite(){
		return this.site;
	}
	
	/**
	 * Define site
	 * @param site site
	 * @generated
	 */
	public Company setSite(java.lang.String site){
		this.site = site;
		return this;
	}
	
	/**
	 * Obtém tcpId
	 * @param tcpId tcpId
	 * return tcpId
	 * @generated
	 */
	public java.lang.String getTcpId(){
		return this.tcpId;
	}
	
	/**
	 * Define tcpId
	 * @param tcpId tcpId
	 * @generated
	 */
	public Company setTcpId(java.lang.String tcpId){
		this.tcpId = tcpId;
		return this;
	}
	
	/**
	 * Obtém telephone
	 * @param telephone telephone
	 * return telephone
	 * @generated
	 */
	public java.lang.String getTelephone(){
		return this.telephone;
	}
	
	/**
	 * Define telephone
	 * @param telephone telephone
	 * @generated
	 */
	public Company setTelephone(java.lang.String telephone){
		this.telephone = telephone;
		return this;
	}
	
	/**
	 * Obtém timeMinuteOff
	 * @param timeMinuteOff timeMinuteOff
	 * return timeMinuteOff
	 * @generated
	 */
	public java.lang.Integer getTimeMinuteOff(){
		return this.timeMinuteOff;
	}
	
	/**
	 * Define timeMinuteOff
	 * @param timeMinuteOff timeMinuteOff
	 * @generated
	 */
	public Company setTimeMinuteOff(java.lang.Integer timeMinuteOff){
		this.timeMinuteOff = timeMinuteOff;
		return this;
	}
	
	/**
	 * Obtém userWeb
	 * @param userWeb userWeb
	 * return userWeb
	 * @generated
	 */
	public java.lang.String getUserWeb(){
		return this.userWeb;
	}
	
	/**
	 * Define userWeb
	 * @param userWeb userWeb
	 * @generated
	 */
	public Company setUserWeb(java.lang.String userWeb){
		this.userWeb = userWeb;
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
	    
	    if(!(obj instanceof Company))
	      return false;
	    
	    Company other = (Company)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
