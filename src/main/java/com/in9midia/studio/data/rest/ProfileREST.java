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
 * Controller para expor serviços REST de Profile
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Profile")
public class ProfileREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ProfileBusiness")
    private ProfileBusiness profileBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("ProfileTvBusiness")
    private ProfileTvBusiness profileTvBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ScheduleBusiness")
    private ScheduleBusiness scheduleBusiness;
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
    @Qualifier("AddressBusiness")
    private AddressBusiness addressBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignBusiness")
    private CampaignBusiness campaignBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignBlockBusiness")
    private CampaignBlockBusiness campaignBlockBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CategoryBusiness")
    private CategoryBusiness categoryBusiness;
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
    @Qualifier("PersonBusiness")
    private PersonBusiness personBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("SgaBusiness")
    private SgaBusiness sgaBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("SoftwareBusiness")
    private SoftwareBusiness softwareBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalTypeBusiness")
    private TerminalTypeBusiness terminalTypeBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TvTypeBusiness")
    private TvTypeBusiness tvTypeBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ContentUpdateBusiness")
    private ContentUpdateBusiness contentUpdateBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Profile post(@Validated @RequestBody final Profile entity) throws Exception {
        profileBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Profile entity = profileBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Profile entity) throws Exception {
        return ResponseEntity.ok( profileBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Profile put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Profile entity) throws Exception {
        return profileBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         profileBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Profile> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return profileBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/CampaignBlock")    
  public List<CampaignBlock> findCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return profileBusiness.findCampaignBlock(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignBlock/{relationId}")    
  public ResponseEntity<?> deleteCampaignBlock(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignBlockBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/ContentUpdate")    
  public List<ContentUpdate> findContentUpdate(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return profileBusiness.findContentUpdate(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ContentUpdate/{relationId}")    
  public ResponseEntity<?> deleteContentUpdate(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.contentUpdateBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Terminal_2")    
  public List<Terminal> findTerminal_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return profileBusiness.findTerminal_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Terminal_2/{relationId}")    
  public ResponseEntity<?> deleteTerminal_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.terminalBusiness.getRepository().delete(relationId);
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
  ,value="/{instanceId}/ProfileTv")
  public List<ProfileTv> listProfileTv(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listProfileTv(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/ProfileTv")
  public ResponseEntity<?> postProfileTv(@Validated @RequestBody final ProfileTv entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignBlock newCampaignBlock = new CampaignBlock();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newCampaignBlock.setProfileTv(entity);
      newCampaignBlock.setProfile(instance);
      
      this.campaignBlockBusiness.getRepository().saveAndFlush(newCampaignBlock);

      return ResponseEntity.ok(newCampaignBlock.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/ProfileTv/{relationId}")
  public ResponseEntity<?> deleteProfileTv(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteProfileTv(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Schedule")
  public List<Schedule> listSchedule(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listSchedule(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Schedule")
  public ResponseEntity<?> postSchedule(@Validated @RequestBody final Schedule entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignBlock newCampaignBlock = new CampaignBlock();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newCampaignBlock.setSchedule(entity);
      newCampaignBlock.setProfile(instance);
      
      this.campaignBlockBusiness.getRepository().saveAndFlush(newCampaignBlock);

      return ResponseEntity.ok(newCampaignBlock.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Schedule/{relationId}")
  public ResponseEntity<?> deleteSchedule(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteSchedule(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal")
  public List<Terminal> listTerminal(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal")
  public ResponseEntity<?> postTerminal(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      ContentUpdate newContentUpdate = new ContentUpdate();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newContentUpdate.setTerminal(entity);
      newContentUpdate.setProfile(instance);
      
      this.contentUpdateBusiness.getRepository().saveAndFlush(newContentUpdate);

      return ResponseEntity.ok(newContentUpdate.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal/{relationId}")
  public ResponseEntity<?> deleteTerminal(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteTerminal(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Address")
  public List<Address> listAddress(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listAddress(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Address")
  public ResponseEntity<?> postAddress(@Validated @RequestBody final Address entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setAddress(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Address/{relationId}")
  public ResponseEntity<?> deleteAddress(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteAddress(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Campaign")
  public List<Campaign> listCampaign(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listCampaign(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign")
  public ResponseEntity<?> postCampaign(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaign(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign/{relationId}")
  public ResponseEntity<?> deleteCampaign(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteCampaign(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignBlock_2")
  public List<CampaignBlock> listCampaignBlock_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listCampaignBlock_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignBlock_2")
  public ResponseEntity<?> postCampaignBlock_2(@Validated @RequestBody final CampaignBlock entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaignBlock(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignBlock_2/{relationId}")
  public ResponseEntity<?> deleteCampaignBlock_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteCampaignBlock_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Category")
  public List<Category> listCategory(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listCategory(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Category")
  public ResponseEntity<?> postCategory(@Validated @RequestBody final Category entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setCategory(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Category/{relationId}")
  public ResponseEntity<?> deleteCategory(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteCategory(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company")
  public List<Company> listCompany(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setCompany(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteCompany(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Person")
  public List<Person> listPerson(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listPerson(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Person")
  public ResponseEntity<?> postPerson(@Validated @RequestBody final Person entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setPerson(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Person/{relationId}")
  public ResponseEntity<?> deletePerson(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deletePerson(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Sga")
  public List<Sga> listSga(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listSga(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Sga")
  public ResponseEntity<?> postSga(@Validated @RequestBody final Sga entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setSga(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Sga/{relationId}")
  public ResponseEntity<?> deleteSga(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteSga(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Software")
  public List<Software> listSoftware(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listSoftware(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Software")
  public ResponseEntity<?> postSoftware(@Validated @RequestBody final Software entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setSoftware(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Software/{relationId}")
  public ResponseEntity<?> deleteSoftware(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteSoftware(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TerminalType")
  public List<TerminalType> listTerminalType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listTerminalType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TerminalType")
  public ResponseEntity<?> postTerminalType(@Validated @RequestBody final TerminalType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setTerminalType(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TerminalType/{relationId}")
  public ResponseEntity<?> deleteTerminalType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteTerminalType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TvType")
  public List<TvType> listTvType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return profileBusiness.listTvType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TvType")
  public ResponseEntity<?> postTvType(@Validated @RequestBody final TvType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Profile instance = this.profileBusiness.getRepository().findOne(instanceId);

      newTerminal.setTvType(entity);
      newTerminal.setProfile(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getProfile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TvType/{relationId}")
  public ResponseEntity<?> deleteTvType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.profileBusiness.deleteTvType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}