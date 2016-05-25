package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignPropertyBusiness
 * 
 * @generated
 **/
@Service("CampaignPropertyBusiness")
public class CampaignPropertyBusiness {

    /**
     * Instância da classe CampaignPropertyDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignPropertyDAO")
    protected CampaignPropertyDAO repository;

    /**
     * Método de acesso ao CampaignPropertyDAO
     * 
     * @generated
     */
    public CampaignPropertyDAO getRepository() {
        return repository;
    }



}
