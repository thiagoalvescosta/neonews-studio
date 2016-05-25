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
 * Controller para expor serviços REST de ModuleProperty
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/ModuleProperty")
public class ModulePropertyREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ModulePropertyBusiness")
    private ModulePropertyBusiness modulePropertyBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignBusiness")
    private CampaignBusiness campaignBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ResolutionBusiness")
    private ResolutionBusiness resolutionBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignPropertyBusiness")
    private CampaignPropertyBusiness campaignPropertyBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public ModuleProperty post(@Validated @RequestBody final ModuleProperty entity) throws Exception {
        modulePropertyBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        ModuleProperty entity = modulePropertyBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final ModuleProperty entity) throws Exception {
        return ResponseEntity.ok( modulePropertyBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ModuleProperty put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final ModuleProperty entity) throws Exception {
        return modulePropertyBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         modulePropertyBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<ModuleProperty> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return modulePropertyBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/CampaignProperty")    
  public List<CampaignProperty> findCampaignProperty(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return modulePropertyBusiness.findCampaignProperty(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignProperty/{relationId}")    
  public ResponseEntity<?> deleteCampaignProperty(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignPropertyBusiness.getRepository().delete(relationId);
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
  ,value="/{instanceId}/Campaign")
  public List<Campaign> listCampaign(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return modulePropertyBusiness.listCampaign(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign")
  public ResponseEntity<?> postCampaign(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignProperty newCampaignProperty = new CampaignProperty();

      ModuleProperty instance = this.modulePropertyBusiness.getRepository().findOne(instanceId);

      newCampaignProperty.setCampaign(entity);
      newCampaignProperty.setModuleProperty(instance);
      
      this.campaignPropertyBusiness.getRepository().saveAndFlush(newCampaignProperty);

      return ResponseEntity.ok(newCampaignProperty.getModuleProperty());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign/{relationId}")
  public ResponseEntity<?> deleteCampaign(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.modulePropertyBusiness.deleteCampaign(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Resolution")
  public List<Resolution> listResolution(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return modulePropertyBusiness.listResolution(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Resolution")
  public ResponseEntity<?> postResolution(@Validated @RequestBody final Resolution entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignProperty newCampaignProperty = new CampaignProperty();

      ModuleProperty instance = this.modulePropertyBusiness.getRepository().findOne(instanceId);

      newCampaignProperty.setResolution(entity);
      newCampaignProperty.setModuleProperty(instance);
      
      this.campaignPropertyBusiness.getRepository().saveAndFlush(newCampaignProperty);

      return ResponseEntity.ok(newCampaignProperty.getModuleProperty());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Resolution/{relationId}")
  public ResponseEntity<?> deleteResolution(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.modulePropertyBusiness.deleteResolution(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}