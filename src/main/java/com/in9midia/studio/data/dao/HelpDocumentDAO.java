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
@Repository("HelpDocumentDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface HelpDocumentDAO extends JpaRepository<HelpDocument, java.lang.String> {

  /**
   * Obtém a instância de HelpDocument utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HelpDocument entity WHERE entity.id = :id")
  public HelpDocument findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de HelpDocument utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HelpDocument entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select h from HelpDocument h")
  public List<HelpDocument> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM HelpContent entity WHERE entity.helpDocument.id = :id")
  public List<HelpContent> findHelpContent(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.helpName FROM HelpContent entity WHERE entity.helpDocument.id = :id")
  public List<HelpName> listHelpName(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM HelpContent entity WHERE entity.helpDocument.id = :instanceId AND entity.helpName.id = :relationId")
    public int deleteHelpName(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}