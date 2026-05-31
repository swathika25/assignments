package com.wipro.customermicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.customermicroservice.entity.customer;
import com.wipro.customermicroservice.service.Icustomer;

@RestController
@RequestMapping("/api/customer")
public class Customercontroller {
	
	@Autowired
	Icustomer service;
	
	@PostMapping(value="/addc",consumes ="application/json")
    public customer addCustomer(@RequestBody customer cus) {
        return service.addCustomer(cus);
    }
	
	// Get Account By Id
    @GetMapping("/getbycid/{cid}")
    public customer getByCid(@PathVariable Long cid) {
        return service.getByCid(cid);
    }
    
 // Get All Accounts
    @GetMapping(value="/getallc",produces = "application/json")
    public List<customer> getAllCustomers() {
        return service.getAllCustomers();
    }

}
