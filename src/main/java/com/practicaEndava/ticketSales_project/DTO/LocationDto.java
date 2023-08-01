package com.practicaEndava.ticketSales_project.DTO;

import lombok.Data;

@Data
public class LocationDto {
    public int locationId;
    public String name;
    public String type;
    public long capacity;
}

