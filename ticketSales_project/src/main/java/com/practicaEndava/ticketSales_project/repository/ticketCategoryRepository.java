package com.practicaEndava.ticketSales_project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ticketCategoryRepository extends CrudRepository<ticketCategoryRepository, Integer> {
}