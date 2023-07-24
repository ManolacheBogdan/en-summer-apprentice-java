package com.practicaEndava.ticketSales_project.controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public record EventDTO(int id,
                       Long location,
                       String eventType,
                       String eventDescription,
                       String eventName,
                       LocalDate startDate,
                       LocalDate endDate,
                       List<TicketCategoryDTO> ticketCategories) implements Serializable {}
