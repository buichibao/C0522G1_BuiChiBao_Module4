package com.example.controller;

import com.example.model.Customer;
import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("customers",iCustomerService.findAll());
        return "/index";
    }

    @RequestMapping("/{id}/view")
    public String view(@PathVariable int id, Model model){
        model.addAttribute("customer",iCustomerService.findById(id));
        return "/view";
    }

    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable int id,Model model){
        model.addAttribute("customer",iCustomerService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String deleteCustomer(Customer customer, RedirectAttributes redirectAttributes){
        iCustomerService.remove(customer.getId());
//        redirectAttributes.addFlashAttribute("mess","successful delete"+customer.getName());
        return "redirect:/";
    }
}
