package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de AgencyBusiness
 * 
 * @generated
 **/
@Service("AgencyBusiness")
public class AgencyBusiness {

    /**
     * Instância da classe AgencyDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("AgencyDAO")
    protected AgencyDAO repository;

    /**
     * Método de acesso ao AgencyDAO
     * 
     * @generated
     */
    public AgencyDAO getRepository() {
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
  /**
   * @generated modifiable
   */  
  public List<Wrapper> listWrapper(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Wrapper> result = repository.listWrapper(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteWrapper(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteWrapper(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
