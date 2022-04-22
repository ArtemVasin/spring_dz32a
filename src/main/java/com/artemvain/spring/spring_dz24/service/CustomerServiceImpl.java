package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.dao.CustomerRepository;
import com.artemvain.spring.spring_dz24.entity.Shopper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Shopper> getAllShopper() {
        return customerRepository.findAll();
    }

    @Override
    public void saveShopper(Shopper shopper) {
        customerRepository.save(shopper);
    }

    @Override
    public Shopper getShopper(int id) {
        Shopper shopper = null;
        Optional<Shopper> optional = customerRepository.findById(id);
        if (optional.isPresent()) {
            shopper = optional.get();
        }
        return shopper;
    }

    @Override
    public void deleteShopper(int id) {
        customerRepository.deleteById(id);
    }
}