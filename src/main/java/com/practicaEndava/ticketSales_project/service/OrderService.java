package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.OrderRepository;
import com.practicaEndava.ticketSales_project.repository.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practicaEndava.ticketSales_project.controller.OrderDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderDTO> getOrders(){
        return orderRepository.findAll().stream().map(orders -> new OrderDTO(
           orders.getTicket_category().getEventID().getEventID(),
           orders.getOrderedAt(),
           orders.getTicket_category().getTicketCategoryID(),
           orders.getNumberOfTickets(),
           orders.getTotalPrice()
        )).collect(Collectors.toList());

    }
    @Override
    public void createOrders (Order orders){
        orderRepository.save(orders);
    }



}
