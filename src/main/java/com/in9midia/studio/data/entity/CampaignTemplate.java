package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.annotations.*;

/**
 * Classe que representa a tabela SYS_TEMPLATE
 * @generated
 */
@Entity
@Table(name = "\"SYS_TEMPLATE\""


)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "CPY_ID", contextProperty = "multitenancy.tenant-id")
public class CampaignTemplate implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1245212098l;
	
	/**
	 * @generated
	 */
	@Column(name = "tpl_auto_timer", nullable = true, unique = false)
	private boolean autoTimer;
	
	/**
	 * @generated
	 */
	@Column(name = "pfl_cam_container_ontop", nullable = true, unique = false)
	private boolean camContainerOntop;
	
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
	@Column(name = "tpl_channel_restriction", nullable = true, unique = false)
	private boolean channelRestriction;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CPY_ID", referencedColumnName = "CPY_ID", insertable=false, updatable=false)
	private Company company;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="FIL_ID2", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="FIL_ID", referencedColumnName = "FIL_ID")
	private File file2;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "tpl_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
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
	@ManyToOne
	@JoinColumn(name="MOD_ID", referencedColumnName = "MOD_ID")
	private Module module;
	
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
	@Column(name = "tpl_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CHN_ID", referencedColumnName = "CHN_ID")
	private NwsChannel nwsChannel;
	
	/**
	 * @generated
	 */
	@Column(name = "tpl_preview_img", nullable = true, unique = false)
	private java.lang.String previewImg;
	
	/**
	 * @generated
	 */
	@Column(name = "tpl_shared", nullable = true, unique = false)
	private boolean shared;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="THM_ID", referencedColumnName = "THM_ID")
	private Theme theme;
	
	/**
	 * @generated
	 */
	@Column(name = "tpl_use_diagramming", nullable = true, unique = false)
	private boolean useDiagramming;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public CampaignTemplate(){
	}

	
	/**
	 * Obtém autoTimer
	 * @param autoTimer autoTimer
	 * return autoTimer
	 * @generated
	 */
	public boolean getAutoTimer(){
		return this.autoTimer;
	}
	
	/**
	 * Define autoTimer
	 * @param autoTimer autoTimer
	 * @generated
	 */
	public CampaignTemplate setAutoTimer(boolean autoTimer){
		this.autoTimer = autoTimer;
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
	public CampaignTemplate setCamContainerOntop(boolean camContainerOntop){
		this.camContainerOntop = camContainerOntop;
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
	public CampaignTemplate setCampaignHeight(java.lang.Integer campaignHeight){
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
	public CampaignTemplate setCampaignLeft(java.lang.Integer campaignLeft){
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
	public CampaignTemplate setCampaignTop(java.lang.Integer campaignTop){
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
	public CampaignTemplate setCampaignWidth(java.lang.Integer campaignWidth){
		this.campaignWidth = campaignWidth;
		return this;
	}
	
	/**
	 * Obtém channelRestriction
	 * @param channelRestriction channelRestriction
	 * return channelRestriction
	 * @generated
	 */
	public boolean getChannelRestriction(){
		return this.channelRestriction;
	}
	
	/**
	 * Define channelRestriction
	 * @param channelRestriction channelRestriction
	 * @generated
	 */
	public CampaignTemplate setChannelRestriction(boolean channelRestriction){
		this.channelRestriction = channelRestriction;
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
	public CampaignTemplate setCompany(Company company){
		this.company = company;
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
	public CampaignTemplate setFile(File file){
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
	public CampaignTemplate setFile2(File file2){
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
	public CampaignTemplate setId(java.lang.String id){
		this.id = id;
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
	public CampaignTemplate setMaskHeight(java.lang.Integer maskHeight){
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
	public CampaignTemplate setMaskLeft(java.lang.Integer maskLeft){
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
	public CampaignTemplate setMaskTop(java.lang.Integer maskTop){
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
	public CampaignTemplate setMaskWidth(java.lang.Integer maskWidth){
		this.maskWidth = maskWidth;
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
	public CampaignTemplate setModule(Module module){
		this.module = module;
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
	public CampaignTemplate setMonitorHeight(java.lang.Integer monitorHeight){
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
	public CampaignTemplate setMonitorWidth(java.lang.Integer monitorWidth){
		this.monitorWidth = monitorWidth;
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
	public CampaignTemplate setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém nwsChannel
	 * @param nwsChannel nwsChannel
	 * return nwsChannel
	 * @generated
	 */
	public NwsChannel getNwsChannel(){
		return this.nwsChannel;
	}
	
	/**
	 * Define nwsChannel
	 * @param nwsChannel nwsChannel
	 * @generated
	 */
	public CampaignTemplate setNwsChannel(NwsChannel nwsChannel){
		this.nwsChannel = nwsChannel;
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
	public CampaignTemplate setPreviewImg(java.lang.String previewImg){
		this.previewImg = previewImg;
		return this;
	}
	
	/**
	 * Obtém shared
	 * @param shared shared
	 * return shared
	 * @generated
	 */
	public boolean getShared(){
		return this.shared;
	}
	
	/**
	 * Define shared
	 * @param shared shared
	 * @generated
	 */
	public CampaignTemplate setShared(boolean shared){
		this.shared = shared;
		return this;
	}
	
	/**
	 * Obtém theme
	 * @param theme theme
	 * return theme
	 * @generated
	 */
	public Theme getTheme(){
		return this.theme;
	}
	
	/**
	 * Define theme
	 * @param theme theme
	 * @generated
	 */
	public CampaignTemplate setTheme(Theme theme){
		this.theme = theme;
		return this;
	}
	
	/**
	 * Obtém useDiagramming
	 * @param useDiagramming useDiagramming
	 * return useDiagramming
	 * @generated
	 */
	public boolean getUseDiagramming(){
		return this.useDiagramming;
	}
	
	/**
	 * Define useDiagramming
	 * @param useDiagramming useDiagramming
	 * @generated
	 */
	public CampaignTemplate setUseDiagramming(boolean useDiagramming){
		this.useDiagramming = useDiagramming;
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
	    
	    if(!(obj instanceof CampaignTemplate))
	      return false;
	    
	    CampaignTemplate other = (CampaignTemplate)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
