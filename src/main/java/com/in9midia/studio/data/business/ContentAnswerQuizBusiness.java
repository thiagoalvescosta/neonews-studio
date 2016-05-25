package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ContentAnswerQuizBusiness
 * 
 * @generated
 **/
@Service("ContentAnswerQuizBusiness")
public class ContentAnswerQuizBusiness {

    /**
     * Instância da classe ContentAnswerQuizDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ContentAnswerQuizDAO")
    protected ContentAnswerQuizDAO repository;

    /**
     * Método de acesso ao ContentAnswerQuizDAO
     * 
     * @generated
     */
    public ContentAnswerQuizDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<ContentAnswerReport> findContentAnswerReport(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ContentAnswerReport> result = repository.findContentAnswerReport(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Content> listContent(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Content> result = repository.listContent(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteContent(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteContent(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
