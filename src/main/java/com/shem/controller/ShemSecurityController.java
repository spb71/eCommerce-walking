package com.shem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShemSecurityController {
	
	@GetMapping("/")
	public String getMyBusinessLogic() {
		return "Welcome SpringBoot Security";
	}
}
