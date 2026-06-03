package com.wipro.transactionmicroservice.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class transaction {
	
	@Id
	private Long transactionId;
	
	private String transactionType;
	private double amount;
	
	private Long accountId;
	
	private Long customerId;

	public transaction() {
		super();
	}

	public transaction(Long transactionId, String transactionType, double amount, Long accountId, Long customerId) {
		super();
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.accountId = accountId;
		this.customerId = customerId;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	
	
	
	
	
	

	
}
