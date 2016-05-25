package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de I18nBusiness
 * 
 * @generated
 **/
@Service("I18nBusiness")
public class I18nBusiness {

    /**
     * Instância da classe I18nDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("I18nDAO")
    protected I18nDAO repository;

    /**
     * Método de acesso ao I18nDAO
     * 
     * @generated
     */
    public I18nDAO getRepository() {
        return repository;
    }



}
