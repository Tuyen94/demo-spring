package com.example.demo.domain.customer.repository;

import com.example.demo.domain.customer.model.Customer;

public interface CustomerRepository {
    Customer findById(int id);
}
