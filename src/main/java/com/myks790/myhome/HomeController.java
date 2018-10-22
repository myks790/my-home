package com.myks790.myhome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String get(){
        return "home";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}