package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CommissionedBusiness
 * 
 * @generated
 **/
@Service("CommissionedBusiness")
public class CommissionedBusiness {

    /**
     * Instância da classe CommissionedDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CommissionedDAO")
    protected CommissionedDAO repository;

    /**
     * Método de acesso ao CommissionedDAO
     * 
     * @generated
     */
    public CommissionedDAO getRepository() {
        return repository;
    }



}
