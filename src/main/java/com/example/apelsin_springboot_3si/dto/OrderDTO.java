package com.example.apelsin_springboot_3si.dto;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class OrderDTO {
    private Integer customerId;   //kim
    private Integer productId;   // qaysi mahsulotdan
    private Short amount;        // nechta
}
