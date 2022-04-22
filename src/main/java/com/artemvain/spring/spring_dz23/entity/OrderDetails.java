package com.artemvain.spring.spring_dz23.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
@Getter
@Setter
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_order_book")
    private OrderBook orderBook;

    @Column(name = "count_book")
    private int countBook;

    @Column(name = "price")
    private int price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_book")
    private Book book;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", idOrderBook=" + orderBook +
                ", countBook=" + countBook +
                ", price=" + price +
                '}';
    }

    public OrderDetails() {
    }

    public OrderDetails(OrderBook orderBook, int countBook, int price, Book book) {
        this.orderBook = orderBook;
        this.countBook = countBook;
        this.price = price;
        this.book = book;
    }
}