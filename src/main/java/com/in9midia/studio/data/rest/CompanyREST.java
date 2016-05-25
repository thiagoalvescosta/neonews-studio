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
 * Controller para expor serviços REST de Company
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Company")
public class CompanyREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CompanyBusiness")
    private CompanyBusiness companyBusiness;

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
    @Qualifier("ExpressionExBusiness")
    private ExpressionExBusiness expressionExBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("FileBusiness")
    private FileBusiness fileBusiness;
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
    @Qualifier("CampaignCategoryBusiness")
    private CampaignCategoryBusiness campaignCategoryBusiness;
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
    @Qualifier("CategoryBusiness")
    private CategoryBusiness categoryBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("FolderBusiness")
    private FolderBusiness folderBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ContentBusiness")
    private ContentBusiness contentBusiness;
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
    @Qualifier("NwsChannelBusiness")
    private NwsChannelBusiness nwsChannelBusiness;
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
    @Qualifier("UsuarioBusiness")
    private UsuarioBusiness usuarioBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("NeonewsUserBusiness")
    private NeonewsUserBusiness neonewsUserBusiness;
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
    @Qualifier("AgencyBusiness")
    private AgencyBusiness agencyBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ChannelTypeBusiness")
    private ChannelTypeBusiness channelTypeBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CommissionedBusiness")
    private CommissionedBusiness commissionedBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ParticipantBusiness")
    private ParticipantBusiness participantBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("PatrimonyBusiness")
    private PatrimonyBusiness patrimonyBusiness;
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
    @Qualifier("RouteBusiness")
    private RouteBusiness routeBusiness;
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
    @Qualifier("CampaignTemplateBusiness")
    private CampaignTemplateBusiness campaignTemplateBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TemplateBusiness")
    private TemplateBusiness templateBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("UserCompanyBusiness")
    private UserCompanyBusiness userCompanyBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Company post(@Validated @RequestBody final Company entity) throws Exception {
        companyBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Company entity = companyBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Company entity) throws Exception {
        return ResponseEntity.ok( companyBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Company put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Company entity) throws Exception {
        return companyBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         companyBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Company> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return companyBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Account")    
  public List<Account> findAccount(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findAccount(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/Agency")    
  public List<Agency> findAgency(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findAgency(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Agency/{relationId}")    
  public ResponseEntity<?> deleteAgency(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.agencyBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Campaign_2")    
  public List<Campaign> findCampaign_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findCampaign_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Campaign_2/{relationId}")    
  public ResponseEntity<?> deleteCampaign_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/CampaignCategory_2")    
  public List<CampaignCategory> findCampaignCategory_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findCampaignCategory_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignCategory_2/{relationId}")    
  public ResponseEntity<?> deleteCampaignCategory_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.campaignCategoryBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Category")    
  public List<Category> findCategory(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findCategory(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/ChannelType")    
  public List<ChannelType> findChannelType(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findChannelType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ChannelType/{relationId}")    
  public ResponseEntity<?> deleteChannelType(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.channelTypeBusiness.getRepository().delete(relationId);
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
    return companyBusiness.findCommissioned(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/File_2")    
  public List<File> findFile_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findFile_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/File_2/{relationId}")    
  public ResponseEntity<?> deleteFile_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.fileBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Folder_2")    
  public List<Folder> findFolder_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findFolder_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Folder_2/{relationId}")    
  public ResponseEntity<?> deleteFolder_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.folderBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Participant")    
  public List<Participant> findParticipant(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findParticipant(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Participant/{relationId}")    
  public ResponseEntity<?> deleteParticipant(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.participantBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Patrimony")    
  public List<Patrimony> findPatrimony(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findPatrimony(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Patrimony/{relationId}")    
  public ResponseEntity<?> deletePatrimony(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.patrimonyBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Patrimony_2")    
  public List<Patrimony> findPatrimony_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findPatrimony_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Patrimony_2/{relationId}")    
  public ResponseEntity<?> deletePatrimony_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.patrimonyBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Patrimony_3")    
  public List<Patrimony> findPatrimony_3(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findPatrimony_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Patrimony_3/{relationId}")    
  public ResponseEntity<?> deletePatrimony_3(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.patrimonyBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Patrimony_4")    
  public List<Patrimony> findPatrimony_4(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findPatrimony_4(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Patrimony_4/{relationId}")    
  public ResponseEntity<?> deletePatrimony_4(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.patrimonyBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Person_3")    
  public List<Person> findPerson_3(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findPerson_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Person_3/{relationId}")    
  public ResponseEntity<?> deletePerson_3(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.personBusiness.getRepository().delete(relationId);
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
    return companyBusiness.findProfile(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/Region")    
  public List<Region> findRegion(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findRegion(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Region/{relationId}")    
  public ResponseEntity<?> deleteRegion(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.regionBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Route")    
  public List<Route> findRoute(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findRoute(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Route/{relationId}")    
  public ResponseEntity<?> deleteRoute(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.routeBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Schedule")    
  public List<Schedule> findSchedule(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findSchedule(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Schedule/{relationId}")    
  public ResponseEntity<?> deleteSchedule(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.scheduleBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Sga")    
  public List<Sga> findSga(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findSga(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Sga/{relationId}")    
  public ResponseEntity<?> deleteSga(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.sgaBusiness.getRepository().delete(relationId);
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
    return companyBusiness.findCampaignTemplate(instanceId,  new PageRequest(offset, limit) );
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
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Template")    
  public List<Template> findTemplate(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findTemplate(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Template/{relationId}")    
  public ResponseEntity<?> deleteTemplate(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.templateBusiness.getRepository().delete(relationId);
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
    return companyBusiness.findTerminal_3(instanceId,  new PageRequest(offset, limit) );
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
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/NeonewsUser")    
  public List<NeonewsUser> findNeonewsUser(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findNeonewsUser(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/NeonewsUser/{relationId}")    
  public ResponseEntity<?> deleteNeonewsUser(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.neonewsUserBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/UserCompany")    
  public List<UserCompany> findUserCompany(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return companyBusiness.findUserCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/UserCompany/{relationId}")    
  public ResponseEntity<?> deleteUserCompany(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.userCompanyBusiness.getRepository().delete(relationId);
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
    return companyBusiness.listCampaign(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign")
  public ResponseEntity<?> postCampaign(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newAccount.setCampaign(entity);
      newAccount.setCompany(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign/{relationId}")
  public ResponseEntity<?> deleteCampaign(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteCampaign(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Person")
  public List<Person> listPerson(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listPerson(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Person")
  public ResponseEntity<?> postPerson(@Validated @RequestBody final Person entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newAccount.setPerson(entity);
      newAccount.setCompany(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Person/{relationId}")
  public ResponseEntity<?> deletePerson(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deletePerson(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal")
  public List<Terminal> listTerminal(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal")
  public ResponseEntity<?> postTerminal(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Account newAccount = new Account();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newAccount.setTerminal(entity);
      newAccount.setCompany(instance);
      
      this.accountBusiness.getRepository().saveAndFlush(newAccount);

      return ResponseEntity.ok(newAccount.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal/{relationId}")
  public ResponseEntity<?> deleteTerminal(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteTerminal(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/ExpressionEx")
  public List<ExpressionEx> listExpressionEx(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listExpressionEx(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/ExpressionEx")
  public ResponseEntity<?> postExpressionEx(@Validated @RequestBody final ExpressionEx entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Agency newAgency = new Agency();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newAgency.setExpressionEx(entity);
      newAgency.setCompany(instance);
      
      this.agencyBusiness.getRepository().saveAndFlush(newAgency);

      return ResponseEntity.ok(newAgency.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/ExpressionEx/{relationId}")
  public ResponseEntity<?> deleteExpressionEx(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteExpressionEx(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/File")
  public List<File> listFile(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listFile(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/File")
  public ResponseEntity<?> postFile(@Validated @RequestBody final File entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Agency newAgency = new Agency();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newAgency.setFile(entity);
      newAgency.setCompany(instance);
      
      this.agencyBusiness.getRepository().saveAndFlush(newAgency);

      return ResponseEntity.ok(newAgency.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/File/{relationId}")
  public ResponseEntity<?> deleteFile(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteFile(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignBlock")
  public List<CampaignBlock> listCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listCampaignBlock(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignBlock")
  public ResponseEntity<?> postCampaignBlock(@Validated @RequestBody final CampaignBlock entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Campaign newCampaign = new Campaign();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCampaign.setCampaignBlock(entity);
      newCampaign.setCompany(instance);
      
      this.campaignBusiness.getRepository().saveAndFlush(newCampaign);

      return ResponseEntity.ok(newCampaign.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignBlock/{relationId}")
  public ResponseEntity<?> deleteCampaignBlock(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteCampaignBlock(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignCategory")
  public List<CampaignCategory> listCampaignCategory(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listCampaignCategory(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignCategory")
  public ResponseEntity<?> postCampaignCategory(@Validated @RequestBody final CampaignCategory entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Campaign newCampaign = new Campaign();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCampaign.setCampaignCategory(entity);
      newCampaign.setCompany(instance);
      
      this.campaignBusiness.getRepository().saveAndFlush(newCampaign);

      return ResponseEntity.ok(newCampaign.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignCategory/{relationId}")
  public ResponseEntity<?> deleteCampaignCategory(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteCampaignCategory(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Module")
  public List<Module> listModule(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listModule(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Module")
  public ResponseEntity<?> postModule(@Validated @RequestBody final Module entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Campaign newCampaign = new Campaign();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCampaign.setModule(entity);
      newCampaign.setCompany(instance);
      
      this.campaignBusiness.getRepository().saveAndFlush(newCampaign);

      return ResponseEntity.ok(newCampaign.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Module/{relationId}")
  public ResponseEntity<?> deleteModule(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteModule(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignCategory_3")
  public List<CampaignCategory> listCampaignCategory_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listCampaignCategory_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignCategory_3")
  public ResponseEntity<?> postCampaignCategory_3(@Validated @RequestBody final CampaignCategory entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignCategory newCampaignCategory = new CampaignCategory();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCampaignCategory.setCampaignCategory(entity);
      newCampaignCategory.setCompany(instance);
      
      this.campaignCategoryBusiness.getRepository().saveAndFlush(newCampaignCategory);

      return ResponseEntity.ok(newCampaignCategory.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignCategory_3/{relationId}")
  public ResponseEntity<?> deleteCampaignCategory_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteCampaignCategory_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Category_2")
  public List<Category> listCategory_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listCategory_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Category_2")
  public ResponseEntity<?> postCategory_2(@Validated @RequestBody final Category entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Category newCategory = new Category();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCategory.setCategory(entity);
      newCategory.setCompany(instance);
      
      this.categoryBusiness.getRepository().saveAndFlush(newCategory);

      return ResponseEntity.ok(newCategory.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Category_2/{relationId}")
  public ResponseEntity<?> deleteCategory_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteCategory_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Person_2")
  public List<Person> listPerson_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listPerson_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Person_2")
  public ResponseEntity<?> postPerson_2(@Validated @RequestBody final Person entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Commissioned newCommissioned = new Commissioned();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCommissioned.setPerson(entity);
      newCommissioned.setCompany(instance);
      
      this.commissionedBusiness.getRepository().saveAndFlush(newCommissioned);

      return ResponseEntity.ok(newCommissioned.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Person_2/{relationId}")
  public ResponseEntity<?> deletePerson_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deletePerson_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal_2")
  public List<Terminal> listTerminal_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listTerminal_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal_2")
  public ResponseEntity<?> postTerminal_2(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Commissioned newCommissioned = new Commissioned();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCommissioned.setTerminal(entity);
      newCommissioned.setCompany(instance);
      
      this.commissionedBusiness.getRepository().saveAndFlush(newCommissioned);

      return ResponseEntity.ok(newCommissioned.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal_2/{relationId}")
  public ResponseEntity<?> deleteTerminal_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteTerminal_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Folder")
  public List<Folder> listFolder(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listFolder(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Folder")
  public ResponseEntity<?> postFolder(@Validated @RequestBody final Folder entity, @PathVariable("instanceId") java.lang.String instanceId) {
      File newFile = new File();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newFile.setFolder(entity);
      newFile.setCompany(instance);
      
      this.fileBusiness.getRepository().saveAndFlush(newFile);

      return ResponseEntity.ok(newFile.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Folder/{relationId}")
  public ResponseEntity<?> deleteFolder(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteFolder(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Folder_3")
  public List<Folder> listFolder_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listFolder_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Folder_3")
  public ResponseEntity<?> postFolder_3(@Validated @RequestBody final Folder entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Folder newFolder = new Folder();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newFolder.setFolder(entity);
      newFolder.setCompany(instance);
      
      this.folderBusiness.getRepository().saveAndFlush(newFolder);

      return ResponseEntity.ok(newFolder.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Folder_3/{relationId}")
  public ResponseEntity<?> deleteFolder_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteFolder_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Content")
  public List<Content> listContent(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listContent(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Content")
  public ResponseEntity<?> postContent(@Validated @RequestBody final Content entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Participant newParticipant = new Participant();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newParticipant.setContent(entity);
      newParticipant.setCompany(instance);
      
      this.participantBusiness.getRepository().saveAndFlush(newParticipant);

      return ResponseEntity.ok(newParticipant.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Content/{relationId}")
  public ResponseEntity<?> deleteContent(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteContent(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/File_3")
  public List<File> listFile_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listFile_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/File_3")
  public ResponseEntity<?> postFile_3(@Validated @RequestBody final File entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Participant newParticipant = new Participant();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newParticipant.setFile(entity);
      newParticipant.setCompany(instance);
      
      this.participantBusiness.getRepository().saveAndFlush(newParticipant);

      return ResponseEntity.ok(newParticipant.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/File_3/{relationId}")
  public ResponseEntity<?> deleteFile_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteFile_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Address")
  public List<Address> listAddress(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listAddress(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Address")
  public ResponseEntity<?> postAddress(@Validated @RequestBody final Address entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Person newPerson = new Person();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newPerson.setAddress(entity);
      newPerson.setCompany(instance);
      
      this.personBusiness.getRepository().saveAndFlush(newPerson);

      return ResponseEntity.ok(newPerson.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Address/{relationId}")
  public ResponseEntity<?> deleteAddress(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteAddress(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Module_2")
  public List<Module> listModule_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listModule_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Module_2")
  public ResponseEntity<?> postModule_2(@Validated @RequestBody final Module entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setModule(entity);
      newCampaignTemplate.setCompany(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Module_2/{relationId}")
  public ResponseEntity<?> deleteModule_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteModule_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/NwsChannel")
  public List<NwsChannel> listNwsChannel(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listNwsChannel(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/NwsChannel")
  public ResponseEntity<?> postNwsChannel(@Validated @RequestBody final NwsChannel entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setNwsChannel(entity);
      newCampaignTemplate.setCompany(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/NwsChannel/{relationId}")
  public ResponseEntity<?> deleteNwsChannel(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteNwsChannel(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Theme")
  public List<Theme> listTheme(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listTheme(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Theme")
  public ResponseEntity<?> postTheme(@Validated @RequestBody final Theme entity, @PathVariable("instanceId") java.lang.String instanceId) {
      CampaignTemplate newCampaignTemplate = new CampaignTemplate();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newCampaignTemplate.setTheme(entity);
      newCampaignTemplate.setCompany(instance);
      
      this.campaignTemplateBusiness.getRepository().saveAndFlush(newCampaignTemplate);

      return ResponseEntity.ok(newCampaignTemplate.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Theme/{relationId}")
  public ResponseEntity<?> deleteTheme(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteTheme(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Address_2")
  public List<Address> listAddress_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listAddress_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Address_2")
  public ResponseEntity<?> postAddress_2(@Validated @RequestBody final Address entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setAddress(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Address_2/{relationId}")
  public ResponseEntity<?> deleteAddress_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteAddress_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Campaign_3")
  public List<Campaign> listCampaign_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listCampaign_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign_3")
  public ResponseEntity<?> postCampaign_3(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaign(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign_3/{relationId}")
  public ResponseEntity<?> deleteCampaign_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteCampaign_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/CampaignBlock_2")
  public List<CampaignBlock> listCampaignBlock_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listCampaignBlock_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/CampaignBlock_2")
  public ResponseEntity<?> postCampaignBlock_2(@Validated @RequestBody final CampaignBlock entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setCampaignBlock(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/CampaignBlock_2/{relationId}")
  public ResponseEntity<?> deleteCampaignBlock_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteCampaignBlock_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Category_3")
  public List<Category> listCategory_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listCategory_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Category_3")
  public ResponseEntity<?> postCategory_3(@Validated @RequestBody final Category entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setCategory(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Category_3/{relationId}")
  public ResponseEntity<?> deleteCategory_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteCategory_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Person_4")
  public List<Person> listPerson_4(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listPerson_4(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Person_4")
  public ResponseEntity<?> postPerson_4(@Validated @RequestBody final Person entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setPerson(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Person_4/{relationId}")
  public ResponseEntity<?> deletePerson_4(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deletePerson_4(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Profile_2")
  public List<Profile> listProfile_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listProfile_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Profile_2")
  public ResponseEntity<?> postProfile_2(@Validated @RequestBody final Profile entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setProfile(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Profile_2/{relationId}")
  public ResponseEntity<?> deleteProfile_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteProfile_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Sga_2")
  public List<Sga> listSga_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listSga_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Sga_2")
  public ResponseEntity<?> postSga_2(@Validated @RequestBody final Sga entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setSga(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Sga_2/{relationId}")
  public ResponseEntity<?> deleteSga_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteSga_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Software")
  public List<Software> listSoftware(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listSoftware(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Software")
  public ResponseEntity<?> postSoftware(@Validated @RequestBody final Software entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setSoftware(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Software/{relationId}")
  public ResponseEntity<?> deleteSoftware(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteSoftware(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TerminalType")
  public List<TerminalType> listTerminalType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listTerminalType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TerminalType")
  public ResponseEntity<?> postTerminalType(@Validated @RequestBody final TerminalType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setTerminalType(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TerminalType/{relationId}")
  public ResponseEntity<?> deleteTerminalType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteTerminalType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/TvType")
  public List<TvType> listTvType(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listTvType(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/TvType")
  public ResponseEntity<?> postTvType(@Validated @RequestBody final TvType entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Terminal newTerminal = new Terminal();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newTerminal.setTvType(entity);
      newTerminal.setCompany(instance);
      
      this.terminalBusiness.getRepository().saveAndFlush(newTerminal);

      return ResponseEntity.ok(newTerminal.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/TvType/{relationId}")
  public ResponseEntity<?> deleteTvType(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteTvType(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Address_3")
  public List<Address> listAddress_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listAddress_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Address_3")
  public ResponseEntity<?> postAddress_3(@Validated @RequestBody final Address entity, @PathVariable("instanceId") java.lang.String instanceId) {
      NeonewsUser newNeonewsUser = new NeonewsUser();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newNeonewsUser.setAddress(entity);
      newNeonewsUser.setCompany(instance);
      
      this.neonewsUserBusiness.getRepository().saveAndFlush(newNeonewsUser);

      return ResponseEntity.ok(newNeonewsUser.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Address_3/{relationId}")
  public ResponseEntity<?> deleteAddress_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteAddress_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Usuario")
  public List<Usuario> listUsuario(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listUsuario(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Usuario")
  public ResponseEntity<?> postUsuario(@Validated @RequestBody final Usuario entity, @PathVariable("instanceId") java.lang.String instanceId) {
      NeonewsUser newNeonewsUser = new NeonewsUser();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newNeonewsUser.setUsuario(entity);
      newNeonewsUser.setCompany(instance);
      
      this.neonewsUserBusiness.getRepository().saveAndFlush(newNeonewsUser);

      return ResponseEntity.ok(newNeonewsUser.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Usuario/{relationCodigo}")
  public ResponseEntity<?> deleteUsuario(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationCodigo") java.lang.Integer relationCodigo) {
      this.companyBusiness.deleteUsuario(instanceId, relationCodigo);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/NeonewsUser_2")
  public List<NeonewsUser> listNeonewsUser_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return companyBusiness.listNeonewsUser_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/NeonewsUser_2")
  public ResponseEntity<?> postNeonewsUser_2(@Validated @RequestBody final NeonewsUser entity, @PathVariable("instanceId") java.lang.String instanceId) {
      UserCompany newUserCompany = new UserCompany();

      Company instance = this.companyBusiness.getRepository().findOne(instanceId);

      newUserCompany.setUser(entity);
      newUserCompany.setCompany(instance);
      
      this.userCompanyBusiness.getRepository().saveAndFlush(newUserCompany);

      return ResponseEntity.ok(newUserCompany.getCompany());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/NeonewsUser_2/{relationId}")
  public ResponseEntity<?> deleteNeonewsUser_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.companyBusiness.deleteNeonewsUser_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}