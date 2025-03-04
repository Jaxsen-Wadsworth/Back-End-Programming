package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "division")
@Getter
@Setter
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "division_name")
    private String division_name;
    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;
    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
    @Column(name = "country_id")
    private Long country_ID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
    private Set<Customer> customer;

    //constructors
    public Division() {
    }

    public Division(Long id, String division_name, Date create_date, Date last_update, Country country, Long country_ID, Set<Customer> customer) {
        this.id = id;
        this.division_name = division_name;
        this.create_date = create_date;
        this.last_update = last_update;
        this.country = country;
        this.country_ID = country_ID;
        this.customer = customer;
    }
}
