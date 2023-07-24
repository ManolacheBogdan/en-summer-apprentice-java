package com.practicaEndava.ticketSales_project.repository.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="orders")
public class Order implements Serializable {
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




    @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", ticketCategory=" + ticket_category +
                ", customer=" + customerID +
                ", orderedAt=" + OrderedAt +
                ", numberOfTickets=" + NumberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return NumberOfTickets == order.NumberOfTickets && totalPrice == order.totalPrice && Objects.equals(orderID, order.orderID) && Objects.equals(ticket_category, order.ticket_category) && Objects.equals(customerID, orderID) && Objects.equals(OrderedAt, order.OrderedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, ticket_category, customerID, OrderedAt, NumberOfTickets, totalPrice);
    }
}
