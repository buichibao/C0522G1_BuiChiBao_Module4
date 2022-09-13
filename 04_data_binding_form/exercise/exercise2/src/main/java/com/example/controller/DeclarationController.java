package com.example.controller;

import com.example.model.Declaration;
import com.example.service.IDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.ArrayList;
import java.util.List;

@Controller
public class DeclarationController {
    @Autowired
    private IDeclarationService iDeclarationService;

    @GetMapping("/")
    public String showForm(Model model){
        List<String> birthdayList = new ArrayList<>();
        List<String> countryList = new ArrayList<>();
        List<String> genderList = new ArrayList<>();
        List<String> travelList = new ArrayList<>();

        travelList.add("máy bay");
        travelList.add("tàu thuyền");
        travelList.add("ô tô");
        travelList.add("khác");

        genderList.add("Nam");
        genderList.add("Nữ");


        birthdayList.add("1990");
        birthdayList.add("1991");
        birthdayList.add("1992");
        birthdayList.add("1993");
        birthdayList.add("1994");
        birthdayList.add("1995");
        birthdayList.add("1996");
        birthdayList.add("1997");
        birthdayList.add("1998");
        birthdayList.add("1999");
        birthdayList.add("2000");
        birthdayList.add("2001");
        birthdayList.add("2002");

        countryList.add("Việt Nam");
        countryList.add("Lào");
        countryList.add("Thái Lan");

        model.addAttribute("travelList",travelList);
        model.addAttribute("genderList",genderList);
        model.addAttribute("countryList", countryList);
        model.addAttribute("birthdayList", birthdayList);
        model.addAttribute("declaration", new Declaration());

        return "/index";
    }


//    @GetMapping("/")
//    public ModelAndView showDeclaration(){
//        return new ModelAndView("/index","declarationList",iDeclarationService.findAll());
//    }
//
    @GetMapping("/save")
    public String formDeclaration(Model model) {
        model.addAttribute("declaration",new Declaration());
        return "/list";
    }
//
    @PostMapping("/save")
    public String declaration(@ModelAttribute Declaration declaration, RedirectAttributes redirectAttributes) {
        iDeclarationService.save(declaration);
        redirectAttributes.addFlashAttribute("masse","Cập nhật thông tin thành công !!!");
        return "redirect:/";
    }
}
