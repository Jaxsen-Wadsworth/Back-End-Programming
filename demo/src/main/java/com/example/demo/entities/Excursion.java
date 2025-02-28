package com.example.demo.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Excursion {
    private long id;
    private String excursion_title;
    private BigDecimal excusion_price;
    private String image_URL;
    private Date create_date;
    private  Date last_update;
    private Vacation vacation;
    private Set<CartItem> cartItems;

    //constructors

    public Excursion() {
    }

    public Excursion(long id, String excursion_title, BigDecimal excusion_price, String image_URL, Date create_date, Date last_update, Vacation vacation, Set<CartItem> cartItems) {
        this.id = id;
        this.excursion_title = excursion_title;
        this.excusion_price = excusion_price;
        this.image_URL = image_URL;
        this.create_date = create_date;
        this.last_update = last_update;
        this.vacation = vacation;
        this.cartItems = cartItems;
    }

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExcursion_title() {
        return excursion_title;
    }

    public void setExcursion_title(String excursion_title) {
        this.excursion_title = excursion_title;
    }

    public BigDecimal getExcusion_price() {
        return excusion_price;
    }

    public void setExcusion_price(BigDecimal excusion_price) {
        this.excusion_price = excusion_price;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
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

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    public Set<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
