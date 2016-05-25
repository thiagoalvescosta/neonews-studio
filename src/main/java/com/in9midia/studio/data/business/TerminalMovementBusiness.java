package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TerminalMovementBusiness
 * 
 * @generated
 **/
@Service("TerminalMovementBusiness")
public class TerminalMovementBusiness {

    /**
     * Instância da classe TerminalMovementDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalMovementDAO")
    protected TerminalMovementDAO repository;

    /**
     * Método de acesso ao TerminalMovementDAO
     * 
     * @generated
     */
    public TerminalMovementDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<TerminalMovementStop> findTerminalMovementStop(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TerminalMovementStop> result = repository.findTerminalMovementStop(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<RouteStop> listRouteStop(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<RouteStop> result = repository.listRouteStop(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteRouteStop(java.lang.String instanceId, java.lang.String relationRouStopId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteRouteStop(instanceId, relationRouStopId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
