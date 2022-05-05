package com.artemvain.spring.spring_dz24.controllers;


import com.artemvain.spring.spring_dz24.entity.*;
import com.artemvain.spring.spring_dz24.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController

@RequestMapping("/api")
public class UserController {

    @Autowired
    private final UserServiceImpl userService;
    //    @Autowired
//    private final BookStoreServiceImpl bookStoreService;
    @Autowired
    private final AuthorServiceImpl authorService;
    @Autowired
    private final OrderServiceImpl orderService;
    @Autowired
    private final BookServiceImpl bookService;


    public UserController(UserServiceImpl userService,
                          AuthorServiceImpl authorService, OrderServiceImpl orderService,
                          BookServiceImpl bookService) {
        this.userService = userService;
//        this.bookStoreService = bookStoreService;
        this.authorService = authorService;
        this.orderService = orderService;
        this.bookService = bookService;
    }

    @GetMapping({"/welcome"})
    public String welcome() {
        String w = "WELCOME!";
        return w;
    }


    @GetMapping({"/books"})
    public List<Book> showAllBooks() {
        List<Book> allBooks = this.bookService.getAllBooks();
        return allBooks;
    }

    @GetMapping({"/books/{id}"})
    public Book getBook(@PathVariable int id) {
        Book book = this.bookService.getBook(id);
        return book;
    }

    @DeleteMapping({"/books/{id}"})
    @Secured("ROLE_ADMIN")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }

    @PostMapping({"/books"})
    @Secured("ROLE_ADMIN")
    public void saveBook(@RequestBody Book book) {
        bookService.saveBooks(book);
    }

    @DeleteMapping({"/authors/{id}"})
    @Secured("ROLE_ADMIN")
    public void deleteAuthor(@PathVariable int id) {
        authorService.deleteAuthor(id);
    }

    @GetMapping({"/authors"})
    public List<Author> showAllAuthors() {
        List<Author> allAuthors = authorService.getAllAuthor();
        return allAuthors;
    }

    @PostMapping({"/authors"})
    @Secured("ROLE_ADMIN")
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }

    @GetMapping({"/user"})
    public List<User> showAllClients() {
        List<User> allClients = userService.getAllUsers();
        return allClients;
    }

    @PutMapping({"/user"})
    public User updateUser(@RequestBody User user) {
        this.userService.saveUser(user);
        return user;
    }

    @GetMapping({"/orders"})
    public List<OrderBook> showAllOrder() {
        List<OrderBook> allOrder = orderService.getAllOrderBook();
        return allOrder;
    }

}

