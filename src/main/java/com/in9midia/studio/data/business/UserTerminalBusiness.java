package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de UserTerminalBusiness
 * 
 * @generated
 **/
@Service("UserTerminalBusiness")
public class UserTerminalBusiness {

    /**
     * Instância da classe UserTerminalDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("UserTerminalDAO")
    protected UserTerminalDAO repository;

    /**
     * Método de acesso ao UserTerminalDAO
     * 
     * @generated
     */
    public UserTerminalDAO getRepository() {
        return repository;
    }



}
