package com.dictionary.controller;

import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {

    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping("/input")
    public String input(){
        return "result";
    }
    @GetMapping("/enter")
    public String trans(@RequestParam String xyz , Model model){
        model.addAttribute("result",xyz);
        return "/result";
    }
}
