package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.EventTypeRepository;
import com.practicaEndava.ticketSales_project.repository.LocationRepository;
import com.practicaEndava.ticketSales_project.repository.model.EventType;
import com.practicaEndava.ticketSales_project.repository.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventTypeService implements IEventTypeService{

    @Autowired
    private EventTypeRepository eventTypeRepository;

    @Override
    public List<EventType> getEventType(){
        List<EventType> eventType = eventTypeRepository.findAll();
        return eventType;
    }
}
