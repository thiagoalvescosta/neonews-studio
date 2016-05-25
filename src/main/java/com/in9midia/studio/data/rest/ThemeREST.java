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
 * Controller para expor serviços REST de Theme
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Theme")
public class ThemeREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ThemeBusiness")
    private ThemeBusiness themeBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("AgencyBusiness")
    private AgencyBusiness agencyBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("WrapperBusiness")
    private WrapperBusiness wrapperBusiness;
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
    @Qualifier("NwsChannelBusiness")
    private NwsChannelBusiness nwsChannelBusiness;
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
    public Theme post(@Validated @RequestBody final Theme entity) throws Exception {
        themeBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Theme entity = themeBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Theme entity) throws Exception {
        return ResponseEntity.ok( themeBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Theme put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Theme entity) throws Exception {
        return themeBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         themeBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Theme> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return themeBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/NwsChannel")    
  public List<NwsChannel> findNwsChannel(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return themeBusiness.findNwsChannel(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/NwsChannel/{relationId}")    
  public ResponseEntity<?> deleteNwsChannel(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.nwsChannelBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/CampaignTemplate")    
  public List<CampaignTemplate> findCampaignTemplate(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return themeBusiness.findCampaignTemplate(instanceId,  new PageRequest(offset, limit) );
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
  ,value="/{instanceId}/Agency")
  public List<Agency> listAgency(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return themeBusiness.listAgency(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Agency")
  public ResponseEntity<?> postAgency(@Validated @RequestBody final Agency entity, @PathVariable("instanceId") java.lang.String instanceId) {
      NwsChannel newNwsChannel = new NwsChannel();

      Theme instance = this.themeBusiness.getRepository().findOne(instanceId);

      newNwsChannel.setAgency(entity);
      newNwsChannel.setTheme(instance);
      
      this.nwsChannelBusiness.getRepository().saveAndFlush(newNwsChannel);

      return ResponseEntity.ok(newNwsChannel.getTheme());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Agency/{relationId}")
  public ResponseEntity<?> deleteAgency(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.themeBusiness.deleteAgency(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Wrapper")
  public List<Wrapper> listWrapper(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return themeBusiness.listWrapper(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Wrapper")
  public ResponseEntity<?> postWrapper(@Validated @RequestBody final Wrapper entity, @PathVariable("instanceId") java.lang.String instanceId) {
      NwsChannel newNwsChannel = new NwsChannel();

      Theme instance = this.themeBusiness.getRepository().findOne(instanceId);

      newNwsChannel.setWrapper(entity);
      newNwsChannel.setTheme(instance);
      
      this.nwsChannelBusiness.getRepository().saveAndFlush(newNwsChannel);

      return ResponseEntity.ok(newNwsChannel.getTheme());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Wrapper/{relationId}")
  public ResponseEntity<?> deleteWrapper(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.themeBusiness.deleteWrapper(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company")
  public List<Company> listCompany(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return themeBusiness.listCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      Theme instance = this.themeBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setCompany(entity);
      newCampaignTemplate.setTheme(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getTheme());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.themeBusiness.deleteCompany(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Module")
  public List<Module> listModule(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return themeBusiness.listModule(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Module")
  public ResponseEntity<?> postModule(@Validated @RequestBody final Module entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      Theme instance = this.themeBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setModule(entity);
      newCampaignTemplate.setTheme(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getTheme());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Module/{relationId}")
  public ResponseEntity<?> deleteModule(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.themeBusiness.deleteModule(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/NwsChannel_2")
  public List<NwsChannel> listNwsChannel_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return themeBusiness.listNwsChannel_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/NwsChannel_2")
  public ResponseEntity<?> postNwsChannel_2(@Validated @RequestBody final NwsChannel entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      Theme instance = this.themeBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setNwsChannel(entity);
      newCampaignTemplate.setTheme(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getTheme());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/NwsChannel_2/{relationId}")
  public ResponseEntity<?> deleteNwsChannel_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.themeBusiness.deleteNwsChannel_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}