package com.artemvain.spring.spring_dz24.controller;


import com.artemvain.spring.spring_dz24.entity.Book;
import com.artemvain.spring.spring_dz24.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//  данный класс создан в процессе ичучения новых тем
@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> showAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        return allBooks;
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable int id) {
        Book book = bookService.getBook(id);
        return book;
    }

    @GetMapping("/book")
    public Book addNewBook(@RequestBody Book book) {
        bookService.saveBooks(book);
        return book;
    }

    @GetMapping("/book")
    public Book updateBook(@RequestBody Book book) {
        bookService.saveBooks(book);
        return book;
    }

    @GetMapping("/book/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}
