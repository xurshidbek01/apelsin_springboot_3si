package com.example.apelsin_springboot_3si.repository;

import com.example.apelsin_springboot_3si.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail,Integer> {
    // save delete find


}
