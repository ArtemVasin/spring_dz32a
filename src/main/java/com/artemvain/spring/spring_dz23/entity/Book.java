package com.artemvain.spring.spring_dz23.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_author")
    private Author author;

    @Column(name = "creation_year")
    private int creationYear;

    @Column(name = "page_count")
    private int pageCount;

    @Column(name = "price")
    private int price;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idAuthor=" + author +
                ", creationYear=" + creationYear +
                ", pageCount=" + pageCount +
                ", price=" + price +
                '}';
    }

    public Book() {
    }

    public Book(String name, Author author, int creationYear, int pageCount, int price) {
        this.name = name;
        this.author = author;
        this.creationYear = creationYear;
        this.pageCount = pageCount;
        this.price = price;
    }
}