package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SYS_CONFIG
 * @generated
 */
@Entity
@Table(name = "\"SYS_CONFIG\""


)
@XmlRootElement
public class Config implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 2024044379l;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_anexo", nullable = true, unique = false)
	private java.lang.String anexo;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_contract", nullable = true, unique = false)
	private java.lang.String contract;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_dst", nullable = true, unique = false)
	private boolean dst;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_email_admin", nullable = true, unique = false)
	private java.lang.String emailAdmin;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_email_autenticacao", nullable = true, unique = false)
	private java.lang.String emailAutenticacao;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_email_content", nullable = true, unique = false)
	private java.lang.String emailContent;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_email_porta", nullable = true, unique = false)
	private java.lang.Integer emailPorta;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_email_remetente", nullable = true, unique = false)
	private java.lang.String emailRemetente;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_email_senha", nullable = true, unique = false)
	private java.lang.String emailSenha;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_email_smtp", nullable = true, unique = false)
	private java.lang.String emailSmtp;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_email_usuario", nullable = true, unique = false)
	private java.lang.String emailUsuario;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_envelope_soap", nullable = true, unique = false)
	private java.lang.String envelopeSoap;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="CFG_DEFAULT_LOGO", referencedColumnName = "FIL_ID")
	private File file;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_file_quota", nullable = true, unique = false)
	private java.lang.Integer fileQuota;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_flv_converter", nullable = true, unique = false)
	private java.lang.String flvConverter;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_flv_player", nullable = true, unique = false)
	private java.lang.String flvPlayer;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_free_sga_players", nullable = true, unique = false)
	private java.lang.Integer freeSgaPlayers;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_get_ip_url", nullable = true, unique = false)
	private java.lang.String getIpUrl;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_group_web", nullable = true, unique = false)
	private java.lang.Integer groupWeb;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_host", nullable = true, unique = false)
	private java.lang.String host;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "cfg_id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_max_file_size", nullable = true, unique = false)
	private java.lang.Integer maxFileSize;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_pag_email", nullable = true, unique = false)
	private java.lang.String pagEmail;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_pag_password", nullable = true, unique = false)
	private java.lang.String pagPassword;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_pag_token", nullable = true, unique = false)
	private java.lang.String pagToken;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_place_youtube_dl", nullable = true, unique = false)
	private java.lang.String placeYoutubeDl;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_ppt_converter", nullable = true, unique = false)
	private java.lang.String pptConverter;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_resource_folder", nullable = true, unique = false)
	private java.lang.String resourceFolder;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_resource_image", nullable = true, unique = false)
	private java.lang.String resourceImage;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_resource_url", nullable = true, unique = false)
	private java.lang.String resourceUrl;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_rss_url", nullable = true, unique = false)
	private java.lang.String rssUrl;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_s3_aws_access_key_id", nullable = true, unique = false)
	private java.lang.String s3AwsAccessKeyId;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_s3_aws_region", nullable = true, unique = false)
	private java.lang.String s3AwsRegion;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_s3_aws_secret_access_key", nullable = true, unique = false)
	private java.lang.String s3AwsSecretAccessKey;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_s3_host", nullable = true, unique = false)
	private java.lang.String s3Host;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_s3_location", nullable = true, unique = false)
	private boolean s3Location;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_s3_resource_host", nullable = true, unique = false)
	private java.lang.String s3ResourceHost;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_sga_host", nullable = true, unique = false)
	private java.lang.String sgaHost;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_sga_light_active_webservice", nullable = true, unique = false)
	private java.lang.String sgaLightActiveWebservice;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_sga_light_service_url", nullable = true, unique = false)
	private java.lang.String sgaLightServiceUrl;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_sga_light_sms_webservice", nullable = true, unique = false)
	private java.lang.String sgaLightSmsWebservice;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_sga_light_webservice", nullable = true, unique = false)
	private java.lang.String sgaLightWebservice;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_sga_light_webservice_port", nullable = true, unique = false)
	private java.lang.String sgaLightWebservicePort;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_tracker_modem_cell_chip", nullable = true, unique = false)
	private java.lang.String trackerModemCellChip;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_tracker_port", nullable = true, unique = false)
	private java.lang.String trackerPort;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_tracker_webservice", nullable = true, unique = false)
	private java.lang.String trackerWebservice;
	
	/**
	 * @generated
	 */
	@Column(name = "fin_url_gerar_boleto", nullable = true, unique = false)
	private java.lang.String urlGerarBoleto;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_webservices", nullable = true, unique = false)
	private java.lang.String webservices;
	
	/**
	 * @generated
	 */
	@Column(name = "cfg_ws_leads", nullable = true, unique = false)
	private java.lang.String wsLeads;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Config(){
	}

	
	/**
	 * Obtém anexo
	 * @param anexo anexo
	 * return anexo
	 * @generated
	 */
	public java.lang.String getAnexo(){
		return this.anexo;
	}
	
	/**
	 * Define anexo
	 * @param anexo anexo
	 * @generated
	 */
	public Config setAnexo(java.lang.String anexo){
		this.anexo = anexo;
		return this;
	}
	
	/**
	 * Obtém contract
	 * @param contract contract
	 * return contract
	 * @generated
	 */
	public java.lang.String getContract(){
		return this.contract;
	}
	
	/**
	 * Define contract
	 * @param contract contract
	 * @generated
	 */
	public Config setContract(java.lang.String contract){
		this.contract = contract;
		return this;
	}
	
	/**
	 * Obtém dst
	 * @param dst dst
	 * return dst
	 * @generated
	 */
	public boolean getDst(){
		return this.dst;
	}
	
	/**
	 * Define dst
	 * @param dst dst
	 * @generated
	 */
	public Config setDst(boolean dst){
		this.dst = dst;
		return this;
	}
	
	/**
	 * Obtém emailAdmin
	 * @param emailAdmin emailAdmin
	 * return emailAdmin
	 * @generated
	 */
	public java.lang.String getEmailAdmin(){
		return this.emailAdmin;
	}
	
	/**
	 * Define emailAdmin
	 * @param emailAdmin emailAdmin
	 * @generated
	 */
	public Config setEmailAdmin(java.lang.String emailAdmin){
		this.emailAdmin = emailAdmin;
		return this;
	}
	
	/**
	 * Obtém emailAutenticacao
	 * @param emailAutenticacao emailAutenticacao
	 * return emailAutenticacao
	 * @generated
	 */
	public java.lang.String getEmailAutenticacao(){
		return this.emailAutenticacao;
	}
	
	/**
	 * Define emailAutenticacao
	 * @param emailAutenticacao emailAutenticacao
	 * @generated
	 */
	public Config setEmailAutenticacao(java.lang.String emailAutenticacao){
		this.emailAutenticacao = emailAutenticacao;
		return this;
	}
	
	/**
	 * Obtém emailContent
	 * @param emailContent emailContent
	 * return emailContent
	 * @generated
	 */
	public java.lang.String getEmailContent(){
		return this.emailContent;
	}
	
	/**
	 * Define emailContent
	 * @param emailContent emailContent
	 * @generated
	 */
	public Config setEmailContent(java.lang.String emailContent){
		this.emailContent = emailContent;
		return this;
	}
	
	/**
	 * Obtém emailPorta
	 * @param emailPorta emailPorta
	 * return emailPorta
	 * @generated
	 */
	public java.lang.Integer getEmailPorta(){
		return this.emailPorta;
	}
	
	/**
	 * Define emailPorta
	 * @param emailPorta emailPorta
	 * @generated
	 */
	public Config setEmailPorta(java.lang.Integer emailPorta){
		this.emailPorta = emailPorta;
		return this;
	}
	
	/**
	 * Obtém emailRemetente
	 * @param emailRemetente emailRemetente
	 * return emailRemetente
	 * @generated
	 */
	public java.lang.String getEmailRemetente(){
		return this.emailRemetente;
	}
	
	/**
	 * Define emailRemetente
	 * @param emailRemetente emailRemetente
	 * @generated
	 */
	public Config setEmailRemetente(java.lang.String emailRemetente){
		this.emailRemetente = emailRemetente;
		return this;
	}
	
	/**
	 * Obtém emailSenha
	 * @param emailSenha emailSenha
	 * return emailSenha
	 * @generated
	 */
	public java.lang.String getEmailSenha(){
		return this.emailSenha;
	}
	
	/**
	 * Define emailSenha
	 * @param emailSenha emailSenha
	 * @generated
	 */
	public Config setEmailSenha(java.lang.String emailSenha){
		this.emailSenha = emailSenha;
		return this;
	}
	
	/**
	 * Obtém emailSmtp
	 * @param emailSmtp emailSmtp
	 * return emailSmtp
	 * @generated
	 */
	public java.lang.String getEmailSmtp(){
		return this.emailSmtp;
	}
	
	/**
	 * Define emailSmtp
	 * @param emailSmtp emailSmtp
	 * @generated
	 */
	public Config setEmailSmtp(java.lang.String emailSmtp){
		this.emailSmtp = emailSmtp;
		return this;
	}
	
	/**
	 * Obtém emailUsuario
	 * @param emailUsuario emailUsuario
	 * return emailUsuario
	 * @generated
	 */
	public java.lang.String getEmailUsuario(){
		return this.emailUsuario;
	}
	
	/**
	 * Define emailUsuario
	 * @param emailUsuario emailUsuario
	 * @generated
	 */
	public Config setEmailUsuario(java.lang.String emailUsuario){
		this.emailUsuario = emailUsuario;
		return this;
	}
	
	/**
	 * Obtém envelopeSoap
	 * @param envelopeSoap envelopeSoap
	 * return envelopeSoap
	 * @generated
	 */
	public java.lang.String getEnvelopeSoap(){
		return this.envelopeSoap;
	}
	
	/**
	 * Define envelopeSoap
	 * @param envelopeSoap envelopeSoap
	 * @generated
	 */
	public Config setEnvelopeSoap(java.lang.String envelopeSoap){
		this.envelopeSoap = envelopeSoap;
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
	public Config setFile(File file){
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
	public Config setFileQuota(java.lang.Integer fileQuota){
		this.fileQuota = fileQuota;
		return this;
	}
	
	/**
	 * Obtém flvConverter
	 * @param flvConverter flvConverter
	 * return flvConverter
	 * @generated
	 */
	public java.lang.String getFlvConverter(){
		return this.flvConverter;
	}
	
	/**
	 * Define flvConverter
	 * @param flvConverter flvConverter
	 * @generated
	 */
	public Config setFlvConverter(java.lang.String flvConverter){
		this.flvConverter = flvConverter;
		return this;
	}
	
	/**
	 * Obtém flvPlayer
	 * @param flvPlayer flvPlayer
	 * return flvPlayer
	 * @generated
	 */
	public java.lang.String getFlvPlayer(){
		return this.flvPlayer;
	}
	
	/**
	 * Define flvPlayer
	 * @param flvPlayer flvPlayer
	 * @generated
	 */
	public Config setFlvPlayer(java.lang.String flvPlayer){
		this.flvPlayer = flvPlayer;
		return this;
	}
	
	/**
	 * Obtém freeSgaPlayers
	 * @param freeSgaPlayers freeSgaPlayers
	 * return freeSgaPlayers
	 * @generated
	 */
	public java.lang.Integer getFreeSgaPlayers(){
		return this.freeSgaPlayers;
	}
	
	/**
	 * Define freeSgaPlayers
	 * @param freeSgaPlayers freeSgaPlayers
	 * @generated
	 */
	public Config setFreeSgaPlayers(java.lang.Integer freeSgaPlayers){
		this.freeSgaPlayers = freeSgaPlayers;
		return this;
	}
	
	/**
	 * Obtém getIpUrl
	 * @param getIpUrl getIpUrl
	 * return getIpUrl
	 * @generated
	 */
	public java.lang.String getGetIpUrl(){
		return this.getIpUrl;
	}
	
	/**
	 * Define getIpUrl
	 * @param getIpUrl getIpUrl
	 * @generated
	 */
	public Config setGetIpUrl(java.lang.String getIpUrl){
		this.getIpUrl = getIpUrl;
		return this;
	}
	
	/**
	 * Obtém groupWeb
	 * @param groupWeb groupWeb
	 * return groupWeb
	 * @generated
	 */
	public java.lang.Integer getGroupWeb(){
		return this.groupWeb;
	}
	
	/**
	 * Define groupWeb
	 * @param groupWeb groupWeb
	 * @generated
	 */
	public Config setGroupWeb(java.lang.Integer groupWeb){
		this.groupWeb = groupWeb;
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
	public Config setHost(java.lang.String host){
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
	public Config setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém maxFileSize
	 * @param maxFileSize maxFileSize
	 * return maxFileSize
	 * @generated
	 */
	public java.lang.Integer getMaxFileSize(){
		return this.maxFileSize;
	}
	
	/**
	 * Define maxFileSize
	 * @param maxFileSize maxFileSize
	 * @generated
	 */
	public Config setMaxFileSize(java.lang.Integer maxFileSize){
		this.maxFileSize = maxFileSize;
		return this;
	}
	
	/**
	 * Obtém pagEmail
	 * @param pagEmail pagEmail
	 * return pagEmail
	 * @generated
	 */
	public java.lang.String getPagEmail(){
		return this.pagEmail;
	}
	
	/**
	 * Define pagEmail
	 * @param pagEmail pagEmail
	 * @generated
	 */
	public Config setPagEmail(java.lang.String pagEmail){
		this.pagEmail = pagEmail;
		return this;
	}
	
	/**
	 * Obtém pagPassword
	 * @param pagPassword pagPassword
	 * return pagPassword
	 * @generated
	 */
	public java.lang.String getPagPassword(){
		return this.pagPassword;
	}
	
	/**
	 * Define pagPassword
	 * @param pagPassword pagPassword
	 * @generated
	 */
	public Config setPagPassword(java.lang.String pagPassword){
		this.pagPassword = pagPassword;
		return this;
	}
	
	/**
	 * Obtém pagToken
	 * @param pagToken pagToken
	 * return pagToken
	 * @generated
	 */
	public java.lang.String getPagToken(){
		return this.pagToken;
	}
	
	/**
	 * Define pagToken
	 * @param pagToken pagToken
	 * @generated
	 */
	public Config setPagToken(java.lang.String pagToken){
		this.pagToken = pagToken;
		return this;
	}
	
	/**
	 * Obtém placeYoutubeDl
	 * @param placeYoutubeDl placeYoutubeDl
	 * return placeYoutubeDl
	 * @generated
	 */
	public java.lang.String getPlaceYoutubeDl(){
		return this.placeYoutubeDl;
	}
	
	/**
	 * Define placeYoutubeDl
	 * @param placeYoutubeDl placeYoutubeDl
	 * @generated
	 */
	public Config setPlaceYoutubeDl(java.lang.String placeYoutubeDl){
		this.placeYoutubeDl = placeYoutubeDl;
		return this;
	}
	
	/**
	 * Obtém pptConverter
	 * @param pptConverter pptConverter
	 * return pptConverter
	 * @generated
	 */
	public java.lang.String getPptConverter(){
		return this.pptConverter;
	}
	
	/**
	 * Define pptConverter
	 * @param pptConverter pptConverter
	 * @generated
	 */
	public Config setPptConverter(java.lang.String pptConverter){
		this.pptConverter = pptConverter;
		return this;
	}
	
	/**
	 * Obtém resourceFolder
	 * @param resourceFolder resourceFolder
	 * return resourceFolder
	 * @generated
	 */
	public java.lang.String getResourceFolder(){
		return this.resourceFolder;
	}
	
	/**
	 * Define resourceFolder
	 * @param resourceFolder resourceFolder
	 * @generated
	 */
	public Config setResourceFolder(java.lang.String resourceFolder){
		this.resourceFolder = resourceFolder;
		return this;
	}
	
	/**
	 * Obtém resourceImage
	 * @param resourceImage resourceImage
	 * return resourceImage
	 * @generated
	 */
	public java.lang.String getResourceImage(){
		return this.resourceImage;
	}
	
	/**
	 * Define resourceImage
	 * @param resourceImage resourceImage
	 * @generated
	 */
	public Config setResourceImage(java.lang.String resourceImage){
		this.resourceImage = resourceImage;
		return this;
	}
	
	/**
	 * Obtém resourceUrl
	 * @param resourceUrl resourceUrl
	 * return resourceUrl
	 * @generated
	 */
	public java.lang.String getResourceUrl(){
		return this.resourceUrl;
	}
	
	/**
	 * Define resourceUrl
	 * @param resourceUrl resourceUrl
	 * @generated
	 */
	public Config setResourceUrl(java.lang.String resourceUrl){
		this.resourceUrl = resourceUrl;
		return this;
	}
	
	/**
	 * Obtém rssUrl
	 * @param rssUrl rssUrl
	 * return rssUrl
	 * @generated
	 */
	public java.lang.String getRssUrl(){
		return this.rssUrl;
	}
	
	/**
	 * Define rssUrl
	 * @param rssUrl rssUrl
	 * @generated
	 */
	public Config setRssUrl(java.lang.String rssUrl){
		this.rssUrl = rssUrl;
		return this;
	}
	
	/**
	 * Obtém s3AwsAccessKeyId
	 * @param s3AwsAccessKeyId s3AwsAccessKeyId
	 * return s3AwsAccessKeyId
	 * @generated
	 */
	public java.lang.String getS3AwsAccessKeyId(){
		return this.s3AwsAccessKeyId;
	}
	
	/**
	 * Define s3AwsAccessKeyId
	 * @param s3AwsAccessKeyId s3AwsAccessKeyId
	 * @generated
	 */
	public Config setS3AwsAccessKeyId(java.lang.String s3AwsAccessKeyId){
		this.s3AwsAccessKeyId = s3AwsAccessKeyId;
		return this;
	}
	
	/**
	 * Obtém s3AwsRegion
	 * @param s3AwsRegion s3AwsRegion
	 * return s3AwsRegion
	 * @generated
	 */
	public java.lang.String getS3AwsRegion(){
		return this.s3AwsRegion;
	}
	
	/**
	 * Define s3AwsRegion
	 * @param s3AwsRegion s3AwsRegion
	 * @generated
	 */
	public Config setS3AwsRegion(java.lang.String s3AwsRegion){
		this.s3AwsRegion = s3AwsRegion;
		return this;
	}
	
	/**
	 * Obtém s3AwsSecretAccessKey
	 * @param s3AwsSecretAccessKey s3AwsSecretAccessKey
	 * return s3AwsSecretAccessKey
	 * @generated
	 */
	public java.lang.String getS3AwsSecretAccessKey(){
		return this.s3AwsSecretAccessKey;
	}
	
	/**
	 * Define s3AwsSecretAccessKey
	 * @param s3AwsSecretAccessKey s3AwsSecretAccessKey
	 * @generated
	 */
	public Config setS3AwsSecretAccessKey(java.lang.String s3AwsSecretAccessKey){
		this.s3AwsSecretAccessKey = s3AwsSecretAccessKey;
		return this;
	}
	
	/**
	 * Obtém s3Host
	 * @param s3Host s3Host
	 * return s3Host
	 * @generated
	 */
	public java.lang.String getS3Host(){
		return this.s3Host;
	}
	
	/**
	 * Define s3Host
	 * @param s3Host s3Host
	 * @generated
	 */
	public Config setS3Host(java.lang.String s3Host){
		this.s3Host = s3Host;
		return this;
	}
	
	/**
	 * Obtém s3Location
	 * @param s3Location s3Location
	 * return s3Location
	 * @generated
	 */
	public boolean getS3Location(){
		return this.s3Location;
	}
	
	/**
	 * Define s3Location
	 * @param s3Location s3Location
	 * @generated
	 */
	public Config setS3Location(boolean s3Location){
		this.s3Location = s3Location;
		return this;
	}
	
	/**
	 * Obtém s3ResourceHost
	 * @param s3ResourceHost s3ResourceHost
	 * return s3ResourceHost
	 * @generated
	 */
	public java.lang.String getS3ResourceHost(){
		return this.s3ResourceHost;
	}
	
	/**
	 * Define s3ResourceHost
	 * @param s3ResourceHost s3ResourceHost
	 * @generated
	 */
	public Config setS3ResourceHost(java.lang.String s3ResourceHost){
		this.s3ResourceHost = s3ResourceHost;
		return this;
	}
	
	/**
	 * Obtém sgaHost
	 * @param sgaHost sgaHost
	 * return sgaHost
	 * @generated
	 */
	public java.lang.String getSgaHost(){
		return this.sgaHost;
	}
	
	/**
	 * Define sgaHost
	 * @param sgaHost sgaHost
	 * @generated
	 */
	public Config setSgaHost(java.lang.String sgaHost){
		this.sgaHost = sgaHost;
		return this;
	}
	
	/**
	 * Obtém sgaLightActiveWebservice
	 * @param sgaLightActiveWebservice sgaLightActiveWebservice
	 * return sgaLightActiveWebservice
	 * @generated
	 */
	public java.lang.String getSgaLightActiveWebservice(){
		return this.sgaLightActiveWebservice;
	}
	
	/**
	 * Define sgaLightActiveWebservice
	 * @param sgaLightActiveWebservice sgaLightActiveWebservice
	 * @generated
	 */
	public Config setSgaLightActiveWebservice(java.lang.String sgaLightActiveWebservice){
		this.sgaLightActiveWebservice = sgaLightActiveWebservice;
		return this;
	}
	
	/**
	 * Obtém sgaLightServiceUrl
	 * @param sgaLightServiceUrl sgaLightServiceUrl
	 * return sgaLightServiceUrl
	 * @generated
	 */
	public java.lang.String getSgaLightServiceUrl(){
		return this.sgaLightServiceUrl;
	}
	
	/**
	 * Define sgaLightServiceUrl
	 * @param sgaLightServiceUrl sgaLightServiceUrl
	 * @generated
	 */
	public Config setSgaLightServiceUrl(java.lang.String sgaLightServiceUrl){
		this.sgaLightServiceUrl = sgaLightServiceUrl;
		return this;
	}
	
	/**
	 * Obtém sgaLightSmsWebservice
	 * @param sgaLightSmsWebservice sgaLightSmsWebservice
	 * return sgaLightSmsWebservice
	 * @generated
	 */
	public java.lang.String getSgaLightSmsWebservice(){
		return this.sgaLightSmsWebservice;
	}
	
	/**
	 * Define sgaLightSmsWebservice
	 * @param sgaLightSmsWebservice sgaLightSmsWebservice
	 * @generated
	 */
	public Config setSgaLightSmsWebservice(java.lang.String sgaLightSmsWebservice){
		this.sgaLightSmsWebservice = sgaLightSmsWebservice;
		return this;
	}
	
	/**
	 * Obtém sgaLightWebservice
	 * @param sgaLightWebservice sgaLightWebservice
	 * return sgaLightWebservice
	 * @generated
	 */
	public java.lang.String getSgaLightWebservice(){
		return this.sgaLightWebservice;
	}
	
	/**
	 * Define sgaLightWebservice
	 * @param sgaLightWebservice sgaLightWebservice
	 * @generated
	 */
	public Config setSgaLightWebservice(java.lang.String sgaLightWebservice){
		this.sgaLightWebservice = sgaLightWebservice;
		return this;
	}
	
	/**
	 * Obtém sgaLightWebservicePort
	 * @param sgaLightWebservicePort sgaLightWebservicePort
	 * return sgaLightWebservicePort
	 * @generated
	 */
	public java.lang.String getSgaLightWebservicePort(){
		return this.sgaLightWebservicePort;
	}
	
	/**
	 * Define sgaLightWebservicePort
	 * @param sgaLightWebservicePort sgaLightWebservicePort
	 * @generated
	 */
	public Config setSgaLightWebservicePort(java.lang.String sgaLightWebservicePort){
		this.sgaLightWebservicePort = sgaLightWebservicePort;
		return this;
	}
	
	/**
	 * Obtém trackerModemCellChip
	 * @param trackerModemCellChip trackerModemCellChip
	 * return trackerModemCellChip
	 * @generated
	 */
	public java.lang.String getTrackerModemCellChip(){
		return this.trackerModemCellChip;
	}
	
	/**
	 * Define trackerModemCellChip
	 * @param trackerModemCellChip trackerModemCellChip
	 * @generated
	 */
	public Config setTrackerModemCellChip(java.lang.String trackerModemCellChip){
		this.trackerModemCellChip = trackerModemCellChip;
		return this;
	}
	
	/**
	 * Obtém trackerPort
	 * @param trackerPort trackerPort
	 * return trackerPort
	 * @generated
	 */
	public java.lang.String getTrackerPort(){
		return this.trackerPort;
	}
	
	/**
	 * Define trackerPort
	 * @param trackerPort trackerPort
	 * @generated
	 */
	public Config setTrackerPort(java.lang.String trackerPort){
		this.trackerPort = trackerPort;
		return this;
	}
	
	/**
	 * Obtém trackerWebservice
	 * @param trackerWebservice trackerWebservice
	 * return trackerWebservice
	 * @generated
	 */
	public java.lang.String getTrackerWebservice(){
		return this.trackerWebservice;
	}
	
	/**
	 * Define trackerWebservice
	 * @param trackerWebservice trackerWebservice
	 * @generated
	 */
	public Config setTrackerWebservice(java.lang.String trackerWebservice){
		this.trackerWebservice = trackerWebservice;
		return this;
	}
	
	/**
	 * Obtém urlGerarBoleto
	 * @param urlGerarBoleto urlGerarBoleto
	 * return urlGerarBoleto
	 * @generated
	 */
	public java.lang.String getUrlGerarBoleto(){
		return this.urlGerarBoleto;
	}
	
	/**
	 * Define urlGerarBoleto
	 * @param urlGerarBoleto urlGerarBoleto
	 * @generated
	 */
	public Config setUrlGerarBoleto(java.lang.String urlGerarBoleto){
		this.urlGerarBoleto = urlGerarBoleto;
		return this;
	}
	
	/**
	 * Obtém webservices
	 * @param webservices webservices
	 * return webservices
	 * @generated
	 */
	public java.lang.String getWebservices(){
		return this.webservices;
	}
	
	/**
	 * Define webservices
	 * @param webservices webservices
	 * @generated
	 */
	public Config setWebservices(java.lang.String webservices){
		this.webservices = webservices;
		return this;
	}
	
	/**
	 * Obtém wsLeads
	 * @param wsLeads wsLeads
	 * return wsLeads
	 * @generated
	 */
	public java.lang.String getWsLeads(){
		return this.wsLeads;
	}
	
	/**
	 * Define wsLeads
	 * @param wsLeads wsLeads
	 * @generated
	 */
	public Config setWsLeads(java.lang.String wsLeads){
		this.wsLeads = wsLeads;
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
	    
	    if(!(obj instanceof Config))
	      return false;
	    
	    Config other = (Config)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
