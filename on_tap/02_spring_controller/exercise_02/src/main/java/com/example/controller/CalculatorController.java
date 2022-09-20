package com.example.controller;

import com.example.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    ICalculatorService iCalculatorService;

    @RequestMapping("/")
    public String home(){
        return "/home";
    }
    @RequestMapping("/calculation")
    public String convert(@RequestParam String number1, String number2 , String opera ,Model model){
        model.addAttribute("result",iCalculatorService.convert(number1,number2,opera));
        return "/home";
    }
}
