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
 * Controller para expor serviços REST de RouteStop
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/RouteStop")
public class RouteStopREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("RouteStopBusiness")
    private RouteStopBusiness routeStopBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalMovementBusiness")
    private TerminalMovementBusiness terminalMovementBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalMovementStopBusiness")
    private TerminalMovementStopBusiness terminalMovementStopBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public RouteStop post(@Validated @RequestBody final RouteStop entity) throws Exception {
        routeStopBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{rouStopId}")
    public ResponseEntity<?> get(@PathVariable("rouStopId") java.lang.String rouStopId) throws Exception {
        RouteStop entity = routeStopBusiness.getRepository().findOne(rouStopId);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final RouteStop entity) throws Exception {
        return ResponseEntity.ok( routeStopBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{rouStopId}")
    public RouteStop put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final RouteStop entity) throws Exception {
        return routeStopBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{rouStopId}")
    public void delete(@PathVariable("rouStopId") java.lang.String rouStopId) throws Exception {
         routeStopBusiness.getRepository().delete(rouStopId);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<RouteStop> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return routeStopBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceRouStopId}/TerminalMovementStop")    
  public List<TerminalMovementStop> findTerminalMovementStop(@PathVariable("instanceRouStopId") java.lang.String instanceRouStopId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return routeStopBusiness.findTerminalMovementStop(instanceRouStopId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceRouStopId}/TerminalMovementStop/{relationStpId}")    
  public ResponseEntity<?> deleteTerminalMovementStop(@PathVariable("relationStpId") java.lang.String relationStpId) {
      try {
        this.terminalMovementStopBusiness.getRepository().delete(relationStpId);
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
  ,value="/{instanceRouStopId}/TerminalMovement")
  public List<TerminalMovement> listTerminalMovement(@PathVariable("instanceRouStopId") java.lang.String instanceRouStopId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return routeStopBusiness.listTerminalMovement(instanceRouStopId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceRouStopId}/TerminalMovement")
  public ResponseEntity<?> postTerminalMovement(@Validated @RequestBody final TerminalMovement entity, @PathVariable("instanceRouStopId") java.lang.String instanceRouStopId) {
      TerminalMovementStop newTerminalMovementStop = new TerminalMovementStop();

      RouteStop instance = this.routeStopBusiness.getRepository().findOne(instanceRouStopId);

      newTerminalMovementStop.setTerminalMovement(entity);
      newTerminalMovementStop.setRouteStop(instance);
      
      this.terminalMovementStopBusiness.getRepository().saveAndFlush(newTerminalMovementStop);

      return ResponseEntity.ok(newTerminalMovementStop.getRouteStop());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceRouStopId}/TerminalMovement/{relationId}")
  public ResponseEntity<?> deleteTerminalMovement(@PathVariable("instanceRouStopId") java.lang.String instanceRouStopId, @PathVariable("relationId") java.lang.String relationId) {
      this.routeStopBusiness.deleteTerminalMovement(instanceRouStopId, relationId);
      return ResponseEntity.ok().build();
  }  



}