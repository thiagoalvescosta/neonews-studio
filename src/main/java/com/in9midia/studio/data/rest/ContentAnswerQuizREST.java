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
 * Controller para expor serviços REST de ContentAnswerQuiz
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/ContentAnswerQuiz")
public class ContentAnswerQuizREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ContentAnswerQuizBusiness")
    private ContentAnswerQuizBusiness contentAnswerQuizBusiness;

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
    @Qualifier("ContentAnswerReportBusiness")
    private ContentAnswerReportBusiness contentAnswerReportBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public ContentAnswerQuiz post(@Validated @RequestBody final ContentAnswerQuiz entity) throws Exception {
        contentAnswerQuizBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> get(@PathVariable("id") java.lang.String id) throws Exception {
        ContentAnswerQuiz entity = contentAnswerQuizBusiness.getRepository().findOne(id);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final ContentAnswerQuiz entity) throws Exception {
        return ResponseEntity.ok( contentAnswerQuizBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ContentAnswerQuiz put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final ContentAnswerQuiz entity) throws Exception {
        return contentAnswerQuizBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
         contentAnswerQuizBusiness.getRepository().delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<ContentAnswerQuiz> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return contentAnswerQuizBusiness.getRepository().list(new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/ContentAnswerReport")    
  public List<ContentAnswerReport> findContentAnswerReport(@PathVariable("instanceId") java.lang.String instanceId, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return contentAnswerQuizBusiness.findContentAnswerReport(instanceId,  new PageRequest(offset, limit) );
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
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Content")
  public List<Content> listContent(@PathVariable("instanceId") java.lang.String instanceId,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return contentAnswerQuizBusiness.listContent(instanceId,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Content")
  public ResponseEntity<?> postContent(@Validated @RequestBody final Content entity, @PathVariable("instanceId") java.lang.String instanceId) {
      ContentAnswerReport newContentAnswerReport = new ContentAnswerReport();

      ContentAnswerQuiz instance = this.contentAnswerQuizBusiness.getRepository().findOne(instanceId);

      newContentAnswerReport.setContent(entity);
      newContentAnswerReport.setContentAnswerQuiz(instance);
      
      this.contentAnswerReportBusiness.getRepository().saveAndFlush(newContentAnswerReport);

      return ResponseEntity.ok(newContentAnswerReport.getContentAnswerQuiz());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Content/{relationId}")
  public ResponseEntity<?> deleteContent(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
      this.contentAnswerQuizBusiness.deleteContent(instanceId, relationId);
      return ResponseEntity.ok().build();
  }  



}