package com.practicaEndava.ticketSales_project.controller;

import com.practicaEndava.ticketSales_project.repository.model.Order;
import com.practicaEndava.ticketSales_project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/order")
public class OrderController{

    @Autowired
    private OrderService orderService;
    public OrderController(OrderService ordersService) {
        this.orderService = ordersService;
    }
    @Autowired(required=true)
    private OrderDTO orderDTO;
    @GetMapping()
    @ResponseBody
    public List<OrderDTO> getOrders() {
        return orderService.getOrders();
    }

    @PostMapping
    public void createOrder(@RequestBody Order orderDTO) {
        orderService.createOrders(orderDTO);

    }
    public OrderDTO convertToOrder(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderID(order.getOrderID());
        orderDTO.setOrderedAt(order.getOrderedAt());
        //orderDTO.setTicket_category(order.getTicketCategoryID());
        orderDTO.setNumberOfTickets(order.getNumberOfTickets());
        orderDTO.setTotalPrice(order.getTotalPrice());

        return orderDTO;
    }
}