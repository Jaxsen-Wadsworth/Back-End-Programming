package com.example.demo.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Vacation {
    private long id;
    private String vacation_title;
    private String description;
    private BigDecimal travel_price;
    private String image_URL;
    private Date create_date;
    private Date last_update;
    private Set<Excursion> excursions;

    //constructors

    public Vacation() {
    }

    public Vacation(long id, String vacation_title, String description, BigDecimal travel_price, String image_URL, Date create_date, Date last_update, Set<Excursion> excursions) {
        this.id = id;
        this.vacation_title = vacation_title;
        this.description = description;
        this.travel_price = travel_price;
        this.image_URL = image_URL;
        this.create_date = create_date;
        this.last_update = last_update;
        this.excursions = excursions;
    }

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVacation_title() {
        return vacation_title;
    }

    public void setVacation_title(String vacation_title) {
        this.vacation_title = vacation_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTravel_price() {
        return travel_price;
    }

    public void setTravel_price(BigDecimal travel_price) {
        this.travel_price = travel_price;
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

    public Set<Excursion> getExcursions() {
        return excursions;
    }

    public void setExcursions(Set<Excursion> excursions) {
        this.excursions = excursions;
    }
}
