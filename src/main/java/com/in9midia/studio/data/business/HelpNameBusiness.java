package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de HelpNameBusiness
 * 
 * @generated
 **/
@Service("HelpNameBusiness")
public class HelpNameBusiness {

    /**
     * Instância da classe HelpNameDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("HelpNameDAO")
    protected HelpNameDAO repository;

    /**
     * Método de acesso ao HelpNameDAO
     * 
     * @generated
     */
    public HelpNameDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<HelpContent> findHelpContent(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<HelpContent> result = repository.findHelpContent(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<HelpDocument> listHelpDocument(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<HelpDocument> result = repository.listHelpDocument(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteHelpDocument(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteHelpDocument(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
