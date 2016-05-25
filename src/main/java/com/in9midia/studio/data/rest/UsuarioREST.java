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
    @Qualifier("AddressBusiness")
    private AddressBusiness addressBusiness;
  /**
   * @generated
   */
    @Autowired
    @Qualifier("CompanyBusiness")
    private CompanyBusiness companyBusiness;
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
        usuarioBusiness.getRepository().save(entity);
        return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{codigo}")
    public ResponseEntity<?> get(@PathVariable("codigo") java.lang.Integer codigo) throws Exception {
        Usuario entity = usuarioBusiness.getRepository().findOne(codigo);
        return entity == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@Validated @RequestBody final Usuario entity) throws Exception {
        return ResponseEntity.ok( usuarioBusiness.getRepository().saveAndFlush(entity));
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{codigo}")
    public Usuario put(@PathVariable("id") final java.lang.Integer id, @Validated @RequestBody final Usuario entity) throws Exception {
        return usuarioBusiness.getRepository().saveAndFlush(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{codigo}")
    public void delete(@PathVariable("codigo") java.lang.Integer codigo) throws Exception {
         usuarioBusiness.getRepository().delete(codigo);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  List<Usuario> listParams (@RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset){
      return usuarioBusiness.getRepository().list(new PageRequest(offset, limit)   );  
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
        this.neonewsUserBusiness.getRepository().delete(relationId);
        return ResponseEntity.ok().build();
      } catch (Exception e) {
        return ResponseEntity.status(404).build();
      }
  }



  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceCodigo}/Address")
  public List<Address> listAddress(@PathVariable("instanceCodigo") java.lang.Integer instanceCodigo,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return usuarioBusiness.listAddress(instanceCodigo,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceCodigo}/Address")
  public ResponseEntity<?> postAddress(@Validated @RequestBody final Address entity, @PathVariable("instanceCodigo") java.lang.Integer instanceCodigo) {
      NeonewsUser newNeonewsUser = new NeonewsUser();

      Usuario instance = this.usuarioBusiness.getRepository().findOne(instanceCodigo);

      newNeonewsUser.setAddress(entity);
      newNeonewsUser.setUsuario(instance);
      
      this.neonewsUserBusiness.getRepository().saveAndFlush(newNeonewsUser);

      return ResponseEntity.ok(newNeonewsUser.getUsuario());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceCodigo}/Address/{relationId}")
  public ResponseEntity<?> deleteAddress(@PathVariable("instanceCodigo") java.lang.Integer instanceCodigo, @PathVariable("relationId") java.lang.String relationId) {
      this.usuarioBusiness.deleteAddress(instanceCodigo, relationId);
      return ResponseEntity.ok().build();
  }  


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceCodigo}/Company")
  public List<Company> listCompany(@PathVariable("instanceCodigo") java.lang.Integer instanceCodigo,  @RequestParam(defaultValue = "100", required = false) Integer limit, @RequestParam(defaultValue = "0", required = false) Integer offset ) {
    return usuarioBusiness.listCompany(instanceCodigo,  new PageRequest(offset, limit) );
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceCodigo}/Company")
  public ResponseEntity<?> postCompany(@Validated @RequestBody final Company entity, @PathVariable("instanceCodigo") java.lang.Integer instanceCodigo) {
      NeonewsUser newNeonewsUser = new NeonewsUser();

      Usuario instance = this.usuarioBusiness.getRepository().findOne(instanceCodigo);

      newNeonewsUser.setCompany(entity);
      newNeonewsUser.setUsuario(instance);
      
      this.neonewsUserBusiness.getRepository().saveAndFlush(newNeonewsUser);

      return ResponseEntity.ok(newNeonewsUser.getUsuario());
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceCodigo}/Company/{relationId}")
  public ResponseEntity<?> deleteCompany(@PathVariable("instanceCodigo") java.lang.Integer instanceCodigo, @PathVariable("relationId") java.lang.String relationId) {
      this.usuarioBusiness.deleteCompany(instanceCodigo, relationId);
      return ResponseEntity.ok().build();
  }  



}