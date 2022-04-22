package com.artemvain.spring.spring_dz24.dao;

import com.artemvain.spring.spring_dz24.entity.OrderBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderBook, Integer> {
}
