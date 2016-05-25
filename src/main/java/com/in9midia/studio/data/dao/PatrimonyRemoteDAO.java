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
@Repository("PatrimonyRemoteDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface PatrimonyRemoteDAO extends JpaRepository<PatrimonyRemote, java.lang.String> {

  /**
   * Obtém a instância de PatrimonyRemote utilizando os identificadores
   * 
   * @param remId
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PatrimonyRemote entity WHERE entity.remId = :remId")
  public PatrimonyRemote findOne(@Param(value="remId") java.lang.String remId);

  /**
   * Remove a instância de PatrimonyRemote utilizando os identificadores
   * 
   * @param remId
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PatrimonyRemote entity WHERE entity.remId = :remId")
  public void delete(@Param(value="remId") java.lang.String remId);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from PatrimonyRemote p")
  public List<PatrimonyRemote> list ( Pageable pageable );
  







}