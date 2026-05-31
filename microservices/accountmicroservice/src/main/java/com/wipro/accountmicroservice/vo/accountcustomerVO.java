package com.wipro.accountmicroservice.vo;

import com.wipro.accountmicroservice.entity.account;
import com.wipro.accountmicroservice.vo.customerVO;

public class accountcustomerVO {
	
private account Account;
	
	private customerVO Customer;

	public accountcustomerVO() {
		super();
	}

	public accountcustomerVO(account account, customerVO customer) {
		super();
		Account = account;
		Customer = customer;
	}

	public account getAccount() {
		return Account;
	}

	public void setAccount(account account) {
		this.Account = account;
	}

	public customerVO getCustomer() {
		return Customer;
	}

	public void setCustomer(customerVO customer) {
		this.Customer = customer;
	}
	

}
