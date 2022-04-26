package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.dao.AuthorRepository;
import com.artemvain.spring.spring_dz24.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Author getAuthor(int id) {
        Author author = null;
        Optional<Author> optional = authorRepository.findById(id);
        if (optional.isPresent()) {
            author = optional.get();
        }
        return author;
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }
}