package com.example.demo.entities;

import java.util.Date;
import java.util.Set;

public class Division {
    private long id;
    private String division_name;
    private Date create_date;
    private Date last_update;
    private Country country;
    private long country_id;
    private Set<Customer> customer;

    //constructors
    public Division() {
    }

    public Division(long id, String division_name, Date create_date, Date last_update, Country country, long country_id, Set<Customer> customer) {
        this.id = id;
        this.division_name = division_name;
        this.create_date = create_date;
        this.last_update = last_update;
        this.country = country;
        this.country_id = country_id;
        this.customer = customer;
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDivision_name() {
        return division_name;
    }

    public void setDivision_name(String division_name) {
        this.division_name = division_name;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(long country_id) {
        this.country_id = country_id;
    }

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }
}
