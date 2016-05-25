package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ScheduleTimeBusiness
 * 
 * @generated
 **/
@Service("ScheduleTimeBusiness")
public class ScheduleTimeBusiness {

    /**
     * Instância da classe ScheduleTimeDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ScheduleTimeDAO")
    protected ScheduleTimeDAO repository;

    /**
     * Método de acesso ao ScheduleTimeDAO
     * 
     * @generated
     */
    public ScheduleTimeDAO getRepository() {
        return repository;
    }



}
