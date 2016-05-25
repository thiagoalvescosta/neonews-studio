package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ParticipantBusiness
 * 
 * @generated
 **/
@Service("ParticipantBusiness")
public class ParticipantBusiness {

    /**
     * Instância da classe ParticipantDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ParticipantDAO")
    protected ParticipantDAO repository;

    /**
     * Método de acesso ao ParticipantDAO
     * 
     * @generated
     */
    public ParticipantDAO getRepository() {
        return repository;
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



}
