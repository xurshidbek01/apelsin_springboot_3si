package com.example.apelsin_springboot_3si.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDTO {
    //frontdan keladigan fieldlar bilan to'ladi
    private String name;
    private Double price;
    private String photo;
    private String description;
    private Integer catId; //unikal
}
