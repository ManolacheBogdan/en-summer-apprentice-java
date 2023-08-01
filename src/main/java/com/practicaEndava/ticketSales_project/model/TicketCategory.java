package com.practicaEndava.ticketSales_project.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ticket_category")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketCategoryID")
    private int ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;

    @Column(name = "ticketDescription")
    private String ticketDescription;

    @Column(name = "Price")
    private double price;

}
