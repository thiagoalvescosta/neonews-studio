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
@Repository("ContentAnswerReportDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ContentAnswerReportDAO extends JpaRepository<ContentAnswerReport, java.lang.String> {

  /**
   * Obtém a instância de ContentAnswerReport utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ContentAnswerReport entity WHERE entity.id = :id")
  public ContentAnswerReport findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ContentAnswerReport utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ContentAnswerReport entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ContentAnswerReport c")
  public List<ContentAnswerReport> list ( Pageable pageable );
  







}