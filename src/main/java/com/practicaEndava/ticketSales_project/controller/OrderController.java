package com.practicaEndava.ticketSales_project.controller;

import com.practicaEndava.ticketSales_project.DTO.CreateOrderDto;
import com.practicaEndava.ticketSales_project.DTO.OrderDTO;
import com.practicaEndava.ticketSales_project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping(value ="/all")
    private ResponseEntity<List<OrderDTO>> getAll(){
        return new ResponseEntity<>(orderService.getAll(),HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<OrderDTO> create(@RequestBody CreateOrderDto createOrderDto) {
        return new ResponseEntity<>(orderService.createOrder(createOrderDto), HttpStatus.CREATED);
    }

}