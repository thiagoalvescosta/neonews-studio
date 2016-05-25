package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignTerminalBusiness
 * 
 * @generated
 **/
@Service("CampaignTerminalBusiness")
public class CampaignTerminalBusiness {

    /**
     * Instância da classe CampaignTerminalDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignTerminalDAO")
    protected CampaignTerminalDAO repository;

    /**
     * Método de acesso ao CampaignTerminalDAO
     * 
     * @generated
     */
    public CampaignTerminalDAO getRepository() {
        return repository;
    }



}
