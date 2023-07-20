package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.model.Event;

import java.util.List;

public interface IEventService {

    List<Event> getEventsByLocationIDAndEventType(int locationID, String eventType);
    List<Event> getAll();
}
