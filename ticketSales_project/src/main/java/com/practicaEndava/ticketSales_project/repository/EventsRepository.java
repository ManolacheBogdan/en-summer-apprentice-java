package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.repository.model.Events;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsRepository extends CrudRepository<Events, Integer> {

    List<Events> findAll();
}
