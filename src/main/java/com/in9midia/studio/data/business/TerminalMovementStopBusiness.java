package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TerminalMovementStopBusiness
 * 
 * @generated
 **/
@Service("TerminalMovementStopBusiness")
public class TerminalMovementStopBusiness {

    /**
     * Instância da classe TerminalMovementStopDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalMovementStopDAO")
    protected TerminalMovementStopDAO repository;

    /**
     * Método de acesso ao TerminalMovementStopDAO
     * 
     * @generated
     */
    public TerminalMovementStopDAO getRepository() {
        return repository;
    }



}
