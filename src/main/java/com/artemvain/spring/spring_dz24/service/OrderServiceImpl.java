package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.dao.OrderRepository;
import com.artemvain.spring.spring_dz24.entity.OrderBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderBook> getAllOrderBook() {
        return orderRepository.findAll();
    }

    @Override
    public void saveOrderBook(OrderBook orderBook) {
        orderRepository.save(orderBook);
    }

    @Override
    public OrderBook getOrderBook(int id) {
        OrderBook orderBook = null;
        Optional<OrderBook> optional = orderRepository.findById(id);
        if (optional.isPresent()) {
            orderBook = optional.get();
        }
        return orderBook;
    }

    @Override
    public void deleteOrderBook(int id) {
        orderRepository.deleteById(id);
    }
}