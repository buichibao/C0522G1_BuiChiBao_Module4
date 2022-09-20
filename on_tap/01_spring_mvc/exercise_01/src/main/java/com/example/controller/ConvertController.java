package com.example.controller;

import com.example.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @Autowired
    IConvertService iConvertService;

    @RequestMapping("/")
    public  String  home(){
        return "/index";
    }
//    C1 : Model giống ModelMap
//    @RequestMapping("/convert")
//    public String change(@RequestParam double usd , Model model){
//        model.addAttribute("result",iConvertService.convertMoney(usd));
//        return "/index";
//    }
//    C2
//    @RequestMapping("/convert")
//    public ModelAndView change(@RequestParam double usd){
//        return new ModelAndView("/index","result",iConvertService.convertMoney(usd));
//    }
//    C3
      @RequestMapping("/convert")
      public String change(@RequestParam double usd,ModelMap modelMap){
        modelMap.addAttribute("result",iConvertService.convertMoney(usd));
        return "/index";
      }

}
