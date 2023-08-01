package com.practicaEndava.ticketSales_project.mapper;

import com.practicaEndava.ticketSales_project.DTO.CreateOrderDto;
import com.practicaEndava.ticketSales_project.model.Customer;
import com.practicaEndava.ticketSales_project.model.Order;
import com.practicaEndava.ticketSales_project.model.TicketCategory;

import java.time.LocalDateTime;

public class CreateOrderDtoTransferMapper {
    public static Order toEntity(CreateOrderDto createOrderDto, Customer customer, TicketCategory ticketCategory){
        Order order=new Order();
        order.setCustomer(customer);
        order.setTicketCategory(ticketCategory);
        order.setNumberOfTickets(createOrderDto.getNoOfTickets());
        order.setOrderedAt(LocalDateTime.now());
        order.setTotalPrice(createOrderDto.getNoOfTickets()*ticketCategory.getPrice());
        return order;
    }
}
