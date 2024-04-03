package com.webshop.npwebshop.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.annotation.Order;

import javax.management.relation.Role;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount {
    private Integer id;

    private String login;

    private String password;

    private String city;

    private String address;

    private String avatar;

    private String channelPreferences;

    private List<Basket> baskets;

    private Role role;

    private List<Order> order;
}
