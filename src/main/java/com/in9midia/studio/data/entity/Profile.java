package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_PROFILE
 * @generated
 */
@Entity
@Table(name = "\"SYS_PROFILE\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class Profile implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1355229568l;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_bar_active", nullable = true, unique = false)
	private boolean barActive;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_bar_template", nullable = true, unique = false)
	private java.lang.String barTemplate;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_bar_weather", nullable = true, unique = false)
	private java.lang.String barWeather;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_cam_container_ontop", nullable = true, unique = false)
	private boolean camContainerOntop;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CAM_ID", referencedColumnName = "CAM_ID")
	private Campaign campaign;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PFL_BAR_CAMPAIGN", referencedColumnName = "CAM_ID")
	private Campaign campaign2;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_campaign_height", nullable = true, unique = false)
	private java.lang.Integer campaignHeight;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_campaign_left", nullable = true, unique = false)
	private java.lang.Integer campaignLeft;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_campaign_top", nullable = true, unique = false)
	private java.lang.Integer campaignTop;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_campaign_width", nullable = true, unique = false)
	private java.lang.Integer campaignWidth;
	
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
	@Column(name = "pfl_creation_date", nullable = true, unique = false)
	private Date creationDate;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_def_cam_never_stops", nullable = true, unique = false)
	private boolean defCamNeverStops;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_display_off_schedule", nullable = true, unique = false)
	private java.lang.String displayOffSchedule;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_display_on_schedule", nullable = true, unique = false)
	private java.lang.String displayOnSchedule;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PFL_BAR_LOGO", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="PFL_BAR_SPONSOR", referencedColumnName = "FIL_ID")
	private File file2;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "pfl_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_interaction_block", nullable = true, unique = false)
	private java.lang.String interactionBlock;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_mask_height", nullable = true, unique = false)
	private java.lang.Integer maskHeight;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_mask_left", nullable = true, unique = false)
	private java.lang.Integer maskLeft;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_mask_top", nullable = true, unique = false)
	private java.lang.Integer maskTop;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_mask_width", nullable = true, unique = false)
	private java.lang.Integer maskWidth;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_monitor_height", nullable = true, unique = false)
	private java.lang.Integer monitorHeight;
	
	/**
	 * @generated
	 */
	@Column(name = "trm_monitor_width", nullable = true, unique = false)
	private java.lang.Integer monitorWidth;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_mute", nullable = true, unique = false)
	private boolean mute;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_pause", nullable = true, unique = false)
	private boolean pause;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_preview_img", nullable = true, unique = false)
	private java.lang.String previewImg;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_radio_password", nullable = true, unique = false)
	private java.lang.String radioPassword;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_radio_tipo", nullable = true, unique = false)
	private java.lang.String radioTipo;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_radio_url", nullable = true, unique = false)
	private java.lang.String radioUrl;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_radio_user", nullable = true, unique = false)
	private java.lang.String radioUser;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_radio_volume", nullable = true, unique = false)
	private java.lang.Integer radioVolume;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_save_block_index", nullable = true, unique = false)
	private boolean saveBlockIndex;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SCH_ROTATION_ID", referencedColumnName = "SCH_ID")
	private Schedule schedule;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="SCH_ID", referencedColumnName = "SCH_ID")
	private Schedule schedule2;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Profile(){
	}

	
	/**
	 * Obtém barActive
	 * @param barActive barActive
	 * return barActive
	 * @generated
	 */
	public boolean getBarActive(){
		return this.barActive;
	}
	
	/**
	 * Define barActive
	 * @param barActive barActive
	 * @generated
	 */
	public Profile setBarActive(boolean barActive){
		this.barActive = barActive;
		return this;
	}
	
	/**
	 * Obtém barTemplate
	 * @param barTemplate barTemplate
	 * return barTemplate
	 * @generated
	 */
	public java.lang.String getBarTemplate(){
		return this.barTemplate;
	}
	
	/**
	 * Define barTemplate
	 * @param barTemplate barTemplate
	 * @generated
	 */
	public Profile setBarTemplate(java.lang.String barTemplate){
		this.barTemplate = barTemplate;
		return this;
	}
	
	/**
	 * Obtém barWeather
	 * @param barWeather barWeather
	 * return barWeather
	 * @generated
	 */
	public java.lang.String getBarWeather(){
		return this.barWeather;
	}
	
	/**
	 * Define barWeather
	 * @param barWeather barWeather
	 * @generated
	 */
	public Profile setBarWeather(java.lang.String barWeather){
		this.barWeather = barWeather;
		return this;
	}
	
	/**
	 * Obtém camContainerOntop
	 * @param camContainerOntop camContainerOntop
	 * return camContainerOntop
	 * @generated
	 */
	public boolean getCamContainerOntop(){
		return this.camContainerOntop;
	}
	
	/**
	 * Define camContainerOntop
	 * @param camContainerOntop camContainerOntop
	 * @generated
	 */
	public Profile setCamContainerOntop(boolean camContainerOntop){
		this.camContainerOntop = camContainerOntop;
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
	public Profile setCampaign(Campaign campaign){
		this.campaign = campaign;
		return this;
	}
	
	/**
	 * Obtém campaign2
	 * @param campaign2 campaign2
	 * return campaign2
	 * @generated
	 */
	public Campaign getCampaign2(){
		return this.campaign2;
	}
	
	/**
	 * Define campaign2
	 * @param campaign2 campaign2
	 * @generated
	 */
	public Profile setCampaign2(Campaign campaign2){
		this.campaign2 = campaign2;
		return this;
	}
	
	/**
	 * Obtém campaignHeight
	 * @param campaignHeight campaignHeight
	 * return campaignHeight
	 * @generated
	 */
	public java.lang.Integer getCampaignHeight(){
		return this.campaignHeight;
	}
	
	/**
	 * Define campaignHeight
	 * @param campaignHeight campaignHeight
	 * @generated
	 */
	public Profile setCampaignHeight(java.lang.Integer campaignHeight){
		this.campaignHeight = campaignHeight;
		return this;
	}
	
	/**
	 * Obtém campaignLeft
	 * @param campaignLeft campaignLeft
	 * return campaignLeft
	 * @generated
	 */
	public java.lang.Integer getCampaignLeft(){
		return this.campaignLeft;
	}
	
	/**
	 * Define campaignLeft
	 * @param campaignLeft campaignLeft
	 * @generated
	 */
	public Profile setCampaignLeft(java.lang.Integer campaignLeft){
		this.campaignLeft = campaignLeft;
		return this;
	}
	
	/**
	 * Obtém campaignTop
	 * @param campaignTop campaignTop
	 * return campaignTop
	 * @generated
	 */
	public java.lang.Integer getCampaignTop(){
		return this.campaignTop;
	}
	
	/**
	 * Define campaignTop
	 * @param campaignTop campaignTop
	 * @generated
	 */
	public Profile setCampaignTop(java.lang.Integer campaignTop){
		this.campaignTop = campaignTop;
		return this;
	}
	
	/**
	 * Obtém campaignWidth
	 * @param campaignWidth campaignWidth
	 * return campaignWidth
	 * @generated
	 */
	public java.lang.Integer getCampaignWidth(){
		return this.campaignWidth;
	}
	
	/**
	 * Define campaignWidth
	 * @param campaignWidth campaignWidth
	 * @generated
	 */
	public Profile setCampaignWidth(java.lang.Integer campaignWidth){
		this.campaignWidth = campaignWidth;
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
	public Profile setCompany(Company company){
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
	public Profile setCreationDate(Date creationDate){
		this.creationDate = creationDate;
		return this;
	}
	
	/**
	 * Obtém defCamNeverStops
	 * @param defCamNeverStops defCamNeverStops
	 * return defCamNeverStops
	 * @generated
	 */
	public boolean getDefCamNeverStops(){
		return this.defCamNeverStops;
	}
	
	/**
	 * Define defCamNeverStops
	 * @param defCamNeverStops defCamNeverStops
	 * @generated
	 */
	public Profile setDefCamNeverStops(boolean defCamNeverStops){
		this.defCamNeverStops = defCamNeverStops;
		return this;
	}
	
	/**
	 * Obtém displayOffSchedule
	 * @param displayOffSchedule displayOffSchedule
	 * return displayOffSchedule
	 * @generated
	 */
	public java.lang.String getDisplayOffSchedule(){
		return this.displayOffSchedule;
	}
	
	/**
	 * Define displayOffSchedule
	 * @param displayOffSchedule displayOffSchedule
	 * @generated
	 */
	public Profile setDisplayOffSchedule(java.lang.String displayOffSchedule){
		this.displayOffSchedule = displayOffSchedule;
		return this;
	}
	
	/**
	 * Obtém displayOnSchedule
	 * @param displayOnSchedule displayOnSchedule
	 * return displayOnSchedule
	 * @generated
	 */
	public java.lang.String getDisplayOnSchedule(){
		return this.displayOnSchedule;
	}
	
	/**
	 * Define displayOnSchedule
	 * @param displayOnSchedule displayOnSchedule
	 * @generated
	 */
	public Profile setDisplayOnSchedule(java.lang.String displayOnSchedule){
		this.displayOnSchedule = displayOnSchedule;
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
	public Profile setFile(File file){
		this.file = file;
		return this;
	}
	
	/**
	 * Obtém file2
	 * @param file2 file2
	 * return file2
	 * @generated
	 */
	public File getFile2(){
		return this.file2;
	}
	
	/**
	 * Define file2
	 * @param file2 file2
	 * @generated
	 */
	public Profile setFile2(File file2){
		this.file2 = file2;
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
	public Profile setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém interactionBlock
	 * @param interactionBlock interactionBlock
	 * return interactionBlock
	 * @generated
	 */
	public java.lang.String getInteractionBlock(){
		return this.interactionBlock;
	}
	
	/**
	 * Define interactionBlock
	 * @param interactionBlock interactionBlock
	 * @generated
	 */
	public Profile setInteractionBlock(java.lang.String interactionBlock){
		this.interactionBlock = interactionBlock;
		return this;
	}
	
	/**
	 * Obtém maskHeight
	 * @param maskHeight maskHeight
	 * return maskHeight
	 * @generated
	 */
	public java.lang.Integer getMaskHeight(){
		return this.maskHeight;
	}
	
	/**
	 * Define maskHeight
	 * @param maskHeight maskHeight
	 * @generated
	 */
	public Profile setMaskHeight(java.lang.Integer maskHeight){
		this.maskHeight = maskHeight;
		return this;
	}
	
	/**
	 * Obtém maskLeft
	 * @param maskLeft maskLeft
	 * return maskLeft
	 * @generated
	 */
	public java.lang.Integer getMaskLeft(){
		return this.maskLeft;
	}
	
	/**
	 * Define maskLeft
	 * @param maskLeft maskLeft
	 * @generated
	 */
	public Profile setMaskLeft(java.lang.Integer maskLeft){
		this.maskLeft = maskLeft;
		return this;
	}
	
	/**
	 * Obtém maskTop
	 * @param maskTop maskTop
	 * return maskTop
	 * @generated
	 */
	public java.lang.Integer getMaskTop(){
		return this.maskTop;
	}
	
	/**
	 * Define maskTop
	 * @param maskTop maskTop
	 * @generated
	 */
	public Profile setMaskTop(java.lang.Integer maskTop){
		this.maskTop = maskTop;
		return this;
	}
	
	/**
	 * Obtém maskWidth
	 * @param maskWidth maskWidth
	 * return maskWidth
	 * @generated
	 */
	public java.lang.Integer getMaskWidth(){
		return this.maskWidth;
	}
	
	/**
	 * Define maskWidth
	 * @param maskWidth maskWidth
	 * @generated
	 */
	public Profile setMaskWidth(java.lang.Integer maskWidth){
		this.maskWidth = maskWidth;
		return this;
	}
	
	/**
	 * Obtém monitorHeight
	 * @param monitorHeight monitorHeight
	 * return monitorHeight
	 * @generated
	 */
	public java.lang.Integer getMonitorHeight(){
		return this.monitorHeight;
	}
	
	/**
	 * Define monitorHeight
	 * @param monitorHeight monitorHeight
	 * @generated
	 */
	public Profile setMonitorHeight(java.lang.Integer monitorHeight){
		this.monitorHeight = monitorHeight;
		return this;
	}
	
	/**
	 * Obtém monitorWidth
	 * @param monitorWidth monitorWidth
	 * return monitorWidth
	 * @generated
	 */
	public java.lang.Integer getMonitorWidth(){
		return this.monitorWidth;
	}
	
	/**
	 * Define monitorWidth
	 * @param monitorWidth monitorWidth
	 * @generated
	 */
	public Profile setMonitorWidth(java.lang.Integer monitorWidth){
		this.monitorWidth = monitorWidth;
		return this;
	}
	
	/**
	 * Obtém mute
	 * @param mute mute
	 * return mute
	 * @generated
	 */
	public boolean getMute(){
		return this.mute;
	}
	
	/**
	 * Define mute
	 * @param mute mute
	 * @generated
	 */
	public Profile setMute(boolean mute){
		this.mute = mute;
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
	public Profile setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém pause
	 * @param pause pause
	 * return pause
	 * @generated
	 */
	public boolean getPause(){
		return this.pause;
	}
	
	/**
	 * Define pause
	 * @param pause pause
	 * @generated
	 */
	public Profile setPause(boolean pause){
		this.pause = pause;
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
	public Profile setPreviewImg(java.lang.String previewImg){
		this.previewImg = previewImg;
		return this;
	}
	
	/**
	 * Obtém radioPassword
	 * @param radioPassword radioPassword
	 * return radioPassword
	 * @generated
	 */
	public java.lang.String getRadioPassword(){
		return this.radioPassword;
	}
	
	/**
	 * Define radioPassword
	 * @param radioPassword radioPassword
	 * @generated
	 */
	public Profile setRadioPassword(java.lang.String radioPassword){
		this.radioPassword = radioPassword;
		return this;
	}
	
	/**
	 * Obtém radioTipo
	 * @param radioTipo radioTipo
	 * return radioTipo
	 * @generated
	 */
	public java.lang.String getRadioTipo(){
		return this.radioTipo;
	}
	
	/**
	 * Define radioTipo
	 * @param radioTipo radioTipo
	 * @generated
	 */
	public Profile setRadioTipo(java.lang.String radioTipo){
		this.radioTipo = radioTipo;
		return this;
	}
	
	/**
	 * Obtém radioUrl
	 * @param radioUrl radioUrl
	 * return radioUrl
	 * @generated
	 */
	public java.lang.String getRadioUrl(){
		return this.radioUrl;
	}
	
	/**
	 * Define radioUrl
	 * @param radioUrl radioUrl
	 * @generated
	 */
	public Profile setRadioUrl(java.lang.String radioUrl){
		this.radioUrl = radioUrl;
		return this;
	}
	
	/**
	 * Obtém radioUser
	 * @param radioUser radioUser
	 * return radioUser
	 * @generated
	 */
	public java.lang.String getRadioUser(){
		return this.radioUser;
	}
	
	/**
	 * Define radioUser
	 * @param radioUser radioUser
	 * @generated
	 */
	public Profile setRadioUser(java.lang.String radioUser){
		this.radioUser = radioUser;
		return this;
	}
	
	/**
	 * Obtém radioVolume
	 * @param radioVolume radioVolume
	 * return radioVolume
	 * @generated
	 */
	public java.lang.Integer getRadioVolume(){
		return this.radioVolume;
	}
	
	/**
	 * Define radioVolume
	 * @param radioVolume radioVolume
	 * @generated
	 */
	public Profile setRadioVolume(java.lang.Integer radioVolume){
		this.radioVolume = radioVolume;
		return this;
	}
	
	/**
	 * Obtém saveBlockIndex
	 * @param saveBlockIndex saveBlockIndex
	 * return saveBlockIndex
	 * @generated
	 */
	public boolean getSaveBlockIndex(){
		return this.saveBlockIndex;
	}
	
	/**
	 * Define saveBlockIndex
	 * @param saveBlockIndex saveBlockIndex
	 * @generated
	 */
	public Profile setSaveBlockIndex(boolean saveBlockIndex){
		this.saveBlockIndex = saveBlockIndex;
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
	public Profile setSchedule(Schedule schedule){
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
	public Profile setSchedule2(Schedule schedule2){
		this.schedule2 = schedule2;
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
	    
	    if(!(obj instanceof Profile))
	      return false;
	    
	    Profile other = (Profile)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
