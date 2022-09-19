package com.example.blog.controller;

import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

  @Autowired
  private ICategoryService iCategoryService;

  @GetMapping("/category")
  public String listCategory(Model model){
      model.addAttribute("categoryList",iCategoryService.findAll());
      return "/list_category";
  }
}
