package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de RegionBusiness
 * 
 * @generated
 **/
@Service("RegionBusiness")
public class RegionBusiness {

    /**
     * Instância da classe RegionDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("RegionDAO")
    protected RegionDAO repository;

    /**
     * Método de acesso ao RegionDAO
     * 
     * @generated
     */
    public RegionDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<CampaignRegion> findCampaignRegion(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignRegion> result = repository.findCampaignRegion(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<SchedulePredicateRegion> findSchedulePredicateRegion(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<SchedulePredicateRegion> result = repository.findSchedulePredicateRegion(id,  pageable );
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
  public List<SchedulePredicate> listSchedulePredicate(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<SchedulePredicate> result = repository.listSchedulePredicate(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteSchedulePredicate(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteSchedulePredicate(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
