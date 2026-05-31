package com.wipro.accounteureka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class account {
	
	@Id
	private Long accountId;
	
	private String accountType;
	
	private double balance;

	public account(Long accountId, String accountType, double balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}

	public account() {
		super();
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
