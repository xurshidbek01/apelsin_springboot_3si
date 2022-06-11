package com.example.apelsin_springboot_3si.repository;

import com.example.apelsin_springboot_3si.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    // save delete find


}
