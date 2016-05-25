package com.in9midia.studio.data.dao;

import com.in9midia.studio.data.entity.*;
import java.util.List;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;



/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("CampaignDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface CampaignDAO extends JpaRepository<Campaign, java.lang.String> {

  /**
   * Obtém a instância de Campaign utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Campaign entity WHERE entity.id = :id")
  public Campaign findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Campaign utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Campaign entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Campaign c")
  public List<Campaign> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Account entity WHERE entity.campaign.id = :id")
  public List<Account> findAccount(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignCampaignBlock entity WHERE entity.campaign.id = :id")
  public List<CampaignCampaignBlock> findCampaignCampaignBlock(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignDate entity WHERE entity.campaign.id = :id")
  public List<CampaignDate> findCampaignDate(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignLog entity WHERE entity.campaign.id = :id")
  public List<CampaignLog> findCampaignLog(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignPerson entity WHERE entity.campaign.id = :id")
  public List<CampaignPerson> findCampaignPerson(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignProperty entity WHERE entity.campaign.id = :id")
  public List<CampaignProperty> findCampaignProperty(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignRegion entity WHERE entity.campaign.id = :id")
  public List<CampaignRegion> findCampaignRegion(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Log entity WHERE entity.campaign.id = :id")
  public List<Log> findLog(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.campaign.id = :id")
  public List<Profile> findProfile(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.campaign2.id = :id")
  public List<Profile> findProfile_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.campaign.id = :id")
  public List<Profile> findProfile_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.campaign2.id = :id")
  public List<Profile> findProfile_4(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ReportCampaignSchedule entity WHERE entity.campaign.id = :id")
  public List<ReportCampaignSchedule> findReportCampaignSchedule(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<Terminal> findTerminal_5(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Account entity WHERE entity.campaign.id = :id")
  public List<Company> listCompany(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.campaign.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM Account entity WHERE entity.campaign.id = :id")
  public List<Person> listPerson(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.campaign.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM Account entity WHERE entity.campaign.id = :id")
  public List<Terminal> listTerminal(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.campaign.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaignBlock FROM CampaignCampaignBlock entity WHERE entity.campaign.id = :id")
  public List<CampaignBlock> listCampaignBlock(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignCampaignBlock entity WHERE entity.campaign.id = :instanceId AND entity.campaignBlock.id = :relationId")
    public int deleteCampaignBlock(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM CampaignLog entity WHERE entity.campaign.id = :id")
  public List<Terminal> listTerminal_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignLog entity WHERE entity.campaign.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM CampaignPerson entity WHERE entity.campaign.id = :id")
  public List<Person> listPerson_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignPerson entity WHERE entity.campaign.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.moduleProperty FROM CampaignProperty entity WHERE entity.campaign.id = :id")
  public List<ModuleProperty> listModuleProperty(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignProperty entity WHERE entity.campaign.id = :instanceId AND entity.moduleProperty.id = :relationId")
    public int deleteModuleProperty(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.resolution FROM CampaignProperty entity WHERE entity.campaign.id = :id")
  public List<Resolution> listResolution(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignProperty entity WHERE entity.campaign.id = :instanceId AND entity.resolution.id = :relationId")
    public int deleteResolution(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.region FROM CampaignRegion entity WHERE entity.campaign.id = :id")
  public List<Region> listRegion(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignRegion entity WHERE entity.campaign.id = :instanceId AND entity.region.id = :relationId")
    public int deleteRegion(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM Log entity WHERE entity.campaign.id = :id")
  public List<Terminal> listTerminal_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Log entity WHERE entity.campaign.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM ReportCampaignSchedule entity WHERE entity.campaign.id = :id")
  public List<Terminal> listTerminal_4(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ReportCampaignSchedule entity WHERE entity.campaign.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal_4(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.address FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<Address> listAddress(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.address.id = :relationId")
    public int deleteAddress(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaignBlock FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<CampaignBlock> listCampaignBlock_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.campaignBlock.id = :relationId")
    public int deleteCampaignBlock_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.category FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<Category> listCategory(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.category.id = :relationId")
    public int deleteCategory(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<Company> listCompany_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<Person> listPerson_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.profile FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<Profile> listProfile_5(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.profile.id = :relationId")
    public int deleteProfile_5(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.sga FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<Sga> listSga(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.sga.id = :relationId")
    public int deleteSga(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.software FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<Software> listSoftware(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.software.id = :relationId")
    public int deleteSoftware(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminalType FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<TerminalType> listTerminalType(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.terminalType.id = :relationId")
    public int deleteTerminalType(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tvType FROM Terminal entity WHERE entity.campaign.id = :id")
  public List<TvType> listTvType(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.campaign.id = :instanceId AND entity.tvType.id = :relationId")
    public int deleteTvType(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}