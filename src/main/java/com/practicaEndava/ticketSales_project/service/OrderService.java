package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.DTO.CreateOrderDto;
import com.practicaEndava.ticketSales_project.DTO.OrderDTO;
import com.practicaEndava.ticketSales_project.mapper.CreateOrderDtoTransferMapper;
import com.practicaEndava.ticketSales_project.mapper.OrderToOrderDTOMapper;
import com.practicaEndava.ticketSales_project.model.Customer;
import com.practicaEndava.ticketSales_project.model.Order;
import com.practicaEndava.ticketSales_project.model.TicketCategory;
import com.practicaEndava.ticketSales_project.repository.CustomerRepository;
import com.practicaEndava.ticketSales_project.repository.OrderRepository;
import com.practicaEndava.ticketSales_project.repository.TicketCategoryRepository;
import com.practicaEndava.ticketSales_project.service.Interfaces.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final TicketCategoryRepository ticketCategoryRepository;

    @Override
    public List<OrderDTO> getAll() {
        List<OrderDTO> orderList = new ArrayList<OrderDTO>();
        orderRepository.findAll().forEach(order -> orderList.add(OrderToOrderDTOMapper.toDto(order)));
        return orderList;
    }


    @Override
    public OrderDTO createOrder(CreateOrderDto createOrderDto) {
        //Get the customer if it exists
        Optional<Customer> customer=customerRepository.findById(createOrderDto.getCustomerId());
        if (!customer.isPresent()) {

            throw new RuntimeException("Customer not found");
        }
        //Get ticket category
        Optional<TicketCategory> ticketCategory=ticketCategoryRepository.findById(createOrderDto.getTicketCategoryID());
        if (!ticketCategory.isPresent()) {

            throw new RuntimeException("Ticket Category not found");
        }

        Order order= CreateOrderDtoTransferMapper.toEntity(createOrderDto,customer.get(),ticketCategory.get());
        return OrderToOrderDTOMapper.toDto(orderRepository.save(order));
    }
}
