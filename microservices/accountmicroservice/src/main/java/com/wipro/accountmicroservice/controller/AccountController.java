package com.wipro.accountmicroservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.accountmicroservice.entity.account;
import com.wipro.accountmicroservice.service.Iaccount;


@RestController
@RequestMapping("/api/account")
public class AccountController {
	
	
	@Autowired
	Iaccount service;
	
	@PostMapping(value="/adda",consumes ="application/json")
    public account addAccount(@RequestBody account acc) {
        return service.addAccount(acc);
    }
	
	// Get Account By Id
    @GetMapping("/getbyaid/{aid}")
    public account getByAid(@PathVariable Long aid) {
        return service.getByAid(aid);
    }
    
 // Get All Accounts
    @GetMapping(value="/getalla",produces = "application/json")
    public List<account> getAllAccounts() {
        return service.getAllAccounts();
    }
    
    
	
	

}
