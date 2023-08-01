package com.practicaEndava.ticketSales_project.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderID")
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;

    @Column(name = "OrderedAt")
    private LocalDateTime orderedAt;

    @Column(name = "NumberOfTickets")
    private int numberOfTickets;

    @Column(name = "totalPrice")
    private double totalPrice;


}
