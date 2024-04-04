package com.webshop.npwebshop.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    private Integer id;

    private String name;

    private List<Product> products;
}
