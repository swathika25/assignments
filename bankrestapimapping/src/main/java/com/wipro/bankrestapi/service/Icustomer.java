package com.wipro.bankrestapi.service;

import java.util.List;

import com.wipro.bankrestapi.entity.customer;

public interface Icustomer {
	
	public customer addCustomer(customer cus);
	
	public customer updateCustomer(customer cus);
	
	public customer getByCid(Long cid);
	
	public void deleteByCid(Long cid);
	
	public List<customer> getAllCustomers();

	

}
