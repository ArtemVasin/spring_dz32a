package com.artemvain.spring.spring_dz24.dao;

import com.artemvain.spring.spring_dz24.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
