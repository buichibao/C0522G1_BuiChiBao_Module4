package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public String showList(Model model){
        model.addAttribute("productList",iProductService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String addProduct(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String saveProduct(@ModelAttribute  Product product , RedirectAttributes redirectAttributes){
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("mess","successfully added new");
        return "redirect:/";
    }
    @GetMapping("/{id}/view")
    public String viewProduct(@PathVariable int id,Model model){
        Product product = iProductService.findById(id);
        model.addAttribute("product",product);
        return "/view";
    }
    @GetMapping("/{id}/delete")
    public String deleteProduct(@PathVariable int id,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product,RedirectAttributes redirectAttributes){
        iProductService.remove(product.getId());
        redirectAttributes.addFlashAttribute("mess","successfully delete");
        return "redirect:/";
    }

}

