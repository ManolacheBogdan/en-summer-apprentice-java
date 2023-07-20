package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.model.EventType;
import com.practicaEndava.ticketSales_project.repository.model.Location;

import java.util.List;

public interface IEventTypeService {
    List<EventType> getEventType();
}
