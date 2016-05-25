package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de PatrimonyRemoteBusiness
 * 
 * @generated
 **/
@Service("PatrimonyRemoteBusiness")
public class PatrimonyRemoteBusiness {

    /**
     * Instância da classe PatrimonyRemoteDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("PatrimonyRemoteDAO")
    protected PatrimonyRemoteDAO repository;

    /**
     * Método de acesso ao PatrimonyRemoteDAO
     * 
     * @generated
     */
    public PatrimonyRemoteDAO getRepository() {
        return repository;
    }



}
