package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.DTO.EventDto;
import com.practicaEndava.ticketSales_project.DTO.TicketCategoryDTO;
import com.practicaEndava.ticketSales_project.mapper.EventDTOMapper;
import com.practicaEndava.ticketSales_project.mapper.LocationDtoTransferMapper;
import com.practicaEndava.ticketSales_project.mapper.OrderToOrderDTOMapper;
import com.practicaEndava.ticketSales_project.mapper.TicketCategoryToTicketCategoryDTOMapper;
import com.practicaEndava.ticketSales_project.model.Event;
import com.practicaEndava.ticketSales_project.model.EventType;
import com.practicaEndava.ticketSales_project.model.Location;
import com.practicaEndava.ticketSales_project.model.TicketCategory;
import com.practicaEndava.ticketSales_project.repository.EventRepository;
import com.practicaEndava.ticketSales_project.repository.EventTypeRepository;
import com.practicaEndava.ticketSales_project.service.Interfaces.IEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EventService implements IEventService {

    private final EventRepository eventRepository;
    private final EventTypeRepository eventTypeRepository;

    public List<EventDto> getAllEvents() {
        List<Event> events = eventRepository.findAll();
        List<EventDto> eventDTOList = new ArrayList<>();
        for (Event event : events) {
            List<TicketCategoryDTO> ticketCategoryDTOS = new ArrayList<>();
            for (TicketCategory ticketCategory : event.getTicketCategories()) {
                ticketCategoryDTOS.add(TicketCategoryToTicketCategoryDTOMapper.toDto(ticketCategory));
            }
            Optional<EventType> eventType = eventTypeRepository.findById(event.getEventType().getEventTypeID());
            if (eventType.isEmpty()) {
                throw new RuntimeException("Could not find event type: " + event.getEventType().getEventTypeID());
            }
            eventDTOList.add(EventDTOMapper.toDto(event, eventType.get().getEventTypeName(), LocationDtoTransferMapper.toDto(event.getLocation()), ticketCategoryDTOS));
        }
        return eventDTOList;
    }
    @Override
    public List<EventDto> getByEventTypeNameAndLocationId(String eventTypeName, int locationId) {
        List<Event> eventList= eventRepository.findEventsByLocationLocationIDAndEventTypeEventTypeName(locationId, eventTypeName);
        List<EventDto> eventDTOList=new ArrayList<>();
        for (Event event:eventList) {
            List<TicketCategoryDTO> ticketCategoryDTOS=new ArrayList<>();
            for(TicketCategory ticketCategory:event.getTicketCategories()){
                ticketCategoryDTOS.add(TicketCategoryToTicketCategoryDTOMapper.toDto(ticketCategory));
            }
            Optional<EventType> eventType=eventTypeRepository.findById(event.getEventType().getEventTypeID());
            if(eventType.isEmpty()){
                throw  new RuntimeException("Could not find event type: "+event.getEventType().getEventTypeID());
            }
            eventDTOList.add(EventDTOMapper.toDto(event,eventType.get().getEventTypeName(), LocationDtoTransferMapper.toDto(event.getLocation()),ticketCategoryDTOS));

        }
        return eventDTOList;
    }


}


