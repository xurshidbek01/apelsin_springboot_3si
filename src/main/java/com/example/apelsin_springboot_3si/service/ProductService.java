package com.example.apelsin_springboot_3si.service;

import com.example.apelsin_springboot_3si.dto.ProductDTO;
import com.example.apelsin_springboot_3si.entity.Category;
import com.example.apelsin_springboot_3si.entity.Product;
import com.example.apelsin_springboot_3si.repository.CategoryRepository;
import com.example.apelsin_springboot_3si.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public void getAll(Model model){
        List<Product> productList = productRepository.findAll();
        model.addAttribute("list",productList);
    }

    public void add(Model model, ProductDTO productDTO){
        Product product = new Product();
        product.setDescription(productDTO.getDescription());
        product.setName(productDTO.getName());
        product.setPrice(BigDecimal.valueOf(productDTO.getPrice()));

        product.setCategory(categoryRepository.getById(productDTO.getCatId()));
        productRepository.save(product);
        model.addAttribute("list",productRepository.findAll());

    }

    public Product getById(int id){
        return productRepository.findById(id).orElseThrow();
    }

    public void deleteById(int id){
        productRepository.deleteById(id);
    }

}
