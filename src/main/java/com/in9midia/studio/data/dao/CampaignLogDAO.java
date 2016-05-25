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
@Repository("CampaignLogDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface CampaignLogDAO extends JpaRepository<CampaignLog, java.lang.Long> {

  /**
   * Obtém a instância de CampaignLog utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM CampaignLog entity WHERE entity.id = :id")
  public CampaignLog findOne(@Param(value="id") java.lang.Long id);

  /**
   * Remove a instância de CampaignLog utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM CampaignLog entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Long id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from CampaignLog c")
  public List<CampaignLog> list ( Pageable pageable );
  







}