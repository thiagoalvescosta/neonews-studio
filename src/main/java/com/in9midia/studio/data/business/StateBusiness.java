package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de StateBusiness
 * 
 * @generated
 **/
@Service("StateBusiness")
public class StateBusiness {

    /**
     * Instância da classe StateDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("StateDAO")
    protected StateDAO repository;

    /**
     * Método de acesso ao StateDAO
     * 
     * @generated
     */
    public StateDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Address> findAddress(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Address> result = repository.findAddress(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<City> findCity_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<City> result = repository.findCity_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<City> listCity(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<City> result = repository.listCity(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCity(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCity(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Country> listCountry(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Country> result = repository.listCountry(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCountry(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCountry(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
