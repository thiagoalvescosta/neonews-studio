package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de SchedulePredicateBusiness
 * 
 * @generated
 **/
@Service("SchedulePredicateBusiness")
public class SchedulePredicateBusiness {

    /**
     * Instância da classe SchedulePredicateDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("SchedulePredicateDAO")
    protected SchedulePredicateDAO repository;

    /**
     * Método de acesso ao SchedulePredicateDAO
     * 
     * @generated
     */
    public SchedulePredicateDAO getRepository() {
        return repository;
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
  public List<SchedulePredicateTerminal> findSchedulePredicateTerminal(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<SchedulePredicateTerminal> result = repository.findSchedulePredicateTerminal(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<ScheduleTime> findScheduleTime(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ScheduleTime> result = repository.findScheduleTime(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Region> listRegion(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Region> result = repository.listRegion(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteRegion(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteRegion(instanceId, relationId);
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
