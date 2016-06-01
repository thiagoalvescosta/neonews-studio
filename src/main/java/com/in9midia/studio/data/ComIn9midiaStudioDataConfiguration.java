package com.in9midia.studio.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import auth.permission.MultitenantJpaTransactionManager;
import auth.permission.TenantEntityManagerFactory;

/**
 * Classe que configura os beans para persistencia
 * 
 * @author Usuário de Teste
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "com.in9midia.studio.data-EntityManagerFactory", transactionManagerRef = "com.in9midia.studio.data-TransactionManager")
class ComIn9midiaStudioDataConfiguration {

	@Bean(name = "com.in9midia.studio.data-EntityManagerFactory")
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean() {

			@Override
			protected javax.persistence.EntityManagerFactory createNativeEntityManagerFactory()
					throws javax.persistence.PersistenceException {
				return new TenantEntityManagerFactory(super.createNativeEntityManagerFactory());
			}
		};

		factoryBean.setPersistenceUnitName("com.in9midia.studio.data");
		return factoryBean;
	}

	@Bean(name = "com.in9midia.studio.data-TransactionManager")
	public PlatformTransactionManager transactionManager() {
		return new MultitenantJpaTransactionManager();
	}

}
