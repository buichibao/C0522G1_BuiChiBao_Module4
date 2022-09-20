package com.example.controller;

import com.example.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerDictionary {

    @Autowired
    IDictionaryService iDictionaryService;
     @RequestMapping("/")
     public String string(){
         return "/home";
     }
     @RequestMapping("/change")
    public String change(@RequestParam String eng, Model model){
         model.addAttribute("result",iDictionaryService.change(eng));
         return "/home";
     }

}
