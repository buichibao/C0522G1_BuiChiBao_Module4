package com.example.blog.controller;

import com.example.blog.model.Category;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

  @Autowired
  private ICategoryService iCategoryService;

  @GetMapping("/category")
  public String listCategory(Model model){
      model.addAttribute("categoryList",iCategoryService.findAll());
      return "/list_category";
  }
  @GetMapping("/{id}/deleteCategory")
  public String showFormDelete(@PathVariable int id,Model model){
      model.addAttribute("category",iCategoryService.findById(id));
      return "/delete_category";
  }
  @PostMapping("/deleteCategory")
    public String deleteCategory(int id){
     iCategoryService.remove(id);
     return "redirect:/category";
  }
  @GetMapping("/createCategory")
    public String addCategory(@ModelAttribute Model model){
      model.addAttribute("category",new Category());
      return "/create_category";
  }
  @PostMapping("/addCategory")
    public String saveCategory(Category category){
      iCategoryService.save(category);
      return "redirect:/category";
  }
    @GetMapping("/{id}/editCategory")
    public String showFormEdit(@PathVariable int id,Model model){
        model.addAttribute("category",iCategoryService.findById(id));
        return "edit_category";
    }
    @PostMapping("/editCategory")
    public String saveEdit(Category category){
      iCategoryService.update(category);
        return "redirect:/category";
    }
}
