package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "excursion")
@Getter
@Setter
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "excursion_title")
    private String excursion_title;
    @Column(name = "excursion_price")
    private BigDecimal excusion_price;
    @Column(name = "image_url")
    private String image_URL;
    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;
    @Column(name = "last_update")
    @UpdateTimestamp
    private  Date last_update;
    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "excursion")
    private Set<ExcursionCartItem> cartItems;

    //constructors

    public Excursion() {
    }

    public Excursion(Long id, String excursion_title, BigDecimal excusion_price, String image_URL, Date create_date, Date last_update, Vacation vacation, Set<ExcursionCartItem> cartItems) {
        this.id = id;
        this.excursion_title = excursion_title;
        this.excusion_price = excusion_price;
        this.image_URL = image_URL;
        this.create_date = create_date;
        this.last_update = last_update;
        this.vacation = vacation;
        this.cartItems = cartItems;
    }

}
