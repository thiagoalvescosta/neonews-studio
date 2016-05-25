package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de StatusPagsegBusiness
 * 
 * @generated
 **/
@Service("StatusPagsegBusiness")
public class StatusPagsegBusiness {

    /**
     * Instância da classe StatusPagsegDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("StatusPagsegDAO")
    protected StatusPagsegDAO repository;

    /**
     * Método de acesso ao StatusPagsegDAO
     * 
     * @generated
     */
    public StatusPagsegDAO getRepository() {
        return repository;
    }



}
