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
@Repository("CompanyDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface CompanyDAO extends JpaRepository<Company, java.lang.String> {

  /**
   * Obtém a instância de Company utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Company entity WHERE entity.id = :id")
  public Company findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Company utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Company entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Company c")
  public List<Company> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Account entity WHERE entity.company.id = :id")
  public List<Account> findAccount(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Agency entity WHERE entity.company.id = :id")
  public List<Agency> findAgency(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Campaign entity WHERE entity.company.id = :id")
  public List<Campaign> findCampaign_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignCategory entity WHERE entity.company.id = :id")
  public List<CampaignCategory> findCampaignCategory_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Category entity WHERE entity.company.id = :id")
  public List<Category> findCategory(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ChannelType entity WHERE entity.company.id = :id")
  public List<ChannelType> findChannelType(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Commissioned entity WHERE entity.company.id = :id")
  public List<Commissioned> findCommissioned(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM File entity WHERE entity.company.id = :id")
  public List<File> findFile_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Folder entity WHERE entity.company.id = :id")
  public List<Folder> findFolder_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Participant entity WHERE entity.company.id = :id")
  public List<Participant> findParticipant(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Patrimony entity WHERE entity.company.id = :id")
  public List<Patrimony> findPatrimony(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Patrimony entity WHERE entity.company2.id = :id")
  public List<Patrimony> findPatrimony_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Patrimony entity WHERE entity.company.id = :id")
  public List<Patrimony> findPatrimony_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Patrimony entity WHERE entity.company2.id = :id")
  public List<Patrimony> findPatrimony_4(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Person entity WHERE entity.company.id = :id")
  public List<Person> findPerson_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.company.id = :id")
  public List<Profile> findProfile(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Region entity WHERE entity.company.id = :id")
  public List<Region> findRegion(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Route entity WHERE entity.company.id = :id")
  public List<Route> findRoute(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Schedule entity WHERE entity.company.id = :id")
  public List<Schedule> findSchedule(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Sga entity WHERE entity.company.id = :id")
  public List<Sga> findSga(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignTemplate entity WHERE entity.company.id = :id")
  public List<CampaignTemplate> findCampaignTemplate(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Template entity WHERE entity.company.id = :id")
  public List<Template> findTemplate(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Terminal entity WHERE entity.company.id = :id")
  public List<Terminal> findTerminal_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM NeonewsUser entity WHERE entity.company.id = :id")
  public List<NeonewsUser> findNeonewsUser(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM UserCompany entity WHERE entity.company.id = :id")
  public List<UserCompany> findUserCompany(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM Account entity WHERE entity.company.id = :id")
  public List<Campaign> listCampaign(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.company.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM Account entity WHERE entity.company.id = :id")
  public List<Person> listPerson(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.company.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM Account entity WHERE entity.company.id = :id")
  public List<Terminal> listTerminal(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.company.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.expressionEx FROM Agency entity WHERE entity.company.id = :id")
  public List<ExpressionEx> listExpressionEx(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Agency entity WHERE entity.company.id = :instanceId AND entity.expressionEx.id = :relationId")
    public int deleteExpressionEx(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.file FROM Agency entity WHERE entity.company.id = :id")
  public List<File> listFile(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Agency entity WHERE entity.company.id = :instanceId AND entity.file.id = :relationId")
    public int deleteFile(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaignBlock FROM Campaign entity WHERE entity.company.id = :id")
  public List<CampaignBlock> listCampaignBlock(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Campaign entity WHERE entity.company.id = :instanceId AND entity.campaignBlock.id = :relationId")
    public int deleteCampaignBlock(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaignCategory FROM Campaign entity WHERE entity.company.id = :id")
  public List<CampaignCategory> listCampaignCategory(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Campaign entity WHERE entity.company.id = :instanceId AND entity.campaignCategory.id = :relationId")
    public int deleteCampaignCategory(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.module FROM Campaign entity WHERE entity.company.id = :id")
  public List<Module> listModule(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Campaign entity WHERE entity.company.id = :instanceId AND entity.module.id = :relationId")
    public int deleteModule(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaignCategory FROM CampaignCategory entity WHERE entity.company.id = :id")
  public List<CampaignCategory> listCampaignCategory_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignCategory entity WHERE entity.company.id = :instanceId AND entity.campaignCategory.id = :relationId")
    public int deleteCampaignCategory_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.category FROM Category entity WHERE entity.company.id = :id")
  public List<Category> listCategory_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Category entity WHERE entity.company.id = :instanceId AND entity.category.id = :relationId")
    public int deleteCategory_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM Commissioned entity WHERE entity.company.id = :id")
  public List<Person> listPerson_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Commissioned entity WHERE entity.company.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM Commissioned entity WHERE entity.company.id = :id")
  public List<Terminal> listTerminal_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Commissioned entity WHERE entity.company.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.folder FROM File entity WHERE entity.company.id = :id")
  public List<Folder> listFolder(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM File entity WHERE entity.company.id = :instanceId AND entity.folder.id = :relationId")
    public int deleteFolder(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.folder FROM Folder entity WHERE entity.company.id = :id")
  public List<Folder> listFolder_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Folder entity WHERE entity.company.id = :instanceId AND entity.folder.id = :relationId")
    public int deleteFolder_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.content FROM Participant entity WHERE entity.company.id = :id")
  public List<Content> listContent(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Participant entity WHERE entity.company.id = :instanceId AND entity.content.id = :relationId")
    public int deleteContent(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.file FROM Participant entity WHERE entity.company.id = :id")
  public List<File> listFile_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Participant entity WHERE entity.company.id = :instanceId AND entity.file.id = :relationId")
    public int deleteFile_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.address FROM Person entity WHERE entity.company.id = :id")
  public List<Address> listAddress(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Person entity WHERE entity.company.id = :instanceId AND entity.address.id = :relationId")
    public int deleteAddress(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.module FROM CampaignTemplate entity WHERE entity.company.id = :id")
  public List<Module> listModule_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignTemplate entity WHERE entity.company.id = :instanceId AND entity.module.id = :relationId")
    public int deleteModule_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.nwsChannel FROM CampaignTemplate entity WHERE entity.company.id = :id")
  public List<NwsChannel> listNwsChannel(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignTemplate entity WHERE entity.company.id = :instanceId AND entity.nwsChannel.id = :relationId")
    public int deleteNwsChannel(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.theme FROM CampaignTemplate entity WHERE entity.company.id = :id")
  public List<Theme> listTheme(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignTemplate entity WHERE entity.company.id = :instanceId AND entity.theme.id = :relationId")
    public int deleteTheme(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.address FROM Terminal entity WHERE entity.company.id = :id")
  public List<Address> listAddress_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.address.id = :relationId")
    public int deleteAddress_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM Terminal entity WHERE entity.company.id = :id")
  public List<Campaign> listCampaign_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaignBlock FROM Terminal entity WHERE entity.company.id = :id")
  public List<CampaignBlock> listCampaignBlock_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.campaignBlock.id = :relationId")
    public int deleteCampaignBlock_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.category FROM Terminal entity WHERE entity.company.id = :id")
  public List<Category> listCategory_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.category.id = :relationId")
    public int deleteCategory_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM Terminal entity WHERE entity.company.id = :id")
  public List<Person> listPerson_4(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson_4(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.profile FROM Terminal entity WHERE entity.company.id = :id")
  public List<Profile> listProfile_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.profile.id = :relationId")
    public int deleteProfile_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.sga FROM Terminal entity WHERE entity.company.id = :id")
  public List<Sga> listSga_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.sga.id = :relationId")
    public int deleteSga_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.software FROM Terminal entity WHERE entity.company.id = :id")
  public List<Software> listSoftware(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.software.id = :relationId")
    public int deleteSoftware(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminalType FROM Terminal entity WHERE entity.company.id = :id")
  public List<TerminalType> listTerminalType(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.terminalType.id = :relationId")
    public int deleteTerminalType(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tvType FROM Terminal entity WHERE entity.company.id = :id")
  public List<TvType> listTvType(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Terminal entity WHERE entity.company.id = :instanceId AND entity.tvType.id = :relationId")
    public int deleteTvType(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.address FROM NeonewsUser entity WHERE entity.company.id = :id")
  public List<Address> listAddress_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM NeonewsUser entity WHERE entity.company.id = :instanceId AND entity.address.id = :relationId")
    public int deleteAddress_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.usuario FROM NeonewsUser entity WHERE entity.company.id = :id")
  public List<Usuario> listUsuario(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM NeonewsUser entity WHERE entity.company.id = :instanceId AND entity.usuario.codigo = :relationCodigo")
    public int deleteUsuario(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationCodigo") java.lang.Integer relationCodigo);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.user FROM UserCompany entity WHERE entity.company.id = :id")
  public List<NeonewsUser> listNeonewsUser_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM UserCompany entity WHERE entity.company.id = :instanceId AND entity.user.id = :relationId")
    public int deleteNeonewsUser_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}