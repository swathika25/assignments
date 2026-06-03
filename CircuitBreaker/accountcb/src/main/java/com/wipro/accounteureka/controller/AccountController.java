package com.wipro.accounteureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.accounteureka.entity.account;
import com.wipro.accounteureka.service.Iaccount;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	 Iaccount service;
	
	@PostMapping("/add")
	public account addAccount(@RequestBody account acc) {
		return service.addAccount(acc);
	}

	@GetMapping("/{id}")
	public account getAccount(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@GetMapping("/all")
	public List<account> getAll(){
		return service.getAllAccounts();
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.deleteAccount(id);
		return "Deleted SuccessFully";
	}
	
	
	
	
	
	
	
	
	
	
}
