package com.practicaEndava.ticketSales_project.repository.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private int orderID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customerID;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticket_category;

    @Column(name = "OrderedAt")
    private LocalDateTime OrderedAt;

    @Column(name = "NumberOfTickets")
    private int NumberOfTickets;

    @Column(name = "totalPrice")
    private double totalPrice;

    public Order(){

    }
    public Order(int orderID) {
        this.orderID = orderID;
    }

    public Order(Customer customerID) {
        this.customerID = customerID;
    }

    public Order(TicketCategory ticket_category) {
        this.ticket_category = ticket_category;
    }

    public Order(LocalDateTime orderedAt) {
        OrderedAt = orderedAt;
    }

    public Order(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public LocalDateTime getOrderedAt() {
        return OrderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        OrderedAt = orderedAt;
    }

    public TicketCategory getTicket_category() {
        return ticket_category;
    }

    public void setTicket_category(TicketCategory ticket_category) {
        this.ticket_category = ticket_category;
    }

    public int getNumberOfTickets() {
        return NumberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        NumberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public int getTicketCategoryID() {
        return 0;
    }
}
