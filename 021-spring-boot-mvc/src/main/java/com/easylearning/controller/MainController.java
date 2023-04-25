package com.easylearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easylearning.entity.Project;

@Controller
public class MainController {
	
	@RequestMapping(value = "test")
	@ResponseBody
	public String test() {
		return "test";
	}
	
	@RequestMapping(value="sample")
	public String samplePage() {
		return "sample";
	}
	
	@GetMapping({"/","/login"})
	public String login() {
		return "login";
	}
	
	@GetMapping("/user/register")
	public String registerUser() {
		return "login";
	}
	
	@RequestMapping(value= { "/home"})
	public String homepage(Model model) {
		
		Project project = new Project();
		project.setName("MVC Project");
		project.setSponsor("Seed Infotech");
		project.setDescription("Help to implement the project management project");
		model.addAttribute("currentProject", project);
		return "home";
	}
	
	
	@GetMapping("/a")
	public String aPage() {
		return  "a";
	}

}
