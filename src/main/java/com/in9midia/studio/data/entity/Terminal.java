package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_TERMINAL
 * @generated
 */
@Entity
@Table(name = "\"SYS_TERMINAL\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Terminal implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1116602734l;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_activation_code", nullable = true, unique = false)
	private java.lang.String activationCode;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_active", nullable = true, unique = false)
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
	@ManyToOne
	@JoinColumn(name="TRM_CURRENT_CAMPAIGN", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TRM_CURRENT_BLOCK", referencedColumnName = "BLO_ID")
	private CampaignBlock campaignBlock;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAT_ID", referencedColumnName = "CAT_ID")
	private Category category;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_cell_number", nullable = true, unique = false)
	private java.lang.String cellNumber;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_communication_key", nullable = false, unique = false)
	private java.lang.String communicationKey;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_con_type", nullable = true, unique = false)
	private java.lang.String conType;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_content_md5", nullable = true, unique = false)
	private java.lang.String contentMd5;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_cpu_load", nullable = true, unique = false)
	private java.lang.Integer cpuLoad;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trm_creation_date", nullable = true, unique = false)
	private Date creationDate;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_description", nullable = true, unique = false)
	private java.lang.String description;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trm_expiration", nullable = true, unique = false)
	private Date expiration;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_host", nullable = true, unique = false)
	private java.lang.String host;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "trm_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trm_implantation", nullable = true, unique = false)
	private Date implantation;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trm_last_seen", nullable = true, unique = false)
	private Date lastSeen;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_latitude", nullable = true, unique = false)
	private java.lang.String latitude;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_log_tracking", nullable = true, unique = false)
	private boolean logTracking;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_logmein_link", nullable = true, unique = false)
	private java.lang.String logmeinLink;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_longitude", nullable = true, unique = false)
	private java.lang.String longitude;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_markers", nullable = true, unique = false)
	private java.lang.String markers;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_memory_load", nullable = true, unique = false)
	private java.lang.Integer memoryLoad;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_monitor_count", nullable = true, unique = false)
	private java.lang.Integer monitorCount;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_monitor_status", nullable = true, unique = false)
	private java.lang.Integer monitorStatus;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_notes", nullable = true, unique = false)
	private java.lang.String notes;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_notification", nullable = true, unique = false)
	private boolean notification;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_notified_off", nullable = true, unique = false)
	private boolean notifiedOff;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_notified_on", nullable = true, unique = false)
	private boolean notifiedOn;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_orientation", nullable = true, unique = false)
	private java.lang.Double orientation;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_os_name", nullable = true, unique = false)
	private java.lang.String osName;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_os_version", nullable = true, unique = false)
	private java.lang.String osVersion;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PES_ID", referencedColumnName = "PES_ID")
	private Person person;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PFL_ID", referencedColumnName = "PFL_ID")
	private Profile profile;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_route", nullable = true, unique = false)
	private java.lang.String route;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SCH_ID", referencedColumnName = "SCH_ID")
	private Schedule schedule;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SCH_ROTATION_ID", referencedColumnName = "SCH_ID")
	private Schedule schedule2;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_screen_height", nullable = true, unique = false)
	private java.lang.Integer screenHeight;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_screen_width", nullable = true, unique = false)
	private java.lang.Integer screenWidth;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SGA_ID", referencedColumnName = "SGA_ID")
	private Sga sga;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SFW_ID", referencedColumnName = "SFW_ID")
	private Software software;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_speed", nullable = true, unique = false)
	private java.lang.Double speed;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trm_startup_time", nullable = true, unique = false)
	private Date startupTime;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_status", nullable = false, unique = false)
	private java.lang.String status;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_stops", nullable = true, unique = false)
	private java.lang.String stops;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trm_sw_last_update", nullable = true, unique = false)
	private Date swLastUpdate;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_sw_version", nullable = true, unique = false)
	private java.lang.String swVersion;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_sw_version_code", nullable = true, unique = false)
	private java.lang.Double swVersionCode;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_synchronization_flag", nullable = true, unique = false)
	private boolean synchronizationFlag;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_terminal_status", nullable = true, unique = false)
	private java.lang.Integer terminalStatus;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TYPE_ID", referencedColumnName = "TYPE_ID")
	private TerminalType terminalType;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_time_minute_off", nullable = true, unique = false)
	private java.lang.Integer timeMinuteOff;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_total_space", nullable = true, unique = false)
	private java.lang.Long totalSpace;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_track_cont", nullable = true, unique = false)
	private java.lang.Integer trackCont;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_track_last_com_sent", nullable = true, unique = false)
	private java.lang.String trackLastComSent;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="TVT_ID", referencedColumnName = "TVT_ID")
	private TvType tvType;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trm_update", nullable = true, unique = false)
	private Date update;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_update_time", nullable = true, unique = false)
	private java.lang.String updateTime;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_used_space", nullable = true, unique = false)
	private java.lang.Long usedSpace;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_user_active", nullable = true, unique = false)
	private boolean userActive;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_validate_activation_code", nullable = true, unique = false)
	private boolean validateActivationCode;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_video_high_quality", nullable = true, unique = false)
	private boolean videoHighQuality;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_webcam_active", nullable = true, unique = false)
	private boolean webcamActive;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_webcam_bandwidth", nullable = true, unique = false)
	private java.lang.Integer webcamBandwidth;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_webcam_server", nullable = true, unique = false)
	private java.lang.String webcamServer;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Terminal(){
	}

	
	/**
	 * Obtém activationCode
	 * @param activationCode activationCode
	 * return activationCode
	 * @generated
	 */
	public java.lang.String getActivationCode(){
		return this.activationCode;
	}
	
	/**
	 * Define activationCode
	 * @param activationCode activationCode
	 * @generated
	 */
	public Terminal setActivationCode(java.lang.String activationCode){
		this.activationCode = activationCode;
		return this;
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
	public Terminal setActive(boolean active){
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
	public Terminal setAddress(Address address){
		this.address = address;
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
	public Terminal setCampaign(Campaign campaign){
		this.campaign = campaign;
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
	public Terminal setCampaignBlock(CampaignBlock campaignBlock){
		this.campaignBlock = campaignBlock;
		return this;
	}
	
	/**
	 * Obtém category
	 * @param category category
	 * return category
	 * @generated
	 */
	public Category getCategory(){
		return this.category;
	}
	
	/**
	 * Define category
	 * @param category category
	 * @generated
	 */
	public Terminal setCategory(Category category){
		this.category = category;
		return this;
	}
	
	/**
	 * Obtém cellNumber
	 * @param cellNumber cellNumber
	 * return cellNumber
	 * @generated
	 */
	public java.lang.String getCellNumber(){
		return this.cellNumber;
	}
	
	/**
	 * Define cellNumber
	 * @param cellNumber cellNumber
	 * @generated
	 */
	public Terminal setCellNumber(java.lang.String cellNumber){
		this.cellNumber = cellNumber;
		return this;
	}
	
	/**
	 * Obtém communicationKey
	 * @param communicationKey communicationKey
	 * return communicationKey
	 * @generated
	 */
	public java.lang.String getCommunicationKey(){
		return this.communicationKey;
	}
	
	/**
	 * Define communicationKey
	 * @param communicationKey communicationKey
	 * @generated
	 */
	public Terminal setCommunicationKey(java.lang.String communicationKey){
		this.communicationKey = communicationKey;
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
	public Terminal setCompany(Company company){
		this.company = company;
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
	public Terminal setConType(java.lang.String conType){
		this.conType = conType;
		return this;
	}
	
	/**
	 * Obtém contentMd5
	 * @param contentMd5 contentMd5
	 * return contentMd5
	 * @generated
	 */
	public java.lang.String getContentMd5(){
		return this.contentMd5;
	}
	
	/**
	 * Define contentMd5
	 * @param contentMd5 contentMd5
	 * @generated
	 */
	public Terminal setContentMd5(java.lang.String contentMd5){
		this.contentMd5 = contentMd5;
		return this;
	}
	
	/**
	 * Obtém cpuLoad
	 * @param cpuLoad cpuLoad
	 * return cpuLoad
	 * @generated
	 */
	public java.lang.Integer getCpuLoad(){
		return this.cpuLoad;
	}
	
	/**
	 * Define cpuLoad
	 * @param cpuLoad cpuLoad
	 * @generated
	 */
	public Terminal setCpuLoad(java.lang.Integer cpuLoad){
		this.cpuLoad = cpuLoad;
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
	public Terminal setCreationDate(Date creationDate){
		this.creationDate = creationDate;
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
	public Terminal setDescription(java.lang.String description){
		this.description = description;
		return this;
	}
	
	/**
	 * Obtém expiration
	 * @param expiration expiration
	 * return expiration
	 * @generated
	 */
	public Date getExpiration(){
		return this.expiration;
	}
	
	/**
	 * Define expiration
	 * @param expiration expiration
	 * @generated
	 */
	public Terminal setExpiration(Date expiration){
		this.expiration = expiration;
		return this;
	}
	
	/**
	 * Obtém host
	 * @param host host
	 * return host
	 * @generated
	 */
	public java.lang.String getHost(){
		return this.host;
	}
	
	/**
	 * Define host
	 * @param host host
	 * @generated
	 */
	public Terminal setHost(java.lang.String host){
		this.host = host;
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
	public Terminal setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém implantation
	 * @param implantation implantation
	 * return implantation
	 * @generated
	 */
	public Date getImplantation(){
		return this.implantation;
	}
	
	/**
	 * Define implantation
	 * @param implantation implantation
	 * @generated
	 */
	public Terminal setImplantation(Date implantation){
		this.implantation = implantation;
		return this;
	}
	
	/**
	 * Obtém lastSeen
	 * @param lastSeen lastSeen
	 * return lastSeen
	 * @generated
	 */
	public Date getLastSeen(){
		return this.lastSeen;
	}
	
	/**
	 * Define lastSeen
	 * @param lastSeen lastSeen
	 * @generated
	 */
	public Terminal setLastSeen(Date lastSeen){
		this.lastSeen = lastSeen;
		return this;
	}
	
	/**
	 * Obtém latitude
	 * @param latitude latitude
	 * return latitude
	 * @generated
	 */
	public java.lang.String getLatitude(){
		return this.latitude;
	}
	
	/**
	 * Define latitude
	 * @param latitude latitude
	 * @generated
	 */
	public Terminal setLatitude(java.lang.String latitude){
		this.latitude = latitude;
		return this;
	}
	
	/**
	 * Obtém logTracking
	 * @param logTracking logTracking
	 * return logTracking
	 * @generated
	 */
	public boolean getLogTracking(){
		return this.logTracking;
	}
	
	/**
	 * Define logTracking
	 * @param logTracking logTracking
	 * @generated
	 */
	public Terminal setLogTracking(boolean logTracking){
		this.logTracking = logTracking;
		return this;
	}
	
	/**
	 * Obtém logmeinLink
	 * @param logmeinLink logmeinLink
	 * return logmeinLink
	 * @generated
	 */
	public java.lang.String getLogmeinLink(){
		return this.logmeinLink;
	}
	
	/**
	 * Define logmeinLink
	 * @param logmeinLink logmeinLink
	 * @generated
	 */
	public Terminal setLogmeinLink(java.lang.String logmeinLink){
		this.logmeinLink = logmeinLink;
		return this;
	}
	
	/**
	 * Obtém longitude
	 * @param longitude longitude
	 * return longitude
	 * @generated
	 */
	public java.lang.String getLongitude(){
		return this.longitude;
	}
	
	/**
	 * Define longitude
	 * @param longitude longitude
	 * @generated
	 */
	public Terminal setLongitude(java.lang.String longitude){
		this.longitude = longitude;
		return this;
	}
	
	/**
	 * Obtém markers
	 * @param markers markers
	 * return markers
	 * @generated
	 */
	public java.lang.String getMarkers(){
		return this.markers;
	}
	
	/**
	 * Define markers
	 * @param markers markers
	 * @generated
	 */
	public Terminal setMarkers(java.lang.String markers){
		this.markers = markers;
		return this;
	}
	
	/**
	 * Obtém memoryLoad
	 * @param memoryLoad memoryLoad
	 * return memoryLoad
	 * @generated
	 */
	public java.lang.Integer getMemoryLoad(){
		return this.memoryLoad;
	}
	
	/**
	 * Define memoryLoad
	 * @param memoryLoad memoryLoad
	 * @generated
	 */
	public Terminal setMemoryLoad(java.lang.Integer memoryLoad){
		this.memoryLoad = memoryLoad;
		return this;
	}
	
	/**
	 * Obtém monitorCount
	 * @param monitorCount monitorCount
	 * return monitorCount
	 * @generated
	 */
	public java.lang.Integer getMonitorCount(){
		return this.monitorCount;
	}
	
	/**
	 * Define monitorCount
	 * @param monitorCount monitorCount
	 * @generated
	 */
	public Terminal setMonitorCount(java.lang.Integer monitorCount){
		this.monitorCount = monitorCount;
		return this;
	}
	
	/**
	 * Obtém monitorStatus
	 * @param monitorStatus monitorStatus
	 * return monitorStatus
	 * @generated
	 */
	public java.lang.Integer getMonitorStatus(){
		return this.monitorStatus;
	}
	
	/**
	 * Define monitorStatus
	 * @param monitorStatus monitorStatus
	 * @generated
	 */
	public Terminal setMonitorStatus(java.lang.Integer monitorStatus){
		this.monitorStatus = monitorStatus;
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
	public Terminal setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém notes
	 * @param notes notes
	 * return notes
	 * @generated
	 */
	public java.lang.String getNotes(){
		return this.notes;
	}
	
	/**
	 * Define notes
	 * @param notes notes
	 * @generated
	 */
	public Terminal setNotes(java.lang.String notes){
		this.notes = notes;
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
	public Terminal setNotification(boolean notification){
		this.notification = notification;
		return this;
	}
	
	/**
	 * Obtém notifiedOff
	 * @param notifiedOff notifiedOff
	 * return notifiedOff
	 * @generated
	 */
	public boolean getNotifiedOff(){
		return this.notifiedOff;
	}
	
	/**
	 * Define notifiedOff
	 * @param notifiedOff notifiedOff
	 * @generated
	 */
	public Terminal setNotifiedOff(boolean notifiedOff){
		this.notifiedOff = notifiedOff;
		return this;
	}
	
	/**
	 * Obtém notifiedOn
	 * @param notifiedOn notifiedOn
	 * return notifiedOn
	 * @generated
	 */
	public boolean getNotifiedOn(){
		return this.notifiedOn;
	}
	
	/**
	 * Define notifiedOn
	 * @param notifiedOn notifiedOn
	 * @generated
	 */
	public Terminal setNotifiedOn(boolean notifiedOn){
		this.notifiedOn = notifiedOn;
		return this;
	}
	
	/**
	 * Obtém orientation
	 * @param orientation orientation
	 * return orientation
	 * @generated
	 */
	public java.lang.Double getOrientation(){
		return this.orientation;
	}
	
	/**
	 * Define orientation
	 * @param orientation orientation
	 * @generated
	 */
	public Terminal setOrientation(java.lang.Double orientation){
		this.orientation = orientation;
		return this;
	}
	
	/**
	 * Obtém osName
	 * @param osName osName
	 * return osName
	 * @generated
	 */
	public java.lang.String getOsName(){
		return this.osName;
	}
	
	/**
	 * Define osName
	 * @param osName osName
	 * @generated
	 */
	public Terminal setOsName(java.lang.String osName){
		this.osName = osName;
		return this;
	}
	
	/**
	 * Obtém osVersion
	 * @param osVersion osVersion
	 * return osVersion
	 * @generated
	 */
	public java.lang.String getOsVersion(){
		return this.osVersion;
	}
	
	/**
	 * Define osVersion
	 * @param osVersion osVersion
	 * @generated
	 */
	public Terminal setOsVersion(java.lang.String osVersion){
		this.osVersion = osVersion;
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
	public Terminal setPerson(Person person){
		this.person = person;
		return this;
	}
	
	/**
	 * Obtém profile
	 * @param profile profile
	 * return profile
	 * @generated
	 */
	public Profile getProfile(){
		return this.profile;
	}
	
	/**
	 * Define profile
	 * @param profile profile
	 * @generated
	 */
	public Terminal setProfile(Profile profile){
		this.profile = profile;
		return this;
	}
	
	/**
	 * Obtém route
	 * @param route route
	 * return route
	 * @generated
	 */
	public java.lang.String getRoute(){
		return this.route;
	}
	
	/**
	 * Define route
	 * @param route route
	 * @generated
	 */
	public Terminal setRoute(java.lang.String route){
		this.route = route;
		return this;
	}
	
	/**
	 * Obtém schedule
	 * @param schedule schedule
	 * return schedule
	 * @generated
	 */
	public Schedule getSchedule(){
		return this.schedule;
	}
	
	/**
	 * Define schedule
	 * @param schedule schedule
	 * @generated
	 */
	public Terminal setSchedule(Schedule schedule){
		this.schedule = schedule;
		return this;
	}
	
	/**
	 * Obtém schedule2
	 * @param schedule2 schedule2
	 * return schedule2
	 * @generated
	 */
	public Schedule getSchedule2(){
		return this.schedule2;
	}
	
	/**
	 * Define schedule2
	 * @param schedule2 schedule2
	 * @generated
	 */
	public Terminal setSchedule2(Schedule schedule2){
		this.schedule2 = schedule2;
		return this;
	}
	
	/**
	 * Obtém screenHeight
	 * @param screenHeight screenHeight
	 * return screenHeight
	 * @generated
	 */
	public java.lang.Integer getScreenHeight(){
		return this.screenHeight;
	}
	
	/**
	 * Define screenHeight
	 * @param screenHeight screenHeight
	 * @generated
	 */
	public Terminal setScreenHeight(java.lang.Integer screenHeight){
		this.screenHeight = screenHeight;
		return this;
	}
	
	/**
	 * Obtém screenWidth
	 * @param screenWidth screenWidth
	 * return screenWidth
	 * @generated
	 */
	public java.lang.Integer getScreenWidth(){
		return this.screenWidth;
	}
	
	/**
	 * Define screenWidth
	 * @param screenWidth screenWidth
	 * @generated
	 */
	public Terminal setScreenWidth(java.lang.Integer screenWidth){
		this.screenWidth = screenWidth;
		return this;
	}
	
	/**
	 * Obtém sga
	 * @param sga sga
	 * return sga
	 * @generated
	 */
	public Sga getSga(){
		return this.sga;
	}
	
	/**
	 * Define sga
	 * @param sga sga
	 * @generated
	 */
	public Terminal setSga(Sga sga){
		this.sga = sga;
		return this;
	}
	
	/**
	 * Obtém software
	 * @param software software
	 * return software
	 * @generated
	 */
	public Software getSoftware(){
		return this.software;
	}
	
	/**
	 * Define software
	 * @param software software
	 * @generated
	 */
	public Terminal setSoftware(Software software){
		this.software = software;
		return this;
	}
	
	/**
	 * Obtém speed
	 * @param speed speed
	 * return speed
	 * @generated
	 */
	public java.lang.Double getSpeed(){
		return this.speed;
	}
	
	/**
	 * Define speed
	 * @param speed speed
	 * @generated
	 */
	public Terminal setSpeed(java.lang.Double speed){
		this.speed = speed;
		return this;
	}
	
	/**
	 * Obtém startupTime
	 * @param startupTime startupTime
	 * return startupTime
	 * @generated
	 */
	public Date getStartupTime(){
		return this.startupTime;
	}
	
	/**
	 * Define startupTime
	 * @param startupTime startupTime
	 * @generated
	 */
	public Terminal setStartupTime(Date startupTime){
		this.startupTime = startupTime;
		return this;
	}
	
	/**
	 * Obtém status
	 * @param status status
	 * return status
	 * @generated
	 */
	public java.lang.String getStatus(){
		return this.status;
	}
	
	/**
	 * Define status
	 * @param status status
	 * @generated
	 */
	public Terminal setStatus(java.lang.String status){
		this.status = status;
		return this;
	}
	
	/**
	 * Obtém stops
	 * @param stops stops
	 * return stops
	 * @generated
	 */
	public java.lang.String getStops(){
		return this.stops;
	}
	
	/**
	 * Define stops
	 * @param stops stops
	 * @generated
	 */
	public Terminal setStops(java.lang.String stops){
		this.stops = stops;
		return this;
	}
	
	/**
	 * Obtém swLastUpdate
	 * @param swLastUpdate swLastUpdate
	 * return swLastUpdate
	 * @generated
	 */
	public Date getSwLastUpdate(){
		return this.swLastUpdate;
	}
	
	/**
	 * Define swLastUpdate
	 * @param swLastUpdate swLastUpdate
	 * @generated
	 */
	public Terminal setSwLastUpdate(Date swLastUpdate){
		this.swLastUpdate = swLastUpdate;
		return this;
	}
	
	/**
	 * Obtém swVersion
	 * @param swVersion swVersion
	 * return swVersion
	 * @generated
	 */
	public java.lang.String getSwVersion(){
		return this.swVersion;
	}
	
	/**
	 * Define swVersion
	 * @param swVersion swVersion
	 * @generated
	 */
	public Terminal setSwVersion(java.lang.String swVersion){
		this.swVersion = swVersion;
		return this;
	}
	
	/**
	 * Obtém swVersionCode
	 * @param swVersionCode swVersionCode
	 * return swVersionCode
	 * @generated
	 */
	public java.lang.Double getSwVersionCode(){
		return this.swVersionCode;
	}
	
	/**
	 * Define swVersionCode
	 * @param swVersionCode swVersionCode
	 * @generated
	 */
	public Terminal setSwVersionCode(java.lang.Double swVersionCode){
		this.swVersionCode = swVersionCode;
		return this;
	}
	
	/**
	 * Obtém synchronizationFlag
	 * @param synchronizationFlag synchronizationFlag
	 * return synchronizationFlag
	 * @generated
	 */
	public boolean getSynchronizationFlag(){
		return this.synchronizationFlag;
	}
	
	/**
	 * Define synchronizationFlag
	 * @param synchronizationFlag synchronizationFlag
	 * @generated
	 */
	public Terminal setSynchronizationFlag(boolean synchronizationFlag){
		this.synchronizationFlag = synchronizationFlag;
		return this;
	}
	
	/**
	 * Obtém terminalStatus
	 * @param terminalStatus terminalStatus
	 * return terminalStatus
	 * @generated
	 */
	public java.lang.Integer getTerminalStatus(){
		return this.terminalStatus;
	}
	
	/**
	 * Define terminalStatus
	 * @param terminalStatus terminalStatus
	 * @generated
	 */
	public Terminal setTerminalStatus(java.lang.Integer terminalStatus){
		this.terminalStatus = terminalStatus;
		return this;
	}
	
	/**
	 * Obtém terminalType
	 * @param terminalType terminalType
	 * return terminalType
	 * @generated
	 */
	public TerminalType getTerminalType(){
		return this.terminalType;
	}
	
	/**
	 * Define terminalType
	 * @param terminalType terminalType
	 * @generated
	 */
	public Terminal setTerminalType(TerminalType terminalType){
		this.terminalType = terminalType;
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
	public Terminal setTimeMinuteOff(java.lang.Integer timeMinuteOff){
		this.timeMinuteOff = timeMinuteOff;
		return this;
	}
	
	/**
	 * Obtém totalSpace
	 * @param totalSpace totalSpace
	 * return totalSpace
	 * @generated
	 */
	public java.lang.Long getTotalSpace(){
		return this.totalSpace;
	}
	
	/**
	 * Define totalSpace
	 * @param totalSpace totalSpace
	 * @generated
	 */
	public Terminal setTotalSpace(java.lang.Long totalSpace){
		this.totalSpace = totalSpace;
		return this;
	}
	
	/**
	 * Obtém trackCont
	 * @param trackCont trackCont
	 * return trackCont
	 * @generated
	 */
	public java.lang.Integer getTrackCont(){
		return this.trackCont;
	}
	
	/**
	 * Define trackCont
	 * @param trackCont trackCont
	 * @generated
	 */
	public Terminal setTrackCont(java.lang.Integer trackCont){
		this.trackCont = trackCont;
		return this;
	}
	
	/**
	 * Obtém trackLastComSent
	 * @param trackLastComSent trackLastComSent
	 * return trackLastComSent
	 * @generated
	 */
	public java.lang.String getTrackLastComSent(){
		return this.trackLastComSent;
	}
	
	/**
	 * Define trackLastComSent
	 * @param trackLastComSent trackLastComSent
	 * @generated
	 */
	public Terminal setTrackLastComSent(java.lang.String trackLastComSent){
		this.trackLastComSent = trackLastComSent;
		return this;
	}
	
	/**
	 * Obtém tvType
	 * @param tvType tvType
	 * return tvType
	 * @generated
	 */
	public TvType getTvType(){
		return this.tvType;
	}
	
	/**
	 * Define tvType
	 * @param tvType tvType
	 * @generated
	 */
	public Terminal setTvType(TvType tvType){
		this.tvType = tvType;
		return this;
	}
	
	/**
	 * Obtém update
	 * @param update update
	 * return update
	 * @generated
	 */
	public Date getUpdate(){
		return this.update;
	}
	
	/**
	 * Define update
	 * @param update update
	 * @generated
	 */
	public Terminal setUpdate(Date update){
		this.update = update;
		return this;
	}
	
	/**
	 * Obtém updateTime
	 * @param updateTime updateTime
	 * return updateTime
	 * @generated
	 */
	public java.lang.String getUpdateTime(){
		return this.updateTime;
	}
	
	/**
	 * Define updateTime
	 * @param updateTime updateTime
	 * @generated
	 */
	public Terminal setUpdateTime(java.lang.String updateTime){
		this.updateTime = updateTime;
		return this;
	}
	
	/**
	 * Obtém usedSpace
	 * @param usedSpace usedSpace
	 * return usedSpace
	 * @generated
	 */
	public java.lang.Long getUsedSpace(){
		return this.usedSpace;
	}
	
	/**
	 * Define usedSpace
	 * @param usedSpace usedSpace
	 * @generated
	 */
	public Terminal setUsedSpace(java.lang.Long usedSpace){
		this.usedSpace = usedSpace;
		return this;
	}
	
	/**
	 * Obtém userActive
	 * @param userActive userActive
	 * return userActive
	 * @generated
	 */
	public boolean getUserActive(){
		return this.userActive;
	}
	
	/**
	 * Define userActive
	 * @param userActive userActive
	 * @generated
	 */
	public Terminal setUserActive(boolean userActive){
		this.userActive = userActive;
		return this;
	}
	
	/**
	 * Obtém validateActivationCode
	 * @param validateActivationCode validateActivationCode
	 * return validateActivationCode
	 * @generated
	 */
	public boolean getValidateActivationCode(){
		return this.validateActivationCode;
	}
	
	/**
	 * Define validateActivationCode
	 * @param validateActivationCode validateActivationCode
	 * @generated
	 */
	public Terminal setValidateActivationCode(boolean validateActivationCode){
		this.validateActivationCode = validateActivationCode;
		return this;
	}
	
	/**
	 * Obtém videoHighQuality
	 * @param videoHighQuality videoHighQuality
	 * return videoHighQuality
	 * @generated
	 */
	public boolean getVideoHighQuality(){
		return this.videoHighQuality;
	}
	
	/**
	 * Define videoHighQuality
	 * @param videoHighQuality videoHighQuality
	 * @generated
	 */
	public Terminal setVideoHighQuality(boolean videoHighQuality){
		this.videoHighQuality = videoHighQuality;
		return this;
	}
	
	/**
	 * Obtém webcamActive
	 * @param webcamActive webcamActive
	 * return webcamActive
	 * @generated
	 */
	public boolean getWebcamActive(){
		return this.webcamActive;
	}
	
	/**
	 * Define webcamActive
	 * @param webcamActive webcamActive
	 * @generated
	 */
	public Terminal setWebcamActive(boolean webcamActive){
		this.webcamActive = webcamActive;
		return this;
	}
	
	/**
	 * Obtém webcamBandwidth
	 * @param webcamBandwidth webcamBandwidth
	 * return webcamBandwidth
	 * @generated
	 */
	public java.lang.Integer getWebcamBandwidth(){
		return this.webcamBandwidth;
	}
	
	/**
	 * Define webcamBandwidth
	 * @param webcamBandwidth webcamBandwidth
	 * @generated
	 */
	public Terminal setWebcamBandwidth(java.lang.Integer webcamBandwidth){
		this.webcamBandwidth = webcamBandwidth;
		return this;
	}
	
	/**
	 * Obtém webcamServer
	 * @param webcamServer webcamServer
	 * return webcamServer
	 * @generated
	 */
	public java.lang.String getWebcamServer(){
		return this.webcamServer;
	}
	
	/**
	 * Define webcamServer
	 * @param webcamServer webcamServer
	 * @generated
	 */
	public Terminal setWebcamServer(java.lang.String webcamServer){
		this.webcamServer = webcamServer;
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
	    
	    if(!(obj instanceof Terminal))
	      return false;
	    
	    Terminal other = (Terminal)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
