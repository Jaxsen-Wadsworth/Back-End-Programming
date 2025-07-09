package com.example.demo.services;

import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Cart cart;
    private Set<CartItem> cartItems;
}
