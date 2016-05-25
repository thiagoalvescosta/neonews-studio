package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de NeonewsUserBusiness
 * 
 * @generated
 **/
@Service("NeonewsUserBusiness")
public class NeonewsUserBusiness {

    /**
     * Instância da classe NeonewsUserDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("NeonewsUserDAO")
    protected NeonewsUserDAO repository;

    /**
     * Método de acesso ao NeonewsUserDAO
     * 
     * @generated
     */
    public NeonewsUserDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<UserCompany> findUserCompany(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<UserCompany> result = repository.findUserCompany(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Company> listCompany(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
