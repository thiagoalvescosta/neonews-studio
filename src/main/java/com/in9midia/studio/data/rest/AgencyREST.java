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
 * Controller para expor serviços REST de Agency
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Agency")
public class AgencyREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("AgencyBusiness")
    private AgencyBusiness agencyBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("ThemeBusiness")
    private ThemeBusiness themeBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("WrapperBusiness")
    private WrapperBusiness wrapperBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("NwsChannelBusiness")
    private NwsChannelBusiness nwsChannelBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Agency post(@Validated @RequestBody final Agency entity) throws Exception {
        agencyBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Agency entity = agencyBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Agency entity) throws Exception {
        return ResponseEntity.ok( agencyBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Agency put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Agency entity) throws Exception {
        return agencyBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         agencyBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Agency> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return agencyBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/NwsChannel")    
  public List<NwsChannel> findNwsChannel(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return agencyBusiness.findNwsChannel(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/NwsChannel/{relationId}")    
  public ResponseEntity<?> deleteNwsChannel(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.nwsChannelBusiness.getRepository().delete(relationId);
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
  ,value="/{instanceId}/Theme")
  public List<Theme> listTheme(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return agencyBusiness.listTheme(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Theme")
  public ResponseEntity<?> postTheme(@Validated @RequestBody final Theme entity, @PathVariable("instanceId") java.lang.String instanceId) {
      NwsChannel newNwsChannel = new NwsChannel();

      Agency instance = this.agencyBusiness.getRepository().findOne(instanceId);

      newNwsChannel.setTheme(entity);
      newNwsChannel.setAgency(instance);
      
      this.nwsChannelBusiness.getRepository().saveAndFlush(newNwsChannel);

      return ResponseEntity.ok(newNwsChannel.getAgency());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Theme/{relationId}")
  public ResponseEntity<?> deleteTheme(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.agencyBusiness.deleteTheme(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Wrapper")
  public List<Wrapper> listWrapper(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return agencyBusiness.listWrapper(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Wrapper")
  public ResponseEntity<?> postWrapper(@Validated @RequestBody final Wrapper entity, @PathVariable("instanceId") java.lang.String instanceId) {
      NwsChannel newNwsChannel = new NwsChannel();

      Agency instance = this.agencyBusiness.getRepository().findOne(instanceId);

      newNwsChannel.setWrapper(entity);
      newNwsChannel.setAgency(instance);
      
      this.nwsChannelBusiness.getRepository().saveAndFlush(newNwsChannel);

      return ResponseEntity.ok(newNwsChannel.getAgency());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Wrapper/{relationId}")
  public ResponseEntity<?> deleteWrapper(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.agencyBusiness.deleteWrapper(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}