package com.practicaEndava.ticketSales_project.controller;

import com.practicaEndava.ticketSales_project.repository.model.Customer;
import com.practicaEndava.ticketSales_project.repository.model.TicketCategory;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class OrderDTO implements Serializable {
    private int eventID;


    private int customerID;


    private int ticketCategoryID;


    private int NumberOfTickets;


    private LocalDateTime OrderedAt;

    private double totalPrice;

    public OrderDTO() {

    }

    public OrderDTO(int eventID, LocalDateTime orderedAt, int ticketCategoryID, int numberOfTickets, double totalPrice) {
    }

    public int getEventID() {
        return eventID;
    }

    public void setOrderID(int eventID) {
        this.eventID = eventID;
    }


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getNumberOfTickets() {
        return NumberOfTickets;
    }

    public void setNumberOfTickets(int NumberOfTickets) {
        this.NumberOfTickets = NumberOfTickets;
    }

    public LocalDateTime getOrderedAt() {
        return OrderedAt;
    }

    public LocalDateTime setOrderedAt(LocalDateTime orderedAt) {
        this.OrderedAt = OrderedAt;
        return OrderedAt;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /*public record OrderDTO(int eventID,
                           LocalDate orderedAt,
                           TicketCategory ticketCategoryID,
                           int NumberOfTickets,
                           double totalPrice) implements Serializable {}*/

    public OrderDTO(int eventID, LocalDateTime OrderedAt, TicketCategory ticketCategoryID, int NumberOfTickets, double totalPrice) {
        this.eventID = eventID;
        this.OrderedAt = OrderedAt;
        this.ticketCategoryID = ticketCategoryID.getTicketCategoryID();
        this.NumberOfTickets = NumberOfTickets;
        this.totalPrice = totalPrice;
    }
}
