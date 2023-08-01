package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
}