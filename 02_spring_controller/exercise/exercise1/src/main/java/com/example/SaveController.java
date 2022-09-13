package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaveController {
    @GetMapping("/")
    public String formSave(){
        return "index";
    }

   @GetMapping("/save")
    public String save(@RequestParam (value = "choose", defaultValue = "Please choose") String[] strings, Model model){

            model.addAttribute("result",strings);

       return "index";
   }
}
