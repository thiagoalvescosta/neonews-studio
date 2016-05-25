package com.in9midia.studio.data.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;

import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.in9midia.studio.data.entity.*;
import com.in9midia.studio.data.business.*;


/**
 * Controller para expor serviços REST de Country
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Country")
public class CountryREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CountryBusiness")
    private CountryBusiness countryBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("CityBusiness")
    private CityBusiness cityBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("StateBusiness")
    private StateBusiness stateBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("AddressBusiness")
    private AddressBusiness addressBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Country post(@Validated @RequestBody final Country entity) throws Exception {
        countryBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Country entity = countryBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Country entity) throws Exception {
        return ResponseEntity.ok( countryBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Country put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Country entity) throws Exception {
        return countryBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         countryBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Country> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return countryBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Address")    
  public List<Address> findAddress(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return countryBusiness.findAddress(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Address/{relationId}")    
  public ResponseEntity<?> deleteAddress(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.addressBusiness.getRepository().delete(relationId);
        return ResponseEntity.ok().build();
      } catch (Exception e) {
        return ResponseEntity.status(404).build();
      }
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/State_2")    
  public List<State> findState_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return countryBusiness.findState_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/State_2/{relationId}")    
  public ResponseEntity<?> deleteState_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.stateBusiness.getRepository().delete(relationId);
        return ResponseEntity.ok().build();
      } catch (Exception e) {
        return ResponseEntity.status(404).build();
      }
  }



  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/City")
  public List<City> listCity(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return countryBusiness.listCity(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/City")
  public ResponseEntity<?> postCity(@Validated @RequestBody final City entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Address newAddress = new Address();

      Country instance = this.countryBusiness.getRepository().findOne(instanceId);

      newAddress.setCity(entity);
      newAddress.setCountry(instance);
      
      this.addressBusiness.getRepository().saveAndFlush(newAddress);

      return ResponseEntity.ok(newAddress.getCountry());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/City/{relationId}")
  public ResponseEntity<?> deleteCity(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.countryBusiness.deleteCity(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/State")
  public List<State> listState(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return countryBusiness.listState(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/State")
  public ResponseEntity<?> postState(@Validated @RequestBody final State entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Address newAddress = new Address();

      Country instance = this.countryBusiness.getRepository().findOne(instanceId);

      newAddress.setState(entity);
      newAddress.setCountry(instance);
      
      this.addressBusiness.getRepository().saveAndFlush(newAddress);

      return ResponseEntity.ok(newAddress.getCountry());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/State/{relationId}")
  public ResponseEntity<?> deleteState(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.countryBusiness.deleteState(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}