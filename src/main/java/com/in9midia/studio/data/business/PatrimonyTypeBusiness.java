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

    /**
     * Método de acesso ao PatrimonyTypeDAO
     * 
     * @generated
     */
    public PatrimonyTypeDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Patrimony> findPatrimony(java.lang.String typId,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Patrimony> result = repository.findPatrimony(typId,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<PatrimonySituation> listPatrimonySituation(java.lang.String typId,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<PatrimonySituation> result = repository.listPatrimonySituation(typId,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deletePatrimonySituation(java.lang.String instanceTypId, java.lang.String relationSitId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deletePatrimonySituation(instanceTypId, relationSitId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
