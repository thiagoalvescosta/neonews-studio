package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de CampaignTemplateBusiness
 * 
 * @generated
 **/
@Service("CampaignTemplateBusiness")
public class CampaignTemplateBusiness {

    /**
     * Instância da classe CampaignTemplateDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("CampaignTemplateDAO")
    protected CampaignTemplateDAO repository;

    /**
     * Método de acesso ao CampaignTemplateDAO
     * 
     * @generated
     */
    public CampaignTemplateDAO getRepository() {
        return repository;
    }



}
