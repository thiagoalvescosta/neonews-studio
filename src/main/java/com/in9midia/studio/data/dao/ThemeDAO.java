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
@Repository("ThemeDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ThemeDAO extends JpaRepository<Theme, java.lang.String> {

  /**
   * Obtém a instância de Theme utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Theme entity WHERE entity.id = :id")
  public Theme findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Theme utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Theme entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from Theme t")
  public List<Theme> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM NwsChannel entity WHERE entity.theme.id = :id")
  public List<NwsChannel> findNwsChannel(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignTemplate entity WHERE entity.theme.id = :id")
  public List<CampaignTemplate> findCampaignTemplate(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.agency FROM NwsChannel entity WHERE entity.theme.id = :id")
  public List<Agency> listAgency(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM NwsChannel entity WHERE entity.theme.id = :instanceId AND entity.agency.id = :relationId")
    public int deleteAgency(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.wrapper FROM NwsChannel entity WHERE entity.theme.id = :id")
  public List<Wrapper> listWrapper(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM NwsChannel entity WHERE entity.theme.id = :instanceId AND entity.wrapper.id = :relationId")
    public int deleteWrapper(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM CampaignTemplate entity WHERE entity.theme.id = :id")
  public List<Company> listCompany(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignTemplate entity WHERE entity.theme.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.module FROM CampaignTemplate entity WHERE entity.theme.id = :id")
  public List<Module> listModule(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignTemplate entity WHERE entity.theme.id = :instanceId AND entity.module.id = :relationId")
    public int deleteModule(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.nwsChannel FROM CampaignTemplate entity WHERE entity.theme.id = :id")
  public List<NwsChannel> listNwsChannel_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignTemplate entity WHERE entity.theme.id = :instanceId AND entity.nwsChannel.id = :relationId")
    public int deleteNwsChannel_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}