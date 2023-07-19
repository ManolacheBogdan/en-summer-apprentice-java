package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.repository.model.Events;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eventTypeRepository extends CrudRepository<eventTypeRepository, Integer> {
}
