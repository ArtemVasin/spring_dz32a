package com.artemvain.spring.spring_dz24;

import com.artemvain.spring.spring_dz24.entity.*;
import com.artemvain.spring.spring_dz24.service.AuthorServiceImpl;
import com.artemvain.spring.spring_dz24.service.BookServiceImpl;

import com.artemvain.spring.spring_dz24.service.BookStoreServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Spring24Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Spring24Application.class, args);


        Author author = new Author("Puskin");
        //  Book book = new Book("Onegin", author, 1865, 100, 800);
//        BookWarehouse bookWarehouse = new BookWarehouse(2, book);
        Shopper shopper = new Shopper("Artem", 1987);
        Shopper shopper1 = new Shopper("Maksim", 1985);
//        OrderBook orderBook = new OrderBook(shopper, 800);
//        OrderDetails orderDetails = new OrderDetails(orderBook, 2, 1600, book);


        context.getBean(BookStoreServiceImpl.class).getAllBookWarehouse();

        Thread one = new Thread() {
            public void run() {
                context.getBean(BookServiceImpl.class).addOrder(4, shopper, 2);
            }
        };
        one.start();

        Thread two = new Thread() {
            public void run() {
                context.getBean(BookServiceImpl.class).addOrder(4, shopper1, 2);
            }
        };
        two.start();
    }
}

