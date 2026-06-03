package com.wipro.transactionmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.transactionmicroservice.entity.transaction;

public interface TransactionRepository extends JpaRepository<transaction, Long> {

}
