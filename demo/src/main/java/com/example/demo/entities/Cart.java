package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "cart")
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "orderTrackingNumber")
    private String orderTrackingNumber;
    @Column(name = "package_price")
    private BigDecimal package_price;
    @Column(name = "party_size")
    private int  party_size;
    @Column(name = "status")
    private StatusType status;
    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;
    @Column(name = "customer")
    private Customer customer;
    @ManyToOne(cascade = CascadeType.ALL)
    private Set<CartItem> cartItem;

    //constructors
    public Cart() {
    }

    public Cart(Long id, String orderTrackingNumber, BigDecimal package_price, int party_size, StatusType status, Date create_date, Date last_update, Customer customer, Set<CartItem> cartItem) {
        this.id = id;
        this.orderTrackingNumber = orderTrackingNumber;
        this.package_price = package_price;
        this.party_size = party_size;
        this.status = status;
        this.create_date = create_date;
        this.last_update = last_update;
        this.customer = customer;
        this.cartItem = cartItem;
    }
}
