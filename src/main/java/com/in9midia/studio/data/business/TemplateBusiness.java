package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TemplateBusiness
 * 
 * @generated
 **/
@Service("TemplateBusiness")
public class TemplateBusiness {

    /**
     * Instância da classe TemplateDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TemplateDAO")
    protected TemplateDAO repository;

    /**
     * Método de acesso ao TemplateDAO
     * 
     * @generated
     */
    public TemplateDAO getRepository() {
        return repository;
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
  public List<Channel> listChannel(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Channel> result = repository.listChannel(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteChannel(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteChannel(instanceId, relationId);
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
}
