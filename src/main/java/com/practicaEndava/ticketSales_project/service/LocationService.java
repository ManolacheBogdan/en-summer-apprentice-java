package com.practicaEndava.ticketSales_project.service;

import com.practicaEndava.ticketSales_project.model.Location;
import com.practicaEndava.ticketSales_project.repository.LocationRepository;
import com.practicaEndava.ticketSales_project.service.Interfaces.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService implements ILocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getLocation() {
        List<Location> location = locationRepository.findAll();
        return location;
    }
}
