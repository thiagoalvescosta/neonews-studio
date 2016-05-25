package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TerminalAltRouteBusiness
 * 
 * @generated
 **/
@Service("TerminalAltRouteBusiness")
public class TerminalAltRouteBusiness {

    /**
     * Instância da classe TerminalAltRouteDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalAltRouteDAO")
    protected TerminalAltRouteDAO repository;

    /**
     * Método de acesso ao TerminalAltRouteDAO
     * 
     * @generated
     */
    public TerminalAltRouteDAO getRepository() {
        return repository;
    }



}
