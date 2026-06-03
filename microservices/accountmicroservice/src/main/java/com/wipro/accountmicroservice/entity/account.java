package com.wipro.accountmicroservice.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class account {
	
	@Id
	private Long accountId;
	
	private String accountType;
	private double balance;
	

	public account() {
		super();
	}



	public account(Long accountId, String accountType, double balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;

	}


}
