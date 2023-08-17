package com.practicaEndava.ticketSales_project.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;

@Component
@Data
public class OrderDTO implements Serializable {

    private int orderID;
    private int eventID;
    private int customerID;
    private int ticketCategoryID;
    private int NumberOfTickets;
    private LocalDateTime OrderedAt;
    private double totalPrice;

}

