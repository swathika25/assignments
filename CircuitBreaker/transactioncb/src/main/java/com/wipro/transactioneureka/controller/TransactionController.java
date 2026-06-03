package com.wipro.transactioneureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.transactioneureka.dto.transactionresponse;
import com.wipro.transactioneureka.entity.transaction;
import com.wipro.transactioneureka.service.Itransaction;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	private Itransaction service;
	
	
	
	@PostMapping("/add")
	public transaction addTransaction(@RequestBody transaction tns) {
		return service.addTransaction(tns);
	}
	
	@GetMapping("/{id}")
	public transaction getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@GetMapping("/all")
	public List<transaction> getAll(){
		return service.getAllTransactions();
	}
	
	
	@DeleteMapping("/all")
	public String delete(@PathVariable Long id) {
		service.deleteTransaction(id);
		return "DELETED SUCCESSFULLY";
	}
	
	@GetMapping("/details/{id}")
	public transactionresponse getTransactionDetails(@PathVariable Long id) {
		return service.getTransactionDetails(id);
	}
	
}
