package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ScheduleBusiness
 * 
 * @generated
 **/
@Service("ScheduleBusiness")
public class ScheduleBusiness {

    /**
     * Instância da classe ScheduleDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ScheduleDAO")
    protected ScheduleDAO repository;

    /**
     * Método de acesso ao ScheduleDAO
     * 
     * @generated
     */
    public ScheduleDAO getRepository() {
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
  public List<Profile> findProfile_5(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile_5(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<SchedulePredicate> findSchedulePredicate(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<SchedulePredicate> result = repository.findSchedulePredicate(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Terminal> findTerminal(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.findTerminal(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Terminal> findTerminal_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.findTerminal_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Terminal> findTerminal_3(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.findTerminal_3(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Terminal> findTerminal_4(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.findTerminal_4(id,  pageable );
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
  public List<ProfileTv> listProfileTv(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<ProfileTv> result = repository.listProfileTv(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteProfileTv(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteProfileTv(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
