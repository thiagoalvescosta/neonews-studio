package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de FolderBusiness
 * 
 * @generated
 **/
@Service("FolderBusiness")
public class FolderBusiness {

    /**
     * Instância da classe FolderDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("FolderDAO")
    protected FolderDAO repository;

    /**
     * Método de acesso ao FolderDAO
     * 
     * @generated
     */
    public FolderDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<File> findFile(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<File> result = repository.findFile(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Folder> findFolder(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Folder> result = repository.findFolder(id,  pageable );
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
  public List<Company> listCompany_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
