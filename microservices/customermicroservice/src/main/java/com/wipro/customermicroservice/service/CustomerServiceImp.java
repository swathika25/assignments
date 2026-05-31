package com.wipro.customermicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.customermicroservice.entity.customer;
import com.wipro.customermicroservice.repository.CustomerRepository;
import com.wipro.customermicroservice.service.Icustomer;


@Service
public class CustomerServiceImp implements Icustomer{
	
	@Autowired
	CustomerRepository repo1;

	@Override
	public customer addCustomer(customer cus) {
		return repo1.save(cus);
		
	}

	
	@Override
	public customer getByCid(Long cid) {
		return repo1.findById(cid).orElse(null);
	}
	
	@Override
	public List<customer> getAllCustomers() {
		return repo1.findAll();
	}

}
