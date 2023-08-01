package com.practicaEndava.ticketSales_project.DTO;

import lombok.Data;

@Data
public class TicketCategoryDTO {
    private int ticketCategoryID;
    private String ticketDescription;
    private double price;
}