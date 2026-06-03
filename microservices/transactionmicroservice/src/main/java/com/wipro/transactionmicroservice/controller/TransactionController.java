package com.wipro.transactionmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.transactionmicroservice.entity.transaction;
import com.wipro.transactionmicroservice.service.Itransaction;
import com.wipro.transactionmicroservice.vo.responsetemplatevo;

public class TransactionController {
	
	@Autowired
	Itransaction service;
	
	@PostMapping("/add")
	public transaction addTransaction(@RequestBody transaction tns) {
		return service.addTransaction(tns);
	}
	
	@GetMapping("/details/{id}")
	public responsetemplatevo getTransactionDetails(@PathVariable Long id) {
		return service.getTransactionDetails(id);
	}

}
