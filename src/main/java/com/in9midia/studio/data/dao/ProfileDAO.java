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
@Repository("ProfileDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ProfileDAO extends JpaRepository<Profile, java.lang.String> {

  /**
   * Obtém a instância de Profile utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Profile entity WHERE entity.id = :id")
  public Profile findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Profile utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Profile entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from Profile p")
  public List<Profile> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignBlock entity WHERE entity.profile.id = :id")
  public List<CampaignBlock> findCampaignBlock(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContentUpdate entity WHERE entity.profile.id = :id")
  public List<ContentUpdate> findContentUpdate(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Terminal entity WHERE entity.profile.id = :id")
  public List<Terminal> findTerminal_2(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.profileTv FROM CampaignBlock entity WHERE entity.profile.id = :id")
  public List<ProfileTv> listProfileTv(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignBlock entity WHERE entity.profile.id = :instanceId AND entity.profileTv.id = :relationId")
    public int deleteProfileTv(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.schedule FROM CampaignBlock entity WHERE entity.profile.id = :id")
  public List<Schedule> listSchedule(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignBlock entity WHERE entity.profile.id = :instanceId AND entity.schedule.id = :relationId")
    public int deleteSchedule(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM ContentUpdate entity WHERE entity.profile.id = :id")
  public List<Terminal> listTerminal(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ContentUpdate entity WHERE entity.profile.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.address FROM Terminal entity WHERE entity.profile.id = :id")
  public List<Address> listAddress(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.address.id = :relationId")
    public int deleteAddress(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM Terminal entity WHERE entity.profile.id = :id")
  public List<Campaign> listCampaign(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaignBlock FROM Terminal entity WHERE entity.profile.id = :id")
  public List<CampaignBlock> listCampaignBlock_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.campaignBlock.id = :relationId")
    public int deleteCampaignBlock_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.category FROM Terminal entity WHERE entity.profile.id = :id")
  public List<Category> listCategory(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.category.id = :relationId")
    public int deleteCategory(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Terminal entity WHERE entity.profile.id = :id")
  public List<Company> listCompany(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM Terminal entity WHERE entity.profile.id = :id")
  public List<Person> listPerson(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.sga FROM Terminal entity WHERE entity.profile.id = :id")
  public List<Sga> listSga(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.sga.id = :relationId")
    public int deleteSga(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.software FROM Terminal entity WHERE entity.profile.id = :id")
  public List<Software> listSoftware(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.software.id = :relationId")
    public int deleteSoftware(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminalType FROM Terminal entity WHERE entity.profile.id = :id")
  public List<TerminalType> listTerminalType(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.terminalType.id = :relationId")
    public int deleteTerminalType(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tvType FROM Terminal entity WHERE entity.profile.id = :id")
  public List<TvType> listTvType(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.profile.id = :instanceId AND entity.tvType.id = :relationId")
    public int deleteTvType(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}