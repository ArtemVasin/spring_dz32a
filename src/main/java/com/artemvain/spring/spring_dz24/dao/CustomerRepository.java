package com.artemvain.spring.spring_dz24.dao;

import com.artemvain.spring.spring_dz24.entity.Shopper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Shopper, Integer> {
}
