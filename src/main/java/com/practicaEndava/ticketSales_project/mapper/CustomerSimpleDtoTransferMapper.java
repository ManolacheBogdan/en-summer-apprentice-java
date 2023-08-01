package com.practicaEndava.ticketSales_project.mapper;

import com.practicaEndava.ticketSales_project.DTO.CustomerSimpleDto;
import com.practicaEndava.ticketSales_project.model.Customer;

public class CustomerSimpleDtoTransferMapper {
    public static Customer toEntity(CustomerSimpleDto customerSimpleDto){
        Customer customer=new Customer();
        customer.setCustomerId(customerSimpleDto.getCustomerId());
        customer.setName(customerSimpleDto.getName());
        customer.setEmail(customerSimpleDto.getEmail());
        return customer;
    }
}
