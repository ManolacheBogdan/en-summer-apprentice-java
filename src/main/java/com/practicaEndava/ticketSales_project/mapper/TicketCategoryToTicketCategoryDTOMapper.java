package com.practicaEndava.ticketSales_project.mapper;

import com.practicaEndava.ticketSales_project.DTO.TicketCategoryDTO;
import com.practicaEndava.ticketSales_project.model.TicketCategory;
import org.springframework.stereotype.Component;

@Component
public class TicketCategoryToTicketCategoryDTOMapper {
    public static TicketCategory toEntity(TicketCategoryDTO ticketCategoryDTO) {
        TicketCategory ticketCategory = new TicketCategory();
        ticketCategory.setTicketCategoryID(ticketCategoryDTO.getTicketCategoryID());
        ticketCategory.setTicketDescription(ticketCategoryDTO.getTicketDescription());
        ticketCategory.setPrice(ticketCategoryDTO.getPrice());
        return ticketCategory;
    }
    public static TicketCategoryDTO toDto(TicketCategory ticketCategory) {
        TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO();
        ticketCategoryDTO.setTicketCategoryID(ticketCategory.getTicketCategoryID());
        ticketCategoryDTO.setTicketDescription(ticketCategory.getTicketDescription());
        ticketCategoryDTO.setPrice(ticketCategory.getPrice());
        ticketCategoryDTO.setEventID(ticketCategory.getEvent().getEventID());
        return ticketCategoryDTO;
    }
}
