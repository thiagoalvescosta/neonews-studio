package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de DownloadBusiness
 * 
 * @generated
 **/
@Service("DownloadBusiness")
public class DownloadBusiness {

    /**
     * Instância da classe DownloadDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("DownloadDAO")
    protected DownloadDAO repository;

    /**
     * Método de acesso ao DownloadDAO
     * 
     * @generated
     */
    public DownloadDAO getRepository() {
        return repository;
    }



}
