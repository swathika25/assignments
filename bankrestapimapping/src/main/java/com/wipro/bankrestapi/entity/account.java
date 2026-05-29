package com.wipro.bankrestapi.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class account {
	
	
	@Id
	private Long accountId;
	
	private String accountType;
	private double balance;
	
	//many accounts belongs to one customer
	@ManyToOne
	private customer customer;
	
	// one account has any transactions
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
	private List<transaction> transactions;
	
	
	public account() {
		super();
	}


	public account(Long accountId, String accountType, double balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
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


	@Override
	public String toString() {
		return "account [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance + "]";
	}
	
	
	
	

}
