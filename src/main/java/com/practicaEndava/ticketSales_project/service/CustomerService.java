package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.CustomerRepository;
import com.practicaEndava.ticketSales_project.repository.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomer(){
        List<Customer> customer = customerRepository.findAll();
        return customer;
    }

    /**
     * @param customer
     */
    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void updateCustomer(Integer customerID, Customer customer) {
        Customer customerToUpdate=customerRepository.findById(customerID).orElseThrow(
                ()-> new IllegalStateException(String.format("Customer with ID %s doesn't exist",customerID))) ;
        customerToUpdate.setCustomerName(customer.getCustomerName());
        customerToUpdate.setEmail(customer.getEmail());

        customerRepository.save(customerToUpdate);
    }



}
