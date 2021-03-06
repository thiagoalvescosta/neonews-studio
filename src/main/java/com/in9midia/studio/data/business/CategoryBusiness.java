package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CategoryBusiness
 * 
 * @generated
 **/
@Service("CategoryBusiness")
public class CategoryBusiness {

    /**
     * Instância da classe CategoryDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CategoryDAO")
    protected CategoryDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Category post(final Category entity) throws Exception {
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
    public Category get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Category result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Category put(final Category entity) throws Exception {
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
    public Category put(final java.lang.String id,final Category entity) throws Exception {
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
  public List<Category> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<Category> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public List<Category> findCategory(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Category> result = repository.findCategory(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public List<Terminal> findTerminal(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.findTerminal(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}

