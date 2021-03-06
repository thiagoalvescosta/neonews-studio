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
@Repository("CampaignBlockDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface CampaignBlockDAO extends JpaRepository<CampaignBlock, java.lang.String> {

  /**
   * Obtém a instância de CampaignBlock utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM CampaignBlock entity WHERE entity.id = :id")
  public CampaignBlock findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de CampaignBlock utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM CampaignBlock entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from CampaignBlock c")
  public List<CampaignBlock> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Campaign entity WHERE entity.campaignBlock.id = :id")
  public List<Campaign> findCampaign(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignCampaignBlock entity WHERE entity.campaignBlock.id = :id")
  public List<CampaignCampaignBlock> findCampaignCampaignBlock(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Terminal entity WHERE entity.campaignBlock.id = :id")
  public List<Terminal> findTerminal(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM CampaignCampaignBlock entity WHERE entity.campaignBlock.id = :id")
  public List<Campaign> listCampaign_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignCampaignBlock entity WHERE entity.campaignBlock.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}