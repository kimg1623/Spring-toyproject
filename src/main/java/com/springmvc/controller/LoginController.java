package com.springmvc.controller;

import com.springmvc.domain.Book;
import com.springmvc.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
public class LoginController {

    @GetMapping("/login") // security-context에서 설정한 login-page uri 매핑
    public String login(){
        return "login";
    }

    @GetMapping("/loginfailed") // authentication-failure-url="/loginfailed"
    public String loginerror(Model model){
        model.addAttribute("error", "ture");
        return "login";
    }


}
