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
@Repository("UsuarioDAO")
@Transactional(transactionManager="com.in9midia.studio.data-TransactionManager")
public interface UsuarioDAO extends JpaRepository<Usuario, java.lang.Integer> {

  /**
   * Obtém a instância de Usuario utilizando os identificadores
   * 
   * @param codigo
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Usuario entity WHERE entity.codigo = :codigo")
  public Usuario findOne(@Param(value="codigo") java.lang.Integer codigo);

  /**
   * Remove a instância de Usuario utilizando os identificadores
   * 
   * @param codigo
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Usuario entity WHERE entity.codigo = :codigo")
  public void delete(@Param(value="codigo") java.lang.Integer codigo);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select u from Usuario u")
  public List<Usuario> list ( Pageable pageable );
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select u from Usuario u where u.login = :login")
  public List<Usuario> findByLogin (@Param(value="login") java.lang.String login , Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM NeonewsUser entity WHERE entity.usuario.codigo = :codigo")
  public List<NeonewsUser> findNeonewsUser(@Param(value="codigo") java.lang.Integer codigo,  Pageable pageable );






}