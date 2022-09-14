package com.example.controller;

import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("customerList", iCustomerService.findAll());
        return "index";
    }

    @GetMapping("/nextdemo")
    private String nextdemo(){
        return "demo";
    }

    @GetMapping("/demo")
    private String demo(){
        return "index";
    }
}
