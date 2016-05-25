package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de FileExtensionBusiness
 * 
 * @generated
 **/
@Service("FileExtensionBusiness")
public class FileExtensionBusiness {

    /**
     * Instância da classe FileExtensionDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("FileExtensionDAO")
    protected FileExtensionDAO repository;

    /**
     * Método de acesso ao FileExtensionDAO
     * 
     * @generated
     */
    public FileExtensionDAO getRepository() {
        return repository;
    }



}
