package com.example.apelsin_springboot_3si.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "category")  // "category" aynan class bilan bir xil bolishi shartmas
public class Category {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // serial
    private Integer id;

    @Column(length = 250)
    private String name;

    @OneToMany(mappedBy = "category") //table ochma deyishlik un
    private List<Product> productList;
}
