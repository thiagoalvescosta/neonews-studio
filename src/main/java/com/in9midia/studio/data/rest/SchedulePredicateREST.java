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
 * Controller para expor serviços REST de SchedulePredicate
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/SchedulePredicate")
public class SchedulePredicateREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("SchedulePredicateBusiness")
    private SchedulePredicateBusiness schedulePredicateBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("RegionBusiness")
    private RegionBusiness regionBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalBusiness")
    private TerminalBusiness terminalBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("SchedulePredicateRegionBusiness")
    private SchedulePredicateRegionBusiness schedulePredicateRegionBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("SchedulePredicateTerminalBusiness")
    private SchedulePredicateTerminalBusiness schedulePredicateTerminalBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ScheduleTimeBusiness")
    private ScheduleTimeBusiness scheduleTimeBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public SchedulePredicate post(@Validated @RequestBody final SchedulePredicate entity) throws Exception {
        schedulePredicateBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        SchedulePredicate entity = schedulePredicateBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final SchedulePredicate entity) throws Exception {
        return ResponseEntity.ok( schedulePredicateBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public SchedulePredicate put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final SchedulePredicate entity) throws Exception {
        return schedulePredicateBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         schedulePredicateBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<SchedulePredicate> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return schedulePredicateBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/SchedulePredicateRegion")    
  public List<SchedulePredicateRegion> findSchedulePredicateRegion(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return schedulePredicateBusiness.findSchedulePredicateRegion(instanceId,  new PageRequest(offset, limit) );
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
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/SchedulePredicateTerminal")    
  public List<SchedulePredicateTerminal> findSchedulePredicateTerminal(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return schedulePredicateBusiness.findSchedulePredicateTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/SchedulePredicateTerminal/{relationId}")    
  public ResponseEntity<?> deleteSchedulePredicateTerminal(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.schedulePredicateTerminalBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/ScheduleTime")    
  public List<ScheduleTime> findScheduleTime(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return schedulePredicateBusiness.findScheduleTime(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ScheduleTime/{relationId}")    
  public ResponseEntity<?> deleteScheduleTime(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.scheduleTimeBusiness.getRepository().delete(relationId);
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
  ,value="/{instanceId}/Region")
  public List<Region> listRegion(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return schedulePredicateBusiness.listRegion(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Region")
  public ResponseEntity<?> postRegion(@Validated @RequestBody final Region entity, @PathVariable("instanceId") java.lang.String instanceId) {
      SchedulePredicateRegion newSchedulePredicateRegion = new SchedulePredicateRegion();

      SchedulePredicate instance = this.schedulePredicateBusiness.getRepository().findOne(instanceId);

      newSchedulePredicateRegion.setRegion(entity);
      newSchedulePredicateRegion.setSchedulePredicate(instance);
      
      this.schedulePredicateRegionBusiness.getRepository().saveAndFlush(newSchedulePredicateRegion);

      return ResponseEntity.ok(newSchedulePredicateRegion.getSchedulePredicate());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Region/{relationId}")
  public ResponseEntity<?> deleteRegion(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.schedulePredicateBusiness.deleteRegion(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal")
  public List<Terminal> listTerminal(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return schedulePredicateBusiness.listTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal")
  public ResponseEntity<?> postTerminal(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      SchedulePredicateTerminal newSchedulePredicateTerminal = new SchedulePredicateTerminal();

      SchedulePredicate instance = this.schedulePredicateBusiness.getRepository().findOne(instanceId);

      newSchedulePredicateTerminal.setTerminal(entity);
      newSchedulePredicateTerminal.setSchedulePredicate(instance);
      
      this.schedulePredicateTerminalBusiness.getRepository().saveAndFlush(newSchedulePredicateTerminal);

      return ResponseEntity.ok(newSchedulePredicateTerminal.getSchedulePredicate());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal/{relationId}")
  public ResponseEntity<?> deleteTerminal(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.schedulePredicateBusiness.deleteTerminal(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}