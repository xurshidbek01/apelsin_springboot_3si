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
@Table(name = "detail")
public class Detail {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ord_id")
    private Order order;

    @ManyToOne   // table ichida ustun ochadi
    @JoinColumn(name = "pr_id")
    private Product product;

    @Column(nullable = false)
    private Short quantity;
}
