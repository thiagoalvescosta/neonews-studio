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
@Repository("ContentDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ContentDAO extends JpaRepository<Content, java.lang.String> {

  /**
   * Obtém a instância de Content utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Content entity WHERE entity.id = :id")
  public Content findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Content utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Content entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Content c")
  public List<Content> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContentAnswerQuiz entity WHERE entity.content.id = :id")
  public List<ContentAnswerQuiz> findContentAnswerQuiz(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContentAnswerReport entity WHERE entity.content.id = :id")
  public List<ContentAnswerReport> findContentAnswerReport(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContentTerminal entity WHERE entity.content.id = :id")
  public List<ContentTerminal> findContentTerminal(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.content.id = :id")
  public List<OriginDestination> findOriginDestination(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Participant entity WHERE entity.content.id = :id")
  public List<Participant> findParticipant(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.contentAnswerQuiz FROM ContentAnswerReport entity WHERE entity.content.id = :id")
  public List<ContentAnswerQuiz> listContentAnswerQuiz_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ContentAnswerReport entity WHERE entity.content.id = :instanceId AND entity.contentAnswerQuiz.id = :relationId")
    public int deleteContentAnswerQuiz_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM ContentTerminal entity WHERE entity.content.id = :id")
  public List<Terminal> listTerminal(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ContentTerminal entity WHERE entity.content.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}