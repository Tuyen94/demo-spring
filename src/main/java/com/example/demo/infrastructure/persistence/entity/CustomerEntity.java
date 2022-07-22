package com.example.demo.infrastructure.persistence.entity;

import com.example.demo.domain.customer.model.Customer;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;

    public Customer toCustomer() {
        return Customer.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
