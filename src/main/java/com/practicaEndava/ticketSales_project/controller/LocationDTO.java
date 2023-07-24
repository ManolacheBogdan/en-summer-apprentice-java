package com.practicaEndava.ticketSales_project.controller;

import java.io.Serializable;

public record LocationDTO(int locationID,
                       String locationName,
                       String locationType,
                       long capacity)  implements Serializable {}