package com.etienne.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etienne.springdemo.service.GenericWelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		// 1. Retrieving the processed data
		// WelcomeServicervice welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Etienne KOA");
		
		// 2.  Add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		// 3.  Return logical view name
		return "welcomeNew";
	}

}
