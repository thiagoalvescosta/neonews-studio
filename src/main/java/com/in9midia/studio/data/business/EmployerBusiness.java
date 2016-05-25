package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de EmployerBusiness
 * 
 * @generated
 **/
@Service("EmployerBusiness")
public class EmployerBusiness {

    /**
     * Instância da classe EmployerDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("EmployerDAO")
    protected EmployerDAO repository;

    /**
     * Método de acesso ao EmployerDAO
     * 
     * @generated
     */
    public EmployerDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<TerminalAudience> findTerminalAudience(java.lang.String card,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TerminalAudience> result = repository.findTerminalAudience(card,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Terminal> listTerminal(java.lang.String card,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.listTerminal(card,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminal(java.lang.String instanceCard, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminal(instanceCard, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
