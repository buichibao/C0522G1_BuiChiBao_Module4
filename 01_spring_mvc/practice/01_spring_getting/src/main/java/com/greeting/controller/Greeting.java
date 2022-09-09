package com.greeting.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Greeting {
    @GetMapping("/greeting")
    // name1 phải cùng tên với bên nhập ở input
    public String getting(@RequestParam String name1, Model model){
        model.addAttribute("name",name1);
        return "/greeting";
    }
    @GetMapping("/")
    public String home(){
        return "/index";
    }
}
