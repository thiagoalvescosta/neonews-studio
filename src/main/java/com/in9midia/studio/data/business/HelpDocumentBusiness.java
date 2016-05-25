package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de HelpDocumentBusiness
 * 
 * @generated
 **/
@Service("HelpDocumentBusiness")
public class HelpDocumentBusiness {

    /**
     * Instância da classe HelpDocumentDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("HelpDocumentDAO")
    protected HelpDocumentDAO repository;

    /**
     * Método de acesso ao HelpDocumentDAO
     * 
     * @generated
     */
    public HelpDocumentDAO getRepository() {
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
  public List<HelpName> listHelpName(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<HelpName> result = repository.listHelpName(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteHelpName(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteHelpName(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
