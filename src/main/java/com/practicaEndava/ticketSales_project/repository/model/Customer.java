package com.practicaEndava.ticketSales_project.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Customer", schema = "dbo")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerID;

    public Customer(int customerID) {
        CustomerID = customerID;
    }

    public Customer(String customerName) {
        CustomerName = customerName;
    }

    @Column(name = "CustomerName")
    private String CustomerName;

    @Column(name = "Email")
    private String Email;


    public Customer(){

    }
    // Getters and Setters

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


}