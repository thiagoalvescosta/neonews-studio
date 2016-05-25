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
@Repository("SchedulePredicateDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface SchedulePredicateDAO extends JpaRepository<SchedulePredicate, java.lang.String> {

  /**
   * Obtém a instância de SchedulePredicate utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM SchedulePredicate entity WHERE entity.id = :id")
  public SchedulePredicate findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de SchedulePredicate utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM SchedulePredicate entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select s from SchedulePredicate s")
  public List<SchedulePredicate> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SchedulePredicateRegion entity WHERE entity.schedulePredicate.id = :id")
  public List<SchedulePredicateRegion> findSchedulePredicateRegion(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SchedulePredicateTerminal entity WHERE entity.schedulePredicate.id = :id")
  public List<SchedulePredicateTerminal> findSchedulePredicateTerminal(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ScheduleTime entity WHERE entity.schedulePredicate.id = :id")
  public List<ScheduleTime> findScheduleTime(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.region FROM SchedulePredicateRegion entity WHERE entity.schedulePredicate.id = :id")
  public List<Region> listRegion(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM SchedulePredicateRegion entity WHERE entity.schedulePredicate.id = :instanceId AND entity.region.id = :relationId")
    public int deleteRegion(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM SchedulePredicateTerminal entity WHERE entity.schedulePredicate.id = :id")
  public List<Terminal> listTerminal(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM SchedulePredicateTerminal entity WHERE entity.schedulePredicate.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}