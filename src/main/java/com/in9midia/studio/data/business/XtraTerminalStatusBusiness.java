package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de XtraTerminalStatusBusiness
 * 
 * @generated
 **/
@Service("XtraTerminalStatusBusiness")
public class XtraTerminalStatusBusiness {

    /**
     * Instância da classe XtraTerminalStatusDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("XtraTerminalStatusDAO")
    protected XtraTerminalStatusDAO repository;

    /**
     * Método de acesso ao XtraTerminalStatusDAO
     * 
     * @generated
     */
    public XtraTerminalStatusDAO getRepository() {
        return repository;
    }



}
