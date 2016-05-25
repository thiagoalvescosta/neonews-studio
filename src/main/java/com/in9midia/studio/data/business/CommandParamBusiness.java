package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CommandParamBusiness
 * 
 * @generated
 **/
@Service("CommandParamBusiness")
public class CommandParamBusiness {

    /**
     * Instância da classe CommandParamDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CommandParamDAO")
    protected CommandParamDAO repository;

    /**
     * Método de acesso ao CommandParamDAO
     * 
     * @generated
     */
    public CommandParamDAO getRepository() {
        return repository;
    }



}
