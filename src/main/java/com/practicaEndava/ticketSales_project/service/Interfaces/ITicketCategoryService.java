package com.practicaEndava.ticketSales_project.service.Interfaces;

import com.practicaEndava.ticketSales_project.DTO.TicketCategoryDTO;
import com.practicaEndava.ticketSales_project.model.Event;

import java.util.List;

public interface ITicketCategoryService {

    public List<TicketCategoryDTO> getAllTicketCategories();

    public List<TicketCategoryDTO> getTicketCategoriesByEventId(Event eventID);
}