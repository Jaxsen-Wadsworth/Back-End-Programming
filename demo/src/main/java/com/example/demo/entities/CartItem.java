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
@Table(name= "cart_items")
@Getter
@Setter
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartItem")
    private Set<ExcursionCartItem> excursions =new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    //constructors
    public void add(ExcursionCartItem excursion){
        if(excursion != null){
            if(excursions == null) {
                excursions = new HashSet<>();
            }
            excursions.add(excursion);
            excursion.setCartItem(this);
        }
    }

    public CartItem() {
    }

}
