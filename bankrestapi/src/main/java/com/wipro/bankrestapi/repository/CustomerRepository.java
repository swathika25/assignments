package com.wipro.bankrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankrestapi.entity.customer;


@Repository
public interface CustomerRepository extends JpaRepository<customer,Long> {

}
