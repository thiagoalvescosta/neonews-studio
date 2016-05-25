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
 * Controller para expor serviços REST de Campaign
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Campaign")
public class CampaignREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
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
    @Qualifier("PersonBusiness")
    private PersonBusiness personBusiness;
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
    @Qualifier("CampaignBlockBusiness")
    private CampaignBlockBusiness campaignBlockBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ModulePropertyBusiness")
    private ModulePropertyBusiness modulePropertyBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ResolutionBusiness")
    private ResolutionBusiness resolutionBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("RegionBusiness")
    private RegionBusiness regionBusiness;
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
    @Qualifier("CampaignCampaignBlockBusiness")
    private CampaignCampaignBlockBusiness campaignCampaignBlockBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignDateBusiness")
    private CampaignDateBusiness campaignDateBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignLogBusiness")
    private CampaignLogBusiness campaignLogBusiness;
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
    @Qualifier("CampaignPropertyBusiness")
    private CampaignPropertyBusiness campaignPropertyBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CampaignRegionBusiness")
    private CampaignRegionBusiness campaignRegionBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("LogBusiness")
    private LogBusiness logBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ReportCampaignScheduleBusiness")
    private ReportCampaignScheduleBusiness reportCampaignScheduleBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Campaign post(@Validated @RequestBody final Campaign entity) throws Exception {
        campaignBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Campaign entity = campaignBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Campaign entity) throws Exception {
        return ResponseEntity.ok( campaignBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Campaign put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Campaign entity) throws Exception {
        return campaignBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         campaignBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Campaign> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return campaignBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Account")    
  public List<Account> findAccount(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findAccount(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/CampaignCampaignBlock")    
  public List<CampaignCampaignBlock> findCampaignCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findCampaignCampaignBlock(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignCampaignBlock/{relationId}")    
  public ResponseEntity<?> deleteCampaignCampaignBlock(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignCampaignBlockBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/CampaignDate")    
  public List<CampaignDate> findCampaignDate(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findCampaignDate(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignDate/{relationId}")    
  public ResponseEntity<?> deleteCampaignDate(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignDateBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/CampaignLog")    
  public List<CampaignLog> findCampaignLog(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findCampaignLog(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignLog/{relationId}")    
  public ResponseEntity<?> deleteCampaignLog(@PathVariable("relationId") java.lang.Long relationId) {
      try {
        this.campaignLogBusiness.getRepository().delete(relationId);
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
    return campaignBusiness.findCampaignPerson(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/CampaignProperty")    
  public List<CampaignProperty> findCampaignProperty(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findCampaignProperty(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignProperty/{relationId}")    
  public ResponseEntity<?> deleteCampaignProperty(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignPropertyBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/CampaignRegion")    
  public List<CampaignRegion> findCampaignRegion(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findCampaignRegion(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignRegion/{relationId}")    
  public ResponseEntity<?> deleteCampaignRegion(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignRegionBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Log")    
  public List<Log> findLog(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findLog(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Log/{relationId}")    
  public ResponseEntity<?> deleteLog(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.logBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Profile")    
  public List<Profile> findProfile(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findProfile(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Profile/{relationId}")    
  public ResponseEntity<?> deleteProfile(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.profileBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Profile_2")    
  public List<Profile> findProfile_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findProfile_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Profile_2/{relationId}")    
  public ResponseEntity<?> deleteProfile_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.profileBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Profile_3")    
  public List<Profile> findProfile_3(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findProfile_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Profile_3/{relationId}")    
  public ResponseEntity<?> deleteProfile_3(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.profileBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Profile_4")    
  public List<Profile> findProfile_4(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findProfile_4(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Profile_4/{relationId}")    
  public ResponseEntity<?> deleteProfile_4(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.profileBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/ReportCampaignSchedule")    
  public List<ReportCampaignSchedule> findReportCampaignSchedule(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findReportCampaignSchedule(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ReportCampaignSchedule/{relationId}")    
  public ResponseEntity<?> deleteReportCampaignSchedule(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.reportCampaignScheduleBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Terminal_5")    
  public List<Terminal> findTerminal_5(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return campaignBusiness.findTerminal_5(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Terminal_5/{relationId}")    
  public ResponseEntity<?> deleteTerminal_5(@PathVariable("relationId") java.lang.String relationId) {
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
    return campaignBusiness.listCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newAccount.setCompany(entity);
      newAccount.setCampaign(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteCompany(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Person")
  public List<Person> listPerson(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listPerson(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Person")
  public ResponseEntity<?> postPerson(@Validated @RequestBody final Person entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newAccount.setPerson(entity);
      newAccount.setCampaign(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Person/{relationId}")
  public ResponseEntity<?> deletePerson(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deletePerson(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal")
  public List<Terminal> listTerminal(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal")
  public ResponseEntity<?> postTerminal(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newAccount.setTerminal(entity);
      newAccount.setCampaign(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal/{relationId}")
  public ResponseEntity<?> deleteTerminal(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteTerminal(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignBlock")
  public List<CampaignBlock> listCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listCampaignBlock(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignBlock")
  public ResponseEntity<?> postCampaignBlock(@Validated @RequestBody final CampaignBlock entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignCampaignBlock newCampaignCampaignBlock = new CampaignCampaignBlock();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newCampaignCampaignBlock.setCampaignBlock(entity);
      newCampaignCampaignBlock.setCampaign(instance);
      
      this.campaignCampaignBlockBusiness.getRepository().saveAndFlush(newCampaignCampaignBlock);

      return ResponseEntity.ok(newCampaignCampaignBlock.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignBlock/{relationId}")
  public ResponseEntity<?> deleteCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteCampaignBlock(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal_2")
  public List<Terminal> listTerminal_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listTerminal_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal_2")
  public ResponseEntity<?> postTerminal_2(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignLog newCampaignLog = new CampaignLog();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newCampaignLog.setTerminal(entity);
      newCampaignLog.setCampaign(instance);
      
      this.campaignLogBusiness.getRepository().saveAndFlush(newCampaignLog);

      return ResponseEntity.ok(newCampaignLog.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal_2/{relationId}")
  public ResponseEntity<?> deleteTerminal_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteTerminal_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Person_2")
  public List<Person> listPerson_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listPerson_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Person_2")
  public ResponseEntity<?> postPerson_2(@Validated @RequestBody final Person entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignPerson newCampaignPerson = new CampaignPerson();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newCampaignPerson.setPerson(entity);
      newCampaignPerson.setCampaign(instance);
      
      this.campaignPersonBusiness.getRepository().saveAndFlush(newCampaignPerson);

      return ResponseEntity.ok(newCampaignPerson.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Person_2/{relationId}")
  public ResponseEntity<?> deletePerson_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deletePerson_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/ModuleProperty")
  public List<ModuleProperty> listModuleProperty(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listModuleProperty(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/ModuleProperty")
  public ResponseEntity<?> postModuleProperty(@Validated @RequestBody final ModuleProperty entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignProperty newCampaignProperty = new CampaignProperty();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newCampaignProperty.setModuleProperty(entity);
      newCampaignProperty.setCampaign(instance);
      
      this.campaignPropertyBusiness.getRepository().saveAndFlush(newCampaignProperty);

      return ResponseEntity.ok(newCampaignProperty.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/ModuleProperty/{relationId}")
  public ResponseEntity<?> deleteModuleProperty(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteModuleProperty(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Resolution")
  public List<Resolution> listResolution(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listResolution(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Resolution")
  public ResponseEntity<?> postResolution(@Validated @RequestBody final Resolution entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignProperty newCampaignProperty = new CampaignProperty();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newCampaignProperty.setResolution(entity);
      newCampaignProperty.setCampaign(instance);
      
      this.campaignPropertyBusiness.getRepository().saveAndFlush(newCampaignProperty);

      return ResponseEntity.ok(newCampaignProperty.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Resolution/{relationId}")
  public ResponseEntity<?> deleteResolution(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteResolution(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Region")
  public List<Region> listRegion(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listRegion(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Region")
  public ResponseEntity<?> postRegion(@Validated @RequestBody final Region entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignRegion newCampaignRegion = new CampaignRegion();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newCampaignRegion.setRegion(entity);
      newCampaignRegion.setCampaign(instance);
      
      this.campaignRegionBusiness.getRepository().saveAndFlush(newCampaignRegion);

      return ResponseEntity.ok(newCampaignRegion.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Region/{relationId}")
  public ResponseEntity<?> deleteRegion(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteRegion(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal_3")
  public List<Terminal> listTerminal_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listTerminal_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal_3")
  public ResponseEntity<?> postTerminal_3(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Log newLog = new Log();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newLog.setTerminal(entity);
      newLog.setCampaign(instance);
      
      this.logBusiness.getRepository().saveAndFlush(newLog);

      return ResponseEntity.ok(newLog.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal_3/{relationId}")
  public ResponseEntity<?> deleteTerminal_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteTerminal_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal_4")
  public List<Terminal> listTerminal_4(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listTerminal_4(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal_4")
  public ResponseEntity<?> postTerminal_4(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      ReportCampaignSchedule newReportCampaignSchedule = new ReportCampaignSchedule();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newReportCampaignSchedule.setTerminal(entity);
      newReportCampaignSchedule.setCampaign(instance);
      
      this.reportCampaignScheduleBusiness.getRepository().saveAndFlush(newReportCampaignSchedule);

      return ResponseEntity.ok(newReportCampaignSchedule.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal_4/{relationId}")
  public ResponseEntity<?> deleteTerminal_4(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteTerminal_4(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Address")
  public List<Address> listAddress(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listAddress(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Address")
  public ResponseEntity<?> postAddress(@Validated @RequestBody final Address entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setAddress(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Address/{relationId}")
  public ResponseEntity<?> deleteAddress(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteAddress(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignBlock_2")
  public List<CampaignBlock> listCampaignBlock_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listCampaignBlock_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignBlock_2")
  public ResponseEntity<?> postCampaignBlock_2(@Validated @RequestBody final CampaignBlock entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaignBlock(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignBlock_2/{relationId}")
  public ResponseEntity<?> deleteCampaignBlock_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteCampaignBlock_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Category")
  public List<Category> listCategory(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listCategory(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Category")
  public ResponseEntity<?> postCategory(@Validated @RequestBody final Category entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setCategory(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Category/{relationId}")
  public ResponseEntity<?> deleteCategory(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteCategory(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company_2")
  public List<Company> listCompany_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listCompany_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company_2")
  public ResponseEntity<?> postCompany_2(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setCompany(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company_2/{relationId}")
  public ResponseEntity<?> deleteCompany_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteCompany_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Person_3")
  public List<Person> listPerson_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listPerson_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Person_3")
  public ResponseEntity<?> postPerson_3(@Validated @RequestBody final Person entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setPerson(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Person_3/{relationId}")
  public ResponseEntity<?> deletePerson_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deletePerson_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Profile_5")
  public List<Profile> listProfile_5(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listProfile_5(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Profile_5")
  public ResponseEntity<?> postProfile_5(@Validated @RequestBody final Profile entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setProfile(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Profile_5/{relationId}")
  public ResponseEntity<?> deleteProfile_5(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteProfile_5(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Sga")
  public List<Sga> listSga(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listSga(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Sga")
  public ResponseEntity<?> postSga(@Validated @RequestBody final Sga entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setSga(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Sga/{relationId}")
  public ResponseEntity<?> deleteSga(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteSga(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Software")
  public List<Software> listSoftware(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listSoftware(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Software")
  public ResponseEntity<?> postSoftware(@Validated @RequestBody final Software entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setSoftware(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Software/{relationId}")
  public ResponseEntity<?> deleteSoftware(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteSoftware(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TerminalType")
  public List<TerminalType> listTerminalType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listTerminalType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TerminalType")
  public ResponseEntity<?> postTerminalType(@Validated @RequestBody final TerminalType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setTerminalType(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TerminalType/{relationId}")
  public ResponseEntity<?> deleteTerminalType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteTerminalType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TvType")
  public List<TvType> listTvType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return campaignBusiness.listTvType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TvType")
  public ResponseEntity<?> postTvType(@Validated @RequestBody final TvType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Campaign instance = this.campaignBusiness.getRepository().findOne(instanceId);

      newTerminal.setTvType(entity);
      newTerminal.setCampaign(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCampaign());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TvType/{relationId}")
  public ResponseEntity<?> deleteTvType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.campaignBusiness.deleteTvType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}