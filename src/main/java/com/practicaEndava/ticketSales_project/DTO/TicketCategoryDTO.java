package com.practicaEndava.ticketSales_project.DTO;

import com.practicaEndava.ticketSales_project.model.Event;
import lombok.Data;

@Data
public class TicketCategoryDTO {
    private int ticketCategoryID;
    private int eventID;
    private String ticketDescription;
    private double price;

}