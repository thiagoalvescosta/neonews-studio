package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de HelpNameBusiness
 * 
 * @generated
 **/
@Service("HelpNameBusiness")
public class HelpNameBusiness {

    /**
     * Instância da classe HelpNameDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("HelpNameDAO")
    protected HelpNameDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public HelpName post(final HelpName entity) throws Exception {
      // begin-user-code  
      // end-user-code  
      repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public HelpName get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       HelpName result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public HelpName put(final HelpName entity) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    public HelpName put(final java.lang.String id,final HelpName entity) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public List<HelpName> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<HelpName> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public List<HelpContent> findHelpContent(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<HelpContent> result = repository.findHelpContent(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public List<HelpDocument> listHelpDocument(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<HelpDocument> result = repository.listHelpDocument(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteHelpDocument(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteHelpDocument(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}

