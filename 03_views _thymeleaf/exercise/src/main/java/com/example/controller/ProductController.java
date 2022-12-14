package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


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
    public String saveProduct(@ModelAttribute Product product , RedirectAttributes redirectAttributes){
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
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes){
        iProductService.remove(id);
        redirectAttributes.addFlashAttribute("mess","successfully delete");
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable int id,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "/update";
    }
    @PostMapping("/edit")
    public String saveEdit(@ModelAttribute Product product,RedirectAttributes redirectAttributes){
        iProductService.update(product);
        redirectAttributes.addFlashAttribute("mess","successfully edit");
        return "redirect:/";
    }

    @GetMapping("/searchProduct")
    public ModelAndView searchProduct(@RequestParam String name) {
        List<Product> products = iProductService.searchProduct(name);
        return new ModelAndView("list", "productList" , products);
    }
}

