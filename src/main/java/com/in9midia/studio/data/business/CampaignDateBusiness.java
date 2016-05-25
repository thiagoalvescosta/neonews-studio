package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignDateBusiness
 * 
 * @generated
 **/
@Service("CampaignDateBusiness")
public class CampaignDateBusiness {

    /**
     * Instância da classe CampaignDateDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignDateDAO")
    protected CampaignDateDAO repository;

    /**
     * Método de acesso ao CampaignDateDAO
     * 
     * @generated
     */
    public CampaignDateDAO getRepository() {
        return repository;
    }



}
