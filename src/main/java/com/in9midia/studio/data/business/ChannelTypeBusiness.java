package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ChannelTypeBusiness
 * 
 * @generated
 **/
@Service("ChannelTypeBusiness")
public class ChannelTypeBusiness {

    /**
     * Instância da classe ChannelTypeDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ChannelTypeDAO")
    protected ChannelTypeDAO repository;

    /**
     * Método de acesso ao ChannelTypeDAO
     * 
     * @generated
     */
    public ChannelTypeDAO getRepository() {
        return repository;
    }

  /**
   * @generated modifiable
   */  
  public List<ChannelTypeCustom> findChannelTypeCustom(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<ChannelTypeCustom> result = repository.findChannelTypeCustom(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



}
