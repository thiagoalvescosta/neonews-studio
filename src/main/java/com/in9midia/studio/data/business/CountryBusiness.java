package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CountryBusiness
 * 
 * @generated
 **/
@Service("CountryBusiness")
public class CountryBusiness {

    /**
     * Instância da classe CountryDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CountryDAO")
    protected CountryDAO repository;

    /**
     * Método de acesso ao CountryDAO
     * 
     * @generated
     */
    public CountryDAO getRepository() {
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
  public List<State> findState_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<State> result = repository.findState_2(id,  pageable );
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
  public List<State> listState(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<State> result = repository.listState(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteState(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteState(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
