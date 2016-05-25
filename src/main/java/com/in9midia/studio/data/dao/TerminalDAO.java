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
@Repository("TerminalDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface TerminalDAO extends JpaRepository<Terminal, java.lang.String> {

  /**
   * Obtém a instância de Terminal utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Terminal entity WHERE entity.id = :id")
  public Terminal findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Terminal utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Terminal entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from Terminal t")
  public List<Terminal> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Account entity WHERE entity.terminal.id = :id")
  public List<Account> findAccount(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CampaignLog entity WHERE entity.terminal.id = :id")
  public List<CampaignLog> findCampaignLog(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Command entity WHERE entity.terminal.id = :id")
  public List<Command> findCommand(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Commissioned entity WHERE entity.terminal.id = :id")
  public List<Commissioned> findCommissioned(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContentTerminal entity WHERE entity.terminal.id = :id")
  public List<ContentTerminal> findContentTerminal(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContentUpdate entity WHERE entity.terminal.id = :id")
  public List<ContentUpdate> findContentUpdate(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Log entity WHERE entity.terminal.id = :id")
  public List<Log> findLog(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ReportCampaignSchedule entity WHERE entity.terminal.id = :id")
  public List<ReportCampaignSchedule> findReportCampaignSchedule(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM SchedulePredicateTerminal entity WHERE entity.terminal.id = :id")
  public List<SchedulePredicateTerminal> findSchedulePredicateTerminal(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TerminalAltRoute entity WHERE entity.terminal.id = :id")
  public List<TerminalAltRoute> findTerminalAltRoute(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TerminalAudience entity WHERE entity.terminal.id = :id")
  public List<TerminalAudience> findTerminalAudience(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TerminalLog entity WHERE entity.terminal.id = :id")
  public List<TerminalLog> findTerminalLog(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM TerminalMovement entity WHERE entity.terminal.id = :id")
  public List<TerminalMovement> findTerminalMovement(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM UserTerminal entity WHERE entity.terminal.id = :id")
  public List<UserTerminal> findUserTerminal(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM Account entity WHERE entity.terminal.id = :id")
  public List<Campaign> listCampaign(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.terminal.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Account entity WHERE entity.terminal.id = :id")
  public List<Company> listCompany(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.terminal.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM Account entity WHERE entity.terminal.id = :id")
  public List<Person> listPerson(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Account entity WHERE entity.terminal.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM CampaignLog entity WHERE entity.terminal.id = :id")
  public List<Campaign> listCampaign_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM CampaignLog entity WHERE entity.terminal.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM Commissioned entity WHERE entity.terminal.id = :id")
  public List<Company> listCompany_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Commissioned entity WHERE entity.terminal.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM Commissioned entity WHERE entity.terminal.id = :id")
  public List<Person> listPerson_2(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Commissioned entity WHERE entity.terminal.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.content FROM ContentTerminal entity WHERE entity.terminal.id = :id")
  public List<Content> listContent(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ContentTerminal entity WHERE entity.terminal.id = :instanceId AND entity.content.id = :relationId")
    public int deleteContent(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.profile FROM ContentUpdate entity WHERE entity.terminal.id = :id")
  public List<Profile> listProfile(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ContentUpdate entity WHERE entity.terminal.id = :instanceId AND entity.profile.id = :relationId")
    public int deleteProfile(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM Log entity WHERE entity.terminal.id = :id")
  public List<Campaign> listCampaign_3(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Log entity WHERE entity.terminal.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign_3(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.campaign FROM ReportCampaignSchedule entity WHERE entity.terminal.id = :id")
  public List<Campaign> listCampaign_4(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ReportCampaignSchedule entity WHERE entity.terminal.id = :instanceId AND entity.campaign.id = :relationId")
    public int deleteCampaign_4(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.schedulePredicate FROM SchedulePredicateTerminal entity WHERE entity.terminal.id = :id")
  public List<SchedulePredicate> listSchedulePredicate(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM SchedulePredicateTerminal entity WHERE entity.terminal.id = :instanceId AND entity.schedulePredicate.id = :relationId")
    public int deleteSchedulePredicate(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.file FROM TerminalAltRoute entity WHERE entity.terminal.id = :id")
  public List<File> listFile(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM TerminalAltRoute entity WHERE entity.terminal.id = :instanceId AND entity.file.id = :relationId")
    public int deleteFile(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.employer FROM TerminalAudience entity WHERE entity.terminal.id = :id")
  public List<Employer> listEmployer(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM TerminalAudience entity WHERE entity.terminal.id = :instanceId AND entity.employer.card = :relationCard")
    public int deleteEmployer(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationCard") java.lang.String relationCard);




}