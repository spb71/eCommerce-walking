package com.shem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	@GetMapping("/default")
	public String display() {
		return "defaultPage";
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcomePage";
	}
	@GetMapping("/user")
	public String user() {
		return "userPage";
	}
	@GetMapping("/admin")
	public String admin() {
		return "adminPage";
	}
	@GetMapping("/manager")
	public String manager() {
		return "managerPage";
	}
	@GetMapping("/accessDenied")
	public String accessDenied() {
		return "accessDenied";
	}
}
