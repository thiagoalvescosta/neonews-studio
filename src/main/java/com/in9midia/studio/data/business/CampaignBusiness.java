package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignBusiness
 * 
 * @generated
 **/
@Service("CampaignBusiness")
public class CampaignBusiness {

    /**
     * Instância da classe CampaignDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignDAO")
    protected CampaignDAO repository;

    /**
     * Método de acesso ao CampaignDAO
     * 
     * @generated
     */
    public CampaignDAO getRepository() {
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
  public List<CampaignCampaignBlock> findCampaignCampaignBlock(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignCampaignBlock> result = repository.findCampaignCampaignBlock(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<CampaignDate> findCampaignDate(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignDate> result = repository.findCampaignDate(id,  pageable );
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
  public List<CampaignPerson> findCampaignPerson(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignPerson> result = repository.findCampaignPerson(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<CampaignProperty> findCampaignProperty(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignProperty> result = repository.findCampaignProperty(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<CampaignRegion> findCampaignRegion(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<CampaignRegion> result = repository.findCampaignRegion(id,  pageable );
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
  public List<Profile> findProfile(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Profile> findProfile_2(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile_2(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Profile> findProfile_3(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile_3(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   */  
  public List<Profile> findProfile_4(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.findProfile_4(id,  pageable );
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
  public List<Terminal> findTerminal_5(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.findTerminal_5(id,  pageable );
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
  public List<Terminal> listTerminal(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.listTerminal(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminal(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminal(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<CampaignBlock> listCampaignBlock(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<CampaignBlock> result = repository.listCampaignBlock(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaignBlock(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaignBlock(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Terminal> listTerminal_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.listTerminal_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminal_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminal_2(instanceId, relationId);
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
  public List<ModuleProperty> listModuleProperty(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<ModuleProperty> result = repository.listModuleProperty(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteModuleProperty(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteModuleProperty(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Resolution> listResolution(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Resolution> result = repository.listResolution(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteResolution(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteResolution(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Region> listRegion(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Region> result = repository.listRegion(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteRegion(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteRegion(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Terminal> listTerminal_3(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.listTerminal_3(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminal_3(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminal_3(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Terminal> listTerminal_4(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.listTerminal_4(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminal_4(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminal_4(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Address> listAddress(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Address> result = repository.listAddress(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteAddress(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteAddress(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<CampaignBlock> listCampaignBlock_2(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<CampaignBlock> result = repository.listCampaignBlock_2(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaignBlock_2(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaignBlock_2(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Category> listCategory(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Category> result = repository.listCategory(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCategory(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCategory(instanceId, relationId);
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
  public List<Person> listPerson_3(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Person> result = repository.listPerson_3(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deletePerson_3(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deletePerson_3(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Profile> listProfile_5(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Profile> result = repository.listProfile_5(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteProfile_5(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteProfile_5(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Sga> listSga(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Sga> result = repository.listSga(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteSga(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteSga(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<Software> listSoftware(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Software> result = repository.listSoftware(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteSoftware(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteSoftware(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<TerminalType> listTerminalType(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<TerminalType> result = repository.listTerminalType(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTerminalType(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTerminalType(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   */  
  public List<TvType> listTvType(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<TvType> result = repository.listTvType(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteTvType(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteTvType(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
