package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.repository.model.Events;
import com.practicaEndava.ticketSales_project.repository.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findAll();
}
