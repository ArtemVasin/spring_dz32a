package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.dao.BookStoreRepository;
import com.artemvain.spring.spring_dz24.entity.BookWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookStoreServiceImpl implements BookStoreService {

    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Override
    public List<BookWarehouse> getAllBookWarehouse() {

        return bookStoreRepository.findAll();
    }

    @Override
    public void saveBookWarehouse(BookWarehouse bookWarehouse) {
        bookStoreRepository.save(bookWarehouse);
    }

    @Override
    public BookWarehouse getBook(int id) {
        BookWarehouse bookWarehouse = null;
        Optional<BookWarehouse> optional = bookStoreRepository.findById(id);
        if (optional.isPresent()) {
            bookWarehouse = optional.get();
        }
        return   bookWarehouse;
    }

    @Override
    public void deleteBookWarehouse(int id) {
        bookStoreRepository.deleteById(id);
    }


}
