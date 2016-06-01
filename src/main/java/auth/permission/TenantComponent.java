package auth.permission;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;

@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, value = "session")
public class TenantComponent {

	private String id = "9A59F97E-08E0-40B7-8408-4FCCEBC78C86";

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

}
