package com.practicaEndava.ticketSales_project.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private int orderID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customerID;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private ticketCategory ticket_category;

    @Column(name = "OrderedAt")
    private LocalDateTime OrderedAt;

    @Column(name = "NumberOfTickets")
    private int NumberOfTickets;

    @Column(name = "totalPrice")
    private double totalPrice;

    public Orders(int orderID) {
        this.orderID = orderID;
    }

    public Orders(Customer customerID) {
        this.customerID = customerID;
    }

    public Orders(ticketCategory ticket_category) {
        this.ticket_category = ticket_category;
    }

    public Orders(LocalDateTime orderedAt) {
        OrderedAt = orderedAt;
    }

    public Orders(double totalPrice) {
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

    public ticketCategory getTicket_category() {
        return ticket_category;
    }

    public void setTicket_category(ticketCategory ticket_category) {
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
}
