package app2.admin.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@GetMapping("/message")
	public String msg(){
		return "this admin access";
	}
}
