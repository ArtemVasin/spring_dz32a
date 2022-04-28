package com.artemvain.spring.spring_dz24.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "book_warehouse")
@Getter
@Setter
public class BookWarehouse {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "count_of_books")
    private int numberOfBooks;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_book")
    private Book book;

    @Override
    public String toString() {
        return "BookWarehouse{" +
                "countOfBooks=" + numberOfBooks +
                ", book=" + book +
                '}';
    }

    public BookWarehouse() {
    }

    public BookWarehouse(int numberOfBooks, Book book) {
        this.numberOfBooks = numberOfBooks;
        this.book = book;
    }
}