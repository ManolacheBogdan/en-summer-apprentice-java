package com.practicaEndava.ticketSales_project.repository.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ticket_category")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketCategoryID")
    private int ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event eventID;

    @Column(name = "ticketDescription")
    private String ticketDescription;

    @Column(name = "Price")
    private double Price;

    public TicketCategory(){

    }

    public TicketCategory(Event eventID) {
        this.eventID = eventID;
    }

    public TicketCategory(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public TicketCategory(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public TicketCategory(double price) {
        Price = price;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Event getEventID() {
        return eventID;
    }

    public void setEventID(Event eventID) {
        this.eventID = eventID;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
