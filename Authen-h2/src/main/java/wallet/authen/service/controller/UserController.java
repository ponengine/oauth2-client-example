package wallet.authen.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import wallet.authen.service.entity.Authorities;
import wallet.authen.service.entity.Users;
import wallet.authen.service.repository.AuthoritiesRepository;
import wallet.authen.service.repository.UserRepository;



@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AuthoritiesRepository authoritiesRepository;
	
	@Autowired
    private BCryptPasswordEncoder standardPasswordEncoder;
	@GetMapping("/getall")
	public Iterable<Users> getall(){
		return userRepository.findAll();
	}
	@PostMapping("/adduser")
	public String addUser(@RequestBody Users user){
		user.setPassword(standardPasswordEncoder.encode(user.getPassword()));
		Authorities ar = new Authorities();
		ar.setUsername(user.getUsername());
		ar.setAuthority("ROLE_USER");
		authoritiesRepository.save(ar);
		userRepository.save(user);
		return "success";
		
	}
}
