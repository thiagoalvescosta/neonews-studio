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
@Repository("EmployerDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface EmployerDAO extends JpaRepository<Employer, java.lang.String> {

  /**
   * Obtém a instância de Employer utilizando os identificadores
   * 
   * @param card
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Employer entity WHERE entity.card = :card")
  public Employer findOne(@Param(value="card") java.lang.String card);

  /**
   * Remove a instância de Employer utilizando os identificadores
   * 
   * @param card
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Employer entity WHERE entity.card = :card")
  public void delete(@Param(value="card") java.lang.String card);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select e from Employer e")
  public List<Employer> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TerminalAudience entity WHERE entity.employer.card = :card")
  public List<TerminalAudience> findTerminalAudience(@Param(value="card") java.lang.String card,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM TerminalAudience entity WHERE entity.employer.card = :card")
  public List<Terminal> listTerminal(@Param(value="card") java.lang.String card,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM TerminalAudience entity WHERE entity.employer.card = :instanceCard AND entity.terminal.id = :relationId")
    public int deleteTerminal(@Param(value="instanceCard") java.lang.String instanceCard, @Param(value="relationId") java.lang.String relationId);




}