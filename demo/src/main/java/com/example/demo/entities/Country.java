package com.example.demo.entities;

import java.util.Date;
import java.util.Set;

public class Country {
    private long id;
    private String country_name;
    private Date create_date;
    private Date last_update;
    private Set<Division> divisions;

    //constructors
    public Country() {
    }

    public Country(long id, String country_name, Date create_date, Date last_update, Set<Division> divisions) {
        this.id = id;
        this.country_name = country_name;
        this.create_date = create_date;
        this.last_update = last_update;
        this.divisions = divisions;
    }

    //setters and getters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
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

    public Set<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(Set<Division> divisions) {
        this.divisions = divisions;
    }
}
