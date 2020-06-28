package com.pymesoft.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthenticationController {
	
	@GetMapping(path="/basicauth")
	public AuthentificationBean helloWorldBean() {
		return new AuthentificationBean("You are authenticated");
	}	
}
