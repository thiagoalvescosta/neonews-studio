package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de RouteBusiness
 * 
 * @generated
 **/
@Service("RouteBusiness")
public class RouteBusiness {

    /**
     * Instância da classe RouteDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("RouteDAO")
    protected RouteDAO repository;

    /**
     * Método de acesso ao RouteDAO
     * 
     * @generated
     */
    public RouteDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<RouteStop> findRouteStop(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<RouteStop> result = repository.findRouteStop(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}
