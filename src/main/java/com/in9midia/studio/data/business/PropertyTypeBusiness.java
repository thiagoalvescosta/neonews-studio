package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de PropertyTypeBusiness
 * 
 * @generated
 **/
@Service("PropertyTypeBusiness")
public class PropertyTypeBusiness {

    /**
     * Instância da classe PropertyTypeDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("PropertyTypeDAO")
    protected PropertyTypeDAO repository;

    /**
     * Método de acesso ao PropertyTypeDAO
     * 
     * @generated
     */
    public PropertyTypeDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<ModuleProperty> findModuleProperty(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ModuleProperty> result = repository.findModuleProperty(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Module> listModule(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Module> result = repository.listModule(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteModule(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteModule(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
