package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de UsuarioBusiness
 * 
 * @generated
 **/
@Service("UsuarioBusiness")
public class UsuarioBusiness {

    /**
     * Instância da classe UsuarioDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("UsuarioDAO")
    protected UsuarioDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Usuario post(final Usuario entity) throws Exception {
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
    public Usuario get(java.lang.Integer codigo) throws Exception {
      // begin-user-code  
      // end-user-code        
       Usuario result = repository.findOne(codigo);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Usuario put(final Usuario entity) throws Exception {
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
    public Usuario put(final java.lang.Integer id,final Usuario entity) throws Exception {
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
    public void delete( java.lang.Integer codigo) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(codigo);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public List<Usuario> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<Usuario> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public List<Usuario> findByLogin ( java.lang.String login , Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<Usuario> result = repository.findByLogin ( login ,  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public List<NeonewsUser> findNeonewsUser(java.lang.Integer codigo,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<NeonewsUser> result = repository.findNeonewsUser(codigo,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}

