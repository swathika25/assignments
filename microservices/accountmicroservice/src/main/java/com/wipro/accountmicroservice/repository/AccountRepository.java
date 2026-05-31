package com.wipro.accountmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.accountmicroservice.entity.account;

public interface AccountRepository extends JpaRepository<account,Long> {

}
