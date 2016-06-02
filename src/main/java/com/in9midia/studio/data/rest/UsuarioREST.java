package com.in9midia.studio.data.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;

import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.in9midia.studio.data.entity.*;
import com.in9midia.studio.data.business.*;


/**
 * Controller para expor serviços REST de Usuario
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/com/in9midia/studio/data/Usuario")
public class UsuarioREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("UsuarioBusiness")
    private UsuarioBusiness usuarioBusiness;

  /**
   * @generated
   */
    @Autowired
    @Qualifier("NeonewsUserBusiness")
    private NeonewsUserBusiness neonewsUserBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Usuario post(@Validated @RequestBody final Usuario entity) throws Exception {
        usuarioBusiness.post(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{codigo}")
    public ResponseEntity<?> get(@PathVariable("codigo") java.lang.Integer codigo) throws Exception {
        Usuario entity = usuarioBusiness.get(codigo);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Usuario entity) throws Exception {
        return ResponseEntity.ok(usuarioBusiness.put(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{codigo}")
    public Usuario put(@PathVariable("id") final java.lang.Integer id, @Validated @RequestBody final Usuario entity) throws Exception {
        return usuarioBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{codigo}")
    public void delete(@PathVariable("codigo") java.lang.Integer codigo) throws Exception {
        usuarioBusiness.delete(codigo);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Usuario> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return usuarioBusiness.list(new PageRequest(offset, limit)   );  
  }

  /**
   * NamedQuery findByLogin
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/findByLogin/{login}")    
  public  List<Usuario> findByLoginParams (@PathVariable("login") java.lang.String login, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return usuarioBusiness.findByLogin(login, new PageRequest(offset, limit)   );  
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceCodigo}/NeonewsUser")    
  public List<NeonewsUser> findNeonewsUser(@PathVariable("instanceCodigo") java.lang.Integer instanceCodigo, @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset) {
    return usuarioBusiness.findNeonewsUser(instanceCodigo,  new PageRequest(offset, limit) );
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceCodigo}/NeonewsUser/{relationId}")    
  public ResponseEntity<?> deleteNeonewsUser(@PathVariable("relationId") java.lang.String relationId) {
      try {
        this.neonewsUserBusiness.delete(relationId);
        return ResponseEntity.ok().build();
      } catch (Exception e) {
        return ResponseEntity.status(404).build();
      }
  }




}
