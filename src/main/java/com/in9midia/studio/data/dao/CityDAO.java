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
@Repository("CityDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface CityDAO extends JpaRepository<City, java.lang.String> {

  /**
   * Obtém a instância de City utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM City entity WHERE entity.id = :id")
  public City findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de City utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM City entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from City c")
  public List<City> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Address entity WHERE entity.city.id = :id")
  public List<Address> findAddress(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.city.id = :id")
  public List<OriginDestination> findOriginDestination(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.city2.id = :id")
  public List<OriginDestination> findOriginDestination_2(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.city.id = :id")
  public List<OriginDestination> findOriginDestination_3(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM OriginDestination entity WHERE entity.city2.id = :id")
  public List<OriginDestination> findOriginDestination_4(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.country FROM Address entity WHERE entity.city.id = :id")
  public List<Country> listCountry(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Address entity WHERE entity.city.id = :instanceId AND entity.country.id = :relationId")
    public int deleteCountry(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.state FROM Address entity WHERE entity.city.id = :id")
  public List<State> listState(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM Address entity WHERE entity.city.id = :instanceId AND entity.state.id = :relationId")
    public int deleteState(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}