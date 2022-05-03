package com.artemvain.spring.spring_dz24.controllers;

import com.artemvain.spring.spring_dz24.entity.Book;
import com.artemvain.spring.spring_dz24.entity.BookWarehouse;
import com.artemvain.spring.spring_dz24.service.BookStoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookStoreController {
    private final BookStoreService bookStoreService;

    public BookStoreController(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }


    @GetMapping("/books")
    public String book() {
        return "Books";
    }

    @GetMapping
    public String getBooks(
//            @RequestParam(name = "name", required = false) String name,
//            @RequestParam(name = "creation_year", required = false) int creationYear,
            Model model) {
        List<BookWarehouse> books = bookStoreService.getAllBookWarehouse();
        model.addAttribute("books", books);
        return "Books";
    }

    @GetMapping("/{bookId}")
    public String getBook(@PathVariable(name = "bookId") int id, Model model) {
        BookWarehouse bookWarehouse = bookStoreService.getBook(id);
        model.addAttribute("book",bookWarehouse);
        return "Book";
    }

}
