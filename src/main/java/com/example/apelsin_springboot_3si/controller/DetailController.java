package com.example.apelsin_springboot_3si.controller;

import com.example.apelsin_springboot_3si.entity.Category;
import com.example.apelsin_springboot_3si.entity.Detail;
import com.example.apelsin_springboot_3si.service.CategoryService;
import com.example.apelsin_springboot_3si.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    DetailService detailService;
    @GetMapping
    public String getAll(Model model) {
        detailService.getAll(model);
        return "detail/list"; //page nomi -> list.html templates
    }

    @GetMapping("/add")
    public String getAddPage() {
//        model.addAttribute("category", null);
        return "detail/add"; //page nomi -> list.html templates
    }

    @PostMapping("/add")
    public String getSavePage(@ModelAttribute Detail detail, Model model) {
        detailService.add(model, detail);
        return "category/list";
    }
}
