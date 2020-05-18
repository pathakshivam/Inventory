package io.pathak.springbootsecurity.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SpringSecurityResource {
	
	@RequestMapping("/")
	public String home() {
		return "<h1>Welcome</h1>";
	}
}
