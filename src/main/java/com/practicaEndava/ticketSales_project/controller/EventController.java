package com.practicaEndava.ticketSales_project.controller;

import com.practicaEndava.ticketSales_project.DTO.EventDto;
import com.practicaEndava.ticketSales_project.model.Event;
import com.practicaEndava.ticketSales_project.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventController {

    private final  EventService eventsService;

    @GetMapping(value="/all")
    public ResponseEntity<List<EventDto>> getAllEvents() {
        List<EventDto> allEvents = eventsService.getAllEvents();
        return new ResponseEntity<>(allEvents, HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<List<EventDto>> getByEventTypeNameAndLocationId(@RequestParam String eventTypeName, @RequestParam int locationID) {
        return new ResponseEntity<>(eventsService.getByEventTypeNameAndLocationId(eventTypeName, locationID), HttpStatus.OK);
    }
}
