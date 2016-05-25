package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela NWS_CHANNEL
 * @generated
 */
@Entity
@Table(name = "\"NWS_CHANNEL\""


)
@XmlRootElement
public class NwsChannel implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1818536463l;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_active", nullable = true, unique = false)
	private boolean active;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="AGE_ID", referencedColumnName = "AGE_ID")
	private Agency agency;
	
	/**
	 * @generated
	 */
	@Column(name = "nec_cms_criar_campanha_", nullable = true, unique = false)
	private boolean cmsCriarCampanha;
	
	/**
	 * @generated
	 */
	@Column(name = "nec_cms_template", nullable = true, unique = false)
	private java.lang.String cmsTemplate;
	
	/**
	 * @generated
	 */
	@Column(name = "nec_cms_tempo_de_exibicao", nullable = true, unique = false)
	private java.lang.Double cmsTempoDeExibicao;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_cut_days", nullable = true, unique = false)
	private java.lang.Integer cutDays;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_expression_dst", nullable = true, unique = false)
	private java.lang.String expressionDst;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CHN_DEFAULT_IMAGE", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CHN_LOGO", referencedColumnName = "FIL_ID")
	private File file2;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_filter", nullable = true, unique = false)
	private java.lang.String filter;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_filter_category", nullable = true, unique = false)
	private java.lang.String filterCategory;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_force_encoding", nullable = true, unique = false)
	private java.lang.String forceEncoding;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "chn_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "chn_image_expression", nullable = true, unique = false)
	private java.lang.String imageExpression;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_include_only", nullable = true, unique = false)
	private java.lang.String includeOnly;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_isutf8", nullable = true, unique = false)
	private boolean isutf8;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_key_name", nullable = true, unique = false)
	private java.lang.String keyName;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_limit_description", nullable = true, unique = false)
	private java.lang.Integer limitDescription;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_limit_description_char", nullable = true, unique = false)
	private java.lang.String limitDescriptionChar;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_name", nullable = false, unique = false)
	private java.lang.String name;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_only_images", nullable = true, unique = false)
	private boolean onlyImages;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_remove_line_break", nullable = true, unique = false)
	private boolean removeLineBreak;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_replace", nullable = true, unique = false)
	private java.lang.String replace;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="THM_ID", referencedColumnName = "THM_ID")
	private Theme theme;
	
	/**
	 * @generated
	 */
	@Column(name = "chn_url", nullable = true, unique = false)
	private java.lang.String url;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="WFR_ID", referencedColumnName = "WRP_ID")
	private Wrapper wrapper;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public NwsChannel(){
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
	public NwsChannel setActive(boolean active){
		this.active = active;
		return this;
	}
	
	/**
	 * Obtém agency
	 * @param agency agency
	 * return agency
	 * @generated
	 */
	public Agency getAgency(){
		return this.agency;
	}
	
	/**
	 * Define agency
	 * @param agency agency
	 * @generated
	 */
	public NwsChannel setAgency(Agency agency){
		this.agency = agency;
		return this;
	}
	
	/**
	 * Obtém cmsCriarCampanha
	 * @param cmsCriarCampanha cmsCriarCampanha
	 * return cmsCriarCampanha
	 * @generated
	 */
	public boolean getCmsCriarCampanha(){
		return this.cmsCriarCampanha;
	}
	
	/**
	 * Define cmsCriarCampanha
	 * @param cmsCriarCampanha cmsCriarCampanha
	 * @generated
	 */
	public NwsChannel setCmsCriarCampanha(boolean cmsCriarCampanha){
		this.cmsCriarCampanha = cmsCriarCampanha;
		return this;
	}
	
	/**
	 * Obtém cmsTemplate
	 * @param cmsTemplate cmsTemplate
	 * return cmsTemplate
	 * @generated
	 */
	public java.lang.String getCmsTemplate(){
		return this.cmsTemplate;
	}
	
	/**
	 * Define cmsTemplate
	 * @param cmsTemplate cmsTemplate
	 * @generated
	 */
	public NwsChannel setCmsTemplate(java.lang.String cmsTemplate){
		this.cmsTemplate = cmsTemplate;
		return this;
	}
	
	/**
	 * Obtém cmsTempoDeExibicao
	 * @param cmsTempoDeExibicao cmsTempoDeExibicao
	 * return cmsTempoDeExibicao
	 * @generated
	 */
	public java.lang.Double getCmsTempoDeExibicao(){
		return this.cmsTempoDeExibicao;
	}
	
	/**
	 * Define cmsTempoDeExibicao
	 * @param cmsTempoDeExibicao cmsTempoDeExibicao
	 * @generated
	 */
	public NwsChannel setCmsTempoDeExibicao(java.lang.Double cmsTempoDeExibicao){
		this.cmsTempoDeExibicao = cmsTempoDeExibicao;
		return this;
	}
	
	/**
	 * Obtém cutDays
	 * @param cutDays cutDays
	 * return cutDays
	 * @generated
	 */
	public java.lang.Integer getCutDays(){
		return this.cutDays;
	}
	
	/**
	 * Define cutDays
	 * @param cutDays cutDays
	 * @generated
	 */
	public NwsChannel setCutDays(java.lang.Integer cutDays){
		this.cutDays = cutDays;
		return this;
	}
	
	/**
	 * Obtém expressionDst
	 * @param expressionDst expressionDst
	 * return expressionDst
	 * @generated
	 */
	public java.lang.String getExpressionDst(){
		return this.expressionDst;
	}
	
	/**
	 * Define expressionDst
	 * @param expressionDst expressionDst
	 * @generated
	 */
	public NwsChannel setExpressionDst(java.lang.String expressionDst){
		this.expressionDst = expressionDst;
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
	public NwsChannel setFile(File file){
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
	public NwsChannel setFile2(File file2){
		this.file2 = file2;
		return this;
	}
	
	/**
	 * Obtém filter
	 * @param filter filter
	 * return filter
	 * @generated
	 */
	public java.lang.String getFilter(){
		return this.filter;
	}
	
	/**
	 * Define filter
	 * @param filter filter
	 * @generated
	 */
	public NwsChannel setFilter(java.lang.String filter){
		this.filter = filter;
		return this;
	}
	
	/**
	 * Obtém filterCategory
	 * @param filterCategory filterCategory
	 * return filterCategory
	 * @generated
	 */
	public java.lang.String getFilterCategory(){
		return this.filterCategory;
	}
	
	/**
	 * Define filterCategory
	 * @param filterCategory filterCategory
	 * @generated
	 */
	public NwsChannel setFilterCategory(java.lang.String filterCategory){
		this.filterCategory = filterCategory;
		return this;
	}
	
	/**
	 * Obtém forceEncoding
	 * @param forceEncoding forceEncoding
	 * return forceEncoding
	 * @generated
	 */
	public java.lang.String getForceEncoding(){
		return this.forceEncoding;
	}
	
	/**
	 * Define forceEncoding
	 * @param forceEncoding forceEncoding
	 * @generated
	 */
	public NwsChannel setForceEncoding(java.lang.String forceEncoding){
		this.forceEncoding = forceEncoding;
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
	public NwsChannel setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém imageExpression
	 * @param imageExpression imageExpression
	 * return imageExpression
	 * @generated
	 */
	public java.lang.String getImageExpression(){
		return this.imageExpression;
	}
	
	/**
	 * Define imageExpression
	 * @param imageExpression imageExpression
	 * @generated
	 */
	public NwsChannel setImageExpression(java.lang.String imageExpression){
		this.imageExpression = imageExpression;
		return this;
	}
	
	/**
	 * Obtém includeOnly
	 * @param includeOnly includeOnly
	 * return includeOnly
	 * @generated
	 */
	public java.lang.String getIncludeOnly(){
		return this.includeOnly;
	}
	
	/**
	 * Define includeOnly
	 * @param includeOnly includeOnly
	 * @generated
	 */
	public NwsChannel setIncludeOnly(java.lang.String includeOnly){
		this.includeOnly = includeOnly;
		return this;
	}
	
	/**
	 * Obtém isutf8
	 * @param isutf8 isutf8
	 * return isutf8
	 * @generated
	 */
	public boolean getIsutf8(){
		return this.isutf8;
	}
	
	/**
	 * Define isutf8
	 * @param isutf8 isutf8
	 * @generated
	 */
	public NwsChannel setIsutf8(boolean isutf8){
		this.isutf8 = isutf8;
		return this;
	}
	
	/**
	 * Obtém keyName
	 * @param keyName keyName
	 * return keyName
	 * @generated
	 */
	public java.lang.String getKeyName(){
		return this.keyName;
	}
	
	/**
	 * Define keyName
	 * @param keyName keyName
	 * @generated
	 */
	public NwsChannel setKeyName(java.lang.String keyName){
		this.keyName = keyName;
		return this;
	}
	
	/**
	 * Obtém limitDescription
	 * @param limitDescription limitDescription
	 * return limitDescription
	 * @generated
	 */
	public java.lang.Integer getLimitDescription(){
		return this.limitDescription;
	}
	
	/**
	 * Define limitDescription
	 * @param limitDescription limitDescription
	 * @generated
	 */
	public NwsChannel setLimitDescription(java.lang.Integer limitDescription){
		this.limitDescription = limitDescription;
		return this;
	}
	
	/**
	 * Obtém limitDescriptionChar
	 * @param limitDescriptionChar limitDescriptionChar
	 * return limitDescriptionChar
	 * @generated
	 */
	public java.lang.String getLimitDescriptionChar(){
		return this.limitDescriptionChar;
	}
	
	/**
	 * Define limitDescriptionChar
	 * @param limitDescriptionChar limitDescriptionChar
	 * @generated
	 */
	public NwsChannel setLimitDescriptionChar(java.lang.String limitDescriptionChar){
		this.limitDescriptionChar = limitDescriptionChar;
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
	public NwsChannel setName(java.lang.String name){
		this.name = name;
		return this;
	}
	
	/**
	 * Obtém onlyImages
	 * @param onlyImages onlyImages
	 * return onlyImages
	 * @generated
	 */
	public boolean getOnlyImages(){
		return this.onlyImages;
	}
	
	/**
	 * Define onlyImages
	 * @param onlyImages onlyImages
	 * @generated
	 */
	public NwsChannel setOnlyImages(boolean onlyImages){
		this.onlyImages = onlyImages;
		return this;
	}
	
	/**
	 * Obtém removeLineBreak
	 * @param removeLineBreak removeLineBreak
	 * return removeLineBreak
	 * @generated
	 */
	public boolean getRemoveLineBreak(){
		return this.removeLineBreak;
	}
	
	/**
	 * Define removeLineBreak
	 * @param removeLineBreak removeLineBreak
	 * @generated
	 */
	public NwsChannel setRemoveLineBreak(boolean removeLineBreak){
		this.removeLineBreak = removeLineBreak;
		return this;
	}
	
	/**
	 * Obtém replace
	 * @param replace replace
	 * return replace
	 * @generated
	 */
	public java.lang.String getReplace(){
		return this.replace;
	}
	
	/**
	 * Define replace
	 * @param replace replace
	 * @generated
	 */
	public NwsChannel setReplace(java.lang.String replace){
		this.replace = replace;
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
	public NwsChannel setTheme(Theme theme){
		this.theme = theme;
		return this;
	}
	
	/**
	 * Obtém url
	 * @param url url
	 * return url
	 * @generated
	 */
	public java.lang.String getUrl(){
		return this.url;
	}
	
	/**
	 * Define url
	 * @param url url
	 * @generated
	 */
	public NwsChannel setUrl(java.lang.String url){
		this.url = url;
		return this;
	}
	
	/**
	 * Obtém wrapper
	 * @param wrapper wrapper
	 * return wrapper
	 * @generated
	 */
	public Wrapper getWrapper(){
		return this.wrapper;
	}
	
	/**
	 * Define wrapper
	 * @param wrapper wrapper
	 * @generated
	 */
	public NwsChannel setWrapper(Wrapper wrapper){
		this.wrapper = wrapper;
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
	    
	    if(!(obj instanceof NwsChannel))
	      return false;
	    
	    NwsChannel other = (NwsChannel)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
