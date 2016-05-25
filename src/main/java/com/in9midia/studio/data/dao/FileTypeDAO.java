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
@Repository("FileTypeDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface FileTypeDAO extends JpaRepository<FileType, java.lang.String> {

  /**
   * Obtém a instância de FileType utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM FileType entity WHERE entity.id = :id")
  public FileType findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de FileType utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM FileType entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select f from FileType f")
  public List<FileType> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM FileExtension entity WHERE entity.fileType.id = :id")
  public List<FileExtension> findFileExtension(@Param(value="id") java.lang.String id,  Pageable pageable );






}