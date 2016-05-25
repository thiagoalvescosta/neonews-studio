package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ResolutionBusiness
 * 
 * @generated
 **/
@Service("ResolutionBusiness")
public class ResolutionBusiness {

    /**
     * Instância da classe ResolutionDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ResolutionDAO")
    protected ResolutionDAO repository;

    /**
     * Método de acesso ao ResolutionDAO
     * 
     * @generated
     */
    public ResolutionDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<CampaignProperty> findCampaignProperty(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignProperty> result = repository.findCampaignProperty(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<TvType> findTvType(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TvType> result = repository.findTvType(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Campaign> listCampaign(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Campaign> result = repository.listCampaign(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaign(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaign(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<ModuleProperty> listModuleProperty(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<ModuleProperty> result = repository.listModuleProperty(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteModuleProperty(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteModuleProperty(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
