package com.wipro.customereureka.service;

import java.util.List;

import com.wipro.customereureka.entity.customer;

public interface Icustomer {
	
	customer addCustomer(customer c);
	
	customer getById(Long id);
	
	List<customer> getAllCustomers();
	void deleteCustomer(Long id);

}
