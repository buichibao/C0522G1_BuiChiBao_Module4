package com.example.controller;

import com.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EmployeeController {
    @RequestMapping("")
    public String home(){
        return "/index";
    }

    @RequestMapping("/create")
    public String addEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "/create";
    }

    @RequestMapping("add")
    public String display(@ModelAttribute Employee employee,Model model){
        model.addAttribute("employee",employee);
        return "/display";
    }
}
