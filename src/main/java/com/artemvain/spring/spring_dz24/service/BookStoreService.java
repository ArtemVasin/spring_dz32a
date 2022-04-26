package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.entity.BookWarehouse;

import java.util.List;

public interface BookStoreService {
    public List<BookWarehouse> getAllBookWarehouse();

    public void saveBookWarehouse(BookWarehouse bookWarehouse);

    public BookWarehouse getBook(int id);

    public void deleteBookWarehouse(int id);

}
