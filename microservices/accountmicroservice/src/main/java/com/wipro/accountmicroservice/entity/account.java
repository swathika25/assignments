package com.wipro.accountmicroservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class account {
	
	@Id
	private Long accountId;
	
	private String accountType;
	private double balance;
	
	private Long customerId;
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public account() {
		super();
	}



	public account(Long accountId, String accountType, double balance, Long customerId) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
		this.customerId = customerId;
	}


}
