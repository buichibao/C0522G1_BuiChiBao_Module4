package com.example.controller;

import com.example.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {
   @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/convert")
    public String change(@RequestParam String num1, String num2 , String opera, Model model) {
        String result = iCalculatorService.convert(num1,num2,opera);
        model.addAttribute("result",result);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        return "index";
    }
}
