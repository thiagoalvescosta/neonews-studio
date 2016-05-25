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
@Repository("NeonewsUserDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface NeonewsUserDAO extends JpaRepository<NeonewsUser, java.lang.String> {

  /**
   * Obtém a instância de NeonewsUser utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM NeonewsUser entity WHERE entity.id = :id")
  public NeonewsUser findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de NeonewsUser utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM NeonewsUser entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select u from NeonewsUser u")
  public List<NeonewsUser> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM UserCompany entity WHERE entity.user.id = :id")
  public List<UserCompany> findUserCompany(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.company FROM UserCompany entity WHERE entity.user.id = :id")
  public List<Company> listCompany(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM UserCompany entity WHERE entity.user.id = :instanceId AND entity.company.id = :relationId")
    public int deleteCompany(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}