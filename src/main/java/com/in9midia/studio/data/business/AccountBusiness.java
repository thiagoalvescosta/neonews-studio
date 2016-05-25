package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de AccountBusiness
 * 
 * @generated
 **/
@Service("AccountBusiness")
public class AccountBusiness {

    /**
     * Instância da classe AccountDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("AccountDAO")
    protected AccountDAO repository;

    /**
     * Método de acesso ao AccountDAO
     * 
     * @generated
     */
    public AccountDAO getRepository() {
        return repository;
    }



}
