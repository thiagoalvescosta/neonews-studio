package auth.permission;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.EntityManagerHolder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.eclipse.persistence.config.EntityManagerProperties;

/**
 * Classe que representa ...
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @since 2016-05-31
 *
 */

public class MultitenantJpaTransactionManager extends JpaTransactionManager {

	@Autowired
	private TenantComponent tenant;

	@Override
	protected void doBegin(Object transaction, TransactionDefinition definition) {
		super.doBegin(transaction, definition);
		TenantEntityManagerFactory.TENANT.set(tenant.getId());

		final EntityManagerHolder emHolder = (EntityManagerHolder) TransactionSynchronizationManager
				.getResource(getEntityManagerFactory());
		final EntityManager em = emHolder.getEntityManager();
		final String tenantId = tenant.getId();

		if (tenantId != null) {
			em.setProperty("multitenancy.tenant-id", tenantId);
		}

	}

	@Override
	protected EntityManager createEntityManagerForTransaction() {
		return super.createEntityManagerForTransaction();
	}
}