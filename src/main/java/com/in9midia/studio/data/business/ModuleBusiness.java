package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ModuleBusiness
 * 
 * @generated
 **/
@Service("ModuleBusiness")
public class ModuleBusiness {

    /**
     * Instância da classe ModuleDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ModuleDAO")
    protected ModuleDAO repository;

    /**
     * Método de acesso ao ModuleDAO
     * 
     * @generated
     */
    public ModuleDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Campaign> findCampaign(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Campaign> result = repository.findCampaign(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<ModuleProperty> findModuleProperty(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ModuleProperty> result = repository.findModuleProperty(id,  pageable );
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
  public List<Theme> findTheme_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Theme> result = repository.findTheme_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<CampaignBlock> listCampaignBlock(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<CampaignBlock> result = repository.listCampaignBlock(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaignBlock(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaignBlock(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<CampaignCategory> listCampaignCategory(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<CampaignCategory> result = repository.listCampaignCategory(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaignCategory(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaignCategory(instanceId, relationId);
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
  public List<PropertyType> listPropertyType(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<PropertyType> result = repository.listPropertyType(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deletePropertyType(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deletePropertyType(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Company> listCompany_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<NwsChannel> listNwsChannel(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<NwsChannel> result = repository.listNwsChannel(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteNwsChannel(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteNwsChannel(instanceId, relationId);
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
