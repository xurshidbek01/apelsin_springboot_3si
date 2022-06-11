package com.example.apelsin_springboot_3si.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "customer")
public class Customer {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // serial 1 talab oshirish
    private Integer id;

    @Column(length = 14)
    private String name;

    @Column(length = 3)
    private String country;

    @Column(columnDefinition = "text")   // 255 tadan koproq belgi qabul qiladi
    private String address;

    @Column(length = 50)
    private String phone;
}
