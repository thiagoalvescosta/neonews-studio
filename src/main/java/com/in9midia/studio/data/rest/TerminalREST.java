package com.in9midia.studio.data.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;

import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;

import java.util.*;

import com.in9midia.studio.data.entity.*;
import com.in9midia.studio.data.business.*;


/**
 * Controller para expor serviços REST de Terminal
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Terminal")
public class TerminalREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalBusiness")
    private TerminalBusiness terminalBusiness;

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
    @Qualifier("ContentBusiness")
    private ContentBusiness contentBusiness;
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
    @Qualifier("SchedulePredicateBusiness")
    private SchedulePredicateBusiness schedulePredicateBusiness;
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
    @Qualifier("EmployerBusiness")
    private EmployerBusiness employerBusiness;
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
    @Qualifier("CampaignLogBusiness")
    private CampaignLogBusiness campaignLogBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CommandBusiness")
    private CommandBusiness commandBusiness;
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
    @Qualifier("ContentTerminalBusiness")
    private ContentTerminalBusiness contentTerminalBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ContentUpdateBusiness")
    private ContentUpdateBusiness contentUpdateBusiness;
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
   * @generated
   */
    @Autowired
    @Qualifier("SchedulePredicateTerminalBusiness")
    private SchedulePredicateTerminalBusiness schedulePredicateTerminalBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalAltRouteBusiness")
    private TerminalAltRouteBusiness terminalAltRouteBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalAudienceBusiness")
    private TerminalAudienceBusiness terminalAudienceBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalLogBusiness")
    private TerminalLogBusiness terminalLogBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("TerminalMovementBusiness")
    private TerminalMovementBusiness terminalMovementBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("UserTerminalBusiness")
    private UserTerminalBusiness userTerminalBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Terminal post(@Validated @RequestBody final Terminal entity) throws Exception {
        terminalBusiness.post(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public List<Terminal> get(@PathVariable("id") java.lang.String id) throws Exception {
        Terminal entity = terminalBusiness.get(id);
        return entity != null ? Arrays.asList(entity) : Collections.emptyList();
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Terminal entity) throws Exception {
        return ResponseEntity.ok(terminalBusiness.put(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Terminal put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Terminal entity) throws Exception {
        return terminalBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        terminalBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Terminal> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return terminalBusiness.list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Account")    
  public List<Account> findAccount(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalBusiness.findAccount(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Account/{relationId}")    
  public ResponseEntity<?> deleteAccount(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.accountBusiness.delete(relationId);
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
    return terminalBusiness.findCampaignLog(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/CampaignLog/{relationId}")    
  public ResponseEntity<?> deleteCampaignLog(@PathVariable("relationId") java.lang.Long relationId) {
      try {
        this.campaignLogBusiness.delete(relationId);
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
  , value="/{instanceId}/Command")    
  public List<Command> findCommand(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalBusiness.findCommand(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Command/{relationId}")    
  public ResponseEntity<?> deleteCommand(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.commandBusiness.delete(relationId);
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
    return terminalBusiness.findCommissioned(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Commissioned/{relationId}")    
  public ResponseEntity<?> deleteCommissioned(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.commissionedBusiness.delete(relationId);
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
  , value="/{instanceId}/ContentTerminal")    
  public List<ContentTerminal> findContentTerminal(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalBusiness.findContentTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ContentTerminal/{relationId}")    
  public ResponseEntity<?> deleteContentTerminal(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.contentTerminalBusiness.delete(relationId);
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
    return terminalBusiness.findContentUpdate(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ContentUpdate/{relationId}")    
  public ResponseEntity<?> deleteContentUpdate(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.contentUpdateBusiness.delete(relationId);
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
    return terminalBusiness.findLog(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Log/{relationId}")    
  public ResponseEntity<?> deleteLog(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.logBusiness.delete(relationId);
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
    return terminalBusiness.findReportCampaignSchedule(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ReportCampaignSchedule/{relationId}")    
  public ResponseEntity<?> deleteReportCampaignSchedule(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.reportCampaignScheduleBusiness.delete(relationId);
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
  , value="/{instanceId}/SchedulePredicateTerminal")    
  public List<SchedulePredicateTerminal> findSchedulePredicateTerminal(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalBusiness.findSchedulePredicateTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/SchedulePredicateTerminal/{relationId}")    
  public ResponseEntity<?> deleteSchedulePredicateTerminal(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.schedulePredicateTerminalBusiness.delete(relationId);
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
    return terminalBusiness.findTerminalAltRoute(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/TerminalAltRoute/{relationId}")    
  public ResponseEntity<?> deleteTerminalAltRoute(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.terminalAltRouteBusiness.delete(relationId);
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
  , value="/{instanceId}/TerminalAudience")    
  public List<TerminalAudience> findTerminalAudience(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalBusiness.findTerminalAudience(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/TerminalAudience/{relationId}")    
  public ResponseEntity<?> deleteTerminalAudience(@PathVariable("relationId") java.lang.Double relationId) {
      try {
        this.terminalAudienceBusiness.delete(relationId);
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
  , value="/{instanceId}/TerminalLog")    
  public List<TerminalLog> findTerminalLog(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalBusiness.findTerminalLog(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/TerminalLog/{relationId}")    
  public ResponseEntity<?> deleteTerminalLog(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.terminalLogBusiness.delete(relationId);
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
  , value="/{instanceId}/TerminalMovement")    
  public List<TerminalMovement> findTerminalMovement(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalBusiness.findTerminalMovement(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/TerminalMovement/{relationId}")    
  public ResponseEntity<?> deleteTerminalMovement(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.terminalMovementBusiness.delete(relationId);
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
  , value="/{instanceId}/UserTerminal")    
  public List<UserTerminal> findUserTerminal(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return terminalBusiness.findUserTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/UserTerminal/{relationId}")    
  public ResponseEntity<?> deleteUserTerminal(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.userTerminalBusiness.delete(relationId);
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
    return terminalBusiness.listCampaign(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign")
  public ResponseEntity<?> postCampaign(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      CampaignLog newCampaignLog = new CampaignLog();

      Terminal instance = this.terminalBusiness.get(instanceId);

      newCampaignLog.setCampaign(entity);
      newCampaignLog.setTerminal(instance);
      
      this.campaignLogBusiness.post(newCampaignLog);

      return ResponseEntity.ok(newCampaignLog.getTerminal());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign/{relationId}")
  public ResponseEntity<?> deleteCampaign(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.terminalBusiness.deleteCampaign(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Content")
  public List<Content> listContent(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return terminalBusiness.listContent(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Content")
  public ResponseEntity<?> postContent(@Validated @RequestBody final Content entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      ContentTerminal newContentTerminal = new ContentTerminal();

      Terminal instance = this.terminalBusiness.get(instanceId);

      newContentTerminal.setContent(entity);
      newContentTerminal.setTerminal(instance);
      
      this.contentTerminalBusiness.post(newContentTerminal);

      return ResponseEntity.ok(newContentTerminal.getTerminal());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Content/{relationId}")
  public ResponseEntity<?> deleteContent(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.terminalBusiness.deleteContent(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Profile")
  public List<Profile> listProfile(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return terminalBusiness.listProfile(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Profile")
  public ResponseEntity<?> postProfile(@Validated @RequestBody final Profile entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      ContentUpdate newContentUpdate = new ContentUpdate();

      Terminal instance = this.terminalBusiness.get(instanceId);

      newContentUpdate.setProfile(entity);
      newContentUpdate.setTerminal(instance);
      
      this.contentUpdateBusiness.post(newContentUpdate);

      return ResponseEntity.ok(newContentUpdate.getTerminal());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Profile/{relationId}")
  public ResponseEntity<?> deleteProfile(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.terminalBusiness.deleteProfile(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Campaign_2")
  public List<Campaign> listCampaign_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return terminalBusiness.listCampaign_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign_2")
  public ResponseEntity<?> postCampaign_2(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      Log newLog = new Log();

      Terminal instance = this.terminalBusiness.get(instanceId);

      newLog.setCampaign(entity);
      newLog.setTerminal(instance);
      
      this.logBusiness.post(newLog);

      return ResponseEntity.ok(newLog.getTerminal());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign_2/{relationId}")
  public ResponseEntity<?> deleteCampaign_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.terminalBusiness.deleteCampaign_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Campaign_3")
  public List<Campaign> listCampaign_3(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return terminalBusiness.listCampaign_3(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Campaign_3")
  public ResponseEntity<?> postCampaign_3(@Validated @RequestBody final Campaign entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      ReportCampaignSchedule newReportCampaignSchedule = new ReportCampaignSchedule();

      Terminal instance = this.terminalBusiness.get(instanceId);

      newReportCampaignSchedule.setCampaign(entity);
      newReportCampaignSchedule.setTerminal(instance);
      
      this.reportCampaignScheduleBusiness.post(newReportCampaignSchedule);

      return ResponseEntity.ok(newReportCampaignSchedule.getTerminal());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Campaign_3/{relationId}")
  public ResponseEntity<?> deleteCampaign_3(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.terminalBusiness.deleteCampaign_3(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/SchedulePredicate")
  public List<SchedulePredicate> listSchedulePredicate(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return terminalBusiness.listSchedulePredicate(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/SchedulePredicate")
  public ResponseEntity<?> postSchedulePredicate(@Validated @RequestBody final SchedulePredicate entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      SchedulePredicateTerminal newSchedulePredicateTerminal = new SchedulePredicateTerminal();

      Terminal instance = this.terminalBusiness.get(instanceId);

      newSchedulePredicateTerminal.setSchedulePredicate(entity);
      newSchedulePredicateTerminal.setTerminal(instance);
      
      this.schedulePredicateTerminalBusiness.post(newSchedulePredicateTerminal);

      return ResponseEntity.ok(newSchedulePredicateTerminal.getTerminal());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/SchedulePredicate/{relationId}")
  public ResponseEntity<?> deleteSchedulePredicate(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.terminalBusiness.deleteSchedulePredicate(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/File")
  public List<File> listFile(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return terminalBusiness.listFile(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/File")
  public ResponseEntity<?> postFile(@Validated @RequestBody final File entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      TerminalAltRoute newTerminalAltRoute = new TerminalAltRoute();

      Terminal instance = this.terminalBusiness.get(instanceId);

      newTerminalAltRoute.setFile(entity);
      newTerminalAltRoute.setTerminal(instance);
      
      this.terminalAltRouteBusiness.post(newTerminalAltRoute);

      return ResponseEntity.ok(newTerminalAltRoute.getTerminal());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/File/{relationId}")
  public ResponseEntity<?> deleteFile(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.terminalBusiness.deleteFile(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Employer")
  public List<Employer> listEmployer(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return terminalBusiness.listEmployer(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Employer")
  public ResponseEntity<?> postEmployer(@Validated @RequestBody final Employer entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      TerminalAudience newTerminalAudience = new TerminalAudience();

      Terminal instance = this.terminalBusiness.get(instanceId);

      newTerminalAudience.setEmployer(entity);
      newTerminalAudience.setTerminal(instance);
      
      this.terminalAudienceBusiness.post(newTerminalAudience);

      return ResponseEntity.ok(newTerminalAudience.getTerminal());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Employer/{relationCard}")
  public ResponseEntity<?> deleteEmployer(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationCard") java.lang.String relationCard) {
      this.terminalBusiness.deleteEmployer(instanceId, relationCard);
      return ResponseEntity.ok().build();
  }  



}
