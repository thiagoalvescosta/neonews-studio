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
 * Controller para expor serviços REST de Content
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Content")
public class ContentREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ContentBusiness")
    private ContentBusiness contentBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("ContentAnswerQuizBusiness")
    private ContentAnswerQuizBusiness contentAnswerQuizBusiness;
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
    @Qualifier("CompanyBusiness")
    private CompanyBusiness companyBusiness;
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
    @Qualifier("ContentAnswerReportBusiness")
    private ContentAnswerReportBusiness contentAnswerReportBusiness;
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
    @Qualifier("OriginDestinationBusiness")
    private OriginDestinationBusiness originDestinationBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("ParticipantBusiness")
    private ParticipantBusiness participantBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Content post(@Validated @RequestBody final Content entity) throws Exception {
        contentBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        Content entity = contentBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Content entity) throws Exception {
        return ResponseEntity.ok( contentBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Content put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Content entity) throws Exception {
        return contentBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         contentBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Content> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return contentBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/ContentAnswerQuiz")    
  public List<ContentAnswerQuiz> findContentAnswerQuiz(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return contentBusiness.findContentAnswerQuiz(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ContentAnswerQuiz/{relationId}")    
  public ResponseEntity<?> deleteContentAnswerQuiz(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.contentAnswerQuizBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/ContentAnswerReport")    
  public List<ContentAnswerReport> findContentAnswerReport(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return contentBusiness.findContentAnswerReport(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ContentAnswerReport/{relationId}")    
  public ResponseEntity<?> deleteContentAnswerReport(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.contentAnswerReportBusiness.getRepository().delete(relationId);
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
    return contentBusiness.findContentTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ContentTerminal/{relationId}")    
  public ResponseEntity<?> deleteContentTerminal(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.contentTerminalBusiness.getRepository().delete(relationId);
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
  , value="/{instanceId}/OriginDestination")    
  public List<OriginDestination> findOriginDestination(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return contentBusiness.findOriginDestination(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/OriginDestination/{relationId}")    
  public ResponseEntity<?> deleteOriginDestination(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.originDestinationBusiness.getRepository().delete(relationId);
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
    return contentBusiness.findParticipant(instanceId,  new PageRequest(offset, limit) );
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
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/ContentAnswerQuiz_2")
  public List<ContentAnswerQuiz> listContentAnswerQuiz_2(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return contentBusiness.listContentAnswerQuiz_2(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/ContentAnswerQuiz_2")
  public ResponseEntity<?> postContentAnswerQuiz_2(@Validated @RequestBody final ContentAnswerQuiz entity, @PathVariable("instanceId") java.lang.String instanceId) {
      ContentAnswerReport newContentAnswerReport = new ContentAnswerReport();

      Content instance = this.contentBusiness.getRepository().findOne(instanceId);

      newContentAnswerReport.setContentAnswerQuiz(entity);
      newContentAnswerReport.setContent(instance);
      
      this.contentAnswerReportBusiness.getRepository().saveAndFlush(newContentAnswerReport);

      return ResponseEntity.ok(newContentAnswerReport.getContent());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/ContentAnswerQuiz_2/{relationId}")
  public ResponseEntity<?> deleteContentAnswerQuiz_2(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.contentBusiness.deleteContentAnswerQuiz_2(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Terminal")
  public List<Terminal> listTerminal(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return contentBusiness.listTerminal(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Terminal")
  public ResponseEntity<?> postTerminal(@Validated @RequestBody final Terminal entity, @PathVariable("instanceId") java.lang.String instanceId) {
      ContentTerminal newContentTerminal = new ContentTerminal();

      Content instance = this.contentBusiness.getRepository().findOne(instanceId);

      newContentTerminal.setTerminal(entity);
      newContentTerminal.setContent(instance);
      
      this.contentTerminalBusiness.getRepository().saveAndFlush(newContentTerminal);

      return ResponseEntity.ok(newContentTerminal.getContent());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Terminal/{relationId}")
  public ResponseEntity<?> deleteTerminal(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.contentBusiness.deleteTerminal(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Company")
  public List<Company> listCompany(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return contentBusiness.listCompany(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Participant newParticipant = new Participant();

      Content instance = this.contentBusiness.getRepository().findOne(instanceId);

      newParticipant.setCompany(entity);
      newParticipant.setContent(instance);
      
      this.participantBusiness.getRepository().saveAndFlush(newParticipant);

      return ResponseEntity.ok(newParticipant.getContent());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.contentBusiness.deleteCompany(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/File")
  public List<File> listFile(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return contentBusiness.listFile(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/File")
  public ResponseEntity<?> postFile(@Validated @RequestBody final File entity, @PathVariable("instanceId") java.lang.String instanceId) {
      Participant newParticipant = new Participant();

      Content instance = this.contentBusiness.getRepository().findOne(instanceId);

      newParticipant.setFile(entity);
      newParticipant.setContent(instance);
      
      this.participantBusiness.getRepository().saveAndFlush(newParticipant);

      return ResponseEntity.ok(newParticipant.getContent());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/File/{relationId}")
  public ResponseEntity<?> deleteFile(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.contentBusiness.deleteFile(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}