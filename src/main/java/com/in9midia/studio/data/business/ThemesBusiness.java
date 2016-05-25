package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ThemesBusiness
 * 
 * @generated
 **/
@Service("ThemesBusiness")
public class ThemesBusiness {

    /**
     * Instância da classe ThemesDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ThemesDAO")
    protected ThemesDAO repository;

    /**
     * Método de acesso ao ThemesDAO
     * 
     * @generated
     */
    public ThemesDAO getRepository() {
        return repository;
    }



}
