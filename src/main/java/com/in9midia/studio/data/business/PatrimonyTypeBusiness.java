package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de PatrimonyTypeBusiness
 * 
 * @generated
 **/
@Service("PatrimonyTypeBusiness")
public class PatrimonyTypeBusiness {

    /**
     * Instância da classe PatrimonyTypeDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("PatrimonyTypeDAO")
    protected PatrimonyTypeDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public PatrimonyType post(final PatrimonyType entity) throws Exception {
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
    public PatrimonyType get(java.lang.String typId) throws Exception {
      // begin-user-code  
      // end-user-code        
       PatrimonyType result = repository.findOne(typId);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public PatrimonyType put(final PatrimonyType entity) throws Exception {
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
    public PatrimonyType put(final java.lang.String id,final PatrimonyType entity) throws Exception {
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
    public void delete( java.lang.String typId) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(typId);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public List<PatrimonyType> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<PatrimonyType> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public List<Patrimony> findPatrimony(java.lang.String typId,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Patrimony> result = repository.findPatrimony(typId,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}

