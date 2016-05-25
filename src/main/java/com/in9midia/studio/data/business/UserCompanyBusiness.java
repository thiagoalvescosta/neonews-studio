package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de UserCompanyBusiness
 * 
 * @generated
 **/
@Service("UserCompanyBusiness")
public class UserCompanyBusiness {

    /**
     * Instância da classe UserCompanyDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("UserCompanyDAO")
    protected UserCompanyDAO repository;

    /**
     * Método de acesso ao UserCompanyDAO
     * 
     * @generated
     */
    public UserCompanyDAO getRepository() {
        return repository;
    }



}
