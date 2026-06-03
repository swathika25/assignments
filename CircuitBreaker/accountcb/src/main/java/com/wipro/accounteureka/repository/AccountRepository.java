package com.wipro.accounteureka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.accounteureka.entity.account;

@Repository
public interface AccountRepository extends JpaRepository<account , Long>{

	
	
}
