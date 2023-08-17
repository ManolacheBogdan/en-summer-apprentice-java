package com.practicaEndava.ticketSales_project.service.Interfaces;

import com.practicaEndava.ticketSales_project.DTO.CreateOrderDto;
import com.practicaEndava.ticketSales_project.DTO.OrderDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IOrderService {

    List<OrderDTO> getAll();

    OrderDTO createOrder(CreateOrderDto createOrderDto);
}
