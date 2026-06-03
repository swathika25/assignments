package com.wipro.customereureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.customereureka.entity.customer;
import com.wipro.customereureka.service.Icustomer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	
	@Autowired
	private Icustomer service;
	
	@PostMapping("/add")
	public customer addCustomer(@RequestBody customer cus) {
		return service.addCustomer(cus);
	}
	
	@GetMapping("/{id}")
	public customer getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	
	@GetMapping("/all")
	public List<customer> getAll(){
		return service.getAllCustomers();
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.deleteCustomer(id);
		return "Deleted SuccessFuly";
	}
	
	
}
