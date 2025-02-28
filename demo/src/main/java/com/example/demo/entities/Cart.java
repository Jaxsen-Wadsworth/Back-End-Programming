package com.example.demo.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Cart {
    private long id;
    private String orderTrackingNumber;
    private BigDecimal package_price;
    private int  party_size;
    private StatusType status;
    private Date create_date;
    private Date last_update;
    private Customer customer;
    private Set<CartItem> cartItem;

    //constructors
    public Cart() {
    }

    public Cart(long id, String orderTrackingNumber, BigDecimal package_price, int party_size, StatusType status, Date create_date, Date last_update, Customer customer, Set<CartItem> cartItem) {
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

    //getter and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public BigDecimal getPackage_price() {
        return package_price;
    }

    public void setPackage_price(BigDecimal package_price) {
        this.package_price = package_price;
    }

    public int getParty_size() {
        return party_size;
    }

    public void setParty_size(int party_size) {
        this.party_size = party_size;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<CartItem> getCartItem() {
        return cartItem;
    }

    public void setCartItem(Set<CartItem> cartItem) {
        this.cartItem = cartItem;
    }
}
