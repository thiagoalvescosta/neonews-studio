package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignBlockBusiness
 * 
 * @generated
 **/
@Service("CampaignBlockBusiness")
public class CampaignBlockBusiness {

    /**
     * Instância da classe CampaignBlockDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignBlockDAO")
    protected CampaignBlockDAO repository;

    /**
     * Método de acesso ao CampaignBlockDAO
     * 
     * @generated
     */
    public CampaignBlockDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<Campaign> findCampaign(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Campaign> result = repository.findCampaign(id,  pageable );
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
  public List<Terminal> findTerminal(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Terminal> result = repository.findTerminal(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   */  
  public List<CampaignCategory> listCampaignCategory(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<CampaignCategory> result = repository.listCampaignCategory(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteCampaignCategory(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteCampaignCategory(instanceId, relationId);
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
  public List<Module> listModule(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<Module> result = repository.listModule(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteModule(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteModule(instanceId, relationId);
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
