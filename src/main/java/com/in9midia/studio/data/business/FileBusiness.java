package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de FileBusiness
 * 
 * @generated
 **/
@Service("FileBusiness")
public class FileBusiness {

    /**
     * Instância da classe FileDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("FileDAO")
    protected FileDAO repository;

    /**
     * Método de acesso ao FileDAO
     * 
     * @generated
     */
    public FileDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Agency> findAgency(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Agency> result = repository.findAgency(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Company> findCompany_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.findCompany_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Config> findConfig(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Config> result = repository.findConfig(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Content> findContent(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Content> result = repository.findContent(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<NwsChannel> findNwsChannel(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<NwsChannel> result = repository.findNwsChannel(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<NwsChannel> findNwsChannel_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<NwsChannel> result = repository.findNwsChannel_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<NwsChannel> findNwsChannel_3(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<NwsChannel> result = repository.findNwsChannel_3(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<NwsChannel> findNwsChannel_4(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<NwsChannel> result = repository.findNwsChannel_4(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Participant> findParticipant(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Participant> result = repository.findParticipant(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Profile> findProfile(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Profile> findProfile_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Profile> findProfile_3(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile_3(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Profile> findProfile_4(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile_4(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Route> findRoute(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Route> result = repository.findRoute(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Route> findRoute_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Route> result = repository.findRoute_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Route> findRoute_3(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Route> result = repository.findRoute_3(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Route> findRoute_4(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Route> result = repository.findRoute_4(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<CampaignTemplate> findCampaignTemplate(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignTemplate> result = repository.findCampaignTemplate(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<CampaignTemplate> findCampaignTemplate_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignTemplate> result = repository.findCampaignTemplate_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<CampaignTemplate> findCampaignTemplate_3(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignTemplate> result = repository.findCampaignTemplate_3(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<CampaignTemplate> findCampaignTemplate_4(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignTemplate> result = repository.findCampaignTemplate_4(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<TerminalAltRoute> findTerminalAltRoute(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TerminalAltRoute> result = repository.findTerminalAltRoute(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Company> listCompany(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<ExpressionEx> listExpressionEx(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<ExpressionEx> result = repository.listExpressionEx(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteExpressionEx(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteExpressionEx(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Address> listAddress(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Address> result = repository.listAddress(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteAddress(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteAddress(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Channel> listChannel(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Channel> result = repository.listChannel(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteChannel(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteChannel(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Template> listTemplate(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Template> result = repository.listTemplate(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTemplate(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTemplate(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Company> listCompany_3(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany_3(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany_3(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany_3(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Content> listContent_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Content> result = repository.listContent_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteContent_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteContent_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Terminal> listTerminal(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.listTerminal(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminal(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminal(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
