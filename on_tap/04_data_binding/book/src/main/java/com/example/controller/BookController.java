package com.example.controller;

import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping("")
    public  String listBook(){
//        model.addAttribute("listBook",iBookService.findAll());
        return "list_book";
    }
}
