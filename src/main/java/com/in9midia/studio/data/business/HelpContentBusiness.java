package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de HelpContentBusiness
 * 
 * @generated
 **/
@Service("HelpContentBusiness")
public class HelpContentBusiness {

    /**
     * Instância da classe HelpContentDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("HelpContentDAO")
    protected HelpContentDAO repository;

    /**
     * Método de acesso ao HelpContentDAO
     * 
     * @generated
     */
    public HelpContentDAO getRepository() {
        return repository;
    }



}
