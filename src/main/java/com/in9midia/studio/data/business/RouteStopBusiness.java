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

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public RouteStop post(final RouteStop entity) throws Exception {
      // begin-user-code  
      // end-user-code  
      repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public RouteStop get(java.lang.String rouStopId) throws Exception {
      // begin-user-code  
      // end-user-code        
       RouteStop result = repository.findOne(rouStopId);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public RouteStop put(final RouteStop entity) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    public RouteStop put(final java.lang.String id,final RouteStop entity) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String rouStopId) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(rouStopId);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public List<RouteStop> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<RouteStop> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
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
   * ManyToMany Relation
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
   * ManyToMany Relation
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

