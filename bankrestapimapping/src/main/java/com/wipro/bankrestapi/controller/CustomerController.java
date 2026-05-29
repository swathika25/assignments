package com.wipro.bankrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankrestapi.entity.customer;
import com.wipro.bankrestapi.service.Icustomer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
		
		
		@Autowired
		Icustomer service;
		
		@PostMapping(value="/addc",consumes ="application/json")
	    public customer addCustomer(@RequestBody customer cus) {
	        return service.addCustomer(cus);
	    }
	 
	    // Update Account
	    @PutMapping(value="/updatec",consumes="application/json")
	    public customer updateCustomer(@RequestBody customer cus) {
	        return service.updateCustomer(cus);
	    }
	 
	    // Get Account By Id
	    @GetMapping("/getbycid/{cid}")
	    public customer getByCid(@PathVariable Long cid) {
	        return service.getByCid(cid);
	    }
	 
	    // Delete Account
	    @DeleteMapping("/deletebycid/{cid}")
	    public String deleteByCid(@PathVariable Long cid) {
	    	String msg = "";
	        service.deleteByCid(cid);
	        
	        customer cus = service.getByCid(cid);
	        if(cus == null) {
	        	msg = "Record Deleted Successfully";
	        }
	        
	        return msg;
	    }
	 
	    // Get All Accounts
	    @GetMapping(value="/getallc",produces = "application/json")
	    public List<customer> getAllCustomers() {
	        return service.getAllCustomers();
	    }


}
