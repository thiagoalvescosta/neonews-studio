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
 * Controller para expor serviços REST de Category
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Category")
public class CategoryREST {

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
    @Qualifier("PersonBusiness")
    private PersonBusiness personBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ProfileBusiness")
    private ProfileBusiness profileBusiness;
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
    @Qualifier("CategoryBusiness")
    private CategoryBusiness categoryBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalBusiness")
    private TerminalBusiness terminalBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Category post(@Validated @RequestBody final Category entity) throws Exception {
        categoryBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Category entity = categoryBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Category entity) throws Exception {
        return ResponseEntity.ok( categoryBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Category put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Category entity) throws Exception {
        return categoryBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         categoryBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Category> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return categoryBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Category")    
  public List<Category> findCategory(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return categoryBusiness.findCategory(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Category/{relationId}")    
  public ResponseEntity<?> deleteCategory(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.categoryBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Terminal")    
  public List<Terminal> findTerminal(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return categoryBusiness.findTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Terminal/{relationId}")    
  public ResponseEntity<?> deleteTerminal(@PathVariable("relationId") java.lang.String relationId) {
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
  ,value="/{instanceId}/Company")
  public List<Company> listCompany(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Category newCategory = new Category();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newCategory.setCompany(entity);
      newCategory.setCategory(instance);
      
      this.categoryBusiness.getRepository().saveAndFlush(newCategory);

      return ResponseEntity.ok(newCategory.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteCompany(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Address")
  public List<Address> listAddress(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listAddress(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Address")
  public ResponseEntity<?> postAddress(@Validated @RequestBody final Address entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setAddress(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Address/{relationId}")
  public ResponseEntity<?> deleteAddress(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteAddress(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Campaign")
  public List<Campaign> listCampaign(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listCampaign(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign")
  public ResponseEntity<?> postCampaign(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaign(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign/{relationId}")
  public ResponseEntity<?> deleteCampaign(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteCampaign(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignBlock")
  public List<CampaignBlock> listCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listCampaignBlock(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignBlock")
  public ResponseEntity<?> postCampaignBlock(@Validated @RequestBody final CampaignBlock entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaignBlock(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignBlock/{relationId}")
  public ResponseEntity<?> deleteCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteCampaignBlock(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company_2")
  public List<Company> listCompany_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listCompany_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company_2")
  public ResponseEntity<?> postCompany_2(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setCompany(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company_2/{relationId}")
  public ResponseEntity<?> deleteCompany_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteCompany_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Person")
  public List<Person> listPerson(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listPerson(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Person")
  public ResponseEntity<?> postPerson(@Validated @RequestBody final Person entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setPerson(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Person/{relationId}")
  public ResponseEntity<?> deletePerson(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deletePerson(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Profile")
  public List<Profile> listProfile(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listProfile(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Profile")
  public ResponseEntity<?> postProfile(@Validated @RequestBody final Profile entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setProfile(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Profile/{relationId}")
  public ResponseEntity<?> deleteProfile(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteProfile(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Sga")
  public List<Sga> listSga(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listSga(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Sga")
  public ResponseEntity<?> postSga(@Validated @RequestBody final Sga entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setSga(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Sga/{relationId}")
  public ResponseEntity<?> deleteSga(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteSga(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Software")
  public List<Software> listSoftware(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listSoftware(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Software")
  public ResponseEntity<?> postSoftware(@Validated @RequestBody final Software entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setSoftware(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Software/{relationId}")
  public ResponseEntity<?> deleteSoftware(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteSoftware(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TerminalType")
  public List<TerminalType> listTerminalType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listTerminalType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TerminalType")
  public ResponseEntity<?> postTerminalType(@Validated @RequestBody final TerminalType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setTerminalType(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TerminalType/{relationId}")
  public ResponseEntity<?> deleteTerminalType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteTerminalType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TvType")
  public List<TvType> listTvType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return categoryBusiness.listTvType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TvType")
  public ResponseEntity<?> postTvType(@Validated @RequestBody final TvType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Category instance = this.categoryBusiness.getRepository().findOne(instanceId);

      newTerminal.setTvType(entity);
      newTerminal.setCategory(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCategory());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TvType/{relationId}")
  public ResponseEntity<?> deleteTvType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.categoryBusiness.deleteTvType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}