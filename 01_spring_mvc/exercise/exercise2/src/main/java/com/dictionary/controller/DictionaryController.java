package com.dictionary.controller;

import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;

    @GetMapping("/")
    public String input(){
        return "/result";
    }

    @GetMapping("/result")
    public String trans(@RequestParam String xyz , Model model){
        String translate = iDictionaryService.translate(xyz);
        if(translate == null){
            model.addAttribute("result","Not fount!");
            return "/result";
        }
        model.addAttribute("result",translate);
        return "/result";
    }
}
