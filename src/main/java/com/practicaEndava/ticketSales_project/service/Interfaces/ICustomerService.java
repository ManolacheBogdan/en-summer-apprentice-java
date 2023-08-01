package com.practicaEndava.ticketSales_project.service.Interfaces;

import com.practicaEndava.ticketSales_project.DTO.CustomerSimpleDto;
import com.practicaEndava.ticketSales_project.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomer();

    void createCustomer(Customer customer);

     void update(Integer customerID, CustomerSimpleDto newCustomerSimpleDto);
}
