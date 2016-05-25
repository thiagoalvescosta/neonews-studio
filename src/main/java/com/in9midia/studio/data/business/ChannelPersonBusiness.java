package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ChannelPersonBusiness
 * 
 * @generated
 **/
@Service("ChannelPersonBusiness")
public class ChannelPersonBusiness {

    /**
     * Instância da classe ChannelPersonDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ChannelPersonDAO")
    protected ChannelPersonDAO repository;

    /**
     * Método de acesso ao ChannelPersonDAO
     * 
     * @generated
     */
    public ChannelPersonDAO getRepository() {
        return repository;
    }



}
