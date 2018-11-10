package com.myks790.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String get(){
        return "home";
    }

    @GetMapping("/admin")
    public String index(){
        return "admin";
    }
}
