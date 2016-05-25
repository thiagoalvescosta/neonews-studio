package com.in9midia.studio.data.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * Classe que representa a tabela FR_USUARIO
 * @generated
 */
@Entity
@Table(name = "\"FR_USUARIO\""


)
@XmlRootElement
public class Usuario implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1531810550l;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_administrador", nullable = false, unique = false)
	private java.lang.String administrador;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "usr_chat_last_sync", nullable = true, unique = false)
	private Date chatLastSync;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "usr_codigo")
	private java.lang.Integer codigo;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_dias_expiracao", nullable = true, unique = false)
	private java.lang.Integer diasExpiracao;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_digital", nullable = true, unique = false)
	private java.lang.Long digital;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_email", nullable = true, unique = false)
	private java.lang.String email;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "usr_inicio_expiracao", nullable = true, unique = false)
	private Date inicioExpiracao;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_key_active", nullable = true, unique = false)
	private java.lang.String keyActive;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_last_company_id", nullable = true, unique = false)
	private java.lang.String lastCompanyId;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_login", nullable = false, unique = false)
	private java.lang.String login;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_nome", nullable = false, unique = false)
	private java.lang.String nome;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_senha", nullable = true, unique = false)
	private java.lang.String senha;
	
	/**
	 * @generated
	 */
	@Column(name = "usr_tipo_expiracao", nullable = false, unique = false)
	private java.lang.String tipoExpiracao;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Usuario(){
	}

	
	/**
	 * Obtém administrador
	 * @param administrador administrador
	 * return administrador
	 * @generated
	 */
	public java.lang.String getAdministrador(){
		return this.administrador;
	}
	
	/**
	 * Define administrador
	 * @param administrador administrador
	 * @generated
	 */
	public Usuario setAdministrador(java.lang.String administrador){
		this.administrador = administrador;
		return this;
	}
	
	/**
	 * Obtém chatLastSync
	 * @param chatLastSync chatLastSync
	 * return chatLastSync
	 * @generated
	 */
	public Date getChatLastSync(){
		return this.chatLastSync;
	}
	
	/**
	 * Define chatLastSync
	 * @param chatLastSync chatLastSync
	 * @generated
	 */
	public Usuario setChatLastSync(Date chatLastSync){
		this.chatLastSync = chatLastSync;
		return this;
	}
	
	/**
	 * Obtém codigo
	 * @param codigo codigo
	 * return codigo
	 * @generated
	 */
	public java.lang.Integer getCodigo(){
		return this.codigo;
	}
	
	/**
	 * Define codigo
	 * @param codigo codigo
	 * @generated
	 */
	public Usuario setCodigo(java.lang.Integer codigo){
		this.codigo = codigo;
		return this;
	}
	
	/**
	 * Obtém diasExpiracao
	 * @param diasExpiracao diasExpiracao
	 * return diasExpiracao
	 * @generated
	 */
	public java.lang.Integer getDiasExpiracao(){
		return this.diasExpiracao;
	}
	
	/**
	 * Define diasExpiracao
	 * @param diasExpiracao diasExpiracao
	 * @generated
	 */
	public Usuario setDiasExpiracao(java.lang.Integer diasExpiracao){
		this.diasExpiracao = diasExpiracao;
		return this;
	}
	
	/**
	 * Obtém digital
	 * @param digital digital
	 * return digital
	 * @generated
	 */
	public java.lang.Long getDigital(){
		return this.digital;
	}
	
	/**
	 * Define digital
	 * @param digital digital
	 * @generated
	 */
	public Usuario setDigital(java.lang.Long digital){
		this.digital = digital;
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
	public Usuario setEmail(java.lang.String email){
		this.email = email;
		return this;
	}
	
	/**
	 * Obtém inicioExpiracao
	 * @param inicioExpiracao inicioExpiracao
	 * return inicioExpiracao
	 * @generated
	 */
	public Date getInicioExpiracao(){
		return this.inicioExpiracao;
	}
	
	/**
	 * Define inicioExpiracao
	 * @param inicioExpiracao inicioExpiracao
	 * @generated
	 */
	public Usuario setInicioExpiracao(Date inicioExpiracao){
		this.inicioExpiracao = inicioExpiracao;
		return this;
	}
	
	/**
	 * Obtém keyActive
	 * @param keyActive keyActive
	 * return keyActive
	 * @generated
	 */
	public java.lang.String getKeyActive(){
		return this.keyActive;
	}
	
	/**
	 * Define keyActive
	 * @param keyActive keyActive
	 * @generated
	 */
	public Usuario setKeyActive(java.lang.String keyActive){
		this.keyActive = keyActive;
		return this;
	}
	
	/**
	 * Obtém lastCompanyId
	 * @param lastCompanyId lastCompanyId
	 * return lastCompanyId
	 * @generated
	 */
	public java.lang.String getLastCompanyId(){
		return this.lastCompanyId;
	}
	
	/**
	 * Define lastCompanyId
	 * @param lastCompanyId lastCompanyId
	 * @generated
	 */
	public Usuario setLastCompanyId(java.lang.String lastCompanyId){
		this.lastCompanyId = lastCompanyId;
		return this;
	}
	
	/**
	 * Obtém login
	 * @param login login
	 * return login
	 * @generated
	 */
	public java.lang.String getLogin(){
		return this.login;
	}
	
	/**
	 * Define login
	 * @param login login
	 * @generated
	 */
	public Usuario setLogin(java.lang.String login){
		this.login = login;
		return this;
	}
	
	/**
	 * Obtém nome
	 * @param nome nome
	 * return nome
	 * @generated
	 */
	public java.lang.String getNome(){
		return this.nome;
	}
	
	/**
	 * Define nome
	 * @param nome nome
	 * @generated
	 */
	public Usuario setNome(java.lang.String nome){
		this.nome = nome;
		return this;
	}
	
	/**
	 * Obtém senha
	 * @param senha senha
	 * return senha
	 * @generated
	 */
	public java.lang.String getSenha(){
		return this.senha;
	}
	
	/**
	 * Define senha
	 * @param senha senha
	 * @generated
	 */
	public Usuario setSenha(java.lang.String senha){
		this.senha = senha;
		return this;
	}
	
	/**
	 * Obtém tipoExpiracao
	 * @param tipoExpiracao tipoExpiracao
	 * return tipoExpiracao
	 * @generated
	 */
	public java.lang.String getTipoExpiracao(){
		return this.tipoExpiracao;
	}
	
	/**
	 * Define tipoExpiracao
	 * @param tipoExpiracao tipoExpiracao
	 * @generated
	 */
	public Usuario setTipoExpiracao(java.lang.String tipoExpiracao){
		this.tipoExpiracao = tipoExpiracao;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());

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
	    
	    if(!(obj instanceof Usuario))
	      return false;
	    
	    Usuario other = (Usuario)obj;
	    
		if(this.codigo == null && other.codigo != null)
	    	return false;
	    else if(!this.codigo.equals(other.codigo))
	     	return false;
	

	    return true;
	    
	}
}
