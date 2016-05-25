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
@Repository("TerminalMovementDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface TerminalMovementDAO extends JpaRepository<TerminalMovement, java.lang.String> {

  /**
   * Obtém a instância de TerminalMovement utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TerminalMovement entity WHERE entity.id = :id")
  public TerminalMovement findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de TerminalMovement utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TerminalMovement entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from TerminalMovement t")
  public List<TerminalMovement> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TerminalMovementStop entity WHERE entity.terminalMovement.id = :id")
  public List<TerminalMovementStop> findTerminalMovementStop(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.routeStop FROM TerminalMovementStop entity WHERE entity.terminalMovement.id = :id")
  public List<RouteStop> listRouteStop(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM TerminalMovementStop entity WHERE entity.terminalMovement.id = :instanceId AND entity.routeStop.rouStopId = :relationRouStopId")
    public int deleteRouteStop(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationRouStopId") java.lang.String relationRouStopId);




}