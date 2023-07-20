package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.repository.CustomerRepository;
import com.practicaEndava.ticketSales_project.repository.LocationRepository;
import com.practicaEndava.ticketSales_project.repository.model.Customer;
import com.practicaEndava.ticketSales_project.repository.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationService implements ILocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getLocation(){
        List<Location> location = locationRepository.findAll();
        return location;
    }
}
