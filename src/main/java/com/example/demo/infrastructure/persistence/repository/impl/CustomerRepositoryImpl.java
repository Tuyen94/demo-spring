package com.example.demo.infrastructure.persistence.repository.impl;

import com.example.demo.domain.customer.model.Customer;
import com.example.demo.domain.customer.repository.CustomerRepository;
import com.example.demo.infrastructure.persistence.entity.CustomerEntity;
import com.example.demo.infrastructure.persistence.repository.jpa.JpaCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private JpaCustomerRepository jpaRepository;

    @Override
    public Customer findById(int id) {
        var customerEntityOptional = jpaRepository.findById(id);
        return customerEntityOptional.map(CustomerEntity::toCustomer).orElse(null);
    }
}
