package com.example.apelsin_springboot_3si.repository;

import com.example.apelsin_springboot_3si.entity.Category;
import com.example.apelsin_springboot_3si.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
    // save delete find


}
