package com.example.apelsin_springboot_3si.service;

import com.example.apelsin_springboot_3si.entity.Category;
import com.example.apelsin_springboot_3si.entity.Customer;
import com.example.apelsin_springboot_3si.repository.CategoryRepository;
import com.example.apelsin_springboot_3si.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void getAll(Model model){
        List<Customer> customerList = customerRepository.findAll();
        model.addAttribute("list",customerList);
    }

    public void add(Model model, Customer customer) {
        customerRepository.save(customer);
        model.addAttribute("list", customerRepository.findAll());
    }
}
