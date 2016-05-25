package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de XtraIntBooleanBusiness
 * 
 * @generated
 **/
@Service("XtraIntBooleanBusiness")
public class XtraIntBooleanBusiness {

    /**
     * Instância da classe XtraIntBooleanDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("XtraIntBooleanDAO")
    protected XtraIntBooleanDAO repository;

    /**
     * Método de acesso ao XtraIntBooleanDAO
     * 
     * @generated
     */
    public XtraIntBooleanDAO getRepository() {
        return repository;
    }



}
