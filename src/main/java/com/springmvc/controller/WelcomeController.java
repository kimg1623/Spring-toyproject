package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET) // 클라이언트의 요청 URL이 /home인 경우 welcome()메서드 실행
    public String welcome(Model model){
        model.addAttribute("greeting", "Welcome to BookMarket");
        model.addAttribute("strapline", "Welcome to Web Shopping Mall!");
        return "welcome";
    }

}
