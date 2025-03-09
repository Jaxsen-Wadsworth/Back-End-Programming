package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
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
    @JoinColumn(name = "country", nullable = false)
    private Country country;
    @Column(name = "country_id")
    private Long country_ID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
    private Set<Customer> customers = new HashSet<>();

    //constructors
    public void add(Customer customer){
        if(customer != null){
            if(customers == null) {
                customers = new HashSet<>();
            }
            customers.add(customer);
            customer.setDivision(this);
        }
    }

    public Division() {
    }

    //bug fix
    public Division(String url) {
        this.id = Long.parseLong(url.substring(url.lastIndexOf('/')+1));

    }

    public Division(Long id, String division_name, Date create_date, Date last_update, Country country, Long country_ID, Set<Customer> customer) {
        this.id = id;
        this.division_name = division_name;
        this.create_date = create_date;
        this.last_update = last_update;
        this.country = country;
        this.country_ID = country_ID;
        this.customers = customer;
    }
}
