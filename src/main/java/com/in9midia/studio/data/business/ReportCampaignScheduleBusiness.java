package com.in9midia.studio.data.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import com.in9midia.studio.data.dao.*;
import com.in9midia.studio.data.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de ReportCampaignScheduleBusiness
 * 
 * @generated
 **/
@Service("ReportCampaignScheduleBusiness")
public class ReportCampaignScheduleBusiness {

    /**
     * Instância da classe ReportCampaignScheduleDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ReportCampaignScheduleDAO")
    protected ReportCampaignScheduleDAO repository;

    /**
     * Método de acesso ao ReportCampaignScheduleDAO
     * 
     * @generated
     */
    public ReportCampaignScheduleDAO getRepository() {
        return repository;
    }



}
