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
@Repository("CampaignCategoryDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface CampaignCategoryDAO extends JpaRepository<CampaignCategory, java.lang.String> {

  /**
   * Obtém a instância de CampaignCategory utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM CampaignCategory entity WHERE entity.id = :id")
  public CampaignCategory findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de CampaignCategory utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM CampaignCategory entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from CampaignCategory c")
  public List<CampaignCategory> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Campaign entity WHERE entity.campaignCategory.id = :id")
  public List<Campaign> findCampaign(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignCategory entity WHERE entity.campaignCategory.id = :id")
  public List<CampaignCategory> findCampaignCategory(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaignBlock FROM Campaign entity WHERE entity.campaignCategory.id = :id")
  public List<CampaignBlock> listCampaignBlock(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Campaign entity WHERE entity.campaignCategory.id = :instanceId AND entity.campaignBlock.id = :relationId")
    public int deleteCampaignBlock(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Campaign entity WHERE entity.campaignCategory.id = :id")
  public List<Company> listCompany(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Campaign entity WHERE entity.campaignCategory.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.module FROM Campaign entity WHERE entity.campaignCategory.id = :id")
  public List<Module> listModule(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Campaign entity WHERE entity.campaignCategory.id = :instanceId AND entity.module.id = :relationId")
    public int deleteModule(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM CampaignCategory entity WHERE entity.campaignCategory.id = :id")
  public List<Company> listCompany_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignCategory entity WHERE entity.campaignCategory.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}