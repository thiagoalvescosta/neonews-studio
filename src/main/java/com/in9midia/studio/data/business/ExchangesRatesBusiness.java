package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ExchangesRatesBusiness
 * 
 * @generated
 **/
@Service("ExchangesRatesBusiness")
public class ExchangesRatesBusiness {

    /**
     * Instância da classe ExchangesRatesDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ExchangesRatesDAO")
    protected ExchangesRatesDAO repository;

    /**
     * Método de acesso ao ExchangesRatesDAO
     * 
     * @generated
     */
    public ExchangesRatesDAO getRepository() {
        return repository;
    }



}
