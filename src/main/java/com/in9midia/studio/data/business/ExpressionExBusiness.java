package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ExpressionExBusiness
 * 
 * @generated
 **/
@Service("ExpressionExBusiness")
public class ExpressionExBusiness {

    /**
     * Instância da classe ExpressionExDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ExpressionExDAO")
    protected ExpressionExDAO repository;

    /**
     * Método de acesso ao ExpressionExDAO
     * 
     * @generated
     */
    public ExpressionExDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Agency> findAgency(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Agency> result = repository.findAgency(id,  pageable );
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
  /**
   * @generated modifiable
   */  
  public List<File> listFile(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<File> result = repository.listFile(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteFile(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteFile(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
