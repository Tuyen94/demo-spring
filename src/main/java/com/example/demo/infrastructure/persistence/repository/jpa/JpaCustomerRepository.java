package com.example.demo.infrastructure.persistence.repository.jpa;

import com.example.demo.infrastructure.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}
