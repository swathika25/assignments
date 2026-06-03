package com.wipro.transactioneureka.dto;

public class accountdto {
	
	private Long accountId;
	
	private String accountType;
	
	private double balance;

	public accountdto() {
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
