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
 * Controller para expor serviços REST de NwsChannel
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/NwsChannel")
public class NwsChannelREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("NwsChannelBusiness")
    private NwsChannelBusiness nwsChannelBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("CompanyBusiness")
    private CompanyBusiness companyBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ModuleBusiness")
    private ModuleBusiness moduleBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ThemeBusiness")
    private ThemeBusiness themeBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignTemplateBusiness")
    private CampaignTemplateBusiness campaignTemplateBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public NwsChannel post(@Validated @RequestBody final NwsChannel entity) throws Exception {
        nwsChannelBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        NwsChannel entity = nwsChannelBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final NwsChannel entity) throws Exception {
        return ResponseEntity.ok( nwsChannelBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public NwsChannel put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final NwsChannel entity) throws Exception {
        return nwsChannelBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         nwsChannelBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<NwsChannel> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return nwsChannelBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/CampaignTemplate")    
  public List<CampaignTemplate> findCampaignTemplate(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return nwsChannelBusiness.findCampaignTemplate(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignTemplate/{relationId}")    
  public ResponseEntity<?> deleteCampaignTemplate(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignTemplateBusiness.getRepository().delete(relationId);
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
  ,value="/{instanceId}/Company")
  public List<Company> listCompany(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return nwsChannelBusiness.listCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      NwsChannel instance = this.nwsChannelBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setCompany(entity);
      newCampaignTemplate.setNwsChannel(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getNwsChannel());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.nwsChannelBusiness.deleteCompany(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Module")
  public List<Module> listModule(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return nwsChannelBusiness.listModule(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Module")
  public ResponseEntity<?> postModule(@Validated @RequestBody final Module entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      NwsChannel instance = this.nwsChannelBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setModule(entity);
      newCampaignTemplate.setNwsChannel(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getNwsChannel());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Module/{relationId}")
  public ResponseEntity<?> deleteModule(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.nwsChannelBusiness.deleteModule(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Theme")
  public List<Theme> listTheme(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return nwsChannelBusiness.listTheme(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Theme")
  public ResponseEntity<?> postTheme(@Validated @RequestBody final Theme entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      NwsChannel instance = this.nwsChannelBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setTheme(entity);
      newCampaignTemplate.setNwsChannel(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getNwsChannel());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Theme/{relationId}")
  public ResponseEntity<?> deleteTheme(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.nwsChannelBusiness.deleteTheme(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}