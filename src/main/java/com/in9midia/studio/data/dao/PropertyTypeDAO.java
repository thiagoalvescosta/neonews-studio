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
@Repository("PropertyTypeDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface PropertyTypeDAO extends JpaRepository<PropertyType, java.lang.String> {

  /**
   * Obtém a instância de PropertyType utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PropertyType entity WHERE entity.id = :id")
  public PropertyType findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de PropertyType utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PropertyType entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from PropertyType p")
  public List<PropertyType> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ModuleProperty entity WHERE entity.propertyType.id = :id")
  public List<ModuleProperty> findModuleProperty(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.module FROM ModuleProperty entity WHERE entity.propertyType.id = :id")
  public List<Module> listModule(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ModuleProperty entity WHERE entity.propertyType.id = :instanceId AND entity.module.id = :relationId")
    public int deleteModule(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}