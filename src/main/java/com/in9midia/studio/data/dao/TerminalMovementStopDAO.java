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
@Repository("TerminalMovementStopDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface TerminalMovementStopDAO extends JpaRepository<TerminalMovementStop, java.lang.String> {

  /**
   * Obtém a instância de TerminalMovementStop utilizando os identificadores
   * 
   * @param stpId
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TerminalMovementStop entity WHERE entity.stpId = :stpId")
  public TerminalMovementStop findOne(@Param(value="stpId") java.lang.String stpId);

  /**
   * Remove a instância de TerminalMovementStop utilizando os identificadores
   * 
   * @param stpId
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TerminalMovementStop entity WHERE entity.stpId = :stpId")
  public void delete(@Param(value="stpId") java.lang.String stpId);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from TerminalMovementStop t")
  public List<TerminalMovementStop> list ( Pageable pageable );
  







}