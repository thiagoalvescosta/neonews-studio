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
@Repository("PatrimonyDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface PatrimonyDAO extends JpaRepository<Patrimony, java.lang.String> {

  /**
   * Obtém a instância de Patrimony utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Patrimony entity WHERE entity.id = :id")
  public Patrimony findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Patrimony utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Patrimony entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from Patrimony p")
  public List<Patrimony> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PatrimonyRemote entity WHERE entity.patrimony.id = :id")
  public List<PatrimonyRemote> findPatrimonyRemote(@Param(value="id") java.lang.String id,  Pageable pageable );






}