package com.example.apelsin_springboot_3si.controller;

import com.example.apelsin_springboot_3si.entity.Category;
import com.example.apelsin_springboot_3si.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @GetMapping
    public String getAll(Model model) {
        categoryService.getAll(model);
        return "category/list"; //page nomi -> list.html templates
    }

    @GetMapping("/add")
    public String getAddPage() {
//        model.addAttribute("category", null);
        return "category/add"; //page nomi -> list.html templates
    }

    @PostMapping("/add")
    public String getSavePage(@ModelAttribute Category category, Model model) {
        categoryService.add(model, category);
        return "category/list";
    }

    @GetMapping("/edit/{id}")
    public String getEditPage(){return "category/edit";}
}
