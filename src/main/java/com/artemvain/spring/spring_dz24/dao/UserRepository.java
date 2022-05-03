package com.artemvain.spring.spring_dz24.dao;

import com.artemvain.spring.spring_dz24.entity.OrderBook;
import com.artemvain.spring.spring_dz24.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
}
