package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.entity.OrderBook;

import java.util.List;

public interface OrderService {
    public List<OrderBook> getAllOrderBook();

    public void saveOrderBook(OrderBook orderBook);

    public OrderBook getOrderBook(int id);

    public void deleteOrderBook(int id);
}
