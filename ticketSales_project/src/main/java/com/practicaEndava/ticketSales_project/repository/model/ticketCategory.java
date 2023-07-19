package com.practicaEndava.ticketSales_project.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "ticket_category")
public class ticketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketCategoryID")
    private int ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Events eventID;

    @Column(name = "ticketDescription")
    private String ticketDescription;

    @Column(name = "Price")
    private double Price;

    public ticketCategory(Events eventID) {
        this.eventID = eventID;
    }

    public ticketCategory(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public ticketCategory(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public ticketCategory(double price) {
        Price = price;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Events getEventID() {
        return eventID;
    }

    public void setEventID(Events eventID) {
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
