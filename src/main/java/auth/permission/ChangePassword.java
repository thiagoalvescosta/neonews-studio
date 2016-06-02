package auth.permission;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controller responsável por gerir a troca de
 * senha do usuário através de serviço REST
 * 
 * @author Techne
 *
 */
@RestController
@RequestMapping(value = "/changePassword")
@PreAuthorize("hasRole('Logged')")
public class ChangePassword {
  
  private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
  
  @RequestMapping(method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.OK)
  public void post(final String oldPassword, final String newPassword, final String newPasswordConfirmation)
          throws Exception {
  }
}