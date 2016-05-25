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
 * Controller para expor serviços REST de File
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/File")
public class FileREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("FileBusiness")
    private FileBusiness fileBusiness;

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
    @Qualifier("ExpressionExBusiness")
    private ExpressionExBusiness expressionExBusiness;
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
    @Qualifier("ChannelBusiness")
    private ChannelBusiness channelBusiness;
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
    @Qualifier("ContentBusiness")
    private ContentBusiness contentBusiness;
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
    @Qualifier("AgencyBusiness")
    private AgencyBusiness agencyBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ConfigBusiness")
    private ConfigBusiness configBusiness;
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
    @Qualifier("ParticipantBusiness")
    private ParticipantBusiness participantBusiness;
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
    @Qualifier("RouteBusiness")
    private RouteBusiness routeBusiness;
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
    @Qualifier("TerminalAltRouteBusiness")
    private TerminalAltRouteBusiness terminalAltRouteBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public File post(@Validated @RequestBody final File entity) throws Exception {
        fileBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        File entity = fileBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final File entity) throws Exception {
        return ResponseEntity.ok( fileBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public File put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final File entity) throws Exception {
        return fileBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         fileBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<File> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return fileBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Agency")    
  public List<Agency> findAgency(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findAgency(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/Company_2")    
  public List<Company> findCompany_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findCompany_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Company_2/{relationId}")    
  public ResponseEntity<?> deleteCompany_2(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.companyBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Config")    
  public List<Config> findConfig(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findConfig(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Config/{relationId}")    
  public ResponseEntity<?> deleteConfig(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.configBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/Content")    
  public List<Content> findContent(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findContent(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Content/{relationId}")    
  public ResponseEntity<?> deleteContent(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.contentBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/NwsChannel")    
  public List<NwsChannel> findNwsChannel(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findNwsChannel(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/NwsChannel_2")    
  public List<NwsChannel> findNwsChannel_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findNwsChannel_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/NwsChannel_2/{relationId}")    
  public ResponseEntity<?> deleteNwsChannel_2(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/NwsChannel_3")    
  public List<NwsChannel> findNwsChannel_3(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findNwsChannel_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/NwsChannel_3/{relationId}")    
  public ResponseEntity<?> deleteNwsChannel_3(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/NwsChannel_4")    
  public List<NwsChannel> findNwsChannel_4(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findNwsChannel_4(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/NwsChannel_4/{relationId}")    
  public ResponseEntity<?> deleteNwsChannel_4(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/Participant")    
  public List<Participant> findParticipant(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findParticipant(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/Profile")    
  public List<Profile> findProfile(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findProfile(instanceId,  new PageRequest(offset, limit) );
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
    return fileBusiness.findProfile_2(instanceId,  new PageRequest(offset, limit) );
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
    return fileBusiness.findProfile_3(instanceId,  new PageRequest(offset, limit) );
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
    return fileBusiness.findProfile_4(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/Route")    
  public List<Route> findRoute(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findRoute(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/Route_2")    
  public List<Route> findRoute_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findRoute_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Route_2/{relationId}")    
  public ResponseEntity<?> deleteRoute_2(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/Route_3")    
  public List<Route> findRoute_3(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findRoute_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Route_3/{relationId}")    
  public ResponseEntity<?> deleteRoute_3(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/Route_4")    
  public List<Route> findRoute_4(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findRoute_4(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Route_4/{relationId}")    
  public ResponseEntity<?> deleteRoute_4(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/CampaignTemplate")    
  public List<CampaignTemplate> findCampaignTemplate(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findCampaignTemplate(instanceId,  new PageRequest(offset, limit) );
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
  , value="/{instanceId}/CampaignTemplate_2")    
  public List<CampaignTemplate> findCampaignTemplate_2(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findCampaignTemplate_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignTemplate_2/{relationId}")    
  public ResponseEntity<?> deleteCampaignTemplate_2(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/CampaignTemplate_3")    
  public List<CampaignTemplate> findCampaignTemplate_3(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findCampaignTemplate_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignTemplate_3/{relationId}")    
  public ResponseEntity<?> deleteCampaignTemplate_3(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/CampaignTemplate_4")    
  public List<CampaignTemplate> findCampaignTemplate_4(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findCampaignTemplate_4(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignTemplate_4/{relationId}")    
  public ResponseEntity<?> deleteCampaignTemplate_4(@PathVariable("relationId") java.lang.String relationId) {
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
  , value="/{instanceId}/TerminalAltRoute")    
  public List<TerminalAltRoute> findTerminalAltRoute(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return fileBusiness.findTerminalAltRoute(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/TerminalAltRoute/{relationId}")    
  public ResponseEntity<?> deleteTerminalAltRoute(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.terminalAltRouteBusiness.getRepository().delete(relationId);
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
    return fileBusiness.listCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Agency newAgency = new Agency();

      File instance = this.fileBusiness.getRepository().findOne(instanceId);

      newAgency.setCompany(entity);
      newAgency.setFile(instance);
      
      this.agencyBusiness.getRepository().saveAndFlush(newAgency);

      return ResponseEntity.ok(newAgency.getFile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.fileBusiness.deleteCompany(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/ExpressionEx")
  public List<ExpressionEx> listExpressionEx(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return fileBusiness.listExpressionEx(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/ExpressionEx")
  public ResponseEntity<?> postExpressionEx(@Validated @RequestBody final ExpressionEx entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Agency newAgency = new Agency();

      File instance = this.fileBusiness.getRepository().findOne(instanceId);

      newAgency.setExpressionEx(entity);
      newAgency.setFile(instance);
      
      this.agencyBusiness.getRepository().saveAndFlush(newAgency);

      return ResponseEntity.ok(newAgency.getFile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/ExpressionEx/{relationId}")
  public ResponseEntity<?> deleteExpressionEx(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.fileBusiness.deleteExpressionEx(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Address")
  public List<Address> listAddress(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return fileBusiness.listAddress(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Address")
  public ResponseEntity<?> postAddress(@Validated @RequestBody final Address entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Company newCompany = new Company();

      File instance = this.fileBusiness.getRepository().findOne(instanceId);

      newCompany.setAddress(entity);
      newCompany.setFile(instance);
      
      this.companyBusiness.getRepository().saveAndFlush(newCompany);

      return ResponseEntity.ok(newCompany.getFile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Address/{relationId}")
  public ResponseEntity<?> deleteAddress(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.fileBusiness.deleteAddress(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Channel")
  public List<Channel> listChannel(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return fileBusiness.listChannel(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Channel")
  public ResponseEntity<?> postChannel(@Validated @RequestBody final Channel entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Content newContent = new Content();

      File instance = this.fileBusiness.getRepository().findOne(instanceId);

      newContent.setChannel(entity);
      newContent.setFile(instance);
      
      this.contentBusiness.getRepository().saveAndFlush(newContent);

      return ResponseEntity.ok(newContent.getFile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Channel/{relationId}")
  public ResponseEntity<?> deleteChannel(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.fileBusiness.deleteChannel(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Template")
  public List<Template> listTemplate(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return fileBusiness.listTemplate(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Template")
  public ResponseEntity<?> postTemplate(@Validated @RequestBody final Template entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Content newContent = new Content();

      File instance = this.fileBusiness.getRepository().findOne(instanceId);

      newContent.setTemplate(entity);
      newContent.setFile(instance);
      
      this.contentBusiness.getRepository().saveAndFlush(newContent);

      return ResponseEntity.ok(newContent.getFile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Template/{relationId}")
  public ResponseEntity<?> deleteTemplate(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.fileBusiness.deleteTemplate(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company_3")
  public List<Company> listCompany_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return fileBusiness.listCompany_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company_3")
  public ResponseEntity<?> postCompany_3(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Participant newParticipant = new Participant();

      File instance = this.fileBusiness.getRepository().findOne(instanceId);

      newParticipant.setCompany(entity);
      newParticipant.setFile(instance);
      
      this.participantBusiness.getRepository().saveAndFlush(newParticipant);

      return ResponseEntity.ok(newParticipant.getFile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company_3/{relationId}")
  public ResponseEntity<?> deleteCompany_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.fileBusiness.deleteCompany_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Content_2")
  public List<Content> listContent_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return fileBusiness.listContent_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Content_2")
  public ResponseEntity<?> postContent_2(@Validated @RequestBody final Content entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Participant newParticipant = new Participant();

      File instance = this.fileBusiness.getRepository().findOne(instanceId);

      newParticipant.setContent(entity);
      newParticipant.setFile(instance);
      
      this.participantBusiness.getRepository().saveAndFlush(newParticipant);

      return ResponseEntity.ok(newParticipant.getFile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Content_2/{relationId}")
  public ResponseEntity<?> deleteContent_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.fileBusiness.deleteContent_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal")
  public List<Terminal> listTerminal(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return fileBusiness.listTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal")
  public ResponseEntity<?> postTerminal(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      TerminalAltRoute newTerminalAltRoute = new TerminalAltRoute();

      File instance = this.fileBusiness.getRepository().findOne(instanceId);

      newTerminalAltRoute.setTerminal(entity);
      newTerminalAltRoute.setFile(instance);
      
      this.terminalAltRouteBusiness.getRepository().saveAndFlush(newTerminalAltRoute);

      return ResponseEntity.ok(newTerminalAltRoute.getFile());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal/{relationId}")
  public ResponseEntity<?> deleteTerminal(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.fileBusiness.deleteTerminal(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}