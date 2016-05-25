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
 * Controller para expor serviços REST de PatrimonySituation
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/PatrimonySituation")
public class PatrimonySituationREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("PatrimonySituationBusiness")
    private PatrimonySituationBusiness patrimonySituationBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("PatrimonyTypeBusiness")
    private PatrimonyTypeBusiness patrimonyTypeBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("PatrimonyBusiness")
    private PatrimonyBusiness patrimonyBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public PatrimonySituation post(@Validated @RequestBody final PatrimonySituation entity) throws Exception {
        patrimonySituationBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{sitId}")
    public ResponseEntity<?> get(@PathVariable("sitId") java.lang.String sitId) throws Exception {
        PatrimonySituation entity = patrimonySituationBusiness.getRepository().findOne(sitId);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final PatrimonySituation entity) throws Exception {
        return ResponseEntity.ok( patrimonySituationBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{sitId}")
    public PatrimonySituation put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final PatrimonySituation entity) throws Exception {
        return patrimonySituationBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{sitId}")
    public void delete(@PathVariable("sitId") java.lang.String sitId) throws Exception {
         patrimonySituationBusiness.getRepository().delete(sitId);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<PatrimonySituation> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return patrimonySituationBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceSitId}/Patrimony")    
  public List<Patrimony> findPatrimony(@PathVariable("instanceSitId") java.lang.String instanceSitId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return patrimonySituationBusiness.findPatrimony(instanceSitId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceSitId}/Patrimony/{relationId}")    
  public ResponseEntity<?> deletePatrimony(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.patrimonyBusiness.getRepository().delete(relationId);
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
  ,value="/{instanceSitId}/PatrimonyType")
  public List<PatrimonyType> listPatrimonyType(@PathVariable("instanceSitId") java.lang.String instanceSitId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return patrimonySituationBusiness.listPatrimonyType(instanceSitId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceSitId}/PatrimonyType")
  public ResponseEntity<?> postPatrimonyType(@Validated @RequestBody final PatrimonyType entity, @PathVariable("instanceSitId") java.lang.String instanceSitId) {
      Patrimony newPatrimony = new Patrimony();

      PatrimonySituation instance = this.patrimonySituationBusiness.getRepository().findOne(instanceSitId);

      newPatrimony.setPatrimonyType(entity);
      newPatrimony.setPatrimonySituation(instance);
      
      this.patrimonyBusiness.getRepository().saveAndFlush(newPatrimony);

      return ResponseEntity.ok(newPatrimony.getPatrimonySituation());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceSitId}/PatrimonyType/{relationTypId}")
  public ResponseEntity<?> deletePatrimonyType(@PathVariable("instanceSitId") java.lang.String instanceSitId, @PathVariable("relationTypId") java.lang.String relationTypId) {
      this.patrimonySituationBusiness.deletePatrimonyType(instanceSitId, relationTypId);
      return ResponseEntity.ok().build();
  }  



}