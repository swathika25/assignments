package com.wipro.transactioneureka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class transaction {
	
	@Id
	private Long transactionId;
	
	private String transactionType;
	
	private double amount;

}
