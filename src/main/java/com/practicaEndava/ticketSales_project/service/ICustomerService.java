package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomer();

    void createCustomer(Customer customer);
    void updateCustomer(Integer customerID, Customer customer);
}
