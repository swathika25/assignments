package com.wipro.transactionmicroservice.vo;
import com.wipro.transactionmicroservice.entity.*;
public class responsetemplatevo {
	
private transaction transaction;
	
	private accountvo account;
	
	private customervo customer;
	
	public transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(transaction transaction) {
		this.transaction = transaction;
	}

	public accountvo getAccount() {
		return account;
	}

	public void setAccount(accountvo account) {
		this.account = account;
	}

	public customervo getCustomer() {
		return customer;
	}

	public void setCustomer(customervo customer) {
		this.customer = customer;
	}

	

}
