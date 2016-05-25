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
@Repository("FileDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface FileDAO extends JpaRepository<File, java.lang.String> {

  /**
   * Obtém a instância de File utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM File entity WHERE entity.id = :id")
  public File findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de File utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM File entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select f from File f")
  public List<File> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Agency entity WHERE entity.file.id = :id")
  public List<Agency> findAgency(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Company entity WHERE entity.file.id = :id")
  public List<Company> findCompany_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Config entity WHERE entity.file.id = :id")
  public List<Config> findConfig(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Content entity WHERE entity.file.id = :id")
  public List<Content> findContent(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM NwsChannel entity WHERE entity.file.id = :id")
  public List<NwsChannel> findNwsChannel(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM NwsChannel entity WHERE entity.file2.id = :id")
  public List<NwsChannel> findNwsChannel_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM NwsChannel entity WHERE entity.file.id = :id")
  public List<NwsChannel> findNwsChannel_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM NwsChannel entity WHERE entity.file2.id = :id")
  public List<NwsChannel> findNwsChannel_4(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Participant entity WHERE entity.file.id = :id")
  public List<Participant> findParticipant(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.file.id = :id")
  public List<Profile> findProfile(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.file2.id = :id")
  public List<Profile> findProfile_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.file.id = :id")
  public List<Profile> findProfile_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Profile entity WHERE entity.file2.id = :id")
  public List<Profile> findProfile_4(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Route entity WHERE entity.file.id = :id")
  public List<Route> findRoute(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Route entity WHERE entity.file2.id = :id")
  public List<Route> findRoute_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Route entity WHERE entity.file.id = :id")
  public List<Route> findRoute_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Route entity WHERE entity.file2.id = :id")
  public List<Route> findRoute_4(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignTemplate entity WHERE entity.file.id = :id")
  public List<CampaignTemplate> findCampaignTemplate(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignTemplate entity WHERE entity.file2.id = :id")
  public List<CampaignTemplate> findCampaignTemplate_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignTemplate entity WHERE entity.file.id = :id")
  public List<CampaignTemplate> findCampaignTemplate_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignTemplate entity WHERE entity.file2.id = :id")
  public List<CampaignTemplate> findCampaignTemplate_4(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TerminalAltRoute entity WHERE entity.file.id = :id")
  public List<TerminalAltRoute> findTerminalAltRoute(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Agency entity WHERE entity.file.id = :id")
  public List<Company> listCompany(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Agency entity WHERE entity.file.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.expressionEx FROM Agency entity WHERE entity.file.id = :id")
  public List<ExpressionEx> listExpressionEx(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Agency entity WHERE entity.file.id = :instanceId AND entity.expressionEx.id = :relationId")
    public int deleteExpressionEx(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.address FROM Company entity WHERE entity.file.id = :id")
  public List<Address> listAddress(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Company entity WHERE entity.file.id = :instanceId AND entity.address.id = :relationId")
    public int deleteAddress(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.channel FROM Content entity WHERE entity.file.id = :id")
  public List<Channel> listChannel(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Content entity WHERE entity.file.id = :instanceId AND entity.channel.id = :relationId")
    public int deleteChannel(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.template FROM Content entity WHERE entity.file.id = :id")
  public List<Template> listTemplate(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Content entity WHERE entity.file.id = :instanceId AND entity.template.id = :relationId")
    public int deleteTemplate(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Participant entity WHERE entity.file.id = :id")
  public List<Company> listCompany_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Participant entity WHERE entity.file.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.content FROM Participant entity WHERE entity.file.id = :id")
  public List<Content> listContent_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Participant entity WHERE entity.file.id = :instanceId AND entity.content.id = :relationId")
    public int deleteContent_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.terminal FROM TerminalAltRoute entity WHERE entity.file.id = :id")
  public List<Terminal> listTerminal(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM TerminalAltRoute entity WHERE entity.file.id = :instanceId AND entity.terminal.id = :relationId")
    public int deleteTerminal(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}