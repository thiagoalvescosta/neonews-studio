package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignRegionBusiness
 * 
 * @generated
 **/
@Service("CampaignRegionBusiness")
public class CampaignRegionBusiness {

    /**
     * Instância da classe CampaignRegionDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignRegionDAO")
    protected CampaignRegionDAO repository;

    /**
     * Método de acesso ao CampaignRegionDAO
     * 
     * @generated
     */
    public CampaignRegionDAO getRepository() {
        return repository;
    }



}
