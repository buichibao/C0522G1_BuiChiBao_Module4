package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @RequestMapping("")
    public String index(Model model, @PageableDefault(value = 1, sort = "date", direction = Sort.Direction.DESC) Pageable pageable){
        model.addAttribute("blogList",iBlogService.findAll(pageable));
        model.addAttribute("categoryList",iCategoryService.findAll());
        return "index";
    }

    @RequestMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("blog",new Blog());
        return "/create";
    }
    @RequestMapping("/add")
    public String add(@ModelAttribute Blog blog){
        iBlogService.save(blog);
        return "redirect:/";
    }
    @RequestMapping("/{id}/delete")
    public String showFormDelete(@PathVariable int id, Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String deleteBlog(int id){
        iBlogService.remove(id);
        return "redirect:/";
    }
    @RequestMapping("/{id}/view")
    public String showView(@PathVariable int id, Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        return "/view";
    }
    @RequestMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        return "edit";
    }
    @GetMapping("/edit")
    public String editForm(@ModelAttribute  Blog blog){
        iBlogService.update(blog);
        return "redirect:/";
    }
}
