package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.repository.model.Customer;
import com.practicaEndava.ticketSales_project.repository.model.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location,Integer> {
    List<Location> findAll();
}
