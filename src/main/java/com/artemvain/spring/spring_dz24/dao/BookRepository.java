package com.artemvain.spring.spring_dz24.dao;

import com.artemvain.spring.spring_dz24.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Integer>{

}
