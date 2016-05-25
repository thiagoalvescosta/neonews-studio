package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ContentUpdateBusiness
 * 
 * @generated
 **/
@Service("ContentUpdateBusiness")
public class ContentUpdateBusiness {

    /**
     * Instância da classe ContentUpdateDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ContentUpdateDAO")
    protected ContentUpdateDAO repository;

    /**
     * Método de acesso ao ContentUpdateDAO
     * 
     * @generated
     */
    public ContentUpdateDAO getRepository() {
        return repository;
    }



}
