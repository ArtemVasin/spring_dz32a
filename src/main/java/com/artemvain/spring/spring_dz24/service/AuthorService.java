package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.entity.Author;

import java.util.List;

public interface AuthorService {
    public List<Author> getAllAuthor();

    public void saveAuthor(Author author);

    public Author getAuthor(int id);

    public void deleteAuthor(int id);
}
