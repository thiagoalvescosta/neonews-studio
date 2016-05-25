package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de RssBusiness
 * 
 * @generated
 **/
@Service("RssBusiness")
public class RssBusiness {

    /**
     * Instância da classe RssDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("RssDAO")
    protected RssDAO repository;

    /**
     * Método de acesso ao RssDAO
     * 
     * @generated
     */
    public RssDAO getRepository() {
        return repository;
    }



}
