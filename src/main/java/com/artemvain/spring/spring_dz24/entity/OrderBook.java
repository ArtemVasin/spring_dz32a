package com.artemvain.spring.spring_dz24.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table( name = "order_book")
@Getter
@Setter
public class OrderBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_shopper")
    private Shopper shopper;

    @Column( name = "purchase_amount")
    private int purchaseAmount;

    @Override
    public String toString() {
        return "OrderBook{" +
                "id=" + id +
                ", idShopper=" + shopper+
                ", purchaseAmount=" + purchaseAmount +
                '}';
    }

    public OrderBook() {
    }

    public OrderBook(Shopper shopper, int purchaseAmount) {
        this.shopper = shopper;
        this.purchaseAmount = purchaseAmount;
    }
}