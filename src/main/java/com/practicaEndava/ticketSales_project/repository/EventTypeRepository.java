package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.repository.model.EventType;
import com.practicaEndava.ticketSales_project.repository.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventTypeRepository extends CrudRepository<EventType, Integer> {
    List<EventType> findAll();
    EventType getEventTypeByEventTypeName(String name);
}
