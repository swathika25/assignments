package com.wipro.bankrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankrestapi.entity.customer;
import com.wipro.bankrestapi.repository.CustomerRepository;


@Service
public class CustomerServiceImp implements Icustomer {
	
	@Autowired
	CustomerRepository repo1;

	@Override
	public customer addCustomer(customer cus) {
		return repo1.save(cus);
	}

	@Override
	public customer updateCustomer(customer cus) {
		return repo1.save(cus);
	}

	@Override
	public customer getByCid(Long cid) {
		return repo1.findById(cid).orElse(null);
	}

	@Override
	public void deleteByCid(Long cid) {
		 repo1.deleteById(cid);
	}

	@Override
	public List<customer> getAllCustomers() {
		return repo1.findAll();
	}

}
