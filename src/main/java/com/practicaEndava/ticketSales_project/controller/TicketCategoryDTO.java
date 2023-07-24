package com.practicaEndava.ticketSales_project.controller;

import java.io.Serializable;

/*public record TicketCategoryDTO(int eventID,
                                String ticketDescription,
                                double price)  implements Serializable {}*/
public class TicketCategoryDTO {

    private int ticketCategoryID;
    private int eventID;
    private String ticketDescription;
    private double price;

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TicketCategoryDTO() {
    }
}