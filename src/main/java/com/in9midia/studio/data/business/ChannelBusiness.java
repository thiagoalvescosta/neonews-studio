package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ChannelBusiness
 * 
 * @generated
 **/
@Service("ChannelBusiness")
public class ChannelBusiness {

    /**
     * Instância da classe ChannelDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ChannelDAO")
    protected ChannelDAO repository;

    /**
     * Método de acesso ao ChannelDAO
     * 
     * @generated
     */
    public ChannelDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<ChannelPerson> findChannelPerson(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ChannelPerson> result = repository.findChannelPerson(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Content> findContent(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Content> result = repository.findContent(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Person> listPerson(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Person> result = repository.listPerson(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deletePerson(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deletePerson(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<File> listFile(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<File> result = repository.listFile(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteFile(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteFile(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Template> listTemplate(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Template> result = repository.listTemplate(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTemplate(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTemplate(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
