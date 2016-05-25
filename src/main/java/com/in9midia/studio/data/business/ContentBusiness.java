package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ContentBusiness
 * 
 * @generated
 **/
@Service("ContentBusiness")
public class ContentBusiness {

    /**
     * Instância da classe ContentDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ContentDAO")
    protected ContentDAO repository;

    /**
     * Método de acesso ao ContentDAO
     * 
     * @generated
     */
    public ContentDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<ContentAnswerQuiz> findContentAnswerQuiz(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ContentAnswerQuiz> result = repository.findContentAnswerQuiz(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
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
  public List<ContentTerminal> findContentTerminal(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ContentTerminal> result = repository.findContentTerminal(id,  pageable );
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
  public List<Participant> findParticipant(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Participant> result = repository.findParticipant(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<ContentAnswerQuiz> listContentAnswerQuiz_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<ContentAnswerQuiz> result = repository.listContentAnswerQuiz_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteContentAnswerQuiz_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteContentAnswerQuiz_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Terminal> listTerminal(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.listTerminal(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminal(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminal(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Company> listCompany(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany(instanceId, relationId);
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
