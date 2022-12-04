package com.example.controller;

import com.example.model.Student;
import com.example.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StudentController {

    @Autowired
    public IStudentService iStudentService;

    @RequestMapping("")
    public String list(Model model){
        model.addAttribute("studentList",iStudentService.findAll());
        return  "/list";
    }

    @RequestMapping("/create")
    public String addStudent(Model model){
        model.addAttribute("student",new Student());
        return "/create";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes){
        iStudentService.save(student);
        redirectAttributes.addFlashAttribute("mess","successful new creation "+student.getName());
        return "redirect:/";
    }

    @RequestMapping("/search")
    public String searchStudent(@RequestParam String name,Model model){
        model.addAttribute("studentList",iStudentService.findByName(name));
        return "/list";
    }


}
