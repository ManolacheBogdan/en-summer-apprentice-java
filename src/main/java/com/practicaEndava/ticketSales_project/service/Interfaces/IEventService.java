package com.practicaEndava.ticketSales_project.service.Interfaces;

import com.practicaEndava.ticketSales_project.DTO.EventDto;
import com.practicaEndava.ticketSales_project.model.Event;

import java.util.List;


public interface IEventService {

     List<EventDto> getAllEvents();
     List<EventDto> getByEventTypeNameAndLocationId(String eventTypeName, int locationID);
}
