package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de SchedulePredicateRegionBusiness
 * 
 * @generated
 **/
@Service("SchedulePredicateRegionBusiness")
public class SchedulePredicateRegionBusiness {

    /**
     * Instância da classe SchedulePredicateRegionDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("SchedulePredicateRegionDAO")
    protected SchedulePredicateRegionDAO repository;

    /**
     * Método de acesso ao SchedulePredicateRegionDAO
     * 
     * @generated
     */
    public SchedulePredicateRegionDAO getRepository() {
        return repository;
    }



}
