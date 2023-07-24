package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.controller.OrderDTO;
import com.practicaEndava.ticketSales_project.repository.model.Order;

import java.util.List;

public interface IOrderService {
    List<OrderDTO> getOrders();

    void createOrders(Order orders);
}
