package com.wipro.customermicroservice.service;

import java.util.List;

import com.wipro.customermicroservice.entity.customer;

public interface Icustomer {

public customer addCustomer(customer cus);
	
	public customer getByCid(Long cid);
	
	public List<customer> getAllCustomers();
}
