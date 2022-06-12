package com.example.apelsin_springboot_3si.controller;

import com.example.apelsin_springboot_3si.dto.ProductDTO;
import com.example.apelsin_springboot_3si.repository.CategoryRepository;
import com.example.apelsin_springboot_3si.repository.ProductRepository;
import com.example.apelsin_springboot_3si.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
private final ProductService productService;
private final CategoryRepository categoryRepository;
    @GetMapping
    public String getAll(Model model){
        productService.getAll(model);
        return "product/list";  //list nomi list.html templetes ni ichid
    }

    @GetMapping("/add")
    public String getAddPage(Model model){
        model.addAttribute("categoryList",categoryRepository.findAll());
        return "product/add";
    }

    @PostMapping("/add")
    public String getSavePage(@ModelAttribute ProductDTO productDTO,Model model){
        productService.add(model,productDTO);
        return "product/list";

    }

}
