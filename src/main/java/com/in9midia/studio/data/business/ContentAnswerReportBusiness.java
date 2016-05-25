package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ContentAnswerReportBusiness
 * 
 * @generated
 **/
@Service("ContentAnswerReportBusiness")
public class ContentAnswerReportBusiness {

    /**
     * Instância da classe ContentAnswerReportDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ContentAnswerReportDAO")
    protected ContentAnswerReportDAO repository;

    /**
     * Método de acesso ao ContentAnswerReportDAO
     * 
     * @generated
     */
    public ContentAnswerReportDAO getRepository() {
        return repository;
    }



}
