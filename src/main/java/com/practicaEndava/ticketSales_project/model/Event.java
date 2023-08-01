package com.practicaEndava.ticketSales_project.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "Event")
@Data
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventID;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "locationID")
    private Location location;

    @Column(name = "eventName")
    private String name;

    @Column(name = "endDate")
    private LocalDateTime endDate;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "eventDescription")
    private String description;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TicketCategory> ticketCategories;
}