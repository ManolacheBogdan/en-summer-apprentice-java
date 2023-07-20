package com.practicaEndava.ticketSales_project.controller;

import com.practicaEndava.ticketSales_project.repository.model.Order;
import com.practicaEndava.ticketSales_project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping()
    @ResponseBody
    public List<Order> getOrders(
                               /* @RequestParam("eventId") int eventId,
                                @RequestParam("timestamp") String orderedAt,
                                @RequestParam("ticketCategoryId") int ticketCategoryId,
                                @RequestParam("numberOfTickets") int numberOfTickets,
                                @RequestParam("totalPrice") double totalPrice*/
    ){
        return orderService.getOrders();
    }

}
