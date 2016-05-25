package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de XtraBooleanBusiness
 * 
 * @generated
 **/
@Service("XtraBooleanBusiness")
public class XtraBooleanBusiness {

    /**
     * Instância da classe XtraBooleanDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("XtraBooleanDAO")
    protected XtraBooleanDAO repository;

    /**
     * Método de acesso ao XtraBooleanDAO
     * 
     * @generated
     */
    public XtraBooleanDAO getRepository() {
        return repository;
    }



}
