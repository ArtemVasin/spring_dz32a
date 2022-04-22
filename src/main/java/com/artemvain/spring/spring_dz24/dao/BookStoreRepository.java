package com.artemvain.spring.spring_dz24.dao;

import com.artemvain.spring.spring_dz24.entity.BookWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreRepository extends JpaRepository<BookWarehouse, Integer> {
}
