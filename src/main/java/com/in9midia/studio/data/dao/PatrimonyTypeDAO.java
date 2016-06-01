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
@Repository("PatrimonyTypeDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface PatrimonyTypeDAO extends JpaRepository<PatrimonyType, java.lang.String> {

  /**
   * Obtém a instância de PatrimonyType utilizando os identificadores
   * 
   * @param typId
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PatrimonyType entity WHERE entity.typId = :typId")
  public PatrimonyType findOne(@Param(value="typId") java.lang.String typId);

  /**
   * Remove a instância de PatrimonyType utilizando os identificadores
   * 
   * @param typId
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PatrimonyType entity WHERE entity.typId = :typId")
  public void delete(@Param(value="typId") java.lang.String typId);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from PatrimonyType p")
  public List<PatrimonyType> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Patrimony entity WHERE entity.patrimonyType.typId = :typId")
  public List<Patrimony> findPatrimony(@Param(value="typId") java.lang.String typId,  Pageable pageable );






}