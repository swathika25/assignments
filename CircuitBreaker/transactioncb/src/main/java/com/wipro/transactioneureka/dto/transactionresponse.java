package com.wipro.transactioneureka.dto;
import com.wipro.transactioneureka.entity.*;
public class transactionresponse {
	
	private transaction transaction;
	
	private accountdto account;
	
	private customerdto customer;

	public transactionresponse() {
		super();
	}

	public transactionresponse(transaction transaction, accountdto account,
			customerdto customer) {
		super();
		this.transaction = transaction;
		this.account = account;
		this.customer = customer;
	}

	public transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(transaction transaction) {
		this.transaction = transaction;
	}

	public accountdto getAccount() {
		return account;
	}

	public void setAccount(accountdto account) {
		this.account = account;
	}

	public customerdto getCustomer() {
		return customer;
	}

	public void setCustomer(customerdto customer) {
		this.customer = customer;
	}

	
	
	

}
