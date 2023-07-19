package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.model.Orders;

import java.util.List;

public interface IOrdersService {
    List<Orders> getOrders();
}
