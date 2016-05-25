package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignCategoryBusiness
 * 
 * @generated
 **/
@Service("CampaignCategoryBusiness")
public class CampaignCategoryBusiness {

    /**
     * Instância da classe CampaignCategoryDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignCategoryDAO")
    protected CampaignCategoryDAO repository;

    /**
     * Método de acesso ao CampaignCategoryDAO
     * 
     * @generated
     */
    public CampaignCategoryDAO getRepository() {
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
  public List<CampaignCategory> findCampaignCategory(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignCategory> result = repository.findCampaignCategory(id,  pageable );
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
}
