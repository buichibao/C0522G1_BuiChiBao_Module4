package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping("/")
    public String model(Model model , ModelMap modelMap){
        model.addAttribute("model","Hello model");
        modelMap.addAttribute("modelMap","Hello modelMap");
        return "/index";
    }
    @GetMapping("/mav")
    public ModelAndView mav(){
        return  new ModelAndView("/index","modelAndView","Hello ModelAndView");
    }
}
