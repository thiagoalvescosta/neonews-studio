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
 * Controller para expor serviços REST de Wrapper
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Wrapper")
public class WrapperREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("WrapperBusiness")
    private WrapperBusiness wrapperBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("NwsChannelBusiness")
    private NwsChannelBusiness nwsChannelBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Wrapper post(@Validated @RequestBody final Wrapper entity) throws Exception {
        wrapperBusiness.post(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Wrapper entity = wrapperBusiness.get(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Wrapper entity) throws Exception {
        return ResponseEntity.ok(wrapperBusiness.put(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Wrapper put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Wrapper entity) throws Exception {
        return wrapperBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        wrapperBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Wrapper> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return wrapperBusiness.list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/NwsChannel")    
  public List<NwsChannel> findNwsChannel(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return wrapperBusiness.findNwsChannel(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/NwsChannel/{relationId}")    
  public ResponseEntity<?> deleteNwsChannel(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.nwsChannelBusiness.delete(relationId);
        return ResponseEntity.ok().build();
      } catch (Exception e) {
        return ResponseEntity.status(404).build();
      }
  }




}
