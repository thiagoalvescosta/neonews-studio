package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de OriginDestinationBusiness
 * 
 * @generated
 **/
@Service("OriginDestinationBusiness")
public class OriginDestinationBusiness {

    /**
     * Instância da classe OriginDestinationDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("OriginDestinationDAO")
    protected OriginDestinationDAO repository;

    /**
     * Método de acesso ao OriginDestinationDAO
     * 
     * @generated
     */
    public OriginDestinationDAO getRepository() {
        return repository;
    }



}
