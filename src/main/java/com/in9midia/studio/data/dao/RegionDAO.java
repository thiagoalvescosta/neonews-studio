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
@Repository("RegionDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface RegionDAO extends JpaRepository<Region, java.lang.String> {

  /**
   * Obtém a instância de Region utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Region entity WHERE entity.id = :id")
  public Region findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Region utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Region entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select r from Region r")
  public List<Region> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignRegion entity WHERE entity.region.id = :id")
  public List<CampaignRegion> findCampaignRegion(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SchedulePredicateRegion entity WHERE entity.region.id = :id")
  public List<SchedulePredicateRegion> findSchedulePredicateRegion(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM CampaignRegion entity WHERE entity.region.id = :id")
  public List<Campaign> listCampaign(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignRegion entity WHERE entity.region.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.schedulePredicate FROM SchedulePredicateRegion entity WHERE entity.region.id = :id")
  public List<SchedulePredicate> listSchedulePredicate(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM SchedulePredicateRegion entity WHERE entity.region.id = :instanceId AND entity.schedulePredicate.id = :relationId")
    public int deleteSchedulePredicate(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}