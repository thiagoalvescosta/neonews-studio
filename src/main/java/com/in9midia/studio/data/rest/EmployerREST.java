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
 * Controller para expor serviços REST de Employer
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Employer")
public class EmployerREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("EmployerBusiness")
    private EmployerBusiness employerBusiness;

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
    @Qualifier("TerminalAudienceBusiness")
    private TerminalAudienceBusiness terminalAudienceBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Employer post(@Validated @RequestBody final Employer entity) throws Exception {
        employerBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{card}")
    public ResponseEntity<?> get(@PathVariable("card") java.lang.String card) throws Exception {
        Employer entity = employerBusiness.getRepository().findOne(card);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Employer entity) throws Exception {
        return ResponseEntity.ok( employerBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{card}")
    public Employer put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Employer entity) throws Exception {
        return employerBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{card}")
    public void delete(@PathVariable("card") java.lang.String card) throws Exception {
         employerBusiness.getRepository().delete(card);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Employer> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return employerBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceCard}/TerminalAudience")    
  public List<TerminalAudience> findTerminalAudience(@PathVariable("instanceCard") java.lang.String instanceCard, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return employerBusiness.findTerminalAudience(instanceCard,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceCard}/TerminalAudience/{relationId}")    
  public ResponseEntity<?> deleteTerminalAudience(@PathVariable("relationId") java.lang.Double relationId) {
      try {
        this.terminalAudienceBusiness.getRepository().delete(relationId);
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
  ,value="/{instanceCard}/Terminal")
  public List<Terminal> listTerminal(@PathVariable("instanceCard") java.lang.String instanceCard,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return employerBusiness.listTerminal(instanceCard,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceCard}/Terminal")
  public ResponseEntity<?> postTerminal(@Validated @RequestBody final Terminal entity, @PathVariable("instanceCard") java.lang.String instanceCard) {
      TerminalAudience newTerminalAudience = new TerminalAudience();

      Employer instance = this.employerBusiness.getRepository().findOne(instanceCard);

      newTerminalAudience.setTerminal(entity);
      newTerminalAudience.setEmployer(instance);
      
      this.terminalAudienceBusiness.getRepository().saveAndFlush(newTerminalAudience);

      return ResponseEntity.ok(newTerminalAudience.getEmployer());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceCard}/Terminal/{relationId}")
  public ResponseEntity<?> deleteTerminal(@PathVariable("instanceCard") java.lang.String instanceCard, @PathVariable("relationId") java.lang.String relationId) {
      this.employerBusiness.deleteTerminal(instanceCard, relationId);
      return ResponseEntity.ok().build();
  }  



}