package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TempBusiness
 * 
 * @generated
 **/
@Service("TempBusiness")
public class TempBusiness {

    /**
     * Instância da classe TempDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TempDAO")
    protected TempDAO repository;

    /**
     * Método de acesso ao TempDAO
     * 
     * @generated
     */
    public TempDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Channel> findChannel(java.lang.String conId,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Channel> result = repository.findChannel(conId,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}
