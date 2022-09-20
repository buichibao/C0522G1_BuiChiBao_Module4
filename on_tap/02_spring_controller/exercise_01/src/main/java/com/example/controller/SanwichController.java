package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SanwichController {

    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/choose")
    public String sandwich(@RequestParam(value = "choose",defaultValue = "Please choose") String[] choose , Model model){
          model.addAttribute("resultList",choose);
          return "/index";
    }
}
