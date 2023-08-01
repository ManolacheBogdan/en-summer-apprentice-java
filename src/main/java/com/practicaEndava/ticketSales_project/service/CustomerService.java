package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.DTO.CustomerSimpleDto;
import com.practicaEndava.ticketSales_project.mapper.CustomerSimpleDtoTransferMapper;
import com.practicaEndava.ticketSales_project.model.Customer;
import com.practicaEndava.ticketSales_project.repository.CustomerRepository;
import com.practicaEndava.ticketSales_project.service.Interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomer() {
        List<Customer> customer = customerRepository.findAll();
        return customer;
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void update(Integer customerID, CustomerSimpleDto newCustomerSimpleDto) {
        Optional<Customer> oldCustomer = customerRepository.findById(customerID);
        if(oldCustomer.isEmpty()){
            throw new RuntimeException("Customer not found: "+oldCustomer.get().getName());
        }

        customerRepository.save(CustomerSimpleDtoTransferMapper.toEntity(newCustomerSimpleDto));
    }


}
