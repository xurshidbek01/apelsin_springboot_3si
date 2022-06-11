package com.example.apelsin_springboot_3si.service;

import com.example.apelsin_springboot_3si.entity.Category;
import com.example.apelsin_springboot_3si.entity.Detail;
import com.example.apelsin_springboot_3si.repository.CategoryRepository;
import com.example.apelsin_springboot_3si.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class DetailService {

    @Autowired
    DetailRepository detailRepository;

    public void getAll(Model model){
        List<Detail> detailList = detailRepository.findAll();
        model.addAttribute("list",detailList);
    }

    public void add(Model model, Detail detail) {
        detailRepository.save(detail);
        model.addAttribute("list", detailRepository.findAll());
    }
}
