package com.example.apelsin_springboot_3si.repository;

import com.example.apelsin_springboot_3si.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    // save delete find


}
