package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TerminalLogBusiness
 * 
 * @generated
 **/
@Service("TerminalLogBusiness")
public class TerminalLogBusiness {

    /**
     * Instância da classe TerminalLogDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalLogDAO")
    protected TerminalLogDAO repository;

    /**
     * Método de acesso ao TerminalLogDAO
     * 
     * @generated
     */
    public TerminalLogDAO getRepository() {
        return repository;
    }



}
