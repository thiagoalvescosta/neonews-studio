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
 * Controller para expor serviços REST de Region
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Region")
public class RegionREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("RegionBusiness")
    private RegionBusiness regionBusiness;

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
    @Qualifier("SchedulePredicateBusiness")
    private SchedulePredicateBusiness schedulePredicateBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignRegionBusiness")
    private CampaignRegionBusiness campaignRegionBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("SchedulePredicateRegionBusiness")
    private SchedulePredicateRegionBusiness schedulePredicateRegionBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Region post(@Validated @RequestBody final Region entity) throws Exception {
        regionBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Region entity = regionBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Region entity) throws Exception {
        return ResponseEntity.ok( regionBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Region put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Region entity) throws Exception {
        return regionBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         regionBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Region> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return regionBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/CampaignRegion")    
  public List<CampaignRegion> findCampaignRegion(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return regionBusiness.findCampaignRegion(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignRegion/{relationId}")    
  public ResponseEntity<?> deleteCampaignRegion(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignRegionBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/SchedulePredicateRegion")    
  public List<SchedulePredicateRegion> findSchedulePredicateRegion(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return regionBusiness.findSchedulePredicateRegion(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/SchedulePredicateRegion/{relationId}")    
  public ResponseEntity<?> deleteSchedulePredicateRegion(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.schedulePredicateRegionBusiness.getRepository().delete(relationId);
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
    return regionBusiness.listCampaign(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign")
  public ResponseEntity<?> postCampaign(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignRegion newCampaignRegion = new CampaignRegion();

      Region instance = this.regionBusiness.getRepository().findOne(instanceId);

      newCampaignRegion.setCampaign(entity);
      newCampaignRegion.setRegion(instance);
      
      this.campaignRegionBusiness.getRepository().saveAndFlush(newCampaignRegion);

      return ResponseEntity.ok(newCampaignRegion.getRegion());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign/{relationId}")
  public ResponseEntity<?> deleteCampaign(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.regionBusiness.deleteCampaign(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/SchedulePredicate")
  public List<SchedulePredicate> listSchedulePredicate(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return regionBusiness.listSchedulePredicate(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/SchedulePredicate")
  public ResponseEntity<?> postSchedulePredicate(@Validated @RequestBody final SchedulePredicate entity, @PathVariable("instanceId") java.lang.String instanceId) {
      SchedulePredicateRegion newSchedulePredicateRegion = new SchedulePredicateRegion();

      Region instance = this.regionBusiness.getRepository().findOne(instanceId);

      newSchedulePredicateRegion.setSchedulePredicate(entity);
      newSchedulePredicateRegion.setRegion(instance);
      
      this.schedulePredicateRegionBusiness.getRepository().saveAndFlush(newSchedulePredicateRegion);

      return ResponseEntity.ok(newSchedulePredicateRegion.getRegion());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/SchedulePredicate/{relationId}")
  public ResponseEntity<?> deleteSchedulePredicate(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.regionBusiness.deleteSchedulePredicate(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}