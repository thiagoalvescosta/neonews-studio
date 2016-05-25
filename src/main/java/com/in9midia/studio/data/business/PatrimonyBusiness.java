package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de PatrimonyBusiness
 * 
 * @generated
 **/
@Service("PatrimonyBusiness")
public class PatrimonyBusiness {

    /**
     * Instância da classe PatrimonyDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("PatrimonyDAO")
    protected PatrimonyDAO repository;

    /**
     * Método de acesso ao PatrimonyDAO
     * 
     * @generated
     */
    public PatrimonyDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<PatrimonyRemote> findPatrimonyRemote(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<PatrimonyRemote> result = repository.findPatrimonyRemote(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}
