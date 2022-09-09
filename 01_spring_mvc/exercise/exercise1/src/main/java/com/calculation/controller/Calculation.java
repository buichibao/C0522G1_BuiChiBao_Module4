package com.calculation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculation {
    @GetMapping("/")
    public String form(){
        return "/result" ;
    }

    @GetMapping("/calculation")
    public String convert(@RequestParam Double number, Model model){
        model.addAttribute("result",(number*230000));
        return "/result" ;
    }

}
