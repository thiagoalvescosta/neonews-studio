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
@Repository("HelpNameDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface HelpNameDAO extends JpaRepository<HelpName, java.lang.String> {

  /**
   * Obtém a instância de HelpName utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HelpName entity WHERE entity.id = :id")
  public HelpName findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de HelpName utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HelpName entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select h from HelpName h")
  public List<HelpName> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM HelpContent entity WHERE entity.helpName.id = :id")
  public List<HelpContent> findHelpContent(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.helpDocument FROM HelpContent entity WHERE entity.helpName.id = :id")
  public List<HelpDocument> listHelpDocument(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM HelpContent entity WHERE entity.helpName.id = :instanceId AND entity.helpDocument.id = :relationId")
    public int deleteHelpDocument(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}