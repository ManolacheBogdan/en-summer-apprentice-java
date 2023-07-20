package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.EventRepository;
import com.practicaEndava.ticketSales_project.repository.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EventService implements IEventService {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private LocationService locationService;

    @Override
    public List<Event> getEventsByLocationIDAndEventType(int locationID, String eventType){

            return eventRepository.findAllByLocationAndByEventType(locationID, eventType);
        }

    /**
     * @return
     */
    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }


}


