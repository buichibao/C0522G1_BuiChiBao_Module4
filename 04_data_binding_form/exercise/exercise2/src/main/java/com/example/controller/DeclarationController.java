package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeclarationController {

    @GetMapping("/")
    public String showForm(){
        return "/index";
    }
}
