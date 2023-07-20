package com.practicaEndava.ticketSales_project.controller;

import com.practicaEndava.ticketSales_project.repository.model.Event;
import com.practicaEndava.ticketSales_project.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {
    @Autowired
    private EventService eventsService;


    @GetMapping("/event/{resource}/{resource2}")
    @ResponseBody
    public List<Event> getEvents(@RequestParam("12") int resource, @RequestParam("Sport") String resource2){
        return eventsService.getEventsByLocationIDAndEventType(resource, resource2) ;
    }
}
