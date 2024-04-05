package com.webshop.npwebshop.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer id;

    private BigDecimal totalPrice;

    private String deliveryAddress;

    private LocalDate creationDate;

    private Integer orderClient;

    private String orderStatus;

    private UserAccount userAccount;
}
