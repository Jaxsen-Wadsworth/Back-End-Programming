package com.example.demo.entities;

import java.util.Date;
import java.util.Set;

public class CartItem {
    private long id;
    private Vacation vacation;
    private Set<Excursion> excursions;
    private Cart cart;
    private Date create_date;
    private Date last_update;

    //constructors
    public CartItem() {
    }

    public CartItem(long id, Vacation vacation, Set<Excursion> excursions, Cart cart, Date create_date, Date last_update) {
        this.id = id;
        this.vacation = vacation;
        this.excursions = excursions;
        this.cart = cart;
        this.create_date = create_date;
        this.last_update = last_update;
    }

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    public Set<Excursion> getExcursions() {
        return excursions;
    }

    public void setExcursions(Set<Excursion> excursions) {
        this.excursions = excursions;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
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
}
