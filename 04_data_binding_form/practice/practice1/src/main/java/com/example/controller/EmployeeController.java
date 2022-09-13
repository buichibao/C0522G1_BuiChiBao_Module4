package com.example.controller;

import com.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/")
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "/create";
    }
    @PostMapping("list")
    public String listEmployee(@ModelAttribute ("employee") Employee employee, ModelMap modelMap){
        modelMap.addAttribute("id",employee.getId());
        modelMap.addAttribute("name",employee.getName());
        modelMap.addAttribute("contactNumber",employee.getContactNumber());
        return "/employee";
    }
}
