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
  public List<Terminal> findTerminal_4(@Param(value="id") java.lang.String id,  Pageable pageable );



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
  public List<Terminal> listTerminal(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignLog entity WHERE entity.campaign.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM CampaignPerson entity WHERE entity.campaign.id = :id")
  public List<Person> listPerson(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignPerson entity WHERE entity.campaign.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

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
  public List<Terminal> listTerminal_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Log entity WHERE entity.campaign.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM ReportCampaignSchedule entity WHERE entity.campaign.id = :id")
  public List<Terminal> listTerminal_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ReportCampaignSchedule entity WHERE entity.campaign.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}