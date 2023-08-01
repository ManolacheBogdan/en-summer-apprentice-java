package com.practicaEndava.ticketSales_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Customer", schema = "dbo")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    @Column(name = "CustomerName")
    private String name;
    @Column(name = "Email")
    private String email;
}