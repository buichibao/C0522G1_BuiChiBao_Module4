package com.example.controller;

import com.example.dao.UserDao;
import com.example.model.Login;
import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("")
    public String login(Model model){
        model.addAttribute("login",new Login());
        return "/index";
    }
    @PostMapping("loadding")
    public ModelAndView welcome(@ModelAttribute("login") Login login){
        User user = UserDao.checkLogin(login);
        if(user==null){
            return new ModelAndView("/noWelcome","error","errorLogin");
        }else {
            return new ModelAndView("/welcome","user",user);
        }
    }
}
