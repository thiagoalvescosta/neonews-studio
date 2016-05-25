package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ProfileTvBusiness
 * 
 * @generated
 **/
@Service("ProfileTvBusiness")
public class ProfileTvBusiness {

    /**
     * Instância da classe ProfileTvDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ProfileTvDAO")
    protected ProfileTvDAO repository;

    /**
     * Método de acesso ao ProfileTvDAO
     * 
     * @generated
     */
    public ProfileTvDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<CampaignBlock> findCampaignBlock(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignBlock> result = repository.findCampaignBlock(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Profile> listProfile(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.listProfile(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteProfile(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteProfile(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Schedule> listSchedule(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Schedule> result = repository.listSchedule(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteSchedule(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteSchedule(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
