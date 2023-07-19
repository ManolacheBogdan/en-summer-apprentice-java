package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.EventsRepository;
import com.practicaEndava.ticketSales_project.repository.model.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EventsService implements IEventsService{

    @Autowired
    private EventsRepository eventsRepository;


   @Override
    public List<Events> getEvents(){
       List<Events> events = eventsRepository.findAll();
       return events;
   }


}

