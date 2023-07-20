package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.OrderRepository;
import com.practicaEndava.ticketSales_project.repository.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrders(){
        List<Order> orders = orderRepository.findAll();
        return orders;
    }
}
