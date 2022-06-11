package com.example.apelsin_springboot_3si.repository;

import com.example.apelsin_springboot_3si.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // busiz ham ishlaydi
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    // save delete find


}
