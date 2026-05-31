package com.wipro.customereureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.customereureka.entity.customer;
import com.wipro.customereureka.repository.CustomerRepository;


@Service
public class CustomerServiceImp  implements Icustomer{
	
	@Autowired
	private CustomerRepository repo1;
	
	

	@Override
	public customer addCustomer(customer cus) {
		return repo1.save(cus);
	}

	@Override
	public customer getById(Long id) {
		
		return repo1.findById(id).orElse(null);
	}

	@Override
	public List<customer> getAllCustomers() {
		
		return repo1.findAll();
	}

	@Override
	public void deleteCustomer(Long id) {
		repo1.deleteById(id);
		
	}
	
	

}
