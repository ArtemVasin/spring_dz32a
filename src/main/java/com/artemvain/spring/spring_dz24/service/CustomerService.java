package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.entity.Shopper;

import java.util.List;

public interface CustomerService {
    public List<Shopper> getAllShopper();

    public void saveShopper(Shopper shopper);

    public Shopper getShopper(int id);

    public void deleteShopper(int id);
}
