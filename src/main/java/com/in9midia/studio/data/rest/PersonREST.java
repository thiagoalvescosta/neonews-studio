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
 * Controller para expor serviços REST de Person
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Person")
public class PersonREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("PersonBusiness")
    private PersonBusiness personBusiness;

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
    @Qualifier("CompanyBusiness")
    private CompanyBusiness companyBusiness;
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
    @Qualifier("ChannelBusiness")
    private ChannelBusiness channelBusiness;
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
    @Qualifier("AccountBusiness")
    private AccountBusiness accountBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignPersonBusiness")
    private CampaignPersonBusiness campaignPersonBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ChannelPersonBusiness")
    private ChannelPersonBusiness channelPersonBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CommissionedBusiness")
    private CommissionedBusiness commissionedBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Person post(@Validated @RequestBody final Person entity) throws Exception {
        personBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Person entity = personBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Person entity) throws Exception {
        return ResponseEntity.ok( personBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Person put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Person entity) throws Exception {
        return personBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         personBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Person> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return personBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Account")    
  public List<Account> findAccount(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return personBusiness.findAccount(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Account/{relationId}")    
  public ResponseEntity<?> deleteAccount(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.accountBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/CampaignPerson")    
  public List<CampaignPerson> findCampaignPerson(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return personBusiness.findCampaignPerson(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignPerson/{relationId}")    
  public ResponseEntity<?> deleteCampaignPerson(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignPersonBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/ChannelPerson")    
  public List<ChannelPerson> findChannelPerson(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return personBusiness.findChannelPerson(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ChannelPerson/{relationId}")    
  public ResponseEntity<?> deleteChannelPerson(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.channelPersonBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Commissioned")    
  public List<Commissioned> findCommissioned(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return personBusiness.findCommissioned(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Commissioned/{relationId}")    
  public ResponseEntity<?> deleteCommissioned(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.commissionedBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Terminal_3")    
  public List<Terminal> findTerminal_3(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return personBusiness.findTerminal_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Terminal_3/{relationId}")    
  public ResponseEntity<?> deleteTerminal_3(@PathVariable("relationId") java.lang.String relationId) {
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
  ,value="/{instanceId}/Campaign")
  public List<Campaign> listCampaign(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listCampaign(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign")
  public ResponseEntity<?> postCampaign(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newAccount.setCampaign(entity);
      newAccount.setPerson(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign/{relationId}")
  public ResponseEntity<?> deleteCampaign(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteCampaign(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company")
  public List<Company> listCompany(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newAccount.setCompany(entity);
      newAccount.setPerson(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteCompany(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal")
  public List<Terminal> listTerminal(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal")
  public ResponseEntity<?> postTerminal(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newAccount.setTerminal(entity);
      newAccount.setPerson(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal/{relationId}")
  public ResponseEntity<?> deleteTerminal(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteTerminal(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Campaign_2")
  public List<Campaign> listCampaign_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listCampaign_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign_2")
  public ResponseEntity<?> postCampaign_2(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignPerson newCampaignPerson = new CampaignPerson();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newCampaignPerson.setCampaign(entity);
      newCampaignPerson.setPerson(instance);
      
      this.campaignPersonBusiness.getRepository().saveAndFlush(newCampaignPerson);

      return ResponseEntity.ok(newCampaignPerson.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign_2/{relationId}")
  public ResponseEntity<?> deleteCampaign_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteCampaign_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Channel")
  public List<Channel> listChannel(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listChannel(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Channel")
  public ResponseEntity<?> postChannel(@Validated @RequestBody final Channel entity, @PathVariable("instanceId") java.lang.String instanceId) {
      ChannelPerson newChannelPerson = new ChannelPerson();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newChannelPerson.setChannel(entity);
      newChannelPerson.setPerson(instance);
      
      this.channelPersonBusiness.getRepository().saveAndFlush(newChannelPerson);

      return ResponseEntity.ok(newChannelPerson.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Channel/{relationId}")
  public ResponseEntity<?> deleteChannel(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteChannel(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company_2")
  public List<Company> listCompany_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listCompany_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company_2")
  public ResponseEntity<?> postCompany_2(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Commissioned newCommissioned = new Commissioned();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newCommissioned.setCompany(entity);
      newCommissioned.setPerson(instance);
      
      this.commissionedBusiness.getRepository().saveAndFlush(newCommissioned);

      return ResponseEntity.ok(newCommissioned.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company_2/{relationId}")
  public ResponseEntity<?> deleteCompany_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteCompany_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal_2")
  public List<Terminal> listTerminal_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listTerminal_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal_2")
  public ResponseEntity<?> postTerminal_2(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Commissioned newCommissioned = new Commissioned();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newCommissioned.setTerminal(entity);
      newCommissioned.setPerson(instance);
      
      this.commissionedBusiness.getRepository().saveAndFlush(newCommissioned);

      return ResponseEntity.ok(newCommissioned.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal_2/{relationId}")
  public ResponseEntity<?> deleteTerminal_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteTerminal_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Address")
  public List<Address> listAddress(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listAddress(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Address")
  public ResponseEntity<?> postAddress(@Validated @RequestBody final Address entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setAddress(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Address/{relationId}")
  public ResponseEntity<?> deleteAddress(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteAddress(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Campaign_3")
  public List<Campaign> listCampaign_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listCampaign_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign_3")
  public ResponseEntity<?> postCampaign_3(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaign(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign_3/{relationId}")
  public ResponseEntity<?> deleteCampaign_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteCampaign_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignBlock")
  public List<CampaignBlock> listCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listCampaignBlock(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignBlock")
  public ResponseEntity<?> postCampaignBlock(@Validated @RequestBody final CampaignBlock entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaignBlock(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignBlock/{relationId}")
  public ResponseEntity<?> deleteCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteCampaignBlock(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Category")
  public List<Category> listCategory(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listCategory(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Category")
  public ResponseEntity<?> postCategory(@Validated @RequestBody final Category entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setCategory(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Category/{relationId}")
  public ResponseEntity<?> deleteCategory(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteCategory(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company_3")
  public List<Company> listCompany_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listCompany_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company_3")
  public ResponseEntity<?> postCompany_3(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setCompany(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company_3/{relationId}")
  public ResponseEntity<?> deleteCompany_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteCompany_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Profile")
  public List<Profile> listProfile(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listProfile(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Profile")
  public ResponseEntity<?> postProfile(@Validated @RequestBody final Profile entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setProfile(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Profile/{relationId}")
  public ResponseEntity<?> deleteProfile(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteProfile(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Sga")
  public List<Sga> listSga(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listSga(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Sga")
  public ResponseEntity<?> postSga(@Validated @RequestBody final Sga entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setSga(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Sga/{relationId}")
  public ResponseEntity<?> deleteSga(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteSga(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Software")
  public List<Software> listSoftware(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listSoftware(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Software")
  public ResponseEntity<?> postSoftware(@Validated @RequestBody final Software entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setSoftware(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Software/{relationId}")
  public ResponseEntity<?> deleteSoftware(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteSoftware(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TerminalType")
  public List<TerminalType> listTerminalType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listTerminalType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TerminalType")
  public ResponseEntity<?> postTerminalType(@Validated @RequestBody final TerminalType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setTerminalType(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TerminalType/{relationId}")
  public ResponseEntity<?> deleteTerminalType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteTerminalType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TvType")
  public List<TvType> listTvType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return personBusiness.listTvType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TvType")
  public ResponseEntity<?> postTvType(@Validated @RequestBody final TvType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Person instance = this.personBusiness.getRepository().findOne(instanceId);

      newTerminal.setTvType(entity);
      newTerminal.setPerson(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getPerson());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TvType/{relationId}")
  public ResponseEntity<?> deleteTvType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.personBusiness.deleteTvType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}