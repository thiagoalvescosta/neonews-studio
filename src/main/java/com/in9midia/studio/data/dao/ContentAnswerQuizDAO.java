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
@Repository("ContentAnswerQuizDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ContentAnswerQuizDAO extends JpaRepository<ContentAnswerQuiz, java.lang.String> {

  /**
   * Obtém a instância de ContentAnswerQuiz utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ContentAnswerQuiz entity WHERE entity.id = :id")
  public ContentAnswerQuiz findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ContentAnswerQuiz utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ContentAnswerQuiz entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ContentAnswerQuiz c")
  public List<ContentAnswerQuiz> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContentAnswerReport entity WHERE entity.contentAnswerQuiz.id = :id")
  public List<ContentAnswerReport> findContentAnswerReport(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.content FROM ContentAnswerReport entity WHERE entity.contentAnswerQuiz.id = :id")
  public List<Content> listContent(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ContentAnswerReport entity WHERE entity.contentAnswerQuiz.id = :instanceId AND entity.content.id = :relationId")
    public int deleteContent(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}