package com.webshop.npwebshop.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer id;

    private String name;

    private String description;
    private String image;

    private BigDecimal price;

    private String type;

    private Integer stockQuantity;

    private Category category;

    private Author author;

    private List<OrderLine> orderLine;

}
