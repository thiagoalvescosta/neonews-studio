package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de RouteStopBusiness
 * 
 * @generated
 **/
@Service("RouteStopBusiness")
public class RouteStopBusiness {

    /**
     * Instância da classe RouteStopDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("RouteStopDAO")
    protected RouteStopDAO repository;

    /**
     * Método de acesso ao RouteStopDAO
     * 
     * @generated
     */
    public RouteStopDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<TerminalMovementStop> findTerminalMovementStop(java.lang.String rouStopId,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TerminalMovementStop> result = repository.findTerminalMovementStop(rouStopId,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<TerminalMovement> listTerminalMovement(java.lang.String rouStopId,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<TerminalMovement> result = repository.listTerminalMovement(rouStopId,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminalMovement(java.lang.String instanceRouStopId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminalMovement(instanceRouStopId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
