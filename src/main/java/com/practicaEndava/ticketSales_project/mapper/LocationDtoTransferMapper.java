package com.practicaEndava.ticketSales_project.mapper;

import com.practicaEndava.ticketSales_project.DTO.LocationDto;
import com.practicaEndava.ticketSales_project.model.Location;

public class LocationDtoTransferMapper {
    public static LocationDto toDto(Location location){
        LocationDto locationDto=new LocationDto();
        locationDto.setLocationId(location.getLocationID());
        locationDto.setName(location.getLocationName());
        locationDto.setType(location.getLocationType());
        locationDto.setCapacity(location.getCapacity());
        return locationDto;
    }
}
