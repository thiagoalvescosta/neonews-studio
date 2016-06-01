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
 * Controller para expor serviços REST de PatrimonyType
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/PatrimonyType")
public class PatrimonyTypeREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
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
    public PatrimonyType post(@Validated @RequestBody final PatrimonyType entity) throws Exception {
        patrimonyTypeBusiness.post(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{typId}")
    public ResponseEntity<?> get(@PathVariable("typId") java.lang.String typId) throws Exception {
        PatrimonyType entity = patrimonyTypeBusiness.get(typId);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final PatrimonyType entity) throws Exception {
        return ResponseEntity.ok(patrimonyTypeBusiness.put(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{typId}")
    public PatrimonyType put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final PatrimonyType entity) throws Exception {
        return patrimonyTypeBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{typId}")
    public void delete(@PathVariable("typId") java.lang.String typId) throws Exception {
        patrimonyTypeBusiness.delete(typId);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<PatrimonyType> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return patrimonyTypeBusiness.list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceTypId}/Patrimony")    
  public List<Patrimony> findPatrimony(@PathVariable("instanceTypId") java.lang.String instanceTypId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return patrimonyTypeBusiness.findPatrimony(instanceTypId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceTypId}/Patrimony/{relationId}")    
  public ResponseEntity<?> deletePatrimony(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.patrimonyBusiness.delete(relationId);
        return ResponseEntity.ok().build();
      } catch (Exception e) {
        return ResponseEntity.status(404).build();
      }
  }




}
