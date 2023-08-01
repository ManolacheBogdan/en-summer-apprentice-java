package com.practicaEndava.ticketSales_project.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locationID")
    private int locationID;

    @Column(name = "locationName")
    private String locationName;

    @Column(name = "locationType")
    private String locationType;

    @Column(name = "capacity")
    private int capacity;
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Event> events;

}
