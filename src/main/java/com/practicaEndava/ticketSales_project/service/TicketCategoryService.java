package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.DTO.TicketCategoryDTO;
import com.practicaEndava.ticketSales_project.mapper.TicketCategoryToTicketCategoryDTOMapper;
import com.practicaEndava.ticketSales_project.model.Event;
import com.practicaEndava.ticketSales_project.model.TicketCategory;
import com.practicaEndava.ticketSales_project.repository.TicketCategoryRepository;
import com.practicaEndava.ticketSales_project.service.Interfaces.ITicketCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketCategoryService implements ITicketCategoryService {

    private final TicketCategoryRepository ticketCategoryRepository;
    public List<TicketCategoryDTO> getAllTicketCategories() {
        return ticketCategoryRepository.findAll().stream().map(TicketCategoryToTicketCategoryDTOMapper::toDto).collect(Collectors.toList());
    }
    public List<TicketCategoryDTO> getTicketCategoriesByEventId(Event eventID) {
        return ticketCategoryRepository.findByEvent(eventID)
                .stream()
                .map(TicketCategoryToTicketCategoryDTOMapper::toDto)
                .collect(Collectors.toList());
}
    @Autowired
    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

}

