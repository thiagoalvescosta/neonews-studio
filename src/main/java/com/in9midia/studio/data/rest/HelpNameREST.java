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
 * Controller para expor serviços REST de HelpName
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/HelpName")
public class HelpNameREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("HelpNameBusiness")
    private HelpNameBusiness helpNameBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("HelpDocumentBusiness")
    private HelpDocumentBusiness helpDocumentBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("HelpContentBusiness")
    private HelpContentBusiness helpContentBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public HelpName post(@Validated @RequestBody final HelpName entity) throws Exception {
        helpNameBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        HelpName entity = helpNameBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final HelpName entity) throws Exception {
        return ResponseEntity.ok( helpNameBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public HelpName put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final HelpName entity) throws Exception {
        return helpNameBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         helpNameBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<HelpName> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return helpNameBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/HelpContent")    
  public List<HelpContent> findHelpContent(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return helpNameBusiness.findHelpContent(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/HelpContent/{relationId}")    
  public ResponseEntity<?> deleteHelpContent(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.helpContentBusiness.getRepository().delete(relationId);
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
  ,value="/{instanceId}/HelpDocument")
  public List<HelpDocument> listHelpDocument(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return helpNameBusiness.listHelpDocument(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/HelpDocument")
  public ResponseEntity<?> postHelpDocument(@Validated @RequestBody final HelpDocument entity, @PathVariable("instanceId") java.lang.String instanceId) {
      HelpContent newHelpContent = new HelpContent();

      HelpName instance = this.helpNameBusiness.getRepository().findOne(instanceId);

      newHelpContent.setHelpDocument(entity);
      newHelpContent.setHelpName(instance);
      
      this.helpContentBusiness.getRepository().saveAndFlush(newHelpContent);

      return ResponseEntity.ok(newHelpContent.getHelpName());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/HelpDocument/{relationId}")
  public ResponseEntity<?> deleteHelpDocument(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.helpNameBusiness.deleteHelpDocument(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}