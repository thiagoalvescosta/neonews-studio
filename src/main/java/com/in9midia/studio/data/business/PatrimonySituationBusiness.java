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

    /**
     * Método de acesso ao PatrimonySituationDAO
     * 
     * @generated
     */
    public PatrimonySituationDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Patrimony> findPatrimony(java.lang.String sitId,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Patrimony> result = repository.findPatrimony(sitId,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<PatrimonyType> listPatrimonyType(java.lang.String sitId,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<PatrimonyType> result = repository.listPatrimonyType(sitId,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deletePatrimonyType(java.lang.String instanceSitId, java.lang.String relationTypId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deletePatrimonyType(instanceSitId, relationTypId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
