package wallet.authen.service;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@EnableAuthorizationServer
@EnableResourceServer
public class AuthenticationApplication {
	@RequestMapping("/user")
	@PreAuthorize("#oauth2.hasScope('read') and hasRole('ROLE_ADMIN')")
	public Principal user(Principal user) {
		return user;
	}

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}
}
