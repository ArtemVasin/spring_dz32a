package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public void saveBooks(Book book);

    public Book getBook(int id);

    public void deleteBook(int id);

}
