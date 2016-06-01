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

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public City post(final City entity) throws Exception {
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
    public City get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       City result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public City put(final City entity) throws Exception {
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
    public City put(final java.lang.String id,final City entity) throws Exception {
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
  public List<City> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<City> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
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
   * OneToMany Relation
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
   * OneToMany Relation
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
   * OneToMany Relation
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
   * OneToMany Relation
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

