package com.example.form.controller;

import com.example.form.model.User;
import com.example.form.model.UserDTO;
import com.example.form.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping()
    public String showList(Model model){
        model.addAttribute("listUser",iUserService.findAll());
        return "/index";
    }

    @GetMapping("/create")
    public String showForm(Model model){
        model.addAttribute("userDTO",new UserDTO());
        return "/create";
    }
    @PostMapping("/saveCreate")
    public String saveUser(@ModelAttribute @Validated UserDTO userDTO , BindingResult bindingResult, RedirectAttributes redirectAttributes){

        new UserDTO().validate(userDTO,bindingResult);

        if(bindingResult.hasFieldErrors()){
            return "/create";
        }else {
            User user = new User();

            BeanUtils.copyProperties(userDTO,user);
            iUserService.save(user);
            redirectAttributes.addFlashAttribute("message","Successfully added new");
        }
          return "redirect:/";
    }
}
