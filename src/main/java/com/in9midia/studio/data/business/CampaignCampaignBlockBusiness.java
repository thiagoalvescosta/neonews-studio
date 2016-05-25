package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignCampaignBlockBusiness
 * 
 * @generated
 **/
@Service("CampaignCampaignBlockBusiness")
public class CampaignCampaignBlockBusiness {

    /**
     * Instância da classe CampaignCampaignBlockDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignCampaignBlockDAO")
    protected CampaignCampaignBlockDAO repository;

    /**
     * Método de acesso ao CampaignCampaignBlockDAO
     * 
     * @generated
     */
    public CampaignCampaignBlockDAO getRepository() {
        return repository;
    }



}
