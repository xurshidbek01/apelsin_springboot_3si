package com.example.apelsin_springboot_3si.controller;

import com.example.apelsin_springboot_3si.dto.OrderDTO;
import com.example.apelsin_springboot_3si.repository.CustomerRepository;
import com.example.apelsin_springboot_3si.repository.OrderRepository;
import com.example.apelsin_springboot_3si.repository.ProductRepository;
import com.example.apelsin_springboot_3si.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.ManyToOne;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor    //  @Autowired qigan ishi qilyabdi menimcha
public class OrderController {
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    private final OrderService orderService;
    @GetMapping
    public String getListPage(Model model){
        model.addAttribute("list",orderRepository.findAll());   // findAll() metod JPA dan kelyabdi

        return "order/list";
    }

    @GetMapping("/add")
    public String getAddPage(Model model){
        model.addAttribute("customerList",customerRepository.findAll());
        model.addAttribute("productList",productRepository.findAll());
        return "order/add";
    }

    @PostMapping
    public String saveAddPage(@ModelAttribute OrderDTO orderDTO, Model model){
        orderService.add(orderDTO,model);
        model.addAttribute("list",orderRepository.findAll());
        return "order/list";
    }

}
