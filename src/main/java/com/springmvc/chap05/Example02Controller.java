package com.springmvc.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/exam02", method = RequestMethod.GET)
public class Example02Controller {

    @RequestMapping
    public void requestMethod(){
        System.out.println("@Controller 02 예제입니다.");
    }
}
