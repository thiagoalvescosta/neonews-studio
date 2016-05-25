package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TerminalTypeBusiness
 * 
 * @generated
 **/
@Service("TerminalTypeBusiness")
public class TerminalTypeBusiness {

    /**
     * Instância da classe TerminalTypeDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalTypeDAO")
    protected TerminalTypeDAO repository;

    /**
     * Método de acesso ao TerminalTypeDAO
     * 
     * @generated
     */
    public TerminalTypeDAO getRepository() {
        return repository;
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
