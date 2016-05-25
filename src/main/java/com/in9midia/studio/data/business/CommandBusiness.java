package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CommandBusiness
 * 
 * @generated
 **/
@Service("CommandBusiness")
public class CommandBusiness {

    /**
     * Instância da classe CommandDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CommandDAO")
    protected CommandDAO repository;

    /**
     * Método de acesso ao CommandDAO
     * 
     * @generated
     */
    public CommandDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<CommandParam> findCommandParam(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CommandParam> result = repository.findCommandParam(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}
