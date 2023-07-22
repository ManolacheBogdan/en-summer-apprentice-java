package com.practicaEndava.ticketSales_project.controller;

import com.practicaEndava.ticketSales_project.repository.model.Customer;
import com.practicaEndava.ticketSales_project.repository.model.TicketCategory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OrderDTO {
    private int orderID;


    private int customerID;


    private int ticketCategoryID;


    private int NumberOfTickets;


    private LocalDateTime OrderedAt;

    private double totalPrice;

    public OrderDTO() {

    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
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

    public OrderDTO(int orderID, Customer customerID, TicketCategory ticketCategoryID,
                    int NumberOfTickets, LocalDateTime OrderedAt, double totalPrice) {
        this.orderID = orderID;
        this.NumberOfTickets = NumberOfTickets;
        this.ticketCategoryID= ticketCategoryID.getTicketCategoryID();
        this.OrderedAt = OrderedAt;
        this.totalPrice = totalPrice;
    }
}