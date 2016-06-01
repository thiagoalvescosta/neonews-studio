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
 * Controller para expor serviços REST de TerminalMovement
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/TerminalMovement")
public class TerminalMovementREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalMovementBusiness")
    private TerminalMovementBusiness terminalMovementBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("RouteStopBusiness")
    private RouteStopBusiness routeStopBusiness;
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
    public TerminalMovement post(@Validated @RequestBody final TerminalMovement entity) throws Exception {
        terminalMovementBusiness.post(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        TerminalMovement entity = terminalMovementBusiness.get(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final TerminalMovement entity) throws Exception {
        return ResponseEntity.ok(terminalMovementBusiness.put(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public TerminalMovement put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final TerminalMovement entity) throws Exception {
        return terminalMovementBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        terminalMovementBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<TerminalMovement> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return terminalMovementBusiness.list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/TerminalMovementStop")    
  public List<TerminalMovementStop> findTerminalMovementStop(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalMovementBusiness.findTerminalMovementStop(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/TerminalMovementStop/{relationStpId}")    
  public ResponseEntity<?> deleteTerminalMovementStop(@PathVariable("relationStpId") java.lang.String relationStpId) {
      try {
        this.terminalMovementStopBusiness.delete(relationStpId);
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
  ,value="/{instanceId}/RouteStop")
  public List<RouteStop> listRouteStop(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return terminalMovementBusiness.listRouteStop(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/RouteStop")
  public ResponseEntity<?> postRouteStop(@Validated @RequestBody final RouteStop entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      TerminalMovementStop newTerminalMovementStop = new TerminalMovementStop();

      TerminalMovement instance = this.terminalMovementBusiness.get(instanceId);

      newTerminalMovementStop.setRouteStop(entity);
      newTerminalMovementStop.setTerminalMovement(instance);
      
      this.terminalMovementStopBusiness.post(newTerminalMovementStop);

      return ResponseEntity.ok(newTerminalMovementStop.getTerminalMovement());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/RouteStop/{relationRouStopId}")
  public ResponseEntity<?> deleteRouteStop(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationRouStopId") java.lang.String relationRouStopId) {
      this.terminalMovementBusiness.deleteRouteStop(instanceId, relationRouStopId);
      return ResponseEntity.ok().build();
  }  



}
