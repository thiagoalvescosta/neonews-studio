package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de LogBusiness
 * 
 * @generated
 **/
@Service("LogBusiness")
public class LogBusiness {

    /**
     * Instância da classe LogDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("LogDAO")
    protected LogDAO repository;

    /**
     * Método de acesso ao LogDAO
     * 
     * @generated
     */
    public LogDAO getRepository() {
        return repository;
    }



}
