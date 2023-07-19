package com.practicaEndava.ticketSales_project.repository.model;

import jakarta.persistence.*;
import jdk.jfr.EventType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.parsing.Location;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "event")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventID")
    private int eventID;
    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;
    @ManyToOne
    @JoinColumn(name = "locationID")
    private Location location;
    @Column
    private String eventName;
    @Column
    private String eventDescription;
    @Column(name = "startDate")
    private LocalDateTime startDate;
    @Column(name = "endDate")
    private LocalDateTime endDate;
//    @OneToMany(targetEntity = TicketCategory.class,fetch = FetchType.LAZY)
//    @JoinColumn(name = "event_id")
//    private List<TicketCategory> ticketCategories;


    public Events(int eventID) {
        this.eventID = eventID;
    }

    public Events(String eventName) {
        this.eventName = eventName;
    }

    public Events(EventType eventType) {
        this.eventType = eventType;
    }

    public Events(Location location) {
        this.location = location;
    }

    public Events(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}