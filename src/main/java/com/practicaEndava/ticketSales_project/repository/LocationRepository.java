package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    List<Location> findAll();
}
