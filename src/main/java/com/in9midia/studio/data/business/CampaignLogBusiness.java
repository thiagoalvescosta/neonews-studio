package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignLogBusiness
 * 
 * @generated
 **/
@Service("CampaignLogBusiness")
public class CampaignLogBusiness {

    /**
     * Instância da classe CampaignLogDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignLogDAO")
    protected CampaignLogDAO repository;

    /**
     * Método de acesso ao CampaignLogDAO
     * 
     * @generated
     */
    public CampaignLogDAO getRepository() {
        return repository;
    }



}
