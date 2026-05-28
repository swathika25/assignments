package com.wipro.bankrestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class transaction {
	
	@Id
	private Long transactionId;
	
	private String transactionType;
	private double amount;
	
	
	public transaction() {
		super();
	}


	public transaction(Long transactionId, String transactionType, double amount) {
		super();
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.amount = amount;
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


	@Override
	public String toString() {
		return "transaction [transactionId=" + transactionId + ", transactionType=" + transactionType + ", amount="
				+ amount + "]";
	}
	
	
	
	

}
