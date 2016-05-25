package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ExtensionVideoBusiness
 * 
 * @generated
 **/
@Service("ExtensionVideoBusiness")
public class ExtensionVideoBusiness {

    /**
     * Instância da classe ExtensionVideoDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ExtensionVideoDAO")
    protected ExtensionVideoDAO repository;

    /**
     * Método de acesso ao ExtensionVideoDAO
     * 
     * @generated
     */
    public ExtensionVideoDAO getRepository() {
        return repository;
    }



}
