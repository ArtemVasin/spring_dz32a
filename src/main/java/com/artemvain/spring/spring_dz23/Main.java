package com.artemvain.spring.spring_dz23;

import com.artemvain.spring.spring_dz23.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class)
                .addAnnotatedClass(BookWarehouse.class).addAnnotatedClass(Author.class).
                addAnnotatedClass(OrderBook.class).addAnnotatedClass(OrderDetails.class).addAnnotatedClass(Shopper.class).buildSessionFactory();
        Session session = null;
        try {

            session = factory.getCurrentSession(); //открываем сессию
            Author author = new Author("Puskin");
            Book book = new Book("Onegin", author, 1865, 100, 800);
            BookWarehouse bookWarehouse = new BookWarehouse(2, book);
            Shopper shopper = new Shopper("Artem", 1987);
            OrderBook orderBook = new OrderBook(shopper, 800);
            OrderDetails orderDetails = new OrderDetails(orderBook, 2, 1600, book);


            session.beginTransaction();           // начинаем транзакцию

            System.out.println(bookWarehouse);
            System.out.println(book);

            session.save(bookWarehouse);
            session.save(orderDetails);
            session.save(shopper);
            session.save(orderBook);
            session.save(author);

            OrderDetails orderDetails1 = session.get(OrderDetails.class, 6);
            System.out.println("Books in order: " + orderDetails1.getBook());

            session.getTransaction().commit();  //закрываем сессию

            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }
    }
}

