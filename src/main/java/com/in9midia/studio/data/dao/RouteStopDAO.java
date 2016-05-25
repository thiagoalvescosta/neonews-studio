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
@Repository("RouteStopDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface RouteStopDAO extends JpaRepository<RouteStop, java.lang.String> {

  /**
   * Obtém a instância de RouteStop utilizando os identificadores
   * 
   * @param rouStopId
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM RouteStop entity WHERE entity.rouStopId = :rouStopId")
  public RouteStop findOne(@Param(value="rouStopId") java.lang.String rouStopId);

  /**
   * Remove a instância de RouteStop utilizando os identificadores
   * 
   * @param rouStopId
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM RouteStop entity WHERE entity.rouStopId = :rouStopId")
  public void delete(@Param(value="rouStopId") java.lang.String rouStopId);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select r from RouteStop r")
  public List<RouteStop> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TerminalMovementStop entity WHERE entity.routeStop.rouStopId = :rouStopId")
  public List<TerminalMovementStop> findTerminalMovementStop(@Param(value="rouStopId") java.lang.String rouStopId,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminalMovement FROM TerminalMovementStop entity WHERE entity.routeStop.rouStopId = :rouStopId")
  public List<TerminalMovement> listTerminalMovement(@Param(value="rouStopId") java.lang.String rouStopId,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM TerminalMovementStop entity WHERE entity.routeStop.rouStopId = :instanceRouStopId AND entity.terminalMovement.id = :relationId")
    public int deleteTerminalMovement(@Param(value="instanceRouStopId") java.lang.String instanceRouStopId, @Param(value="relationId") java.lang.String relationId);




}