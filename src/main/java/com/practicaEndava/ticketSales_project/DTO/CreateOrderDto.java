package com.practicaEndava.ticketSales_project.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderDto {
    private int ticketCategoryID;
    private int noOfTickets;
    private int customerId;
    private int eventId;
}
