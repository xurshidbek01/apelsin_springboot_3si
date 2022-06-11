package com.example.apelsin_springboot_3si.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // serial 1 talab oshirish
    private Integer id;

    @OneToOne
    private Order order;

    @Column(nullable = false)
    private Timestamp time;

    @Column(nullable = false,precision = 8,scale = 2)
    private BigDecimal amount;

    @CreatedDate  //sistemadan ayni vaqti
    private Date issued;

    //xozirgi ga 3kun+

    private Date due;

}
