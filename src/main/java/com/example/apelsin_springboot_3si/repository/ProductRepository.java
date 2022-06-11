package com.example.apelsin_springboot_3si.repository;

import com.example.apelsin_springboot_3si.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    // save delete find


}
