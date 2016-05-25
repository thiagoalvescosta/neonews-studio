package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de NwsChannelBusiness
 * 
 * @generated
 **/
@Service("NwsChannelBusiness")
public class NwsChannelBusiness {

    /**
     * Instância da classe NwsChannelDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("NwsChannelDAO")
    protected NwsChannelDAO repository;

    /**
     * Método de acesso ao NwsChannelDAO
     * 
     * @generated
     */
    public NwsChannelDAO getRepository() {
        return repository;
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
  public List<Theme> listTheme(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Theme> result = repository.listTheme(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTheme(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTheme(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
