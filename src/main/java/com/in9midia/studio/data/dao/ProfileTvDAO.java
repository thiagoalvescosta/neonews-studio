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
@Repository("ProfileTvDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ProfileTvDAO extends JpaRepository<ProfileTv, java.lang.String> {

  /**
   * Obtém a instância de ProfileTv utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ProfileTv entity WHERE entity.id = :id")
  public ProfileTv findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ProfileTv utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ProfileTv entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from ProfileTv p")
  public List<ProfileTv> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignBlock entity WHERE entity.profileTv.id = :id")
  public List<CampaignBlock> findCampaignBlock(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.profile FROM CampaignBlock entity WHERE entity.profileTv.id = :id")
  public List<Profile> listProfile(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignBlock entity WHERE entity.profileTv.id = :instanceId AND entity.profile.id = :relationId")
    public int deleteProfile(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.schedule FROM CampaignBlock entity WHERE entity.profileTv.id = :id")
  public List<Schedule> listSchedule(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignBlock entity WHERE entity.profileTv.id = :instanceId AND entity.schedule.id = :relationId")
    public int deleteSchedule(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}