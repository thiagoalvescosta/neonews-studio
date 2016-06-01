package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de PatrimonySituationBusiness
 * 
 * @generated
 **/
@Service("PatrimonySituationBusiness")
public class PatrimonySituationBusiness {

    /**
     * Instância da classe PatrimonySituationDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("PatrimonySituationDAO")
    protected PatrimonySituationDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public PatrimonySituation post(final PatrimonySituation entity) throws Exception {
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
    public PatrimonySituation get(java.lang.String sitId) throws Exception {
      // begin-user-code  
      // end-user-code        
       PatrimonySituation result = repository.findOne(sitId);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public PatrimonySituation put(final PatrimonySituation entity) throws Exception {
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
    public PatrimonySituation put(final java.lang.String id,final PatrimonySituation entity) throws Exception {
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
    public void delete( java.lang.String sitId) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(sitId);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public List<PatrimonySituation> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<PatrimonySituation> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public List<Patrimony> findPatrimony(java.lang.String sitId,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Patrimony> result = repository.findPatrimony(sitId,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}

