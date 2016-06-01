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
 * Controller para expor serviços REST de TerminalMovementStop
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/TerminalMovementStop")
public class TerminalMovementStopREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
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
    public TerminalMovementStop post(@Validated @RequestBody final TerminalMovementStop entity) throws Exception {
        terminalMovementStopBusiness.post(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{stpId}")
    public ResponseEntity<?> get(@PathVariable("stpId") java.lang.String stpId) throws Exception {
        TerminalMovementStop entity = terminalMovementStopBusiness.get(stpId);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final TerminalMovementStop entity) throws Exception {
        return ResponseEntity.ok(terminalMovementStopBusiness.put(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{stpId}")
    public TerminalMovementStop put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final TerminalMovementStop entity) throws Exception {
        return terminalMovementStopBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{stpId}")
    public void delete(@PathVariable("stpId") java.lang.String stpId) throws Exception {
        terminalMovementStopBusiness.delete(stpId);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<TerminalMovementStop> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return terminalMovementStopBusiness.list(new PageRequest(offset, limit)   );  
  }




}
