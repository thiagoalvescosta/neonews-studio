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
 * Controller para expor serviços REST de HelpDocument
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/HelpDocument")
public class HelpDocumentREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("HelpDocumentBusiness")
    private HelpDocumentBusiness helpDocumentBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("HelpNameBusiness")
    private HelpNameBusiness helpNameBusiness;
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
    public HelpDocument post(@Validated @RequestBody final HelpDocument entity) throws Exception {
        helpDocumentBusiness.post(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        HelpDocument entity = helpDocumentBusiness.get(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final HelpDocument entity) throws Exception {
        return ResponseEntity.ok(helpDocumentBusiness.put(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public HelpDocument put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final HelpDocument entity) throws Exception {
        return helpDocumentBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        helpDocumentBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<HelpDocument> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return helpDocumentBusiness.list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/HelpContent")    
  public List<HelpContent> findHelpContent(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return helpDocumentBusiness.findHelpContent(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/HelpContent/{relationId}")    
  public ResponseEntity<?> deleteHelpContent(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.helpContentBusiness.delete(relationId);
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
  ,value="/{instanceId}/HelpName")
  public List<HelpName> listHelpName(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return helpDocumentBusiness.listHelpName(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/HelpName")
  public ResponseEntity<?> postHelpName(@Validated @RequestBody final HelpName entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      HelpContent newHelpContent = new HelpContent();

      HelpDocument instance = this.helpDocumentBusiness.get(instanceId);

      newHelpContent.setHelpName(entity);
      newHelpContent.setHelpDocument(instance);
      
      this.helpContentBusiness.post(newHelpContent);

      return ResponseEntity.ok(newHelpContent.getHelpDocument());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/HelpName/{relationId}")
  public ResponseEntity<?> deleteHelpName(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.helpDocumentBusiness.deleteHelpName(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}
