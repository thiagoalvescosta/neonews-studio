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
@Repository("TempDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface TempDAO extends JpaRepository<Temp, java.lang.String> {

  /**
   * Obtém a instância de Temp utilizando os identificadores
   * 
   * @param conId
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Temp entity WHERE entity.conId = :conId")
  public Temp findOne(@Param(value="conId") java.lang.String conId);

  /**
   * Remove a instância de Temp utilizando os identificadores
   * 
   * @param conId
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Temp entity WHERE entity.conId = :conId")
  public void delete(@Param(value="conId") java.lang.String conId);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from Temp t")
  public List<Temp> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Channel entity WHERE entity.temp.conId = :conId")
  public List<Channel> findChannel(@Param(value="conId") java.lang.String conId,  Pageable pageable );






}