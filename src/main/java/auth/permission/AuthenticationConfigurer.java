package auth.permission;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.in9midia.studio.data.dao.UsuarioDAO;
import com.in9midia.studio.data.entity.Usuario;

@Component
public class AuthenticationConfigurer implements AuthenticationProvider {
	@Autowired
	private UsuarioDAO userRepository;

	public static final String ROLE_ADMIN_NAME = "Administrators";

	private UsernamePasswordAuthenticationToken authenticateDataBase(Authentication authentication)
			throws AuthenticationException {
		String name = authentication.getName();
		String rawPassword = authentication.getCredentials().toString();
		List<Usuario> users = userRepository.findByLogin(name, new PageRequest(0, 100));

		if (users.isEmpty())
			throw new UsernameNotFoundException("Usuário não encontrado!");

		Usuario user = users.get(0);

		if (true) {
			Set<GrantedAuthority> roles = new HashSet<>();
			roles.add(new SimpleGrantedAuthority("Administrators"));
			roles.add(new SimpleGrantedAuthority("Logged"));

			org.springframework.security.core.userdetails.User userDetails = new org.springframework.security.core.userdetails.User(
					user.getNome(), user.getSenha(), false, false, false, false, roles);
			UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(userDetails,
					user.getSenha(), roles);
			userToken.setDetails(userDetails);
			return userToken;
		} else {
			throw new BadCredentialsException("Usuário ou senha incorreta!");
		}
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		return authenticateDataBase(authentication);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}