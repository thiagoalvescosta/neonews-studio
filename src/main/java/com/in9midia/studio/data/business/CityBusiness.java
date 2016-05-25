package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CityBusiness
 * 
 * @generated
 **/
@Service("CityBusiness")
public class CityBusiness {

    /**
     * Instância da classe CityDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CityDAO")
    protected CityDAO repository;

    /**
     * Método de acesso ao CityDAO
     * 
     * @generated
     */
    public CityDAO getRepository() {
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
  public List<OriginDestination> findOriginDestination(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<OriginDestination> result = repository.findOriginDestination(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<OriginDestination> findOriginDestination_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<OriginDestination> result = repository.findOriginDestination_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<OriginDestination> findOriginDestination_3(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<OriginDestination> result = repository.findOriginDestination_3(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<OriginDestination> findOriginDestination_4(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<OriginDestination> result = repository.findOriginDestination_4(id,  pageable );
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
