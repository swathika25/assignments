package com.wipro.customereureka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class customer {
	
	@Id
	private Long customerId;
	
	private String customerName;
	private String email;

}
