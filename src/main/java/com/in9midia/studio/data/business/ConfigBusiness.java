package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ConfigBusiness
 * 
 * @generated
 **/
@Service("ConfigBusiness")
public class ConfigBusiness {

    /**
     * Instância da classe ConfigDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ConfigDAO")
    protected ConfigDAO repository;

    /**
     * Método de acesso ao ConfigDAO
     * 
     * @generated
     */
    public ConfigDAO getRepository() {
        return repository;
    }



}
