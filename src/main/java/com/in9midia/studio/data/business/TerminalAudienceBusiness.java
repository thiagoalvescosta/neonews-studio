package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de TerminalAudienceBusiness
 * 
 * @generated
 **/
@Service("TerminalAudienceBusiness")
public class TerminalAudienceBusiness {

    /**
     * Instância da classe TerminalAudienceDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("TerminalAudienceDAO")
    protected TerminalAudienceDAO repository;

    /**
     * Método de acesso ao TerminalAudienceDAO
     * 
     * @generated
     */
    public TerminalAudienceDAO getRepository() {
        return repository;
    }



}
