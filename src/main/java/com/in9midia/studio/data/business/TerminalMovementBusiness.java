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

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public TerminalMovement post(final TerminalMovement entity) throws Exception {
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
    public TerminalMovement get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       TerminalMovement result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public TerminalMovement put(final TerminalMovement entity) throws Exception {
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
    public TerminalMovement put(final java.lang.String id,final TerminalMovement entity) throws Exception {
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
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public List<TerminalMovement> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<TerminalMovement> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
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
   * ManyToMany Relation
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
   * ManyToMany Relation
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

