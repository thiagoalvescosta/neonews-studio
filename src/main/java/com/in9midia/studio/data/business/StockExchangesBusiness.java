package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de StockExchangesBusiness
 * 
 * @generated
 **/
@Service("StockExchangesBusiness")
public class StockExchangesBusiness {

    /**
     * Instância da classe StockExchangesDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("StockExchangesDAO")
    protected StockExchangesDAO repository;

    /**
     * Método de acesso ao StockExchangesDAO
     * 
     * @generated
     */
    public StockExchangesDAO getRepository() {
        return repository;
    }



}
