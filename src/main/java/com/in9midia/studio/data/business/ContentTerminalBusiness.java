package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ContentTerminalBusiness
 * 
 * @generated
 **/
@Service("ContentTerminalBusiness")
public class ContentTerminalBusiness {

    /**
     * Instância da classe ContentTerminalDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ContentTerminalDAO")
    protected ContentTerminalDAO repository;

    /**
     * Método de acesso ao ContentTerminalDAO
     * 
     * @generated
     */
    public ContentTerminalDAO getRepository() {
        return repository;
    }



}
