package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de UsuarioBusiness
 * 
 * @generated
 **/
@Service("UsuarioBusiness")
public class UsuarioBusiness {

    /**
     * Instância da classe UsuarioDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("UsuarioDAO")
    protected UsuarioDAO repository;

    /**
     * Método de acesso ao UsuarioDAO
     * 
     * @generated
     */
    public UsuarioDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<NeonewsUser> findNeonewsUser(java.lang.Integer codigo,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<NeonewsUser> result = repository.findNeonewsUser(codigo,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Address> listAddress(java.lang.Integer codigo,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Address> result = repository.listAddress(codigo,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteAddress(java.lang.Integer instanceCodigo, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteAddress(instanceCodigo, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Company> listCompany(java.lang.Integer codigo,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany(codigo,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany(java.lang.Integer instanceCodigo, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany(instanceCodigo, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
