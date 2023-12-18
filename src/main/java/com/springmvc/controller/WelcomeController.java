package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/home")
    public String welcome(Model model){
        model.addAttribute("greeting", "Welcome to BookMarket");
        model.addAttribute("strapline", "Welcome to Shopping Mall");
        return "welcome";

    }
}
