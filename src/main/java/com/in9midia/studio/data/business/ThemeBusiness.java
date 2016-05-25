package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ThemeBusiness
 * 
 * @generated
 **/
@Service("ThemeBusiness")
public class ThemeBusiness {

    /**
     * Instância da classe ThemeDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ThemeDAO")
    protected ThemeDAO repository;

    /**
     * Método de acesso ao ThemeDAO
     * 
     * @generated
     */
    public ThemeDAO getRepository() {
        return repository;
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
  public List<Agency> listAgency(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Agency> result = repository.listAgency(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteAgency(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteAgency(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Wrapper> listWrapper(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Wrapper> result = repository.listWrapper(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteWrapper(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteWrapper(instanceId, relationId);
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
  public List<Module> listModule(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Module> result = repository.listModule(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteModule(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteModule(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<NwsChannel> listNwsChannel_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<NwsChannel> result = repository.listNwsChannel_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteNwsChannel_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteNwsChannel_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
