package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de UserCompanyBusiness
 * 
 * @generated
 **/
@Service("UserCompanyBusiness")
public class UserCompanyBusiness {

    /**
     * Instância da classe UserCompanyDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("UserCompanyDAO")
    protected UserCompanyDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public UserCompany post(final UserCompany entity) throws Exception {
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
    public UserCompany get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       UserCompany result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public UserCompany put(final UserCompany entity) throws Exception {
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
    public UserCompany put(final java.lang.String id,final UserCompany entity) throws Exception {
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
  public List<UserCompany> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<UserCompany> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    



}

