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
 * Controller para expor serviços REST de CampaignCategory
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/CampaignCategory")
public class CampaignCategoryREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignCategoryBusiness")
    private CampaignCategoryBusiness campaignCategoryBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignBusiness")
    private CampaignBusiness campaignBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public CampaignCategory post(@Validated @RequestBody final CampaignCategory entity) throws Exception {
        campaignCategoryBusiness.post(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        CampaignCategory entity = campaignCategoryBusiness.get(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final CampaignCategory entity) throws Exception {
        return ResponseEntity.ok(campaignCategoryBusiness.put(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public CampaignCategory put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final CampaignCategory entity) throws Exception {
        return campaignCategoryBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        campaignCategoryBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<CampaignCategory> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return campaignCategoryBusiness.list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Campaign")    
  public List<Campaign> findCampaign(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignCategoryBusiness.findCampaign(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Campaign/{relationId}")    
  public ResponseEntity<?> deleteCampaign(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignBusiness.delete(relationId);
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
  , value="/{instanceId}/CampaignCategory")    
  public List<CampaignCategory> findCampaignCategory(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignCategoryBusiness.findCampaignCategory(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignCategory/{relationId}")    
  public ResponseEntity<?> deleteCampaignCategory(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignCategoryBusiness.delete(relationId);
        return ResponseEntity.ok().build();
      } catch (Exception e) {
        return ResponseEntity.status(404).build();
      }
  }




}
