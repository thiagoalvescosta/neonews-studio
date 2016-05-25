package com.in9midia.studio.data;

import org.springframework.orm.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.*;


/**
 * Classe que configura os beans para persistencia
 * 
 * @author Usuário de Teste
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "com.in9midia.studio.data-EntityManagerFactory",
        transactionManagerRef = "com.in9midia.studio.data-TransactionManager"
)
class ComIn9midiaStudioDataConfiguration {
  

    @Bean(name="com.in9midia.studio.data-EntityManagerFactory")
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("com.in9midia.studio.data");
        return factoryBean;
    }

    @Bean(name = "com.in9midia.studio.data-TransactionManager")
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager(entityManagerFactory().getObject());
    }


}


