package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping()
    public String list(Model model){
        model.addAttribute("productList",iProductService.findAll());
        return "/list";
    }
    @RequestMapping("/{id}/delete")
    public String showFormDelete(@PathVariable int id, Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "/delete";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam int id){
        iProductService.delete(id);
        return "redirect:/";
    }
    @RequestMapping("/{id}/view")
    public  String showFormView(@PathVariable int id,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "/view";
    }
    @RequestMapping("/{id}/edit")
    public String showFormEdit(@PathVariable int id,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "/edit";
    }
    @RequestMapping("/edit")

    public String edit(Product product){
        iProductService.update(product);
        return "redirect:/";
    }
    @RequestMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("product",new Product());
        return "/add";
    }
    @PostMapping("/save")

    public String add(Product product){
        iProductService.update(product);
        return "redirect:/";
    }
    @RequestMapping("/search")

    public String searchProduct(@RequestParam String name ,Model model){
         model.addAttribute("productList",iProductService.searchByName(name));
        return "/list";
    }
// Đối tượng thì dung @ModelAttribute
// thuộc tính @RequestParam
}

