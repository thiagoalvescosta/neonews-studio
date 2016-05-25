package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de WrapperBusiness
 * 
 * @generated
 **/
@Service("WrapperBusiness")
public class WrapperBusiness {

    /**
     * Instância da classe WrapperDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("WrapperDAO")
    protected WrapperDAO repository;

    /**
     * Método de acesso ao WrapperDAO
     * 
     * @generated
     */
    public WrapperDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<NwsChannel> findNwsChannel(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<NwsChannel> result = repository.findNwsChannel(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Agency> listAgency(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Agency> result = repository.listAgency(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteAgency(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteAgency(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Theme> listTheme(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Theme> result = repository.listTheme(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTheme(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTheme(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
