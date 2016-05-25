package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TerminalBusiness
 * 
 * @generated
 **/
@Service("TerminalBusiness")
public class TerminalBusiness {

    /**
     * Instância da classe TerminalDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalDAO")
    protected TerminalDAO repository;

    /**
     * Método de acesso ao TerminalDAO
     * 
     * @generated
     */
    public TerminalDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Account> findAccount(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Account> result = repository.findAccount(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<CampaignLog> findCampaignLog(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignLog> result = repository.findCampaignLog(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Command> findCommand(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Command> result = repository.findCommand(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Commissioned> findCommissioned(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Commissioned> result = repository.findCommissioned(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<ContentTerminal> findContentTerminal(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ContentTerminal> result = repository.findContentTerminal(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<ContentUpdate> findContentUpdate(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ContentUpdate> result = repository.findContentUpdate(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Log> findLog(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Log> result = repository.findLog(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<ReportCampaignSchedule> findReportCampaignSchedule(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ReportCampaignSchedule> result = repository.findReportCampaignSchedule(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<SchedulePredicateTerminal> findSchedulePredicateTerminal(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<SchedulePredicateTerminal> result = repository.findSchedulePredicateTerminal(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<TerminalAltRoute> findTerminalAltRoute(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TerminalAltRoute> result = repository.findTerminalAltRoute(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<TerminalAudience> findTerminalAudience(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TerminalAudience> result = repository.findTerminalAudience(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<TerminalLog> findTerminalLog(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TerminalLog> result = repository.findTerminalLog(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<TerminalMovement> findTerminalMovement(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<TerminalMovement> result = repository.findTerminalMovement(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<UserTerminal> findUserTerminal(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<UserTerminal> result = repository.findUserTerminal(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<Campaign> listCampaign(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Campaign> result = repository.listCampaign(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaign(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaign(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Company> listCompany(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Person> listPerson(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Person> result = repository.listPerson(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deletePerson(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deletePerson(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Campaign> listCampaign_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Campaign> result = repository.listCampaign_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaign_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaign_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Company> listCompany_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Company> result = repository.listCompany_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCompany_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCompany_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Person> listPerson_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Person> result = repository.listPerson_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deletePerson_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deletePerson_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Content> listContent(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Content> result = repository.listContent(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteContent(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteContent(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Profile> listProfile(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.listProfile(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteProfile(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteProfile(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Campaign> listCampaign_3(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Campaign> result = repository.listCampaign_3(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaign_3(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaign_3(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Campaign> listCampaign_4(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Campaign> result = repository.listCampaign_4(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaign_4(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaign_4(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<SchedulePredicate> listSchedulePredicate(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<SchedulePredicate> result = repository.listSchedulePredicate(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteSchedulePredicate(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteSchedulePredicate(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<File> listFile(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<File> result = repository.listFile(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteFile(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteFile(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Employer> listEmployer(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Employer> result = repository.listEmployer(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteEmployer(java.lang.String instanceId, java.lang.String relationCard) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteEmployer(instanceId, relationCard);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
