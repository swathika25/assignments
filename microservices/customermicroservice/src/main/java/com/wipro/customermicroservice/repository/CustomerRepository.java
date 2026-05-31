package com.wipro.customermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.customermicroservice.entity.customer;

public interface CustomerRepository extends JpaRepository<customer,Long> {

}
