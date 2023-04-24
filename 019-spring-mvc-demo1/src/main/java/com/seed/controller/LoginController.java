package com.seed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
	@RequestMapping(path = "/login")
	public String login() {
		//List<Employee> emlp
		return "loginSuccess";
	}
	
	@RequestMapping(path="/home")
	public String home() {
		return "homePage";
	}

}
