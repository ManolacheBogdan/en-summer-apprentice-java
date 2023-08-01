package com.practicaEndava.ticketSales_project.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class CustomerSimpleDto {
    private int customerId;
    private String name;
    private String email;
}
