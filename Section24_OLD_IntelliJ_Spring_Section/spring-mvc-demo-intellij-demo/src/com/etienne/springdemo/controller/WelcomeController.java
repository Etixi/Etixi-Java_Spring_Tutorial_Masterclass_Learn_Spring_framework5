package com.etienne.springdemo.controller;

import com.etienne.service.demo.WelcomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * Created by Etienne KOA.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String doWelcome(Model model) {
        // 1. Retrieve the processed data
        WelcomeService welcomeService = new WelcomeService();
        List<String> welcomeMessages = welcomeService.getWelcome("Tim Buchalka");

        // 2. Add data to the model
        model.addAttribute("myWelcomeMessage", welcomeMessages);

        // 3.  Return logical view name
        return "welcomeNew";
    }
}