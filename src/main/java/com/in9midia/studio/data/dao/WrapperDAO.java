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
@Repository("WrapperDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface WrapperDAO extends JpaRepository<Wrapper, java.lang.String> {

  /**
   * Obtém a instância de Wrapper utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Wrapper entity WHERE entity.id = :id")
  public Wrapper findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Wrapper utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Wrapper entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select w from Wrapper w")
  public List<Wrapper> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM NwsChannel entity WHERE entity.wrapper.id = :id")
  public List<NwsChannel> findNwsChannel(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.agency FROM NwsChannel entity WHERE entity.wrapper.id = :id")
  public List<Agency> listAgency(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM NwsChannel entity WHERE entity.wrapper.id = :instanceId AND entity.agency.id = :relationId")
    public int deleteAgency(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.theme FROM NwsChannel entity WHERE entity.wrapper.id = :id")
  public List<Theme> listTheme(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM NwsChannel entity WHERE entity.wrapper.id = :instanceId AND entity.theme.id = :relationId")
    public int deleteTheme(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}