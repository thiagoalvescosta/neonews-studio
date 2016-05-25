package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignPersonBusiness
 * 
 * @generated
 **/
@Service("CampaignPersonBusiness")
public class CampaignPersonBusiness {

    /**
     * Instância da classe CampaignPersonDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignPersonDAO")
    protected CampaignPersonDAO repository;

    /**
     * Método de acesso ao CampaignPersonDAO
     * 
     * @generated
     */
    public CampaignPersonDAO getRepository() {
        return repository;
    }



}
