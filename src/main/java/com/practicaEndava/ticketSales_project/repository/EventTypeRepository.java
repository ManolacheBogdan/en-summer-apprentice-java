package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventTypeRepository extends JpaRepository<EventType, Integer> {
    List<EventType> findAll();

    EventType getEventTypeByEventTypeName(String name);
}
