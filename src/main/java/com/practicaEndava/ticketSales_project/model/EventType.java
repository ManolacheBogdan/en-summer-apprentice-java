package com.practicaEndava.ticketSales_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "eventType")
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventTypeID")
    private int eventTypeID;

    @Column(name = "eventTypeName")
    private String eventTypeName;

}