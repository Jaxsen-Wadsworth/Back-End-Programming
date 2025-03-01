package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "cart")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "country_name")
    private String country_name;
    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    private Set<Division> divisions;

    //constructors
    public Country() {
    }

    public Country(Long id, String country_name, Date create_date, Date last_update, Set<Division> divisions) {
        this.id = id;
        this.country_name = country_name;
        this.create_date = create_date;
        this.last_update = last_update;
        this.divisions = divisions;
    }

    //setters and getters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
