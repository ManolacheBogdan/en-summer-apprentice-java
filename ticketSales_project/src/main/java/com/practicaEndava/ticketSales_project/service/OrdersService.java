package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.OrdersRepository;
import com.practicaEndava.ticketSales_project.repository.model.Orders;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<Orders> getOrders(){
        List<Orders> Orders = OrdersRepository.findAll();
        return Orders;
    }
}
