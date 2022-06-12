package com.example.apelsin_springboot_3si.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // serial 1 talab oshirish
    private Integer id;

    @Column(length = 14)
    private String name;

    @ManyToOne
    private Category category;   // category_id

    @Column(length = 20)
    private String description;

    @Column(precision = 6,scale = 2)
    private BigDecimal price;

    @Column(length = 1024)
    private String photo;


}
