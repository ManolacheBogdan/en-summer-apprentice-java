package com.practicaEndava.ticketSales_project.controller;

import com.practicaEndava.ticketSales_project.DTO.TicketCategoryDTO;
import com.practicaEndava.ticketSales_project.model.Event;
import com.practicaEndava.ticketSales_project.service.TicketCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/ticketCategories")
public class TicketCategoryController {
        private final TicketCategoryService ticketCategoryService;

        @Autowired
        public TicketCategoryController(TicketCategoryService ticketCategoryService) {
            this.ticketCategoryService = ticketCategoryService;
        }

        @GetMapping("/all")
        public List<TicketCategoryDTO> getAllTicketCategories() {
            return ticketCategoryService.getAllTicketCategories();
        }

        @GetMapping("/byEvent/{eventID}")
        public List<TicketCategoryDTO> getTicketCategoriesByEventId(@PathVariable Event eventID) {
            return ticketCategoryService.getTicketCategoriesByEventId(eventID);
      }
}
