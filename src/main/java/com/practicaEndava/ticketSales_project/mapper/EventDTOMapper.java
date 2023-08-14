package com.practicaEndava.ticketSales_project.mapper;


import com.practicaEndava.ticketSales_project.DTO.EventDto;
import com.practicaEndava.ticketSales_project.DTO.LocationDto;
import com.practicaEndava.ticketSales_project.DTO.TicketCategoryDTO;
import com.practicaEndava.ticketSales_project.model.Event;
import com.practicaEndava.ticketSales_project.model.Location;

import java.util.List;

public class EventDTOMapper {

    public  static EventDto toDto(Event event, String eventTypeName, LocationDto locationDto, List<TicketCategoryDTO> ticketCategoryDtoList) {
        EventDto eventDto = new EventDto();
        eventDto.setEventID(event.getEventID());
        eventDto.setName(event.getName());
        eventDto.setDescription(event.getDescription());
        eventDto.setStartDate(event.getStartDate());
        eventDto.setEndDate(event.getEndDate());
        eventDto.setEventTypeName(eventTypeName);
        eventDto.setLocation(locationDto);
        eventDto.setTicketCategories(ticketCategoryDtoList);
        return eventDto;
    }
}




