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
@Repository("ParticipantDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ParticipantDAO extends JpaRepository<Participant, java.lang.String> {

  /**
   * Obtém a instância de Participant utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Participant entity WHERE entity.id = :id")
  public Participant findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Participant utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Participant entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from Participant p")
  public List<Participant> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.participant.id = :id")
  public List<OriginDestination> findOriginDestination(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.participant2.id = :id")
  public List<OriginDestination> findOriginDestination_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.participant.id = :id")
  public List<OriginDestination> findOriginDestination_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.participant2.id = :id")
  public List<OriginDestination> findOriginDestination_4(@Param(value="id") java.lang.String id,  Pageable pageable );






}