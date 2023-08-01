package com.practicaEndava.ticketSales_project.DTO;

import com.practicaEndava.ticketSales_project.model.Location;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class EventDto {
    private int eventID;
    private LocationDto location;
    private String  eventTypeName;
    private String description;
    private String name;
    private List<TicketCategoryDTO> ticketCategories;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}