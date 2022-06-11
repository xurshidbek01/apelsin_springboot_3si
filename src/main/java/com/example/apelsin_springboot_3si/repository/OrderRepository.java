package com.example.apelsin_springboot_3si.repository;

import com.example.apelsin_springboot_3si.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    // save delete find


}
