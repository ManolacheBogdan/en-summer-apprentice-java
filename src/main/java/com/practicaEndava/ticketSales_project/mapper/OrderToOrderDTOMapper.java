package com.practicaEndava.ticketSales_project.mapper;

import com.practicaEndava.ticketSales_project.DTO.OrderDTO;
import com.practicaEndava.ticketSales_project.model.Order;

public class OrderToOrderDTOMapper {
    public static OrderDTO toDto(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderID(order.getOrderId());
        orderDTO.setOrderedAt(order.getOrderedAt());
        orderDTO.setNumberOfTickets(order.getNumberOfTickets());
        orderDTO.setTotalPrice(order.getTotalPrice());
        orderDTO.setCustomerID(order.getCustomer().getCustomerId());
        orderDTO.setTicketCategoryID(order.getTicketCategory().getTicketCategoryID());
        orderDTO.setEventID(order.getTicketCategory().getEvent().getEventID());
        return orderDTO;
    }

}
