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
@Repository("PatrimonySituationDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface PatrimonySituationDAO extends JpaRepository<PatrimonySituation, java.lang.String> {

  /**
   * Obtém a instância de PatrimonySituation utilizando os identificadores
   * 
   * @param sitId
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PatrimonySituation entity WHERE entity.sitId = :sitId")
  public PatrimonySituation findOne(@Param(value="sitId") java.lang.String sitId);

  /**
   * Remove a instância de PatrimonySituation utilizando os identificadores
   * 
   * @param sitId
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PatrimonySituation entity WHERE entity.sitId = :sitId")
  public void delete(@Param(value="sitId") java.lang.String sitId);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from PatrimonySituation p")
  public List<PatrimonySituation> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Patrimony entity WHERE entity.patrimonySituation.sitId = :sitId")
  public List<Patrimony> findPatrimony(@Param(value="sitId") java.lang.String sitId,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.patrimonyType FROM Patrimony entity WHERE entity.patrimonySituation.sitId = :sitId")
  public List<PatrimonyType> listPatrimonyType(@Param(value="sitId") java.lang.String sitId,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Patrimony entity WHERE entity.patrimonySituation.sitId = :instanceSitId AND entity.patrimonyType.typId = :relationTypId")
    public int deletePatrimonyType(@Param(value="instanceSitId") java.lang.String instanceSitId, @Param(value="relationTypId") java.lang.String relationTypId);




}