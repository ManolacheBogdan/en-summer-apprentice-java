package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAll();
}
