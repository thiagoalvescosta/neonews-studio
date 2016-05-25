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
@Repository("ChannelDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface ChannelDAO extends JpaRepository<Channel, java.lang.String> {

  /**
   * Obtém a instância de Channel utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Channel entity WHERE entity.id = :id")
  public Channel findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Channel utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Channel entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Channel c")
  public List<Channel> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ChannelPerson entity WHERE entity.channel.id = :id")
  public List<ChannelPerson> findChannelPerson(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Content entity WHERE entity.channel.id = :id")
  public List<Content> findContent(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.person FROM ChannelPerson entity WHERE entity.channel.id = :id")
  public List<Person> listPerson(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ChannelPerson entity WHERE entity.channel.id = :instanceId AND entity.person.id = :relationId")
    public int deletePerson(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.file FROM Content entity WHERE entity.channel.id = :id")
  public List<File> listFile(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Content entity WHERE entity.channel.id = :instanceId AND entity.file.id = :relationId")
    public int deleteFile(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.template FROM Content entity WHERE entity.channel.id = :id")
  public List<Template> listTemplate(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Content entity WHERE entity.channel.id = :instanceId AND entity.template.id = :relationId")
    public int deleteTemplate(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}