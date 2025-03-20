package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "excursion_cartitem")
@Entity
@Getter
@Setter
public class ExcursionCartItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "cart_item_id")
    private CartItem cartItem;
    @Id
    @ManyToOne
    @JoinColumn(name = "excursion_id")
    private Excursion excursion;
}
