package com.example.controller;

import com.example.model.Setting;
import com.example.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SettingController {
    @Autowired
    private ISettingService iSettingService;


    //      @GetMapping("")
//          public String showList(@RequestParam Model model){
//          model.addAttribute("listSetting",iSettingService.findSettingAll());
//          return "/index";
//      }

    @GetMapping("")
    public ModelAndView showList() {
        return new ModelAndView("/index", "listSetting", iSettingService.findSettingAll());
    }

    @GetMapping("/update")
    public String showForm(@RequestParam int id,Model model){
        model.addAttribute("listSetting",iSettingService.findById(id));
        model.addAttribute("listSize",iSettingService.findSize());
        model.addAttribute("listLanguage",iSettingService.findLanguages());
        return "/show";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Setting setting, RedirectAttributes redirectAttributes){
        iSettingService.update(setting);
        redirectAttributes.addFlashAttribute("message","Cập nhật Email Thành Công");
        return "redirect:/";
    }

}
