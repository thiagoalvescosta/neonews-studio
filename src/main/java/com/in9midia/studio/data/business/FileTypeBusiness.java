package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de FileTypeBusiness
 * 
 * @generated
 **/
@Service("FileTypeBusiness")
public class FileTypeBusiness {

    /**
     * Instância da classe FileTypeDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("FileTypeDAO")
    protected FileTypeDAO repository;

    /**
     * Método de acesso ao FileTypeDAO
     * 
     * @generated
     */
    public FileTypeDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<FileExtension> findFileExtension(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<FileExtension> result = repository.findFileExtension(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}
