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
@Repository("ScheduleDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ScheduleDAO extends JpaRepository<Schedule, java.lang.String> {

  /**
   * Obtém a instância de Schedule utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Schedule entity WHERE entity.id = :id")
  public Schedule findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Schedule utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Schedule entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select s from Schedule s")
  public List<Schedule> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignBlock entity WHERE entity.schedule.id = :id")
  public List<CampaignBlock> findCampaignBlock(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.schedule.id = :id")
  public List<Profile> findProfile_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.schedule2.id = :id")
  public List<Profile> findProfile_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.schedule.id = :id")
  public List<Profile> findProfile_4(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.schedule2.id = :id")
  public List<Profile> findProfile_5(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SchedulePredicate entity WHERE entity.schedule.id = :id")
  public List<SchedulePredicate> findSchedulePredicate(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Terminal entity WHERE entity.schedule.id = :id")
  public List<Terminal> findTerminal(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Terminal entity WHERE entity.schedule2.id = :id")
  public List<Terminal> findTerminal_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Terminal entity WHERE entity.schedule.id = :id")
  public List<Terminal> findTerminal_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Terminal entity WHERE entity.schedule2.id = :id")
  public List<Terminal> findTerminal_4(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.profile FROM CampaignBlock entity WHERE entity.schedule.id = :id")
  public List<Profile> listProfile(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignBlock entity WHERE entity.schedule.id = :instanceId AND entity.profile.id = :relationId")
    public int deleteProfile(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.profileTv FROM CampaignBlock entity WHERE entity.schedule.id = :id")
  public List<ProfileTv> listProfileTv(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignBlock entity WHERE entity.schedule.id = :instanceId AND entity.profileTv.id = :relationId")
    public int deleteProfileTv(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}