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
@Repository("TerminalAudienceDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface TerminalAudienceDAO extends JpaRepository<TerminalAudience, java.lang.Double> {

  /**
   * Obtém a instância de TerminalAudience utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TerminalAudience entity WHERE entity.id = :id")
  public TerminalAudience findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de TerminalAudience utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TerminalAudience entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from TerminalAudience t")
  public List<TerminalAudience> list ( Pageable pageable );
  







}