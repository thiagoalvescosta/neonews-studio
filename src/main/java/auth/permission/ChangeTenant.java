package auth.permission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import security.business.UserBusiness;

/**
 * Controller responsável por gerir a troca de
 * senha do usuário através de serviço REST
 * 
 * @author Techne
 *
 */
@RestController
@RequestMapping(value = "/changeTenant")
@PreAuthorize("hasRole('Logged')")
public class ChangeTenant {

	@Autowired
	@Qualifier("UserBusiness")
	private UserBusiness userBusiness;

	@Autowired
	private TenantComponent tenant;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void post(final String id) throws Exception {
		tenant.setId(id);
	}
}