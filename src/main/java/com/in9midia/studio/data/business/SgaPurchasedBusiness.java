package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de SgaPurchasedBusiness
 * 
 * @generated
 **/
@Service("SgaPurchasedBusiness")
public class SgaPurchasedBusiness {

    /**
     * Instância da classe SgaPurchasedDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("SgaPurchasedDAO")
    protected SgaPurchasedDAO repository;

    /**
     * Método de acesso ao SgaPurchasedDAO
     * 
     * @generated
     */
    public SgaPurchasedDAO getRepository() {
        return repository;
    }



}
