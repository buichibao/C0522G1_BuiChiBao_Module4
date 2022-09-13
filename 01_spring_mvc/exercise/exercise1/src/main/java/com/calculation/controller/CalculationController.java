package com.calculation.controller;

import com.calculation.service.ICalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {
    @Autowired
    ICalculationService iCalculationService;
    @GetMapping("/")

    public String form(){
        return "/result" ;
    }

    @GetMapping("/calculation")
    public String convert(@RequestParam double number, Model model){
        double result = iCalculationService.convert(number);
        model.addAttribute("result",result);
        return "/result" ;
    }
}
