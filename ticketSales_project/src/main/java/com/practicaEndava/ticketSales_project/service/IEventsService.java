package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.model.Customer;
import com.practicaEndava.ticketSales_project.repository.model.Events;

import java.util.List;

public interface IEventsService {
    List<Events> getEvents();

}
